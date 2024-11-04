package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class op {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;
    public mnw c;

    public op(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(nv nvVar) {
        this.a.add(nvVar);
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nv) it.next()).b();
        }
    }

    public final void g(nv nvVar) {
        this.a.remove(nvVar);
    }

    public final void h(boolean z) {
        this.b = z;
        mnw mnwVar = this.c;
        if (mnwVar != null) {
            mnwVar.a();
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(nu nuVar) {
    }
}
