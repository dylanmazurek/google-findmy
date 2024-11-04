package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbw {
    public final jxp a;

    public jbw(jxp jxpVar) {
        this.a = jxpVar;
    }

    public static jbw b(jyz jyzVar) {
        return new jbw(new jxp(jyzVar));
    }

    public static jbw c(jxl jxlVar, Executor executor) {
        int i = jbn.a;
        idf idfVar = new idf(jbu.b(), jxlVar, 2);
        jxk jxkVar = new jxk();
        jzt jztVar = new jzt(new jxf(idfVar, jxkVar, 0));
        executor.execute(jztVar);
        return new jbw(new jxp(jztVar, jxkVar));
    }

    public final jbw a(Class cls, jxj jxjVar, Executor executor) {
        jxj d = jbn.d(jxjVar);
        jxp jxpVar = this.a;
        return new jbw(jxpVar.f((jys) jwb.h(jxpVar.d, cls, new jxi(jxpVar, d), executor)));
    }

    public final jbw d(jxm jxmVar, Executor executor) {
        int i = jbn.a;
        iby ibyVar = new iby(jbu.b(), jxmVar, 2);
        jxp jxpVar = this.a;
        return new jbw(jxpVar.f((jys) jwu.h(jxpVar.d, new jxh(jxpVar, ibyVar, 0), executor)));
    }

    public final jbw e(jxj jxjVar, Executor executor) {
        jxj d = jbn.d(jxjVar);
        jxp jxpVar = this.a;
        return new jbw(jxpVar.f((jys) jwu.h(jxpVar.d, new jxh(jxpVar, d, 2), executor)));
    }

    public final jbx f() {
        return jbx.d(this.a.g());
    }

    public final boolean g() {
        Logger a = jxp.a.a();
        Level level = Level.FINER;
        jxp jxpVar = this.a;
        a.logp(level, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", jxpVar);
        boolean cancel = jxpVar.d.cancel(false);
        if (cancel) {
            jxpVar.c();
        }
        return cancel;
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
