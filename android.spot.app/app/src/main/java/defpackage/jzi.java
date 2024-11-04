package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzi extends jzf implements jzd {
    final ScheduledExecutorService a;

    public jzi(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jzb schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        jzt e = jzt.e(runnable, null);
        return new jzg(e, scheduledExecutorService.schedule(e, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final jzb schedule(Callable callable, long j, TimeUnit timeUnit) {
        jzt jztVar = new jzt(callable);
        return new jzg(jztVar, this.a.schedule(jztVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final jzb scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jzh jzhVar = new jzh(runnable);
        return new jzg(jzhVar, this.a.scheduleAtFixedRate(jzhVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jzb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jzh jzhVar = new jzh(runnable);
        return new jzg(jzhVar, this.a.scheduleWithFixedDelay(jzhVar, j, j2, timeUnit));
    }
}
