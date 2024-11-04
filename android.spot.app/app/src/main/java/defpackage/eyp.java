package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyp extends jwr implements jzd {
    public static final /* synthetic */ int b = 0;
    public final Handler a;

    public eyp(Looper looper) {
        this.a = new Handler(looper);
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        if (delay == delay2) {
            return 0;
        }
        return 1;
    }

    private final jzb i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        eyn eynVar = new eyn(this, runnable, millis + SystemClock.elapsedRealtime(), timeUnit.toMillis(j2), z);
        this.a.postDelayed(eynVar, millis);
        j(eynVar, eynVar);
        return eynVar;
    }

    private final void j(jyz jyzVar, Runnable runnable) {
        jyzVar.c(new fbh((Object) this, (Object) runnable, 1, (byte[]) null), jxv.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jwr, defpackage.jzc
    /* renamed from: b */
    public final jyz submit(final Callable callable) {
        final jzm jzmVar = new jzm();
        this.a.post(new Runnable() { // from class: eym
            @Override // java.lang.Runnable
            public final void run() {
                int i = eyp.b;
                jzm jzmVar2 = jzm.this;
                try {
                    jzmVar2.d(callable.call());
                } catch (Exception e) {
                    jzmVar2.n(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return jzmVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final jzb schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final jzb schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        eyo eyoVar = new eyo(callable, SystemClock.elapsedRealtime() + millis);
        this.a.postDelayed(eyoVar, millis);
        j(eyoVar, eyoVar);
        return eyoVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final jzb scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final jzb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jwr, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
