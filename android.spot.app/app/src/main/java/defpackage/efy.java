package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efy {
    public final ele a;
    public final ewf d;
    public final bym e;
    private final ewc f;
    public final List b = new ArrayList();
    private final dhx g = new dhx((short[]) null);
    public jer c = jdl.a;

    public efy(ewc ewcVar, ewf ewfVar, ele eleVar, bym bymVar) {
        this.f = ewcVar;
        this.d = ewfVar;
        this.e = bymVar;
        this.a = eleVar;
        ewfVar.c(new dym(this, 12, null));
    }

    public final efp a(lqd lqdVar) {
        Parcelable a = this.f.a(lqdVar);
        if (a instanceof efp) {
            return (efp) a;
        }
        return null;
    }

    public final jer b() {
        return jer.h(this.d.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jer c(lqd lqdVar) {
        jer b = eyf.b(this.f.c, lqdVar);
        if (b.g() && ((lqc) b.c()).b == 3) {
            return b;
        }
        return jdl.a;
    }

    public final void d(ewk ewkVar) {
        this.g.h(ewkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void e() {
        if (this.c.g()) {
            this.e.n(this.c.c());
            this.c = jdl.a;
        }
    }

    public final void f(lqd lqdVar) {
        if (h(lqdVar)) {
            this.g.i();
        }
    }

    public final void g(ewk ewkVar) {
        this.g.j(ewkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(lqd lqdVar) {
        lqc a = this.d.a();
        if (a != null) {
            lqd lqdVar2 = a.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            if (lqdVar2.equals(lqdVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(lqd lqdVar, efx efxVar, int i) {
        amr.j();
        efp efpVar = (efp) this.f.a(lqdVar);
        if (efpVar != null) {
            efn d = efpVar.d();
            efxVar.a(d);
            efp c = d.c();
            if (efpVar != c) {
                j(lqdVar, c, i);
            }
        }
    }

    public final void j(lqd lqdVar, efp efpVar, int i) {
        this.f.r(lqdVar, efpVar);
        if (i == 1 && h(lqdVar)) {
            this.g.i();
        }
        if (i - 1 != 1) {
            return;
        }
        f(lqdVar);
    }
}
