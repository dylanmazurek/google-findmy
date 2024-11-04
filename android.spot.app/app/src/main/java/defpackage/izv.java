package defpackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.ConnPoolByRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.RouteSpecificPool;
import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izv extends ConnPoolByRoute {
    public izv(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        super(clientConnectionOperator, httpParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.conn.tsccm.ConnPoolByRoute
    public final BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        Date date;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        } else {
            date = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            BasicPoolEntry basicPoolEntry = null;
            WaitingThread waitingThread = null;
            while (basicPoolEntry == null) {
                if (!this.isShutDown) {
                    basicPoolEntry = getFreeEntry(routePool, obj);
                    if (basicPoolEntry != null) {
                        break;
                    }
                    String str = dga.a;
                    try {
                        if (routePool.getCapacity() > 0) {
                            if (this.numConnections < this.maxTotalConnections) {
                                basicPoolEntry = createEntry(routePool, this.operator);
                            } else if (!this.freeConnections.isEmpty()) {
                                deleteLeastUsedEntry();
                                basicPoolEntry = createEntry(routePool, this.operator);
                            }
                        }
                        routePool.queueThread(waitingThread);
                        this.waitingThreads.add(waitingThread);
                        if (!waitingThread.await(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                        }
                        basicPoolEntry = null;
                    } finally {
                        routePool.removeThread(waitingThread);
                        this.waitingThreads.remove(waitingThread);
                    }
                    if (waitingThread == null) {
                        waitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThread);
                    }
                } else {
                    throw new IllegalStateException("Connection pool shut down.");
                }
            }
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
            if (System.currentTimeMillis() - currentTimeMillis > 10) {
                String str2 = dga.a;
            }
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.ConnPoolByRoute, org.apache.http.impl.conn.tsccm.AbstractConnPool
    public final PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new izu(this, new WaitingThreadAborter(), httpRoute, obj);
    }
}
