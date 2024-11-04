package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgm implements Future, dfv, dfu {
    private boolean a = false;
    private Object b;
    private dfy c;

    private final synchronized Object c(Long l) {
        if (this.c == null) {
            if (!this.a) {
                if (l == null) {
                    while (!isDone()) {
                        wait(0L);
                    }
                } else if (l.longValue() > 0) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long longValue = l.longValue() + uptimeMillis;
                    while (!isDone() && uptimeMillis < longValue) {
                        wait(longValue - uptimeMillis);
                        uptimeMillis = SystemClock.uptimeMillis();
                    }
                }
                if (this.c == null) {
                    if (!this.a) {
                        throw new TimeoutException();
                    }
                } else {
                    throw new ExecutionException(this.c);
                }
            }
        } else {
            throw new ExecutionException(this.c);
        }
        return this.b;
    }

    @Override // defpackage.dfu
    public final synchronized void a(dfy dfyVar) {
        this.c = dfyVar;
        notifyAll();
    }

    @Override // defpackage.dfv
    public final synchronized void b(Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.a) {
            if (this.c == null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return c(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
