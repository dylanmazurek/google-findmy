package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjz {
    public Context a;
    public ExecutorService b;
    public ScheduledExecutorService c;
    public Handler d;
    public hpd f;
    public final fgp e = fgp.a;
    public final fma g = new fma();
    private final jfe h = hwx.H(new eft(10));

    public final hjy a() {
        this.a.getClass();
        if (this.b == null) {
            ExecutorService executorService = this.c;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool((ThreadFactory) this.h.a());
            }
            this.b = executorService;
        }
        if (this.c == null) {
            this.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) this.h.a());
        }
        return new hld(this.b, new gvf(this, 20), 1);
    }

    public final void b(Context context) {
        this.a = context.getApplicationContext();
    }
}
