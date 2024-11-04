package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdd implements mje {
    private static final Logger c = Logger.getLogger(mdd.class.getName());
    public mev a;
    public mrx b;
    private final ScheduledExecutorService d;
    private final mcf e;

    public mdd(ScheduledExecutorService scheduledExecutorService, mcf mcfVar) {
        this.d = scheduledExecutorService;
        this.e = mcfVar;
    }

    @Override // defpackage.mje
    public final void a() {
        this.e.c();
        this.e.execute(new meg(this, 1));
    }

    @Override // defpackage.mje
    public final void b(Runnable runnable) {
        this.e.c();
        if (this.a == null) {
            this.a = new mev();
        }
        mrx mrxVar = this.b;
        if (mrxVar != null && mrxVar.b()) {
            return;
        }
        long a = this.a.a();
        this.b = this.e.d(runnable, a, TimeUnit.NANOSECONDS, this.d);
        c.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a));
    }
}
