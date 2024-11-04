package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nab implements jyz {
    public final jzm a = new jzm();
    public boolean b;
    private final muf c;

    public nab(muf mufVar) {
        this.c = mufVar;
    }

    private static final void a(Object obj) {
        if (!(obj instanceof naa)) {
        } else {
            throw new CancellationException().initCause(((naa) obj).a);
        }
    }

    @Override // defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (this.a.cancel(z)) {
            this.c.s(null);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.a.get();
        a(obj);
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.a.isCancelled()) {
            return true;
        }
        if (isDone() && !this.b) {
            try {
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.b = true;
            }
            if (amr.f(this.a) instanceof naa) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object f = amr.f(this.a);
                if (f instanceof naa) {
                    sb.append("CANCELLED, cause=[" + ((naa) f).a + "]");
                } else {
                    sb.append(a.af(f, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.a + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.a.get(j, timeUnit);
        a(obj);
        return obj;
    }
}
