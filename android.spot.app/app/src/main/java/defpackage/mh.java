package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mh {
    public static final List a = Collections.emptyList();
    public final View b;
    public WeakReference c;
    int k;
    RecyclerView p;
    lj q;
    public int d = -1;
    public int e = -1;
    public long f = -1;
    int g = -1;
    int h = -1;
    public mh i = null;
    public mh j = null;
    private int r = 0;
    lw l = null;
    boolean m = false;
    public int n = 0;
    public int o = -1;

    public mh(View view) {
        if (view != null) {
            this.b = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void B() {
        c(1024);
    }

    public final FrameLayout C() {
        return (FrameLayout) this.b;
    }

    public final int a() {
        RecyclerView recyclerView = this.p;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        int i = this.h;
        if (i == -1) {
            return this.d;
        }
        return i;
    }

    public final void c(int i) {
        this.k = i | this.k;
    }

    public final void d() {
        this.e = -1;
        this.h = -1;
    }

    public final void e() {
        this.k &= -1025;
    }

    public final void f() {
        this.k &= -33;
    }

    public final void g() {
        this.k &= -257;
    }

    public final void h(int i, boolean z) {
        if (this.e == -1) {
            this.e = this.d;
        }
        int i2 = this.h;
        if (i2 == -1) {
            i2 = this.d;
            this.h = i2;
        }
        if (z) {
            this.h = i2 + i;
        }
        this.d += i;
        if (this.b.getLayoutParams() != null) {
            ((ls) this.b.getLayoutParams()).e = true;
        }
    }

    public final void i() {
        int i = RecyclerView.W;
        this.k = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1L;
        this.h = -1;
        this.r = 0;
        this.i = null;
        this.j = null;
        e();
        this.n = 0;
        this.o = -1;
        RecyclerView.s(this);
    }

    public final void j(int i, int i2) {
        this.k = (i & i2) | (this.k & (~i2));
    }

    public final void k(boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.r - 1;
        } else {
            i = this.r + 1;
        }
        this.r = i;
        if (i < 0) {
            this.r = 0;
            int i3 = RecyclerView.W;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i == 1) {
                i2 = this.k | 16;
            } else if (z && i == 0) {
                i2 = this.k & (-17);
            }
            this.k = i2;
        }
        int i4 = RecyclerView.W;
    }

    public final void l(lw lwVar, boolean z) {
        this.l = lwVar;
        this.m = z;
    }

    public final void m() {
        this.l.m(this);
    }

    public final boolean n(int i) {
        if ((i & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.b.getParent() != null && this.b.getParent() != this.p) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.k & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.k & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.k & 16) == 0) {
            View view = this.b;
            int[] iArr = bwn.a;
            if (!view.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean s() {
        if ((this.k & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.d + " id=" + this.f + ", oldPos=" + this.e + ", pLpos:" + this.h);
        if (t()) {
            sb.append(" scrap ");
            if (true != this.m) {
                str = "[attachedScrap]";
            } else {
                str = "[changeScrap]";
            }
            sb.append(str);
        }
        if (q()) {
            sb.append(" invalid");
        }
        if (!p()) {
            sb.append(" unbound");
        }
        if (w()) {
            sb.append(" update");
        }
        if (s()) {
            sb.append(" removed");
        }
        if (x()) {
            sb.append(" ignored");
        }
        if (u()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.r + ")");
        }
        if ((this.k & 512) != 0 || q()) {
            sb.append(" undefined adapter position");
        }
        if (this.b.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        if ((this.k & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if ((this.k & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.k & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.k & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.k & 32) != 0) {
            return true;
        }
        return false;
    }

    public void z() {
    }

    public void A(dzp dzpVar) {
    }
}
