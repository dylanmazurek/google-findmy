package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkj {
    static final lyr a;
    private static final Logger b = Logger.getLogger(mkj.class.getName());

    static {
        if (!ivc.o(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new lyr("internal-stub-type", null);
    }

    private mkj() {
    }

    public static jyz a(lyv lyvVar, Object obj) {
        mkg mkgVar = new mkg(lyvVar);
        c(lyvVar, obj, new mkh(mkgVar));
        return mkgVar;
    }

    private static RuntimeException b(lyv lyvVar, Throwable th) {
        try {
            lyvVar.c(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
        throw ((RuntimeException) th);
    }

    private static void c(lyv lyvVar, Object obj, mkh mkhVar) {
        lyvVar.a(mkhVar, new mbc());
        mkhVar.a.a.e(2);
        try {
            lyvVar.f(obj);
            lyvVar.d();
        } catch (Error | RuntimeException e) {
            throw b(lyvVar, e);
        }
    }
}
