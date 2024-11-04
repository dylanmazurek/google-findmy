package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrq {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(mrq.class, "b");
    public volatile long b;
    public final mpd c;

    public mrq(long j, mpd mpdVar) {
        this.c = mpdVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean compareAndSet = a.compareAndSet(this, j, j2);
        if (compareAndSet && this.c != mrs.a) {
            return true;
        }
        return compareAndSet;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
