package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krr {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long b = TimeUnit.MINUTES.toMillis(30);
    private long c;
    private int d;

    public krr() {
        krk.b();
    }

    private final synchronized long c(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return a;
        }
        return (long) Math.min(Math.pow(2.0d, this.d) + ((long) (Math.random() * 1000.0d)), b);
    }

    private final synchronized void d() {
        this.d = 0;
    }

    public final synchronized void a(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.d++;
            this.c = System.currentTimeMillis() + c(i);
            return;
        }
        d();
    }

    public final synchronized boolean b() {
        if (this.d != 0) {
            if (System.currentTimeMillis() <= this.c) {
                return false;
            }
        }
        return true;
    }
}
