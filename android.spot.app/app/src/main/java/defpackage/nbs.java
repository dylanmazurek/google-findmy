package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbs extends mtv implements Executor {
    public static final nbs a = new nbs();
    private static final mst b;

    static {
        mst mstVar = nbz.a;
        int A = mpp.A("kotlinx.coroutines.io.parallelism", moz.ac(64, nbk.a), 0, 0, 12);
        mpd.n(A);
        if (A < nby.d) {
            mpd.n(A);
            mstVar = new nav(mstVar, A);
        }
        b = mstVar;
    }

    private nbs() {
    }

    @Override // defpackage.mst
    public final void a(mnb mnbVar, Runnable runnable) {
        b.a(mnbVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(mnc.a, runnable);
    }

    @Override // defpackage.mst
    public final void f(mnb mnbVar, Runnable runnable) {
        b.f(mnbVar, runnable);
    }

    @Override // defpackage.mst
    public final String toString() {
        return "Dispatchers.IO";
    }
}
