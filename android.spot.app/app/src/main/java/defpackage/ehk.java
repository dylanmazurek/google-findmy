package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ehk extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/securedevice/SecureDeviceViewModel");
    public lqd b;
    public jer c;
    public final ele d;
    public final Executor e;
    public final cfm f;
    public final eqk g;
    public final apc h;
    public final dhx i;
    private boolean j;

    public ehk(apc apcVar, eqk eqkVar, ele eleVar, Executor executor, dhx dhxVar) {
        jdl jdlVar = jdl.a;
        this.c = jdlVar;
        this.j = false;
        this.f = new cfm(new ehj(jdlVar, false, false));
        this.h = apcVar;
        this.g = eqkVar;
        this.d = eleVar;
        this.e = executor;
        this.i = dhxVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ewg, java.lang.Object] */
    public final lqc a() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        jer b = eyf.b(this.h.c.c(), this.b);
        hwx.U(b.g());
        return (lqc) b.c();
    }

    public final void b(boolean z) {
        boolean z2;
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.U(z2);
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        return this.j;
    }

    public final void e(jer jerVar, int i) {
        boolean z;
        jyz f;
        int i2 = 1;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        this.f.l(new ehj(jer.i(ehi.SECURING_DEVICE), false, false));
        lqd lqdVar = this.b;
        if (!d()) {
            f = jyv.a;
        } else {
            this.f.l(new ehj(jer.i(ehi.MARKING_AS_LOST), false, false));
            f = jbx.d(this.g.e(lqdVar, 3, false)).f(new ejc(this, lqdVar, i2), this.e);
        }
        ivc.N(f, new ehh(this, jerVar, i), this.e);
    }
}
