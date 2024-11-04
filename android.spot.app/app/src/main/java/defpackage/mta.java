package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mta extends mtt implements Runnable {
    private static volatile Thread _thread;
    public static final mta a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        mta mtaVar = new mta();
        a = mtaVar;
        mtaVar.n(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private mta() {
    }

    private final synchronized boolean A() {
        if (B()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean B() {
        int i = debugStatus;
        if (i != 2 && i != 3) {
            return false;
        }
        return true;
    }

    private static final void C() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread y() {
        Thread thread = _thread;
        if (thread == null) {
            Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread2;
            thread2.setContextClassLoader(getClass().getClassLoader());
            thread2.setDaemon(true);
            thread2.start();
            return thread2;
        }
        return thread;
    }

    private final synchronized void z() {
        if (!B()) {
            return;
        }
        debugStatus = 3;
        ((mtt) this).c.c(null);
        this.d.c(null);
        notifyAll();
    }

    @Override // defpackage.mto
    protected final Thread e() {
        Thread thread = _thread;
        if (thread == null) {
            return y();
        }
        return thread;
    }

    @Override // defpackage.mtt, defpackage.mtd
    public final mtl g(long j, Runnable runnable, mnb mnbVar) {
        return u(j, runnable);
    }

    @Override // defpackage.mtt
    public final void h(Runnable runnable) {
        if (debugStatus == 4) {
            C();
        }
        super.h(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mto
    public final void i(long j, mtr mtrVar) {
        C();
    }

    @Override // defpackage.mtt, defpackage.mto
    public final void j() {
        debugStatus = 4;
        super.j();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = mvc.a;
        mvc.a.set(this);
        try {
            if (A()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long k = k();
                    if (k == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            k = moz.ag(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (k > 0) {
                        if (B()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, k);
                        }
                    }
                }
            }
            _thread = null;
            z();
            if (!x()) {
                e();
            }
        } catch (Throwable th) {
            _thread = null;
            z();
            if (!x()) {
                e();
            }
            throw th;
        }
    }
}
