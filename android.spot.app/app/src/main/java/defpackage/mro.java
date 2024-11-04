package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mro {
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(mro.class, "b");
    private volatile int b;
    private final mpd c;

    public mro(boolean z, mpd mpdVar) {
        this.c = mpdVar;
        this.b = z ? 1 : 0;
    }

    public final boolean a(boolean z, boolean z2) {
        boolean compareAndSet = a.compareAndSet(this, z ? 1 : 0, z2 ? 1 : 0);
        if (compareAndSet && this.c != mrs.a) {
            return true;
        }
        return compareAndSet;
    }

    public final boolean b() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = 1;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
