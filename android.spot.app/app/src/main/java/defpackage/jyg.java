package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jyg extends jic implements Future, jyz {
    @Override // defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        j().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return k().cancel(z);
    }

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return k().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return k().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return k().isDone();
    }

    protected abstract jyz j();

    protected /* bridge */ /* synthetic */ Future k() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return k().get(j, timeUnit);
    }
}
