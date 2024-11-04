package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnq implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ jzm c;
    final /* synthetic */ gnr d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ gnt g;

    public gnq(gnt gntVar, Runnable runnable, jzm jzmVar, gnr gnrVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = jzmVar;
        this.d = gnrVar;
        this.e = j;
        this.f = timeUnit;
        this.g = gntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final jzm jzmVar = this.c;
        final gnr gnrVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: gnp
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                gnq gnqVar = gnq.this;
                Runnable runnable2 = runnable;
                jzm jzmVar2 = jzmVar;
                gnr gnrVar2 = gnrVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (!jzmVar2.isDone()) {
                        jzb schedule = gnqVar.g.a.schedule(gnqVar.a, j2, timeUnit2);
                        gnrVar2.a = schedule;
                        if (gnrVar2.isDone()) {
                            schedule.cancel(false);
                        }
                    }
                } catch (Throwable th) {
                    jzmVar2.n(th);
                }
            }
        });
    }
}
