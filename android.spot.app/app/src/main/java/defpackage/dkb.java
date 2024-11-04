package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkb {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile djz d;

    public dkb() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new djy());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        newSingleThreadExecutor.execute(new col(this, 11));
    }

    public final synchronized dkz a(dir dirVar) {
        dka dkaVar = (dka) this.a.get(dirVar);
        if (dkaVar == null) {
            return null;
        }
        dkz dkzVar = (dkz) dkaVar.get();
        if (dkzVar == null) {
            c(dkaVar);
        }
        return dkzVar;
    }

    public final synchronized void b(dir dirVar, dkz dkzVar) {
        dka dkaVar = (dka) this.a.put(dirVar, new dka(dirVar, dkzVar, this.b));
        if (dkaVar != null) {
            dkaVar.a();
        }
    }

    public final void c(dka dkaVar) {
        synchronized (this) {
            this.a.remove(dkaVar.a);
            if (dkaVar.b) {
                dlf dlfVar = dkaVar.c;
            }
        }
    }

    public final synchronized void d(dir dirVar) {
        dka dkaVar = (dka) this.a.remove(dirVar);
        if (dkaVar != null) {
            dkaVar.a();
        }
    }
}
