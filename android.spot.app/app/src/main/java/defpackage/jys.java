package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jys extends jwq {
    public static jys q(jyz jyzVar) {
        if (jyzVar instanceof jys) {
            return (jys) jyzVar;
        }
        return new jyf(jyzVar);
    }

    public final jys r(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (jys) ivc.L(this, j, timeUnit, scheduledExecutorService);
    }
}
