package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbh {
    public final mbu a;
    public final mcf b;
    public final mbm c;
    public final ScheduledExecutorService d;
    public final Executor e;
    private final lyu f;

    public mbh(Integer num, mbu mbuVar, mcf mcfVar, mbm mbmVar, ScheduledExecutorService scheduledExecutorService, lyu lyuVar, Executor executor) {
        num.intValue();
        this.a = mbuVar;
        this.b = mcfVar;
        this.c = mbmVar;
        this.d = scheduledExecutorService;
        this.f = lyuVar;
        this.e = executor;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.d("defaultPort", 443);
        q.b("proxyDetector", this.a);
        q.b("syncContext", this.b);
        q.b("serviceConfigParser", this.c);
        q.b("scheduledExecutorService", this.d);
        q.b("channelLogger", this.f);
        q.b("executor", this.e);
        q.b("overrideAuthority", null);
        return q.toString();
    }
}
