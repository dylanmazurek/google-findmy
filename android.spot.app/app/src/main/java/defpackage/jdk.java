package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdk implements Runnable {
    final /* synthetic */ jzm a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ jzd d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    public jdk(jzm jzmVar, Runnable runnable, AtomicReference atomicReference, jzd jzdVar, long j, long j2) {
        this.a = jzmVar;
        this.b = runnable;
        this.c = atomicReference;
        this.d = jzdVar;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        try {
            if (!this.a.isDone()) {
                this.b.run();
                jzm jzmVar = new jzm();
                this.c.set(jzmVar);
                if (!this.a.isDone()) {
                    jzd jzdVar = this.d;
                    long j2 = this.e;
                    long j3 = this.f;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime < j2) {
                        j = (j2 + j3) - elapsedRealtime;
                    } else {
                        j = j3 - ((elapsedRealtime - j2) % j3);
                    }
                    jzmVar.o(jzdVar.schedule(this, j, TimeUnit.MILLISECONDS));
                }
            }
        } catch (Throwable th) {
            this.a.n(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
