package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goo implements goj {
    public static final joo a = joo.m("GnpSdk");
    public final gok b;

    public goo(gok gokVar) {
        gokVar.getClass();
        this.b = gokVar;
    }

    @Override // defpackage.goj
    public final goa a(gwf gwfVar) {
        goa goaVar;
        gwfVar.getClass();
        try {
            gok gokVar = this.b;
            int D = frx.D(gwfVar);
            String a2 = gwfVar.a();
            goaVar = (goa) bwr.c((cih) gokVar.a, true, false, new gon(D, a2, 1));
        } catch (Exception e) {
            ((jol) ((jol) a.g()).i(e)).q();
            goaVar = null;
        }
        if (goaVar != null) {
            return goaVar;
        }
        throw new gnx();
    }

    @Override // defpackage.goj
    public final List b() {
        try {
            List a2 = this.b.a();
            a2.getClass();
            return a2;
        } catch (Exception e) {
            ((jol) ((jol) a.g()).i(e)).q();
            return mlx.a;
        }
    }

    @Override // defpackage.goj
    public final List c() {
        List a2 = this.b.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.goj
    public final Long[] d(List list) {
        Long[] b = this.b.b(list);
        b.getClass();
        return b;
    }

    @Override // defpackage.goj
    public final void e(List list) {
        list.getClass();
        try {
            this.b.c(list);
        } catch (Exception e) {
            ((jol) ((jol) a.g()).i(e)).q();
        }
    }

    @Override // defpackage.goj
    public final void f(List list) {
        this.b.c(list);
    }
}
