package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayw extends awr implements awg, axn, ayb {
    public boolean f;
    public boolean i;
    public bld j;
    public moh l;
    public boolean m;
    public boolean q;
    public Object s;
    public boolean t;
    final /* synthetic */ ayz u;
    private boolean w;
    public int g = Integer.MAX_VALUE;
    public int h = Integer.MAX_VALUE;
    public int v = 3;
    public long k = 0;
    public final axm n = new aza(this);
    public final aiu o = new aiu(new ayw[16]);
    public boolean p = true;
    public boolean r = true;

    public ayw(ayz ayzVar) {
        this.u = ayzVar;
        this.s = ayzVar.q.o;
    }

    private final void u() {
        boolean z = this.m;
        this.m = true;
        if (!z) {
            ayz ayzVar = this.u;
            if (ayzVar.f) {
                ayr.ao(ayzVar.a, true, 6);
            }
        }
        aiu n = this.u.a.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar = (ayr) objArr[i2];
                if (ayrVar.k() != Integer.MAX_VALUE) {
                    ayw q = ayrVar.q();
                    q.getClass();
                    q.u();
                    ayrVar.U(ayrVar);
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.axn
    public final axm a() {
        return this.n;
    }

    @Override // defpackage.axn
    public final axn b() {
        ayz ayzVar;
        ayr o = this.u.a.o();
        if (o != null && (ayzVar = o.o) != null) {
            return ayzVar.r;
        }
        return null;
    }

    @Override // defpackage.awr, defpackage.avq
    public final Object c() {
        return this.s;
    }

    @Override // defpackage.axn
    public final azq d() {
        return this.u.a.s();
    }

    @Override // defpackage.axn
    public final void e(moh mohVar) {
        aiu n = this.u.a.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayw aywVar = ((ayr) objArr[i2]).o.r;
                aywVar.getClass();
                mohVar.a(aywVar);
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.axn
    public final void f() {
        aiu n;
        int i;
        this.q = true;
        this.n.g();
        ayz ayzVar = this.u;
        if (ayzVar.g && (i = (n = ayzVar.a.n()).b) > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar = (ayr) objArr[i2];
                if (ayrVar.ab() && ayrVar.aj() == 1) {
                    ayz ayzVar2 = ayrVar.o;
                    ayw aywVar = ayzVar2.r;
                    aywVar.getClass();
                    bld b = ayzVar2.b();
                    b.getClass();
                    if (aywVar.n(b.a)) {
                        ayr.ao(ayzVar.a, false, 7);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        azd azdVar = ((ayh) d()).g;
        azdVar.getClass();
        ayz ayzVar3 = this.u;
        if (ayzVar3.h || (!azdVar.j && ayzVar3.g)) {
            ayzVar3.g = false;
            int i3 = ayzVar3.u;
            ayzVar3.u = 4;
            baw a = ayu.a(ayzVar3.a);
            ayzVar3.l(false);
            azw azwVar = a.l;
            ayz ayzVar4 = this.u;
            azwVar.b(ayzVar4.a, true, new azm(this, azdVar, ayzVar4, 1));
            ayz ayzVar5 = this.u;
            ayzVar5.u = i3;
            if (ayzVar5.n && azdVar.j) {
                g();
            }
            this.u.h = false;
        }
        axm axmVar = this.n;
        if (axmVar.b && axmVar.j()) {
            this.n.f();
        }
        this.q = false;
    }

    @Override // defpackage.axn
    public final void g() {
        ayr.an(this.u.a);
    }

    @Override // defpackage.axn
    public final void h() {
        ayr.ao(this.u.a, false, 7);
    }

    @Override // defpackage.axn
    public final boolean i() {
        return this.m;
    }

    public final void j() {
        if (this.m) {
            int i = 0;
            this.m = false;
            aiu n = this.u.a.n();
            int i2 = n.b;
            if (i2 > 0) {
                Object[] objArr = n.a;
                do {
                    ayw aywVar = ((ayr) objArr[i]).o.r;
                    aywVar.getClass();
                    aywVar.j();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void k() {
        aiu n;
        int i;
        ayz ayzVar = this.u;
        if (ayzVar.p > 0 && (i = (n = ayzVar.a.n()).b) > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayr ayrVar = (ayr) objArr[i2];
                ayz ayzVar2 = ayrVar.o;
                if ((ayzVar2.n || ayzVar2.o) && !ayzVar2.g) {
                    ayr.an(ayrVar);
                }
                ayw aywVar = ayzVar2.r;
                if (aywVar != null) {
                    aywVar.k();
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // defpackage.awg
    public final awr l(long j) {
        ayr o;
        ayr o2 = this.u.a.o();
        int i = 2;
        if ((o2 != null && o2.ah() == 2) || ((o = this.u.a.o()) != null && o.ah() == 4)) {
            this.u.b = false;
        }
        ayr ayrVar = this.u.a;
        ayr o3 = ayrVar.o();
        if (o3 != null) {
            if (this.v != 3 && !ayrVar.m) {
                ll.g("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ah = o3.ah();
            int i2 = ah - 1;
            if (ah != 0) {
                if (i2 != 0 && i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        int ah2 = o3.ah();
                        Objects.toString(ql.d(ah2));
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(ql.d(ah2)));
                    }
                } else {
                    i = 1;
                }
                this.v = i;
            } else {
                throw null;
            }
        } else {
            this.v = 3;
        }
        ayr ayrVar2 = this.u.a;
        if (ayrVar2.s == 3) {
            ayrVar2.B();
        }
        n(j);
        return this;
    }

    public final void m() {
        this.t = true;
        ayr o = this.u.a.o();
        if (!this.m) {
            u();
            if (this.f && o != null) {
                ayr.an(o);
            }
        }
        if (o != null) {
            if (!this.f && (o.ah() == 3 || o.ah() == 4)) {
                if (this.h != Integer.MAX_VALUE) {
                    ll.g("Place was called on a node which was placed already");
                }
                ayz ayzVar = o.o;
                int i = ayzVar.i;
                this.h = i;
                ayzVar.i = i + 1;
            }
        } else {
            this.h = 0;
        }
        f();
    }

    public final boolean n(long j) {
        boolean z;
        long m;
        bld bldVar;
        if (this.u.a.r) {
            ll.f("measure is called on a deactivated node");
        }
        ayr ayrVar = this.u.a;
        ayr o = ayrVar.o();
        if (!ayrVar.m && (o == null || !o.m)) {
            z = false;
        } else {
            z = true;
        }
        ayrVar.m = z;
        if (!ayrVar.ab() && (bldVar = this.j) != null && a.n(bldVar.a, j)) {
            ayr ayrVar2 = this.u.a;
            baw bawVar = ayrVar2.t;
            if (bawVar != null) {
                bawVar.n(ayrVar2, true);
            }
            this.u.a.V();
            return false;
        }
        this.j = new bld(j);
        t(j);
        this.n.d = false;
        e(awu.g);
        if (this.w) {
            m = this.c;
        } else {
            m = bef.m(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        this.w = true;
        azd w = this.u.a().w();
        if (w == null) {
            ll.g("Lookahead result from lookaheadRemeasure cannot be null");
        }
        ayz ayzVar = this.u;
        ayzVar.u = 2;
        ayzVar.f = false;
        ayu.a(ayzVar.a).l.c(ayzVar.a, true, new ayy(ayzVar, j));
        ayzVar.e();
        if (ql.c(ayzVar.a)) {
            ayzVar.d();
        } else {
            ayzVar.f();
        }
        ayzVar.u = 5;
        s(bef.m(w.a, w.b));
        if (blm.b(m) == w.a && blm.a(m) == w.b) {
            return false;
        }
        return true;
    }

    public final void o(long j, moh mohVar) {
        if (this.u.a.r) {
            ll.f("place is called on a deactivated node");
        }
        ayz ayzVar = this.u;
        ayzVar.u = 4;
        this.i = true;
        this.t = false;
        if (!a.n(j, this.k)) {
            if (ayzVar.o || ayzVar.n) {
                ayzVar.g = true;
            }
            k();
        }
        ayz ayzVar2 = this.u;
        baw a = ayu.a(ayzVar2.a);
        if (!ayzVar2.g && this.m) {
            azd w = ayzVar2.a().w();
            w.getClass();
            w.z(blk.d(j, w.e));
            m();
        } else {
            ayzVar2.k(false);
            this.n.e = false;
            azw azwVar = a.l;
            ayz ayzVar3 = this.u;
            azwVar.a(ayzVar3.a, true, new ayv(ayzVar3, a, j));
        }
        this.k = j;
        this.l = mohVar;
        this.u.u = 5;
    }

    @Override // defpackage.ayb
    public final void p() {
        Boolean bool;
        if (this.u.a().w() != null) {
            bool = false;
        } else {
            bool = null;
        }
        if (!amr.i(false, bool)) {
            this.u.a().w();
        }
    }

    @Override // defpackage.awr
    public final void r(long j, float f, moh mohVar) {
        o(j, mohVar);
    }
}
