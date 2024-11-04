package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jwu extends jyd implements Runnable {
    jyz a;
    Object b;

    public jwu(jyz jyzVar, Object obj) {
        jyzVar.getClass();
        this.a = jyzVar;
        obj.getClass();
        this.b = obj;
    }

    public static jyz g(jyz jyzVar, jei jeiVar, Executor executor) {
        jwt jwtVar = new jwt(jyzVar, jeiVar);
        jyzVar.c(jwtVar, ivc.A(executor, jwtVar));
        return jwtVar;
    }

    public static jyz h(jyz jyzVar, jxd jxdVar, Executor executor) {
        executor.getClass();
        jws jwsVar = new jws(jyzVar, jxdVar);
        jyzVar.c(jwsVar, ivc.A(executor, jwsVar));
        return jwsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        String str;
        jyz jyzVar = this.a;
        Object obj = this.b;
        String a = super.a();
        if (jyzVar != null) {
            str = der.c(jyzVar, "inputFuture=[", "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        }
        if (a != null) {
            return str.concat(a);
        }
        return null;
    }

    @Override // defpackage.jwq
    protected final void b() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object e(Object obj, Object obj2);

    public abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        jyz jyzVar = this.a;
        Object obj = this.b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (jyzVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.a = null;
        if (jyzVar.isCancelled()) {
            o(jyzVar);
            return;
        }
        try {
            try {
                Object e = e(obj, ivc.M(jyzVar));
                this.b = null;
                f(e);
            } catch (Throwable th) {
                try {
                    ivc.x(th);
                    n(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e2) {
            n(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            n(e3.getCause());
        } catch (Exception e4) {
            n(e4);
        }
    }
}
