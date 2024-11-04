package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class jxb extends jwl {
    public static final jwy a;
    private static final jyy b = new jyy(jxb.class);
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        Throwable th;
        jwy jxaVar;
        try {
            jxaVar = new jwz(AtomicReferenceFieldUpdater.newUpdater(jxb.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(jxb.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            jxaVar = new jxa();
        }
        Throwable th3 = th;
        a = jxaVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public jxb(int i) {
        this.remaining = i;
    }

    public abstract void e(Set set);
}
