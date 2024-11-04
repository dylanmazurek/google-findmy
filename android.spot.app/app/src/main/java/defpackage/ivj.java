package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivj {
    public iva a;
    public iva b;
    public iva c;
    public iva d;
    public ivc e;
    public ivc f;
    public ivc g;
    public ivc h;
    public iuu i;
    public iuu j;
    public iuu k;
    public iuu l;

    public ivj() {
        this.i = new ivi();
        this.j = new ivi();
        this.k = new ivi();
        this.l = new ivi();
        this.a = new iuy(0.0f);
        this.b = new iuy(0.0f);
        this.c = new iuy(0.0f);
        this.d = new iuy(0.0f);
        this.e = new ivc();
        this.f = new ivc();
        this.g = new ivc();
        this.h = new ivc();
    }

    private static void l(iuu iuuVar) {
        if (iuuVar instanceof ivi) {
            float f = ((ivi) iuuVar).a;
        } else if (iuuVar instanceof ivb) {
            float f2 = ((ivb) iuuVar).a;
        }
    }

    public final void a(float f) {
        this.d = new iuy(f);
    }

    public final void b(float f) {
        this.c = new iuy(f);
    }

    public final void c(float f) {
        this.a = new iuy(f);
    }

    public final void d(float f) {
        this.b = new iuy(f);
    }

    public final void e(float f) {
        c(f);
        d(f);
        b(f);
        a(f);
    }

    public final void f(float f) {
        j(ivc.d(0));
        c(f);
    }

    public final void g(float f) {
        k(ivc.d(0));
        d(f);
    }

    public final void h(iuu iuuVar) {
        this.l = iuuVar;
        l(iuuVar);
    }

    public final void i(iuu iuuVar) {
        this.k = iuuVar;
        l(iuuVar);
    }

    public final void j(iuu iuuVar) {
        this.i = iuuVar;
        l(iuuVar);
    }

    public final void k(iuu iuuVar) {
        this.j = iuuVar;
        l(iuuVar);
    }

    public ivj(ivl ivlVar) {
        this.i = new ivi();
        this.j = new ivi();
        this.k = new ivi();
        this.l = new ivi();
        this.a = new iuy(0.0f);
        this.b = new iuy(0.0f);
        this.c = new iuy(0.0f);
        this.d = new iuy(0.0f);
        this.e = new ivc();
        this.f = new ivc();
        this.g = new ivc();
        this.h = new ivc();
        this.i = ivlVar.j;
        this.j = ivlVar.k;
        this.k = ivlVar.l;
        this.l = ivlVar.m;
        this.a = ivlVar.b;
        this.b = ivlVar.c;
        this.c = ivlVar.d;
        this.d = ivlVar.e;
        this.e = ivlVar.f;
        this.f = ivlVar.g;
        this.g = ivlVar.h;
        this.h = ivlVar.i;
    }
}
