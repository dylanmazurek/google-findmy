package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mw {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public mw(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final ms n(View view) {
        return (ms) view.getLayoutParams();
    }

    public final int a() {
        if (this.f.d) {
            return m(this.a.size() - 1, -1);
        }
        return m(0, this.a.size());
    }

    public final int b() {
        if (this.f.d) {
            return m(0, this.a.size());
        }
        return m(this.a.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        h();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        h();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.b;
    }

    public final View g(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.a.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) this.a.get(i3);
                if ((this.f.d && StaggeredGridLayoutManager.be(view2) <= i) || ((!this.f.d && StaggeredGridLayoutManager.be(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.a.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) this.a.get(size2);
                if ((this.f.d && StaggeredGridLayoutManager.be(view3) >= i) || ((!this.f.d && StaggeredGridLayoutManager.be(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    final void h() {
        View view = (View) this.a.get(r0.size() - 1);
        ms n = n(view);
        this.c = this.f.b.a(view);
        boolean z = n.b;
    }

    final void i() {
        View view = (View) this.a.get(0);
        ms n = n(view);
        this.b = this.f.b.d(view);
        boolean z = n.b;
    }

    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = i;
    }

    final int m(int i, int i2) {
        View view;
        boolean z;
        int j = this.f.b.j();
        int f = this.f.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            view = (View) this.a.get(i3);
            int d = this.f.b.d(view);
            int a = this.f.b.a(view);
            boolean z2 = false;
            if (d <= f) {
                z = true;
            } else {
                z = false;
            }
            if (a >= j) {
                z2 = true;
            }
            if (!z || !z2 || (d >= j && a <= f)) {
                if (i2 > i) {
                    i4 = 1;
                }
                i3 += i4;
            }
        }
        return StaggeredGridLayoutManager.be(view);
    }
}
