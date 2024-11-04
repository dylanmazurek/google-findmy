package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxv extends fxs {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final miv e = new miv();

    private final void v() {
        fma.aO(this.b, "Task is not yet complete");
    }

    private final void w() {
        if (!this.c) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        String str;
        if (this.b) {
            if (h()) {
                Exception d = d();
                if (d == null) {
                    if (!i()) {
                        if (this.c) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(String.valueOf(e())));
                    }
                } else {
                    str = "failure";
                }
                throw new fxj("Complete with: ".concat(str), d);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (!this.b) {
                return;
            }
            this.e.d(this);
        }
    }

    @Override // defpackage.fxs
    public final fxs a(Executor executor, fxi fxiVar) {
        fxv fxvVar = new fxv();
        this.e.c(new fxk(executor, fxiVar, fxvVar, 1));
        y();
        return fxvVar;
    }

    @Override // defpackage.fxs
    public final fxs b(Executor executor, fxi fxiVar) {
        fxv fxvVar = new fxv();
        this.e.c(new fxp(executor, fxiVar, fxvVar, 1));
        y();
        return fxvVar;
    }

    @Override // defpackage.fxs
    public final fxs c(Executor executor, fxr fxrVar) {
        fxv fxvVar = new fxv();
        this.e.c(new fxp(executor, fxrVar, fxvVar, 0));
        y();
        return fxvVar;
    }

    @Override // defpackage.fxs
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.fxs
    public final Object e() {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.d;
            if (exc == null) {
                obj = this.f;
            } else {
                throw new fxq(exc);
            }
        }
        return obj;
    }

    @Override // defpackage.fxs
    public final Object f(Class cls) {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            if (!cls.isInstance(this.d)) {
                Exception exc = this.d;
                if (exc == null) {
                    obj = this.f;
                } else {
                    throw new fxq(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.d));
            }
        }
        return obj;
    }

    @Override // defpackage.fxs
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.fxs
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.fxs
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fxs
    public final void j(Executor executor, fxl fxlVar) {
        this.e.c(new fxk(executor, fxlVar, 0));
        y();
    }

    @Override // defpackage.fxs
    public final void k(fxm fxmVar) {
        l(fxu.a, fxmVar);
    }

    @Override // defpackage.fxs
    public final void l(Executor executor, fxm fxmVar) {
        this.e.c(new fxk(executor, fxmVar, 2));
        y();
    }

    @Override // defpackage.fxs
    public final void m(Executor executor, fxn fxnVar) {
        this.e.c(new fxk(executor, fxnVar, 3));
        y();
    }

    @Override // defpackage.fxs
    public final void n(fxo fxoVar) {
        o(fxu.a, fxoVar);
    }

    @Override // defpackage.fxs
    public final void o(Executor executor, fxo fxoVar) {
        this.e.c(new fxk(executor, fxoVar, 4));
        y();
    }

    @Override // defpackage.fxs
    public final void p(fxl fxlVar) {
        j(fxu.a, fxlVar);
    }

    @Override // defpackage.fxs
    public final void q(fxn fxnVar) {
        m(fxu.a, fxnVar);
    }

    public final void r(Exception exc) {
        fma.aS(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.b = true;
            this.d = exc;
        }
        this.e.d(this);
    }

    public final void s(Object obj) {
        synchronized (this.a) {
            x();
            this.b = true;
            this.f = obj;
        }
        this.e.d(this);
    }

    public final boolean t(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.d(this);
            return true;
        }
    }

    public final void u() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.d(this);
        }
    }
}
