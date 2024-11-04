package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drz {
    private static volatile drz d;
    public boolean a;
    public final Object b;
    public final Object c;

    public drz(Executor executor) {
        executor.getClass();
        this.c = new Object();
        this.b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static drz a(Context context) {
        if (d == null) {
            synchronized (drz.class) {
                if (d == null) {
                    d = new drz(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [drt, java.lang.Object] */
    public final synchronized void b(drc drcVar) {
        this.c.add(drcVar);
        if (!this.a && !this.c.isEmpty()) {
            this.a = this.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [drt, java.lang.Object] */
    public final synchronized void c(drc drcVar) {
        this.c.remove(drcVar);
        if (this.a && this.c.isEmpty()) {
            this.b.a();
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cjz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cjz, java.lang.Object] */
    public final void d() {
        cex N = this.c.N();
        if (N.b == cew.INITIALIZED) {
            N.a(new cjv(this.c));
            Object obj = this.b;
            N.getClass();
            cjy cjyVar = (cjy) obj;
            if (!cjyVar.b) {
                N.a(new nw(obj, 3));
                cjyVar.b = true;
                this.a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cjz, java.lang.Object] */
    public final void e(Bundle bundle) {
        Bundle bundle2;
        if (!this.a) {
            d();
        }
        cex N = this.c.N();
        if (!N.b.a(cew.STARTED)) {
            cjy cjyVar = (cjy) this.b;
            if (cjyVar.b) {
                if (!cjyVar.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    cjyVar.c = bundle2;
                    cjyVar.d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        cew cewVar = N.b;
        Objects.toString(cewVar);
        throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(cewVar)));
    }

    public final void f(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        cjy cjyVar = (cjy) this.b;
        Bundle bundle3 = cjyVar.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        qa e = cjyVar.a.e();
        while (e.hasNext()) {
            pz pzVar = (pz) e.next();
            bundle2.putBundle((String) pzVar.a, ((cjx) pzVar.b).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final aqf g(aqh aqhVar) {
        return (aqf) ((su) this.c).a(aqhVar);
    }

    public final void h() {
        this.a = true;
    }

    public final void i() {
        aiu aiuVar = (aiu) this.b;
        int i = aiuVar.b;
        if (i > 0) {
            Object[] objArr = aiuVar.a;
            int i2 = 0;
            do {
                ((mnw) objArr[i2]).a();
                i2++;
            } while (i2 < i);
        }
        ((aiu) this.b).f();
        ((su) this.c).d();
        this.a = false;
    }

    public final void j() {
        su suVar = (su) this.c;
        Object[] objArr = suVar.b;
        long[] jArr = suVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                aqh aqhVar = (aqh) objArr[(i << 3) + i3];
                                aqf g = ij.l(aqhVar).g(aqhVar);
                                if (g != null) {
                                    aqhVar.c = g;
                                } else {
                                    ll.h("committing a node that was not updated in the current transaction");
                                    throw new mks();
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            break;
                        }
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ((su) this.c).d();
        this.a = false;
    }

    public drz() {
        this.c = new su((byte[]) null);
        this.b = new aiu(new mnw[16]);
    }

    public drz(cjz cjzVar) {
        this.c = cjzVar;
        this.b = new cjy();
    }

    private drz(Context context) {
        Object dryVar;
        this.c = new HashSet();
        dtj dtjVar = new dtj(new drr(context));
        drs drsVar = new drs(this);
        if (Build.VERSION.SDK_INT >= 24) {
            dryVar = new drv(dtjVar, drsVar);
        } else {
            dryVar = new dry(context, dtjVar, drsVar);
        }
        this.b = dryVar;
    }
}
