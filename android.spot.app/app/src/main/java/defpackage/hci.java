package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hci {
    public static final String a = "hci";
    private final be b;
    private final hcc c;
    private final aj d;

    public hci(be beVar, hcc hccVar, aj ajVar) {
        this.b = beVar;
        this.c = hccVar;
        this.d = ajVar;
        hmh hmhVar = (hmh) c(beVar);
        if (hmhVar != null) {
            d(hmhVar);
        }
    }

    private static dq c(be beVar) {
        return (dq) beVar.f(a);
    }

    private final void d(hmh hmhVar) {
        ijs.c();
        ljh k = lnh.g.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lnh lnhVar = (lnh) ljnVar;
        lnhVar.c = 1;
        lnhVar.a |= 2;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lnh lnhVar2 = (lnh) ljnVar2;
        lnhVar2.e = 8;
        lnhVar2.a |= 32;
        if (!ljnVar2.y()) {
            k.t();
        }
        hcc hccVar = this.c;
        lnh lnhVar3 = (lnh) k.b;
        lnhVar3.d = 3;
        lnhVar3.a = 8 | lnhVar3.a;
        new hgd(hccVar, hmhVar, (lnh) k.q());
    }

    public final hmh a() {
        ijs.c();
        hmh hmhVar = (hmh) c(this.b);
        if (hmhVar == null) {
            hmh hmhVar2 = new hmh();
            Bundle bundle = new Bundle();
            bundle.putBoolean("accountMenuFlavorsStyle", true);
            hmhVar2.ak(bundle);
            d(hmhVar2);
            return hmhVar2;
        }
        return hmhVar;
    }

    public final void b(dq dqVar) {
        ijs.c();
        aj ajVar = this.d;
        if ((ajVar == null || !ajVar.isFinishing()) && !dqVar.au() && !this.b.ac()) {
            dqVar.cs(this.b, a);
        }
    }
}
