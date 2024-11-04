package defpackage;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izs implements ClientConnectionRequest {
    final /* synthetic */ PoolEntryRequest a;
    final /* synthetic */ HttpRoute b;
    final /* synthetic */ izw c;

    public izs(izw izwVar, PoolEntryRequest poolEntryRequest, HttpRoute httpRoute) {
        this.c = izwVar;
        this.a = poolEntryRequest;
        this.b = httpRoute;
    }

    @Override // org.apache.http.conn.ClientConnectionRequest
    public final void abortRequest() {
        this.a.abortRequest();
    }

    @Override // org.apache.http.conn.ClientConnectionRequest
    public final ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
        if (this.b != null) {
            return new izt(this.c, this.a.getPoolEntry(j, timeUnit));
        }
        throw new IllegalArgumentException("Route may not be null.");
    }
}
