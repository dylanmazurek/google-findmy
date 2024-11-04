package defpackage;

import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhq implements mar {
    public lzf a = lzf.a(lze.IDLE);
    public mhv b;
    final /* synthetic */ mhw c;

    public mhq(mhw mhwVar) {
        this.c = mhwVar;
    }

    @Override // defpackage.mar
    public final void a(lzf lzfVar) {
        mhw.d.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{lzfVar, this.b.a});
        this.a = lzfVar;
        try {
            mhw mhwVar = this.c;
            mhv mhvVar = (mhv) mhwVar.f.get(mhwVar.g.c());
            if (mhvVar != null && mhvVar.c == this) {
                this.c.g(this.b);
            }
        } catch (IllegalStateException unused) {
            mhw.d.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Health listener received state change after subchannel was removed");
        }
    }
}
