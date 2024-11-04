package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtw extends mtv implements mtd {
    private final Executor a;

    public mtw(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.a = executor;
        Method method2 = nag.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = nag.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, true);
            }
        } catch (Throwable unused) {
        }
    }

    private static final void e(mnb mnbVar, RejectedExecutionException rejectedExecutionException) {
        mkm.aA(mnbVar, mkm.aI("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture h(ScheduledExecutorService scheduledExecutorService, Runnable runnable, mnb mnbVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            e(mnbVar, e);
            return null;
        }
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            e(mnbVar, e);
            mtj.b.a(mnbVar, runnable);
        }
    }

    @Override // defpackage.mtd
    public final void c(long j, msd msdVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.a;
        ScheduledFuture scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = h(scheduledExecutorService, new cri(this, msdVar, 5, null), ((mse) msdVar).b, j);
        }
        if (scheduledFuture != null) {
            ((mse) msdVar).A(new msb(scheduledFuture, 1));
        } else {
            mta.a.c(j, msdVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.a;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mtw) && ((mtw) obj).a == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mtd
    public final mtl g(long j, Runnable runnable, mnb mnbVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.a;
        ScheduledFuture scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = h(scheduledExecutorService, runnable, mnbVar, j);
        }
        if (scheduledFuture != null) {
            return new mtk(scheduledFuture);
        }
        return mta.a.u(j, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.mst
    public final String toString() {
        return this.a.toString();
    }
}
