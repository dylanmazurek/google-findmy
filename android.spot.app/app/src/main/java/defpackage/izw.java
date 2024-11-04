package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.AbstractConnPool;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izw extends ThreadSafeClientConnManager {
    public izw(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
    protected final AbstractConnPool createConnectionPool(HttpParams httpParams) {
        izv izvVar = new izv(this.connOperator, httpParams);
        izvVar.enableConnectionGC();
        return izvVar;
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager, org.apache.http.conn.ClientConnectionManager
    public final void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        long j2;
        if ((managedClientConnection instanceof izt) && managedClientConnection.getRoute() != null) {
            long currentTimeMillis = System.currentTimeMillis() - ((izt) managedClientConnection).a;
            if (true != managedClientConnection.getRoute().isSecure()) {
                j2 = 2500;
            } else {
                j2 = 5000;
            }
            if (currentTimeMillis > j2) {
                try {
                    managedClientConnection.close();
                } catch (IOException unused) {
                }
            }
        }
        super.releaseConnection(managedClientConnection, j, timeUnit);
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager, org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new izs(this, this.connectionPool.requestPoolEntry(httpRoute, obj), httpRoute);
    }
}
