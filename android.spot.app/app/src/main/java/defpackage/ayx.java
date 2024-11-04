package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayx extends awr implements awg, axn, ayb {
    private final mnw D;
    public boolean f;
    public boolean i;
    public boolean j;
    public moh l;
    public float m;
    public Object o;
    public boolean p;
    public boolean q;
    public boolean t;
    public float u;
    public boolean v;
    public moh w;
    public float y;
    public final /* synthetic */ ayz z;
    public int g = Integer.MAX_VALUE;
    public int h = Integer.MAX_VALUE;
    public int A = 3;
    public long k = 0;
    public boolean n = true;
    public final axm r = new ays(this);
    private final aiu B = new aiu(new ayx[16]);
    public boolean s = true;
    private final mnw C = new ob(this, 20);
    public long x = 0;

    public ayx(ayz ayzVar) {
        this.z = ayzVar;
        this.D = new aqg(ayzVar, this, 3);
    }

    private final void v() {
        boolean z = this.p;
        this.p = true;
        ayr ayrVar = this.z.a;
        if (!z) {
            if (ayrVar.ac()) {
                ayr.aq(ayrVar, true, 6);
            } else if (ayrVar.ab()) {
                ayr.ao(ayrVar, true, 6);
            }
        }
        azq azqVar = ayrVar.s().t;
        for (azq t = ayrVar.t(); !amr.i(t, azqVar) && t != null; t = t.t) {
            if (t.y) {
                t.ab();
            }
        }
        aiu n = ayrVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if (ayrVar2.k() != Integer.MAX_VALUE) {
                    ayrVar2.r().v();
                    ayrVar.U(ayrVar2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.axn
    public final axm a() {
        return this.r;
    }

    @Override // defpackage.axn
    public final axn b() {
        ayz ayzVar;
        ayr o = this.z.a.o();
        if (o != null && (ayzVar = o.o) != null) {
            return ayzVar.q;
        }
        return null;
    }

    @Override // defpackage.awr, defpackage.avq
    public final Object c() {
        return this.o;
    }

    @Override // defpackage.axn
    public final azq d() {
        return this.z.a.s();
    }

    @Override // defpackage.axn
    public final void e(moh mohVar) {
        aiu n = this.z.a.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                mohVar.a(((ayr) objArr[i2]).o.q);
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.axn
    public final void f() {
        aiu n;
        int i;
        this.t = true;
        this.r.g();
        ayz ayzVar = this.z;
        if (ayzVar.d && (i = (n = ayzVar.a.n()).b) > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar = (ayr) objArr[i2];
                if (ayrVar.ac() && ayrVar.ai() == 1 && ayr.am(ayrVar)) {
                    ayr.aq(ayzVar.a, false, 7);
                }
                i2++;
            } while (i2 < i);
        }
        if (this.z.e || (!d().j && this.z.d)) {
            ayz ayzVar2 = this.z;
            ayzVar2.d = false;
            int i3 = ayzVar2.u;
            ayzVar2.u = 3;
            ayzVar2.j(false);
            ayr ayrVar2 = this.z.a;
            ayu.a(ayrVar2).l.b(ayrVar2, false, this.C);
            this.z.u = i3;
            if (d().j && this.z.k) {
                g();
            }
            this.z.e = false;
        }
        axm axmVar = this.r;
        if (axmVar.b && axmVar.j()) {
            this.r.f();
        }
        this.t = false;
    }

    @Override // defpackage.axn
    public final void g() {
        ayr.ap(this.z.a);
    }

    @Override // defpackage.axn
    public final void h() {
        ayr.aq(this.z.a, false, 7);
    }

    @Override // defpackage.axn
    public final boolean i() {
        return this.p;
    }

    public final List j() {
        this.z.a.X();
        if (!this.s) {
            return this.B.d();
        }
        ayz ayzVar = this.z;
        aiu aiuVar = this.B;
        ayr ayrVar = ayzVar.a;
        aiu n = ayrVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if (aiuVar.b <= i2) {
                    aiuVar.o(ayrVar2.o.q);
                } else {
                    aiuVar.c(i2, ayrVar2.o.q);
                }
                i2++;
            } while (i2 < i);
        }
        aiuVar.h(ayrVar.z().size(), aiuVar.b);
        this.s = false;
        return this.B.d();
    }

    public final void k() {
        if (this.p) {
            int i = 0;
            this.p = false;
            ayr ayrVar = this.z.a;
            azq azqVar = ayrVar.s().t;
            for (azq t = ayrVar.t(); !amr.i(t, azqVar) && t != null; t = t.t) {
                t.ai();
            }
            aiu n = this.z.a.n();
            int i2 = n.b;
            if (i2 > 0) {
                Object[] objArr = n.a;
                do {
                    ((ayr) objArr[i]).r().k();
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // defpackage.awg
    public final awr l(long j) {
        ayr ayrVar = this.z.a;
        int i = 3;
        if (ayrVar.s == 3) {
            ayrVar.B();
        }
        if (ql.c(this.z.a)) {
            ayw aywVar = this.z.r;
            aywVar.getClass();
            aywVar.v = 3;
            aywVar.l(j);
        }
        ayr ayrVar2 = this.z.a;
        ayr o = ayrVar2.o();
        if (o != null) {
            if (this.A != 3 && !ayrVar2.m) {
                ll.g("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ah = o.ah();
            int i2 = ah - 1;
            if (ah != 0) {
                if (i2 != 0) {
                    if (i2 == 2) {
                        i = 2;
                    } else {
                        int ah2 = o.ah();
                        Objects.toString(ql.d(ah2));
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(ql.d(ah2)));
                    }
                } else {
                    i = 1;
                }
            } else {
                throw null;
            }
        }
        this.A = i;
        o(j);
        return this;
    }

    public final void m() {
        aiu n;
        int i;
        ayz ayzVar = this.z;
        if (ayzVar.m > 0 && (i = (n = ayzVar.a.n()).b) > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar = (ayr) objArr[i2];
                ayz ayzVar2 = ayrVar.o;
                if ((ayzVar2.k || ayzVar2.l) && !ayzVar2.d) {
                    ayr.ap(ayrVar);
                }
                ayzVar2.q.m();
                i2++;
            } while (i2 < i);
        }
    }

    public final void n() {
        this.v = true;
        ayr o = this.z.a.o();
        float f = d().w;
        ayr ayrVar = this.z.a;
        azq t = ayrVar.t();
        azq s = ayrVar.s();
        while (t != s) {
            t.getClass();
            aym aymVar = (aym) t;
            f += aymVar.w;
            t = aymVar.t;
        }
        if (f != this.u) {
            this.u = f;
            if (o != null) {
                o.P();
            }
            if (o != null) {
                o.H();
            }
        }
        if (!this.p) {
            if (o != null) {
                o.H();
            }
            v();
            if (this.f && o != null) {
                ayr.ap(o);
            }
        }
        if (o != null) {
            if (!this.f && o.ah() == 3) {
                if (this.h != Integer.MAX_VALUE) {
                    ll.g("Place was called on a node which was placed already");
                }
                ayz ayzVar = o.o;
                int i = ayzVar.j;
                this.h = i;
                ayzVar.j = i + 1;
            }
        } else {
            this.h = 0;
        }
        f();
    }

    public final boolean o(long j) {
        boolean z;
        if (this.z.a.r) {
            ll.f("measure is called on a deactivated node");
        }
        ayr ayrVar = this.z.a;
        baw a = ayu.a(ayrVar);
        ayr o = ayrVar.o();
        boolean z2 = false;
        if (!ayrVar.m && (o == null || !o.m)) {
            z = false;
        } else {
            z = true;
        }
        ayrVar.m = z;
        if (!ayrVar.ac() && a.n(this.d, j)) {
            a.n(this.z.a, false);
            this.z.a.V();
            return false;
        }
        this.r.d = false;
        e(awu.j);
        this.i = true;
        long j2 = this.z.a().c;
        t(j);
        ayz ayzVar = this.z;
        if (ayzVar.u != 5) {
            ll.g("layout state is not idle before measure starts");
        }
        ayzVar.u = 1;
        ayzVar.c = false;
        ayzVar.s = j;
        ayu.a(ayzVar.a).l.c(ayzVar.a, false, ayzVar.t);
        if (ayzVar.u == 1) {
            ayzVar.d();
            ayzVar.u = 5;
        }
        if (!a.n(this.z.a().c, j2) || this.z.a().a != this.a || this.z.a().b != this.b) {
            z2 = true;
        }
        s(bef.m(this.z.a().a, this.z.a().b));
        return z2;
    }

    @Override // defpackage.ayb
    public final void p() {
        this.z.a();
    }

    @Override // defpackage.awr
    public final void r(long j, float f, moh mohVar) {
        this.q = true;
        if (!a.n(j, this.k)) {
            ayz ayzVar = this.z;
            if (ayzVar.l || ayzVar.k) {
                ayzVar.d = true;
            }
            m();
        }
        if (ql.c(this.z.a)) {
            azq azqVar = this.z.a().u;
            if (azqVar == null || azqVar.k == null) {
                ayu.a(this.z.a);
                moh mohVar2 = aws.a;
            }
            ayz ayzVar2 = this.z;
            ayw aywVar = ayzVar2.r;
            aywVar.getClass();
            ayr o = ayzVar2.a.o();
            if (o != null) {
                o.o.i = 0;
            }
            aywVar.h = Integer.MAX_VALUE;
            awq.i(aywVar, blk.a(j), blk.b(j));
        }
        ayw aywVar2 = this.z.r;
        if (aywVar2 != null && !aywVar2.i) {
            ll.g("Error: Placement happened before lookahead.");
        }
        u(j, f, mohVar);
    }

    public final void u(long j, float f, moh mohVar) {
        if (this.z.a.r) {
            ll.f("place is called on a deactivated node");
        }
        ayz ayzVar = this.z;
        ayzVar.u = 3;
        this.k = j;
        this.m = f;
        this.l = mohVar;
        this.j = true;
        this.v = false;
        baw a = ayu.a(ayzVar.a);
        if (!ayzVar.d && this.p) {
            azq a2 = ayzVar.a();
            a2.aq(blk.d(j, a2.e), f, mohVar);
            n();
        } else {
            this.r.e = false;
            ayzVar.i(false);
            this.w = mohVar;
            this.x = j;
            this.y = f;
            azw azwVar = a.l;
            ayz ayzVar2 = this.z;
            azwVar.a(ayzVar2.a, false, this.D);
        }
        this.z.u = 5;
    }
}
