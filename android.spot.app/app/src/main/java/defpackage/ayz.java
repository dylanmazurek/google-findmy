package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayz {
    public final ayr a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public ayw r;
    public int u = 5;
    public final ayx q = new ayx(this);
    public long s = bbc.o(0, 0, 15);
    public final mnw t = new azp(this, 1);

    public ayz(ayr ayrVar) {
        this.a = ayrVar;
    }

    public final azq a() {
        return this.a.n.c;
    }

    public final bld b() {
        ayw aywVar = this.r;
        if (aywVar != null) {
            return aywVar.j;
        }
        return null;
    }

    public final void c() {
        this.q.s = true;
        ayw aywVar = this.r;
        if (aywVar != null) {
            aywVar.p = true;
        }
    }

    public final void d() {
        this.d = true;
        this.e = true;
    }

    public final void e() {
        this.g = true;
        this.h = true;
    }

    public final void f() {
        this.c = true;
    }

    public final void g(int i) {
        boolean z;
        ayz ayzVar;
        int i2 = this.m;
        this.m = i;
        boolean z2 = false;
        if (i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            ayr o = this.a.o();
            if (o != null) {
                ayzVar = o.o;
            } else {
                ayzVar = null;
            }
            if (ayzVar != null) {
                if (i == 0) {
                    ayzVar.g(ayzVar.m - 1);
                } else {
                    ayzVar.g(ayzVar.m + 1);
                }
            }
        }
    }

    public final void h(int i) {
        boolean z;
        ayz ayzVar;
        int i2 = this.p;
        this.p = i;
        boolean z2 = false;
        if (i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            ayr o = this.a.o();
            if (o != null) {
                ayzVar = o.o;
            } else {
                ayzVar = null;
            }
            if (ayzVar != null) {
                if (i == 0) {
                    ayzVar.h(ayzVar.p - 1);
                } else {
                    ayzVar.h(ayzVar.p + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (!this.k) {
                    g(this.m + 1);
                }
            } else if (!this.k) {
                g(this.m - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z) {
                if (!this.l) {
                    g(this.m + 1);
                }
            } else if (!this.l) {
                g(this.m - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            if (z) {
                if (!this.n) {
                    h(this.p + 1);
                }
            } else if (!this.n) {
                h(this.p - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z) {
                if (!this.o) {
                    h(this.p + 1);
                }
            } else if (!this.o) {
                h(this.p - 1);
            }
        }
    }

    public final void m() {
        ayx ayxVar = this.q;
        if ((ayxVar.o != null || ayxVar.z.a().c() != null) && ayxVar.n) {
            ayxVar.n = false;
            ayxVar.o = ayxVar.z.a().c();
            ayr o = this.a.o();
            if (o != null) {
                ayr.aq(o, false, 7);
            }
        }
        ayw aywVar = this.r;
        if (aywVar != null) {
            if (aywVar.s == null) {
                azd w = aywVar.u.a().w();
                w.getClass();
                if (w.c() == null) {
                    return;
                }
            }
            if (aywVar.r) {
                aywVar.r = false;
                azd w2 = aywVar.u.a().w();
                w2.getClass();
                aywVar.s = w2.c();
                if (ql.c(this.a)) {
                    ayr o2 = this.a.o();
                    if (o2 != null) {
                        ayr.aq(o2, false, 7);
                        return;
                    }
                    return;
                }
                ayr o3 = this.a.o();
                if (o3 != null) {
                    ayr.ao(o3, false, 7);
                }
            }
        }
    }
}
