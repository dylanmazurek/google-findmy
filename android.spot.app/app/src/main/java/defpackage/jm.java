package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jm {
    public View d;
    public final njz e;
    public int c = 0;
    public final jl a = new jl();
    public final List b = new ArrayList();

    public jm(njz njzVar) {
        this.e = njzVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int C = this.e.C();
        int i2 = i;
        while (i2 < C) {
            int a = i - (i2 - this.a.a(i2));
            if (a == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a;
        }
        return -1;
    }

    public final int a() {
        return this.e.C() - this.b.size();
    }

    public final int b() {
        return this.e.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        int D = this.e.D(view);
        if (D == -1 || this.a.f(D)) {
            return -1;
        }
        return D - this.a.a(D);
    }

    public final View d(int i) {
        return this.e.E(m(i));
    }

    public final View e(int i) {
        return this.e.E(i);
    }

    public final void f(View view, int i, boolean z) {
        int m;
        if (i < 0) {
            m = this.e.C();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        njz njzVar = this.e;
        ((RecyclerView) njzVar.a).addView(view, m);
        mh h = RecyclerView.h(view);
        RecyclerView recyclerView = (RecyclerView) njzVar.a;
        lj ljVar = recyclerView.l;
        if (ljVar != null && h != null) {
            ljVar.m(h);
        }
        List list = recyclerView.w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ls lsVar = (ls) view.getLayoutParams();
                if (lsVar.width != -1 || lsVar.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m;
        if (i < 0) {
            m = this.e.C();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        njz njzVar = this.e;
        mh h = RecyclerView.h(view);
        if (h != null) {
            if (!h.u() && !h.x()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + h + ((RecyclerView) njzVar.a).k());
            }
            h.g();
        }
        ((RecyclerView) njzVar.a).attachViewToParent(view, m, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        jl jlVar = this.a;
        int m = m(i);
        jlVar.g(m);
        njz njzVar = this.e;
        View E = njzVar.E(m);
        if (E != null) {
            mh h = RecyclerView.h(E);
            if (h != null) {
                if (h.u() && !h.x()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + h + ((RecyclerView) njzVar.a).k());
                }
                h.c(256);
            }
        } else {
            int i2 = RecyclerView.W;
        }
        ((RecyclerView) njzVar.a).detachViewFromParent(m);
    }

    public final void i(View view) {
        this.b.add(view);
        mh h = RecyclerView.h(view);
        if (h != null) {
            njz njzVar = this.e;
            int i = h.o;
            if (i != -1) {
                h.n = i;
            } else {
                h.n = h.b.getImportantForAccessibility();
            }
            ((RecyclerView) njzVar.a).al(h, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        int i2 = this.c;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int m = m(i);
                    View E = this.e.E(m);
                    if (E != null) {
                        this.c = 1;
                        this.d = E;
                        if (this.a.g(m)) {
                            l(E);
                        }
                        this.e.G(m);
                    }
                    return;
                } finally {
                    this.c = 0;
                    this.d = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.F(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
