package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmj implements jyz {
    final WeakReference a;
    public final bme b = new bmi(this);

    public bmj(bmf bmfVar) {
        this.a = new WeakReference(bmfVar);
    }

    public final boolean a(Throwable th) {
        return this.b.g(th);
    }

    @Override // defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        bmf bmfVar = (bmf) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && bmfVar != null) {
            bmfVar.a = null;
            bmfVar.b = null;
            bmfVar.c.f(null);
            return true;
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
