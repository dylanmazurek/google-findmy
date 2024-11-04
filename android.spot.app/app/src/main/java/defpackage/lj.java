package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lj {
    public final lk b = new lk();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int d(int i) {
        return 0;
    }

    public long e(int i) {
        return -1L;
    }

    public abstract mh f(ViewGroup viewGroup, int i);

    public final void g() {
        this.b.a();
    }

    public final void h(int i, int i2) {
        this.b.c(i, i2);
    }

    public final void i(int i, int i2) {
        this.b.d(i, i2);
    }

    public abstract void k(mh mhVar, int i);

    public final void o(int i, int i2) {
        this.b.f(i, i2);
    }

    public boolean p() {
        return false;
    }

    public final void q(eu euVar) {
        this.b.registerObserver(euVar);
    }

    public final void r(eu euVar) {
        this.b.unregisterObserver(euVar);
    }

    public void j(RecyclerView recyclerView) {
    }

    public void l(RecyclerView recyclerView) {
    }

    public void m(mh mhVar) {
    }

    public void n(mh mhVar) {
    }
}
