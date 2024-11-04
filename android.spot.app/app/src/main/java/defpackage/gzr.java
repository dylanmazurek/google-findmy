package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzr {
    public gzo a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public gzr() {
    }

    public final void a(gzq gzqVar) {
        this.b.add(gzqVar);
    }

    public final void b(gzq gzqVar) {
        this.b.remove(gzqVar);
    }

    public final void c(gzo gzoVar) {
        if (!amr.i(gzoVar, this.a)) {
            this.a = gzoVar;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((gzq) it.next()).a();
            }
        }
    }

    public gzr(gzo gzoVar) {
        this.a = gzoVar;
    }
}
