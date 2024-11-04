package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mcg extends lzh {
    private static final Logger b = Logger.getLogger(mcg.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.lzh
    public final lzi a() {
        lzi lziVar = (lzi) a.get();
        if (lziVar == null) {
            return lzi.b;
        }
        return lziVar;
    }

    @Override // defpackage.lzh
    public final lzi b(lzi lziVar) {
        lzi a2 = a();
        a.set(lziVar);
        return a2;
    }

    @Override // defpackage.lzh
    public final void c(lzi lziVar, lzi lziVar2) {
        if (a() != lziVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (lziVar2 != lzi.b) {
            a.set(lziVar2);
        } else {
            a.set(null);
        }
    }
}
