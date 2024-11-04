package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mil {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final jfd g;

    public mil(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, jfd jfdVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = jfdVar;
        jfdVar.d();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
