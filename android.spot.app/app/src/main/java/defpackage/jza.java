package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jza extends FutureTask implements jyz {
    private final jxz a;

    public jza(Runnable runnable) {
        super(runnable, null);
        this.a = new jxz();
    }

    @Override // defpackage.jyz
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        jxz jxzVar = this.a;
        synchronized (jxzVar) {
            if (!jxzVar.b) {
                jxzVar.a = new jxy(runnable, executor, jxzVar.a);
            } else {
                jxz.a(runnable, executor);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        jxz jxzVar = this.a;
        synchronized (jxzVar) {
            if (jxzVar.b) {
                return;
            }
            jxzVar.b = true;
            jxy jxyVar = jxzVar.a;
            jxy jxyVar2 = null;
            jxzVar.a = null;
            while (jxyVar != null) {
                jxy jxyVar3 = jxyVar.c;
                jxyVar.c = jxyVar2;
                jxyVar2 = jxyVar;
                jxyVar = jxyVar3;
            }
            while (jxyVar2 != null) {
                jxz.a(jxyVar2.a, jxyVar2.b);
                jxyVar2 = jxyVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public jza(Callable callable) {
        super(callable);
        this.a = new jxz();
    }
}
