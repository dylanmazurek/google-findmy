package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ox {
    public final mlv a;
    public op b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public ox() {
        this(null);
    }

    private final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z) {
                if (!this.f) {
                    or.a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                    this.f = true;
                    return;
                }
                return;
            }
            if (this.f) {
                or.a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final nv a(op opVar) {
        this.a.add(opVar);
        ov ovVar = new ov(this, opVar);
        opVar.e(ovVar);
        f();
        opVar.c = new ow(this, 0);
        return ovVar;
    }

    public final void b(cfc cfcVar, op opVar) {
        cfcVar.getClass();
        opVar.getClass();
        cex N = cfcVar.N();
        if (N.b == cew.DESTROYED) {
            return;
        }
        opVar.e(new ou(this, N, opVar));
        f();
        opVar.c = new ow(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        op opVar;
        op opVar2 = this.b;
        if (opVar2 == null) {
            mlv mlvVar = this.a;
            ListIterator listIterator = mlvVar.listIterator(mlvVar.a);
            while (true) {
                if (listIterator.hasPrevious()) {
                    opVar = listIterator.previous();
                    if (((op) opVar).b) {
                        break;
                    }
                } else {
                    opVar = 0;
                    break;
                }
            }
            opVar2 = opVar;
        }
        this.b = null;
        if (opVar2 != null) {
            opVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        op opVar;
        op opVar2 = this.b;
        if (opVar2 == null) {
            mlv mlvVar = this.a;
            ListIterator listIterator = mlvVar.listIterator(mlvVar.a);
            while (true) {
                if (listIterator.hasPrevious()) {
                    opVar = listIterator.previous();
                    if (((op) opVar).b) {
                        break;
                    }
                } else {
                    opVar = 0;
                    break;
                }
            }
            opVar2 = opVar;
        }
        this.b = null;
        if (opVar2 != null) {
            opVar2.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        g(this.g);
    }

    public final void f() {
        boolean z = this.g;
        mlv mlvVar = this.a;
        boolean z2 = false;
        if (!mlvVar.isEmpty()) {
            Iterator<E> it = mlvVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((op) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            g(z2);
        }
    }

    public ox(Runnable runnable) {
        OnBackInvokedCallback a;
        this.c = runnable;
        this.a = new mlv();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                a = ot.a.a(new oq(this, 1), new oq(this, 0), new ob(this, 3), new ob(this, 4));
            } else {
                a = or.a.a(new ob(this, 5));
            }
            this.d = a;
        }
    }
}
