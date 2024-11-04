package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzo implements Runnable {
    jzq a;

    public jzo(jzq jzqVar) {
        this.a = jzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jyz jyzVar;
        jzq jzqVar = this.a;
        if (jzqVar != null && (jyzVar = jzqVar.a) != null) {
            this.a = null;
            if (!jyzVar.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = jzqVar.b;
                    jzqVar.b = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th) {
                            jzqVar.n(new jzp(str));
                            throw th;
                        }
                    }
                    jzqVar.n(new jzp(str + ": " + jyzVar.toString()));
                    return;
                } finally {
                    jyzVar.cancel(true);
                }
            }
            jzqVar.o(jyzVar);
        }
    }
}
