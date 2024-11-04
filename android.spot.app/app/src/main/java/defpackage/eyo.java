package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyo extends jwq implements Runnable, jzb {
    private Callable a;
    private final long b;

    public eyo(Callable callable, long j) {
        this.a = callable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return eyp.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.b - SystemClock.elapsedRealtime(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.a;
            callable.getClass();
            this.a = null;
            d(callable.call());
        } catch (Throwable th) {
            n(th);
            throw new RuntimeException(th);
        }
    }
}
