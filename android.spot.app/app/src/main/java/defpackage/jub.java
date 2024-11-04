package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jub extends jwq {
    public static final Object a;
    public final jfe b;
    public final jtw c;
    public final jet d;
    public final jfd e;
    public final jzd f;
    public final jua g;
    private final Executor l;
    public volatile int h = 0;
    private final AtomicReference m = new AtomicReference(ivc.E(new Object()));

    static {
        Logger.getLogger(jub.class.getCanonicalName());
        a = new Object();
    }

    public jub(jfe jfeVar, jtw jtwVar, jet jetVar, Executor executor, ScheduledExecutorService scheduledExecutorService, jfk jfkVar, jua juaVar) {
        this.b = jfeVar;
        this.c = jtwVar;
        this.d = jetVar;
        this.l = new jze(this, executor, 1);
        this.f = ivc.z(scheduledExecutorService);
        this.g = juaVar;
        this.e = jfd.b(jfkVar);
        e(0L, TimeUnit.MILLISECONDS);
        c(new gpm(7), executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        String ag;
        jyz jyzVar = (jyz) this.m.get();
        String obj = jyzVar.toString();
        jtw jtwVar = this.c;
        jet jetVar = this.d;
        String obj2 = this.b.toString();
        String obj3 = jetVar.toString();
        String obj4 = jtwVar.toString();
        int i = this.h;
        if (jyzVar.isDone()) {
            ag = "";
        } else {
            ag = a.ag(obj, ", activeTry=[", "]");
        }
        return "futureSupplier=[" + obj2 + "], shouldContinue=[" + obj3 + "], strategy=[" + obj4 + "], tries=[" + i + "]" + ag;
    }

    @Override // defpackage.jwq
    protected final void b() {
        jyz jyzVar = (jyz) this.m.getAndSet(ivc.C());
        if (jyzVar != null) {
            boolean z = true;
            if (isCancelled() && !p()) {
                z = false;
            }
            jyzVar.cancel(z);
        }
    }

    public final void e(final long j, final TimeUnit timeUnit) {
        jzm jzmVar = new jzm();
        jyz jyzVar = (jyz) this.m.getAndSet(jzmVar);
        if (j != 0) {
            jyzVar = jwu.h(jyzVar, new jxd() { // from class: jtx
                @Override // defpackage.jxd
                public final jyz a(Object obj) {
                    return jub.this.f.schedule(new hxl(4), j, timeUnit);
                }
            }, jxv.a);
        }
        jyz h = jwu.h(jyzVar, new jty(this, 0), this.l);
        jzmVar.o(jwb.h(h, Exception.class, new ibz(this, h, 15), this.l));
        jzmVar.c(new jtz(this, jzmVar), jxv.a);
    }
}
