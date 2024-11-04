package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imf {
    public final String a;
    public final img b;
    public final jak c;
    private final jyz f;
    private final jak g = new jak(new ime(this), jxv.a);
    public final Object d = new Object();
    public List e = new ArrayList();
    private final kub h = new kub((byte[]) null);

    public imf(img imgVar, jyz jyzVar) {
        this.b = imgVar;
        this.f = jyzVar;
        this.a = imgVar.f();
        this.c = new jak(imgVar.a(), jxv.a);
        c(new ifl(this, 19));
    }

    public final jyz a() {
        jyz jyzVar;
        jfd.b(jdj.a);
        if (this.g.c.isDone()) {
            jyzVar = this.b.i();
        } else {
            jax i = iqh.i("Get ".concat(String.valueOf(this.a)));
            try {
                jyz h = jwu.h(this.g.c(), jbn.c(new ifl(this, 20)), jxv.a);
                i.a(h);
                i.close();
                jyzVar = h;
            } catch (Throwable th) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ivc.F(this.f);
        return ivc.F(jyzVar);
    }

    public final jyz b(jei jeiVar, Executor executor) {
        jxd c = jbn.c(new ifl(jeiVar, 18));
        jfd.b(jdj.a);
        jax i = iqh.i("Update ".concat(String.valueOf(this.a)));
        try {
            jyz c2 = this.g.c();
            this.h.b(new eli(c2, 20), jxv.a);
            jyz b = this.h.b(jbn.b(new igf(this, c2, c, executor, 4)), jxv.a);
            b.getClass();
            if (!c2.isDone()) {
                if (b.isDone()) {
                    ivc.O(b, c2);
                } else {
                    jyl jylVar = new jyl(b, c2, 0);
                    b.c(jylVar, jxv.a);
                    c2.c(jylVar, jxv.a);
                }
            }
            ivc.F(this.f);
            jyz h = hrb.h(b);
            i.a(h);
            i.close();
            return h;
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(jxd jxdVar) {
        synchronized (this.d) {
            this.e.add(jxdVar);
        }
    }
}
