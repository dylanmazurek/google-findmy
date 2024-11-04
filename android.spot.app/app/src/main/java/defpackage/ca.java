package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ca {
    public final ag a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public ca(int i, int i2, ag agVar) {
        this.h = i;
        this.i = i2;
        this.a = agVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (!this.c) {
            if (be.Z(2)) {
                toString();
            }
            this.c = true;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(by byVar) {
        this.k.add(byVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (!this.b) {
            this.b = true;
            if (this.k.isEmpty()) {
                a();
                return;
            }
            for (by byVar : mkm.ag(this.g)) {
                if (!byVar.c) {
                    byVar.a(viewGroup);
                }
                byVar.c = true;
            }
        }
    }

    public final void f(ViewGroup viewGroup, boolean z) {
        if (this.b) {
            return;
        }
        if (z) {
            this.d = true;
        }
        e(viewGroup);
    }

    public final void g(by byVar) {
        if (this.k.remove(byVar) && this.k.isEmpty()) {
            a();
        }
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (this.h != 1) {
                    if (be.Z(2)) {
                        Objects.toString(this.a);
                        Objects.toString(a.W(this.h));
                        Objects.toString(a.W(i));
                    }
                    this.h = i;
                    return;
                }
                return;
            }
            if (be.Z(2)) {
                Objects.toString(this.a);
                Objects.toString(a.W(this.h));
                Objects.toString(a.aa(this.i));
            }
            this.h = 1;
            this.i = 3;
            this.f = true;
            return;
        }
        if (this.h == 1) {
            if (be.Z(2)) {
                Objects.toString(this.a);
                Objects.toString(a.aa(this.i));
            }
            this.h = 2;
            this.i = 2;
            this.f = true;
        }
    }

    public final void i() {
        this.f = false;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) a.W(this.h)) + " lifecycleImpact = " + ((Object) a.aa(this.i)) + " fragment = " + this.a + '}';
    }
}
