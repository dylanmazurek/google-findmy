package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wi {
    public final String a;
    public long d;
    private final wm e;
    private final wi f;
    private final adt g = new aee(d(), agw.a);
    private final adt h = new aee(new wd(d(), d()), agw.a);
    private final adr i = new aec(0);
    private final adr j = new aec(Long.MIN_VALUE);
    private final adt k = new aee(false, agw.a);
    public final anr b = new anr();
    public final anr c = new anr();
    private final adt l = new aee(false, agw.a);

    public wi(wm wmVar, wi wiVar, String str) {
        this.e = wmVar;
        this.f = wiVar;
        this.a = str;
    }

    private final void v() {
        anr anrVar = this.b;
        int a = anrVar.a();
        for (int i = 0; i < a; i++) {
            ((we) anrVar.get(i)).f(-2.0f);
        }
        anr anrVar2 = this.c;
        int a2 = anrVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ((wi) anrVar2.get(i2)).v();
        }
    }

    private final void w(wc wcVar) {
        this.h.h(wcVar);
    }

    public final long a() {
        wi wiVar = this.f;
        if (wiVar != null) {
            return wiVar.a();
        }
        return this.i.b();
    }

    public final long b() {
        return this.j.b();
    }

    public final wc c() {
        return (wc) this.h.a();
    }

    public final Object d() {
        return this.e.b();
    }

    public final Object e() {
        return this.g.a();
    }

    public final void f(Object obj, abi abiVar, int i) {
        int i2;
        boolean z;
        int i3;
        boolean D;
        int i4;
        int i5 = i & 6;
        abi b = abiVar.b(-1493585151);
        if (i5 == 0) {
            if ((i & 8) == 0) {
                D = b.B(obj);
            } else {
                D = b.D(obj);
            }
            if (true != D) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.B(this)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && b.G()) {
            b.r();
        } else if (!s()) {
            p(obj);
            if (!amr.i(obj, d()) || r() || ((Boolean) this.k.a()).booleanValue()) {
                abp abpVar = (abp) b;
                Object P = abpVar.P();
                if (P == abh.a) {
                    acf acfVar = new acf(act.a(mnc.a, b));
                    abpVar.Z(acfVar);
                    P = acfVar;
                }
                msw mswVar = ((acf) P).a;
                boolean D2 = b.D(mswVar);
                if ((i2 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = z | D2;
                Object P2 = abpVar.P();
                if (z2 || P2 == abh.a) {
                    P2 = new tn(mswVar, this, 6, null);
                    abpVar.Z(P2);
                }
                act.b(mswVar, this, (moh) P2, b);
            }
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new xb(this, obj, i, 1);
        }
    }

    public final void g(long j, boolean z) {
        long j2;
        if (b() == Long.MIN_VALUE) {
            i(j);
        } else if (!((Boolean) this.e.a.a()).booleanValue()) {
            this.e.a(true);
        }
        o(false);
        anr anrVar = this.b;
        int a = anrVar.a();
        boolean z2 = true;
        for (int i = 0; i < a; i++) {
            we weVar = (we) anrVar.get(i);
            if (!weVar.j()) {
                if (z) {
                    j2 = weVar.d().a();
                } else {
                    j2 = j;
                }
                weVar.g(weVar.d().c(j2));
                weVar.a = weVar.d().b(j2);
                if (qg.c(weVar.d(), j2)) {
                    weVar.e(true);
                }
            }
            z2 &= weVar.j();
        }
        anr anrVar2 = this.c;
        int a2 = anrVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            wi wiVar = (wi) anrVar2.get(i2);
            if (!amr.i(wiVar.e(), wiVar.d())) {
                wiVar.g(j, z);
            }
            z2 &= amr.i(wiVar.e(), wiVar.d());
        }
        if (z2) {
            h();
        }
    }

    public final void h() {
        m(Long.MIN_VALUE);
        wm wmVar = this.e;
        if (wmVar instanceof wm) {
            wmVar.d(e());
        }
        k(0L);
        this.e.a(false);
    }

    public final void i(long j) {
        m(j);
        this.e.a(true);
    }

    public final void j(we weVar) {
        this.b.remove(weVar);
    }

    public final void k(long j) {
        if (this.f == null) {
            this.i.f(j);
        }
    }

    public final void l(boolean z) {
        this.l.h(Boolean.valueOf(z));
    }

    public final void m(long j) {
        this.j.f(j);
    }

    public final void n(Object obj) {
        this.g.h(obj);
    }

    public final void o(boolean z) {
        this.k.h(Boolean.valueOf(z));
    }

    public final void p(Object obj) {
        if (!amr.i(e(), obj)) {
            w(new wd(e(), obj));
            if (!amr.i(d(), e())) {
                this.e.d(e());
            }
            n(obj);
            if (!r()) {
                o(true);
            }
            v();
        }
    }

    public final boolean q() {
        anr anrVar = this.b;
        int a = anrVar.a();
        for (int i = 0; i < a; i++) {
        }
        anr anrVar2 = this.c;
        int a2 = anrVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            if (((wi) anrVar2.get(i2)).q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        if (b() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final void t(we weVar) {
        this.b.add(weVar);
    }

    public final String toString() {
        anr anrVar = this.b;
        int a = anrVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < a; i++) {
            str = str + ((we) anrVar.get(i)) + ", ";
        }
        return str;
    }

    public final void u(Object obj, Object obj2) {
        m(Long.MIN_VALUE);
        this.e.a(false);
        if (!s() || !amr.i(d(), obj) || !amr.i(e(), obj2)) {
            if (!amr.i(d(), obj)) {
                wm wmVar = this.e;
                if (wmVar instanceof wm) {
                    wmVar.d(obj);
                }
            }
            n(obj2);
            l(true);
            w(new wd(obj, obj2));
        }
        anr anrVar = this.c;
        int a = anrVar.a();
        for (int i = 0; i < a; i++) {
            wi wiVar = (wi) anrVar.get(i);
            wiVar.getClass();
            if (wiVar.s()) {
                wiVar.u(wiVar.d(), wiVar.e());
            }
        }
        anr anrVar2 = this.b;
        int a2 = anrVar2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ((we) anrVar2.get(i2)).k();
        }
        this.d = 0L;
    }
}
