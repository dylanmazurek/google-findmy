package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzq extends jyd {
    public jyz a;
    public ScheduledFuture b;

    public jzq(jyz jyzVar) {
        jyzVar.getClass();
        this.a = jyzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        jyz jyzVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (jyzVar != null) {
            String c = der.c(jyzVar, "inputFuture=[", "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return c + ", remaining delay=[" + delay + " ms]";
                }
                return c;
            }
            return c;
        }
        return null;
    }

    @Override // defpackage.jwq
    protected final void b() {
        m(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
