package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cex {
    public final AtomicReference a;
    public cew b;
    private pw c;
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private final ArrayList h;
    private final myu i;

    public cex() {
        this.a = new AtomicReference(null);
    }

    private final cew e(cfb cfbVar) {
        pz pzVar;
        cew cewVar;
        pw pwVar = this.c;
        cew cewVar2 = null;
        if (pwVar.c(cfbVar)) {
            pzVar = ((pz) pwVar.a.get(cfbVar)).d;
        } else {
            pzVar = null;
        }
        if (pzVar != null) {
            cewVar = ((cfd) pzVar.b).a;
        } else {
            cewVar = null;
        }
        if (!this.h.isEmpty()) {
            cewVar2 = (cew) this.h.get(r0.size() - 1);
        }
        return bsx.d(bsx.d(this.b, cewVar), cewVar2);
    }

    private final void f(cew cewVar) {
        cew cewVar2 = this.b;
        if (cewVar2 != cewVar) {
            if (cewVar2 == cew.INITIALIZED && cewVar == cew.DESTROYED) {
                throw new IllegalStateException("State must be at least CREATED to move to " + cewVar + ", but was " + this.b + " in component " + this.d.get());
            }
            this.b = cewVar;
            if (!this.f && this.e == 0) {
                this.f = true;
                i();
                this.f = false;
                if (this.b == cew.DESTROYED) {
                    this.c = new pw();
                    return;
                }
                return;
            }
            this.g = true;
        }
    }

    private final void g() {
        this.h.remove(r0.size() - 1);
    }

    private final void h(cew cewVar) {
        this.h.add(cewVar);
    }

    private final void i() {
        cfc cfcVar = (cfc) this.d.get();
        if (cfcVar != null) {
            while (true) {
                pw pwVar = this.c;
                if (pwVar.e != 0) {
                    pz pzVar = pwVar.b;
                    pzVar.getClass();
                    cew cewVar = ((cfd) pzVar.b).a;
                    pz pzVar2 = pwVar.c;
                    pzVar2.getClass();
                    cew cewVar2 = ((cfd) pzVar2.b).a;
                    if (cewVar == cewVar2 && this.b == cewVar2) {
                        break;
                    }
                    this.g = false;
                    cew cewVar3 = this.b;
                    pzVar.getClass();
                    if (cewVar3.compareTo(cewVar) < 0) {
                        pw pwVar2 = this.c;
                        py pyVar = new py(pwVar2.c, pwVar2.b);
                        pwVar2.d.put(pyVar, false);
                        while (pyVar.hasNext() && !this.g) {
                            Map.Entry next = pyVar.next();
                            next.getClass();
                            pz pzVar3 = (pz) next;
                            Object obj = pzVar3.b;
                            cfb cfbVar = (cfb) pzVar3.a;
                            cfd cfdVar = (cfd) obj;
                            while (cfdVar.a.compareTo(this.b) > 0 && !this.g && this.c.c(cfbVar)) {
                                cev a = ceu.a(cfdVar.a);
                                if (a != null) {
                                    h(a.a());
                                    cfdVar.a(cfcVar, a);
                                    g();
                                } else {
                                    cew cewVar4 = cfdVar.a;
                                    Objects.toString(cewVar4);
                                    throw new IllegalStateException("no event down from ".concat(String.valueOf(cewVar4)));
                                }
                            }
                        }
                    }
                    pz pzVar4 = this.c.c;
                    if (!this.g && pzVar4 != null && this.b.compareTo(((cfd) pzVar4.b).a) > 0) {
                        qa e = this.c.e();
                        while (e.hasNext() && !this.g) {
                            pz pzVar5 = (pz) e.next();
                            cfb cfbVar2 = (cfb) pzVar5.a;
                            cfd cfdVar2 = (cfd) pzVar5.b;
                            while (cfdVar2.a.compareTo(this.b) < 0 && !this.g && this.c.c(cfbVar2)) {
                                h(cfdVar2.a);
                                cev b = ceu.b(cfdVar2.a);
                                if (b != null) {
                                    cfdVar2.a(cfcVar, b);
                                    g();
                                } else {
                                    cew cewVar5 = cfdVar2.a;
                                    Objects.toString(cewVar5);
                                    throw new IllegalStateException("no event up from ".concat(String.valueOf(cewVar5)));
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.g = false;
            this.i.e(this.b);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    private static void j(String str) {
        if (pu.g().h()) {
        } else {
            throw new IllegalStateException(a.ag(str, "Method ", " must be called on the main thread"));
        }
    }

    public final void a(cfb cfbVar) {
        Object obj;
        cfc cfcVar;
        boolean z;
        cfbVar.getClass();
        j("addObserver");
        cew cewVar = this.b;
        cew cewVar2 = cew.DESTROYED;
        if (cewVar != cewVar2) {
            cewVar2 = cew.INITIALIZED;
        }
        cfd cfdVar = new cfd(cfbVar, cewVar2);
        pw pwVar = this.c;
        pz a = pwVar.a(cfbVar);
        if (a != null) {
            obj = a.b;
        } else {
            pwVar.a.put(cfbVar, pwVar.d(cfbVar, cfdVar));
            obj = null;
        }
        if (((cfd) obj) == null && (cfcVar = (cfc) this.d.get()) != null) {
            if (this.e == 0 && !this.f) {
                z = false;
            } else {
                z = true;
            }
            cew e = e(cfbVar);
            this.e++;
            while (cfdVar.a.compareTo(e) < 0 && this.c.c(cfbVar)) {
                h(cfdVar.a);
                cev b = ceu.b(cfdVar.a);
                if (b != null) {
                    cfdVar.a(cfcVar, b);
                    g();
                    e = e(cfbVar);
                } else {
                    cew cewVar3 = cfdVar.a;
                    Objects.toString(cewVar3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(cewVar3)));
                }
            }
            if (!z) {
                i();
            }
            this.e--;
        }
    }

    public final void b(cev cevVar) {
        cevVar.getClass();
        j("handleLifecycleEvent");
        f(cevVar.a());
    }

    public final void c(cfb cfbVar) {
        cfbVar.getClass();
        j("removeObserver");
        this.c.b(cfbVar);
    }

    public final void d(cew cewVar) {
        cewVar.getClass();
        j("setCurrentState");
        f(cewVar);
    }

    public cex(cfc cfcVar) {
        this();
        this.c = new pw();
        this.b = cew.INITIALIZED;
        this.h = new ArrayList();
        this.d = new WeakReference(cfcVar);
        this.i = myv.a(cew.INITIALIZED);
    }
}
