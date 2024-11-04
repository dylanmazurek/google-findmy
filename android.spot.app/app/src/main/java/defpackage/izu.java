package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izu implements PoolEntryRequest {
    final /* synthetic */ WaitingThreadAborter a;
    final /* synthetic */ HttpRoute b;
    final /* synthetic */ Object c;
    final /* synthetic */ izv d;

    public izu(izv izvVar, WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
        this.d = izvVar;
        this.a = waitingThreadAborter;
        this.b = httpRoute;
        this.c = obj;
    }

    @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
    public final void abortRequest() {
        Lock lock;
        Lock lock2;
        lock = this.d.poolLock;
        lock.lock();
        try {
            this.a.abort();
        } finally {
            lock2 = this.d.poolLock;
            lock2.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
    public final BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
        return this.d.getEntryBlocking(this.b, this.c, j, timeUnit, this.a);
    }
}
