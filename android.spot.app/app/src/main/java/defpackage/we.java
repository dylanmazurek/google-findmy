package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class we implements agt {
    public va a;
    final /* synthetic */ wi b;
    private final adt c;
    private final vu d;
    private final adt e;
    private final adt f;
    private final adt g;
    private final adp h;
    private boolean i;
    private final adt j;
    private final adr k;
    private boolean l;
    private final vj m;
    private final atk n;

    /* JADX WARN: Type inference failed for: r11v18, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [moh, java.lang.Object] */
    public we(wi wiVar, Object obj, va vaVar, atk atkVar) {
        this.b = wiVar;
        this.n = atkVar;
        this.c = new aee(obj, agw.a);
        Object obj2 = null;
        vu b = qh.b(0.0f, null, 7);
        this.d = b;
        this.e = new aee(b, agw.a);
        this.f = new aee(new wa(c(), atkVar, obj, l(), vaVar), agw.a);
        this.g = new aee(true, agw.a);
        this.h = new ady(-1.0f);
        this.j = new aee(obj, agw.a);
        this.a = vaVar;
        this.k = new aec(d().a());
        Float f = (Float) xa.a.get(atkVar);
        if (f != null) {
            float floatValue = f.floatValue();
            va vaVar2 = (va) atkVar.b.a(obj);
            int b2 = vaVar2.b();
            for (int i = 0; i < b2; i++) {
                vaVar2.e(i, floatValue);
            }
            obj2 = this.n.a.a(vaVar2);
        }
        this.m = qh.b(0.0f, obj2, 3);
    }

    private final Object l() {
        return this.c.a();
    }

    private final void m(wa waVar) {
        this.f.h(waVar);
    }

    private final void n(vj vjVar) {
        this.e.h(vjVar);
    }

    private final void o(Object obj) {
        this.c.h(obj);
    }

    private final void p(Object obj, boolean z) {
        uu c;
        uu uuVar;
        if (amr.i(null, l())) {
            m(new wa(this.m, this.n, obj, obj, this.a.c()));
            this.i = true;
            return;
        }
        if (z && !this.l) {
            if (c() instanceof vu) {
                c = c();
            } else {
                c = this.m;
            }
        } else {
            c = c();
        }
        long j = 0;
        if (this.b.a() > 0) {
            uuVar = new vv(c, this.b.a());
        } else {
            uuVar = c;
        }
        m(new wa(uuVar, this.n, obj, l(), this.a));
        this.i = false;
        wi wiVar = this.b;
        wiVar.o(true);
        if (wiVar.s()) {
            anr anrVar = wiVar.b;
            int a = anrVar.a();
            for (int i = 0; i < a; i++) {
                we weVar = (we) anrVar.get(i);
                weVar.k.f(weVar.d().a());
                j = Math.max(j, weVar.k.b());
                long j2 = wiVar.d;
                weVar.k();
            }
            wiVar.o(false);
        }
    }

    @Override // defpackage.agt
    public final Object a() {
        return this.j.a();
    }

    public final float b() {
        return this.h.b();
    }

    public final vj c() {
        return (vj) this.e.a();
    }

    public final wa d() {
        return (wa) this.f.a();
    }

    public final void e(boolean z) {
        this.g.h(Boolean.valueOf(z));
    }

    public final void f(float f) {
        this.h.f(f);
    }

    public final void g(Object obj) {
        this.j.h(obj);
    }

    public final void h(Object obj, Object obj2, vj vjVar) {
        o(obj2);
        n(vjVar);
        if (amr.i(d().c, obj) && amr.i(d().b, obj2)) {
            return;
        }
        p(obj, false);
    }

    public final void i(Object obj, vj vjVar) {
        Object a;
        if (!this.i || !amr.i(obj, null)) {
            if (amr.i(l(), obj) && b() == -1.0f) {
                return;
            }
            o(obj);
            n(vjVar);
            if (b() == -3.0f) {
                a = obj;
            } else {
                a = a();
            }
            boolean z = true;
            p(a, !j());
            if (b() != -3.0f) {
                z = false;
            }
            e(z);
            if (b() >= 0.0f) {
                g(d().c(((float) d().a()) * b()));
            } else if (b() == -3.0f) {
                g(obj);
            }
            this.i = false;
            f(-1.0f);
        }
    }

    public final boolean j() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public final void k() {
        if (b() == -1.0f) {
            this.l = true;
            if (amr.i(d().b, d().c)) {
                g(d().b);
            } else {
                g(d().c(0L));
                this.a = d().b(0L);
            }
        }
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + l() + ", spec: " + c();
    }
}
