package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nby {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final nbw f;
    public static final nbw g;

    static {
        long y;
        long y2;
        String a2 = nbk.a("kotlinx.coroutines.scheduler.default.name");
        if (a2 == null) {
            a2 = "DefaultDispatcher";
        }
        a = a2;
        y = mpp.y("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        b = y;
        c = mpp.A("kotlinx.coroutines.scheduler.core.pool.size", moz.ac(nbk.a, 2), 1, 0, 8);
        d = mpp.A("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        y2 = mpp.y("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        e = timeUnit.toNanos(y2);
        f = new nbw(0);
        g = new nbw(1);
    }
}
