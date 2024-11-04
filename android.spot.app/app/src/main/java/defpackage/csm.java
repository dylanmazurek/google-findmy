package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csm {
    public static final String a = cqc.a("WorkerWrapper");

    public static final Object a(jyz jyzVar, cqb cqbVar, mmx mmxVar) {
        try {
            if (jyzVar.isDone()) {
                return b(jyzVar);
            }
            mse mseVar = new mse(mjo.w(mmxVar), 1);
            mseVar.z();
            jyzVar.c(new cri(jyzVar, mseVar, 0), cps.a);
            mseVar.d(new tn(cqbVar, jyzVar, 20));
            return mseVar.j();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
