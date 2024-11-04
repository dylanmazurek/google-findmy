package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvf {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public bvf(View view) {
        this.d = view;
    }

    private final ViewParent n(int i) {
        if (i != 0) {
            return this.c;
        }
        return this.b;
    }

    private final void o(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] p() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final void a(boolean z) {
        if (this.a) {
            bwb.r(this.d);
        }
        this.a = z;
    }

    public final void b() {
        c(0);
    }

    public final void c(int i) {
        ViewParent n = n(i);
        if (n != null) {
            bqo.e(n, this.d, i);
            o(i, null);
        }
    }

    public final boolean d(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return bqo.f(viewParent, this.d, f, f2, z);
        }
        return false;
    }

    public final boolean e(float f, float f2) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return bqo.g(viewParent, this.d, f, f2);
        }
        return false;
    }

    public final boolean f(int i, int i2, int[] iArr, int[] iArr2) {
        return g(i, i2, iArr, iArr2, 0);
    }

    public final boolean g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent n;
        int i4;
        int i5;
        int i6;
        if (!this.a || (n = n(i3)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 != 0) {
                i4 = 0;
            } else {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
        } else {
            i4 = i;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            iArr2 = null;
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = p();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        bqo.b(n, this.d, i4, i2, iArr, i3);
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean h(int i, int i2, int i3, int i4, int[] iArr) {
        return i(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent n;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (n = n(i5)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                    } else {
                        if (iArr4 != null) {
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                        }
                        return false;
                    }
                } else {
                    i8 = i3;
                    i6 = 0;
                    i7 = 0;
                }
            } else {
                i7 = i2;
                i8 = i3;
                i6 = 0;
            }
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
        }
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i10 = iArr4[1];
        } else {
            iArr4 = null;
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] p = p();
            p[0] = 0;
            p[1] = 0;
            iArr3 = p;
        } else {
            iArr3 = iArr2;
        }
        bqo.c(n, this.d, i6, i7, i8, i4, i5, iArr3);
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    public final boolean j() {
        return k(0);
    }

    public final boolean k(int i) {
        if (n(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean l(int i) {
        return m(i, 0);
    }

    public final boolean m(int i, int i2) {
        if (k(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (bqo.h(parent, view, this.d, i, i2)) {
                    o(i2, parent);
                    bqo.d(parent, view, this.d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }
}
