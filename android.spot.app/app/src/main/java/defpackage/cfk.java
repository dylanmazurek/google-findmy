package defpackage;

import android.os.Looper;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cfk {
    public static final Object b = new Object();
    private final qd a;
    public final Object c;
    int d;
    public boolean e;
    public volatile Object f;
    public int g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public cfk() {
        this.c = new Object();
        this.a = new qd();
        this.d = 0;
        Object obj = b;
        this.f = obj;
        this.k = new nl(this, 19, null);
        this.h = obj;
        this.g = -1;
    }

    private final void a(cfj cfjVar) {
        if (cfjVar.d) {
            if (!cfjVar.cq()) {
                cfjVar.d(false);
                return;
            }
            int i = cfjVar.e;
            int i2 = this.g;
            if (i < i2) {
                cfjVar.e = i2;
                cfjVar.c.d(this.h);
            }
        }
    }

    static void e(String str) {
        if (pu.g().h()) {
        } else {
            throw new IllegalStateException(a.ag(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public final Object d() {
        Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    public final void f(cfj cfjVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (cfjVar != null) {
                a(cfjVar);
            } else {
                qa e = this.a.e();
                while (e.hasNext()) {
                    a((cfj) ((pz) e.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (this.j) {
                cfjVar = null;
            } else {
                this.i = false;
                return;
            }
        }
    }

    public final void g(cfc cfcVar, cfo cfoVar) {
        e("observe");
        if (cfcVar.N().b != cew.DESTROYED) {
            cfi cfiVar = new cfi(this, cfcVar, cfoVar);
            cfj cfjVar = (cfj) this.a.f(cfoVar, cfiVar);
            if (cfjVar != null && !cfjVar.c(cfcVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (cfjVar != null) {
                return;
            }
            cfcVar.N().a(cfiVar);
        }
    }

    public final void h(cfo cfoVar) {
        e("observeForever");
        cfh cfhVar = new cfh(this, cfoVar);
        cfj cfjVar = (cfj) this.a.f(cfoVar, cfhVar);
        if (!(cfjVar instanceof cfi)) {
            if (cfjVar != null) {
                return;
            }
            cfhVar.d(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public final void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.k;
        iz izVar = pu.g().b;
        pv pvVar = (pv) izVar;
        if (pvVar.c == null) {
            synchronized (pvVar.a) {
                if (((pv) izVar).c == null) {
                    ((pv) izVar).c = pv.g(Looper.getMainLooper());
                }
            }
        }
        pvVar.c.post(runnable);
    }

    public void j(cfo cfoVar) {
        e("removeObserver");
        cfj cfjVar = (cfj) this.a.b(cfoVar);
        if (cfjVar == null) {
            return;
        }
        cfjVar.b();
        cfjVar.d(false);
    }

    public final void k(cfc cfcVar) {
        e("removeObservers");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            pz pzVar = (pz) ((qb) it).next();
            if (((cfj) pzVar.b).c(cfcVar)) {
                j((cfo) pzVar.a);
            }
        }
    }

    public void l(Object obj) {
        e("setValue");
        this.g++;
        this.h = obj;
        f(null);
    }

    public final boolean m() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.h != b) {
            return true;
        }
        return false;
    }

    public cfk(Object obj) {
        this.c = new Object();
        this.a = new qd();
        this.d = 0;
        this.f = b;
        this.k = new nl(this, 19, null);
        this.h = obj;
        this.g = 0;
    }

    public void b() {
    }

    public void c() {
    }
}
