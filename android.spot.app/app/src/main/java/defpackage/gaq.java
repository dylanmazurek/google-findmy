package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaq extends mbs {
    final /* synthetic */ gar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaq(gar garVar, mjo mjoVar) {
        super(mjoVar);
        this.a = garVar;
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        gat gatVar = this.a.a;
        synchronized (gatVar.a) {
            if (!gatVar.c) {
                gatVar.c = true;
                gas gasVar = gatVar.b;
                if (gasVar == null) {
                    gatVar.d.r = mcaVar.l.r;
                    hms.a().c(gatVar.d);
                } else {
                    synchronized (gasVar.a) {
                        hsb hsbVar = gasVar.b;
                        int i = gasVar.d;
                        int i2 = gasVar.e;
                        hsbVar.c = SystemClock.elapsedRealtime() - hsbVar.a;
                        hsbVar.d = i;
                        hsbVar.e = i2;
                        gasVar.b.r = mcaVar.l.r;
                        hms.a().c(gasVar.b);
                        gasVar.c = true;
                    }
                }
            }
        }
        this.f.a(mcaVar, mbcVar);
    }
}
