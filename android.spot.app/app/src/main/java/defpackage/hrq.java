package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrq {
    private static final hrp g = new hrp() { // from class: hrn
        @Override // defpackage.hrp
        public final void a(int i, String str) {
        }
    };
    public final lqz a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile hrp d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public hrq(hnq hnqVar, jzd jzdVar, Executor executor, lqz lqzVar) {
        this.a = lqzVar;
        this.b = executor;
        hnqVar.a(new hro(this, jzdVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
