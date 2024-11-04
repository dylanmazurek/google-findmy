package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyq {
    private static fyv a;

    public static synchronized fyv a() {
        fyv fyvVar;
        synchronized (fyq.class) {
            if (a == null) {
                b(new fyv());
            }
            fyvVar = a;
        }
        return fyvVar;
    }

    public static synchronized void b(fyv fyvVar) {
        synchronized (fyq.class) {
            if (a == null) {
                a = fyvVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
