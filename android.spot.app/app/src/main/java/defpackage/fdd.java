package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fdd {
    private static volatile Handler a;
    public final fcn b;
    public final Runnable c = new eta(this, 8, null);
    public volatile long d;

    public fdd(fcn fcnVar) {
        this.b = fcnVar;
    }

    public abstract void a();

    public final Handler b() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (fdd.class) {
            if (a == null) {
                a = new fqw(this.b.a.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public final void c() {
        this.d = 0L;
        b().removeCallbacks(this.c);
    }

    public final void d(long j) {
        c();
        if (j >= 0) {
            this.d = System.currentTimeMillis();
            if (!b().postDelayed(this.c, j)) {
                this.b.h().v("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean e() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }
}
