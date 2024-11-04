package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jyf extends jys {
    private final jyz a;

    public jyf(jyz jyzVar) {
        jyzVar.getClass();
        this.a = jyzVar;
    }

    @Override // defpackage.jwq, defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.jwq
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.jwq, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
