package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apq extends aow implements ayj, aya {
    public atq a;
    public aon c;
    public avo d;
    public boolean b = true;
    public float e = 1.0f;

    public apq(atq atqVar, aon aonVar, avo avoVar) {
        this.a = atqVar;
        this.c = aonVar;
        this.d = avoVar;
    }

    private final boolean c() {
        if (this.b && this.a.a() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    private static final boolean f(long j) {
        if (!a.n(j, 9205357640488583168L)) {
            float a = aqn.a(j);
            if (!Float.isInfinite(a) && !Float.isNaN(a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static final boolean g(long j) {
        if (!a.n(j, 9205357640488583168L)) {
            float b = aqn.b(j);
            if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        boolean z;
        int d;
        int c;
        long k;
        float b;
        float a;
        awi cd;
        boolean z2 = true;
        if (bld.h(j) && bld.g(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!bld.j(j) || !bld.i(j)) {
            z2 = false;
        }
        if ((!c() && z) || z2) {
            k = bld.k(j, bld.b(j), bld.a(j));
        } else {
            long a2 = this.a.a();
            if (g(a2)) {
                d = Math.round(aqn.b(a2));
            } else {
                d = bld.d(j);
            }
            if (f(a2)) {
                c = Math.round(aqn.a(a2));
            } else {
                c = bld.c(j);
            }
            long k2 = a.k(bbc.k(j, d), bbc.j(j, c));
            if (c()) {
                if (!g(this.a.a())) {
                    b = aqn.b(k2);
                } else {
                    b = aqn.b(this.a.a());
                }
                if (!f(this.a.a())) {
                    a = aqn.a(k2);
                } else {
                    a = aqn.a(this.a.a());
                }
                long k3 = a.k(b, a);
                if (aqn.b(k2) != 0.0f && aqn.a(k2) != 0.0f) {
                    k2 = nq.g(k3, this.d.a(k3, k2));
                } else {
                    k2 = 0;
                }
            }
            k = bld.k(j, bbc.k(j, Math.round(aqn.b(k2))), bbc.j(j, Math.round(aqn.a(k2))));
        }
        awr l = awgVar.l(k);
        cd = awjVar.cd(l.a, l.b, mly.a, new zc(l, 5));
        return cd;
    }

    @Override // defpackage.aya
    public final void ca(ayt aytVar) {
        float b;
        float a;
        long j;
        long a2 = this.a.a();
        if (g(a2)) {
            b = aqn.b(a2);
        } else {
            b = aqn.b(aytVar.l());
        }
        if (f(a2)) {
            a = aqn.a(a2);
        } else {
            a = aqn.a(aytVar.l());
        }
        long k = a.k(b, a);
        if (aqn.b(aytVar.l()) != 0.0f && aqn.a(aytVar.l()) != 0.0f) {
            j = nq.g(k, this.d.a(k, aytVar.l()));
        } else {
            j = 0;
        }
        long j2 = j;
        long a3 = this.c.a(bef.m(Math.round(aqn.b(j2)), Math.round(aqn.a(j2))), bef.m(Math.round(aqn.b(aytVar.l())), Math.round(aqn.a(aytVar.l()))), aytVar.m());
        float a4 = blk.a(a3);
        float b2 = blk.b(a3);
        aytVar.n().c.u(a4, b2);
        float f = -a4;
        float f2 = -b2;
        try {
            this.a.f(aytVar, j2, this.e, null);
            aytVar.n().c.u(f, f2);
            aytVar.o();
        } catch (Throwable th) {
            aytVar.n().c.u(f, f2);
            throw th;
        }
    }

    @Override // defpackage.aow
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=null)";
    }

    @Override // defpackage.aya
    public final /* synthetic */ void d() {
    }
}
