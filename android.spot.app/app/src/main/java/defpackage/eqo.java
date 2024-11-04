package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqo extends cgk {
    public jer a;
    public jer b;
    public jer c;
    public final eqk d;
    public final dhx e;
    private final ele f;
    private final ewg g;
    private final Executor h;

    public eqo(eqk eqkVar, ele eleVar, ewg ewgVar, dhx dhxVar, Executor executor) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = eqkVar;
        this.f = eleVar;
        this.g = ewgVar;
        this.e = dhxVar;
        this.h = executor;
    }

    private final kxz h() {
        kyf kyfVar = this.f.a(d()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        kxz kxzVar = kylVar.h;
        if (kxzVar == null) {
            return kxz.d;
        }
        return kxzVar;
    }

    private static boolean i(kxz kxzVar) {
        if (kxzVar.c.isEmpty() && kxzVar.a.isEmpty() && kxzVar.b.isEmpty()) {
            return false;
        }
        return true;
    }

    public final eqm a(jer jerVar, eqg eqgVar) {
        if (jerVar.g()) {
            if (jerVar.c() == eqh.MARKING_AS_LOST) {
                jer i = jer.i(eql.MARKING_AS_LOST);
                jdl jdlVar = jdl.a;
                return new eqm(i, jdlVar, jdlVar, false);
            }
            if (jerVar.c() == eqh.MARKING_AS_FOUND) {
                jer i2 = jer.i(eql.MARKING_AS_FOUND);
                jdl jdlVar2 = jdl.a;
                return new eqm(i2, jdlVar2, jdlVar2, false);
            }
        }
        kzc b = b();
        if (eku.k(b)) {
            kxz kxzVar = (kxz) eqgVar.a.e(h());
            return new eqm(jdl.a, jer.i(b), jer.i(kxzVar), eqgVar.a.g());
        }
        return eqm.a(b, (kxz) eqgVar.a.e(h()), eqgVar.a.g());
    }

    public final kzc b() {
        kyf kyfVar = this.f.a(d()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kzc kzcVar = kyfVar.d;
        if (kzcVar == null) {
            return kzc.c;
        }
        return kzcVar;
    }

    public final lqc d() {
        jer b = eyf.b(this.g.c(), (lqd) this.a.c());
        hwx.V(b.g(), "'initialize() should be called before using this object.");
        return (lqc) b.c();
    }

    public final void e(kxz kxzVar) {
        jer i;
        jer i2;
        kxz h = h();
        jer jerVar = jdl.a;
        if (kxzVar.c.isEmpty() && !h.c.isEmpty()) {
            jerVar = jer.i(false);
        } else if (!kxzVar.c.isEmpty() && h.c.isEmpty()) {
            jerVar = jer.i(true);
        }
        if (kxzVar.a.equals(h.a)) {
            i = jdl.a;
        } else {
            i = jer.i(kxzVar.a);
        }
        if (kxzVar.b.equals(h.b)) {
            i2 = jdl.a;
        } else {
            i2 = jer.i(kxzVar.b);
        }
        if (!jerVar.g() && !i.g() && !i2.g()) {
            return;
        }
        ijp.a(this.d.b((lqd) this.a.c(), jerVar, i, i2), "Update contact info failed", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        if (eku.k(b())) {
            return i(h());
        }
        if (this.c.g() && i((kxz) this.c.c())) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        hwx.V(this.a.g(), "'initialize() should be called before using this object.");
        jbx.d(this.d.e((lqd) this.a.c(), i, false)).e(new eoc(this, 8), this.h).a(Throwable.class, new hkb(this, i, 1), this.h).c(new dzw(this, 17), this.h);
    }
}
