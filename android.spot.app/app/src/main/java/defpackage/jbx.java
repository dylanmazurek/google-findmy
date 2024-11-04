package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbx extends jyh {
    private jbx(jyz jyzVar) {
        super(jyzVar);
    }

    public static jbx d(jyz jyzVar) {
        if (jyzVar instanceof jbx) {
            return (jbx) jyzVar;
        }
        return new jbx(jyzVar);
    }

    public final jbx a(Class cls, jei jeiVar, Executor executor) {
        return new jbx(jwb.g(this.b, cls, jbn.a(jeiVar), executor));
    }

    public final jbx b(Class cls, jxd jxdVar, Executor executor) {
        return new jbx(iuu.j(this.b, cls, jxdVar, executor));
    }

    public final jbx e(jei jeiVar, Executor executor) {
        return new jbx(iuu.o(this.b, jeiVar, executor));
    }

    public final jbx f(jxd jxdVar, Executor executor) {
        return new jbx(iuu.p(this.b, jxdVar, executor));
    }

    public final jbx h(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new jbx(ivc.L(this.b, j, timeUnit, scheduledExecutorService));
    }

    public final void i(jyj jyjVar, Executor executor) {
        iuu.q(this.b, jyjVar, executor);
    }
}
