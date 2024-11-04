package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hld implements hjy {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    private final Object d;

    public hld(hjy hjyVar, int i, hri hriVar, String str, int i2) {
        this.c = i2;
        this.a = hjyVar;
        this.b = new iia(hjyVar, i, hriVar, str);
        this.d = new iia(hjyVar, i, hriVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final jyz g(jei jeiVar) {
        if (((AtomicReference) this.b).get() != null) {
            return (jyz) jeiVar.a((hjy) ((AtomicReference) this.b).get());
        }
        return jbx.d(iuu.m(new csf(this.a, 11), this.d)).f(new ejc(this, jeiVar, 16), jxv.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jzc, java.lang.Object] */
    private final void h(Runnable runnable) {
        if (((AtomicReference) this.b).get() != null) {
            runnable.run();
        } else {
            this.d.execute(jbn.f(new hka(this, runnable, 1)));
        }
    }

    @Override // defpackage.hjy
    public final jyz a() {
        if (this.c != 0) {
            return g(new gfa(16));
        }
        return ((iia) this.b).f(true);
    }

    @Override // defpackage.hjy
    public final jyz b() {
        if (this.c != 0) {
            return g(new gfa(17));
        }
        return ((iia) this.b).f(false);
    }

    @Override // defpackage.hjy
    public final jyz c(String str, int i) {
        if (this.c != 0) {
            return g(new hkb(str, i, 0));
        }
        return ((iia) this.d).g(true, str, i);
    }

    @Override // defpackage.hjy
    public final jyz d(String str, int i) {
        if (this.c != 0) {
            return g(new hkb(str, i, 2));
        }
        return ((iia) this.d).g(false, str, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hjy, java.lang.Object] */
    @Override // defpackage.hjy
    public final void e(njz njzVar) {
        if (this.c != 0) {
            h(new hka(this, njzVar, 0, (byte[]) null));
        } else {
            this.a.e(njzVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hjy, java.lang.Object] */
    @Override // defpackage.hjy
    public final void f(njz njzVar) {
        if (this.c != 0) {
            h(new gno(this, njzVar, 20, null));
        } else {
            this.a.f(njzVar);
        }
    }

    public hld(ExecutorService executorService, jfe jfeVar, int i) {
        this.c = i;
        this.b = new AtomicReference();
        this.d = ivc.y(executorService);
        this.a = hwx.H(jfeVar);
    }
}
