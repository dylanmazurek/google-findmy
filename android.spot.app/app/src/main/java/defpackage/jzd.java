package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface jzd extends ScheduledExecutorService, jzc {
    jzb c(Runnable runnable, long j, TimeUnit timeUnit);

    jzb d(Callable callable, long j, TimeUnit timeUnit);

    jzb e(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    jzb f(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
