package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsl implements Future, dsm, dsw {
    private Object a;
    private dsi b;
    private boolean c;
    private boolean d;
    private boolean e;
    private dlb f;

    private final synchronized Object n(Long l) {
        if (!isDone() && !dtq.i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.c) {
            if (!this.e) {
                if (!this.d) {
                    if (l == null) {
                        wait(0L);
                    } else if (l.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            wait(longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.e) {
                            if (!this.c) {
                                if (!this.d) {
                                    throw new TimeoutException();
                                }
                            } else {
                                throw new CancellationException();
                            }
                        } else {
                            throw new ExecutionException(this.f);
                        }
                    } else {
                        throw new InterruptedException();
                    }
                }
            } else {
                throw new ExecutionException(this.f);
            }
        } else {
            throw new CancellationException();
        }
        return this.a;
    }

    @Override // defpackage.dsm
    public final synchronized boolean a(dlb dlbVar) {
        this.e = true;
        this.f = dlbVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.dsm
    public final synchronized boolean b(Object obj) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.dsw
    public final synchronized dsi c() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            dsi dsiVar = null;
            if (z) {
                dsi dsiVar2 = this.b;
                this.b = null;
                dsiVar = dsiVar2;
            }
            if (dsiVar != null) {
                dsiVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.dsw
    public final synchronized void d(dsi dsiVar) {
        this.b = dsiVar;
    }

    @Override // defpackage.dsw
    public final void e(dso dsoVar) {
        dsoVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.dsw
    public final synchronized void g(Object obj) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.c && !this.d) {
            if (!this.e) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dsw
    public final synchronized void l() {
    }

    public final String toString() {
        dsi dsiVar;
        String str;
        String valueOf = String.valueOf(super.toString());
        synchronized (this) {
            dsiVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dsiVar = this.b;
            }
        }
        String concat = valueOf.concat("[status=");
        if (dsiVar != null) {
            return concat + str + ", request=[" + dsiVar.toString() + "]]";
        }
        return concat + str + "]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.drk
    public final void h() {
    }

    @Override // defpackage.drk
    public final void i() {
    }

    @Override // defpackage.drk
    public final void j() {
    }

    @Override // defpackage.dsw
    public final void k() {
    }

    @Override // defpackage.dsw
    public final void m() {
    }

    @Override // defpackage.dsw
    public final void f(dso dsoVar) {
    }
}
