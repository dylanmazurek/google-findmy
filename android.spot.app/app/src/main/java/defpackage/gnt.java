package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnt extends jyi implements jzd {
    public static final /* synthetic */ int b = 0;
    public final jzd a;
    private final jzc c;

    public gnt(jzc jzcVar, jzd jzdVar) {
        this.c = jzcVar;
        this.a = jzdVar;
    }

    @Override // defpackage.jyi
    public final jzc a() {
        return this.c;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final jzb schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        jza jzaVar = new jza(runnable);
        if (j <= 0) {
            return new gns(this.c.submit(runnable), System.nanoTime());
        }
        return new gnr(jzaVar, this.a.schedule(new gno(this, jzaVar, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final jzb schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new gns(this.c.submit(callable), System.nanoTime());
        }
        jza jzaVar = new jza(callable);
        return new gnr(jzaVar, this.a.schedule(new gno(this, jzaVar, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final jzb scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final jzl jzlVar = new jzl(this);
        final jzm jzmVar = new jzm();
        return new gnr(jzmVar, this.a.scheduleAtFixedRate(new Runnable() { // from class: gnm
            @Override // java.lang.Runnable
            public final void run() {
                final Runnable runnable2 = runnable;
                final jzm jzmVar2 = jzmVar;
                jzlVar.execute(new Runnable() { // from class: gnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = gnt.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            jzmVar2.n(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final jzb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jzm jzmVar = new jzm();
        gnr gnrVar = new gnr(jzmVar, null);
        gnrVar.a = this.a.schedule(new gnq(this, runnable, jzmVar, gnrVar, j2, timeUnit), j, timeUnit);
        return gnrVar;
    }

    @Override // defpackage.jye, defpackage.jic
    public final /* synthetic */ Object g() {
        return this.c;
    }

    @Override // defpackage.jyi, defpackage.jye
    public final /* synthetic */ ExecutorService h() {
        return this.c;
    }
}
