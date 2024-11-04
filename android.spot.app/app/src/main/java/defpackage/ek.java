package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ek extends Drawable.ConstantState {
    int A;
    public int B;
    public int C;
    boolean D;
    ColorFilter E;
    boolean F;
    ColorStateList G;
    PorterDuff.Mode H;
    boolean I;
    boolean J;
    final el c;
    Resources d;
    int e;
    public int f;
    int g;
    SparseArray h;
    Drawable[] i;
    int j;
    public boolean k;
    boolean l;
    Rect m;
    public boolean n;
    boolean o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public boolean z;

    public ek(ek ekVar, el elVar, Resources resources) {
        Resources resources2;
        int i;
        this.k = false;
        this.n = false;
        this.z = true;
        this.B = 0;
        this.C = 0;
        this.c = elVar;
        if (resources != null) {
            resources2 = resources;
        } else if (ekVar != null) {
            resources2 = ekVar.d;
        } else {
            resources2 = null;
        }
        this.d = resources2;
        if (ekVar != null) {
            i = ekVar.e;
        } else {
            i = 0;
        }
        int e = el.e(resources, i);
        this.e = e;
        if (ekVar != null) {
            this.f = ekVar.f;
            this.g = ekVar.g;
            this.x = true;
            this.y = true;
            this.k = ekVar.k;
            this.n = ekVar.n;
            this.z = ekVar.z;
            this.A = ekVar.A;
            this.B = ekVar.B;
            this.C = ekVar.C;
            this.D = ekVar.D;
            this.E = ekVar.E;
            this.F = ekVar.F;
            this.G = ekVar.G;
            this.H = ekVar.H;
            this.I = ekVar.I;
            this.J = ekVar.J;
            if (ekVar.e == e) {
                if (ekVar.l) {
                    Rect rect = ekVar.m;
                    this.m = rect != null ? new Rect(rect) : null;
                    this.l = true;
                }
                if (ekVar.o) {
                    this.p = ekVar.p;
                    this.q = ekVar.q;
                    this.r = ekVar.r;
                    this.s = ekVar.s;
                    this.o = true;
                }
            }
            if (ekVar.t) {
                this.u = ekVar.u;
                this.t = true;
            }
            if (ekVar.v) {
                this.w = ekVar.w;
                this.v = true;
            }
            Drawable[] drawableArr = ekVar.i;
            this.i = new Drawable[drawableArr.length];
            int i2 = ekVar.j;
            this.j = i2;
            SparseArray sparseArray = ekVar.h;
            if (sparseArray != null) {
                this.h = sparseArray.clone();
            } else {
                this.h = new SparseArray(i2);
            }
            int i3 = this.j;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.h.put(i4, constantState);
                    } else {
                        this.i[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.i = new Drawable[10];
        this.j = 0;
    }

    private final Drawable a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            bpu.k(drawable, this.A);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.c);
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.j;
        Drawable[] drawableArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (bsc.i(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.h.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        throw null;
    }

    public final int f(Drawable drawable) {
        int i = this.j;
        if (i >= this.i.length) {
            j(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.c);
        this.i[i] = drawable;
        this.j++;
        this.g = drawable.getChangingConfigurations() | this.g;
        k();
        this.m = null;
        this.l = false;
        this.o = false;
        this.x = false;
        return i;
    }

    public final Drawable g(int i) {
        int indexOfKey;
        Drawable drawable = this.i[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.h;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable a = a(((Drawable.ConstantState) this.h.valueAt(indexOfKey)).newDrawable(this.d));
        this.i[i] = a;
        this.h.removeAt(indexOfKey);
        if (this.h.size() == 0) {
            this.h = null;
        }
        return a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f | this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        this.o = true;
        i();
        int i = this.j;
        Drawable[] drawableArr = this.i;
        this.q = -1;
        this.p = -1;
        this.s = 0;
        this.r = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.p) {
                this.p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.q) {
                this.q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.r) {
                this.r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.s) {
                this.s = minimumHeight;
            }
        }
    }

    public final void i() {
        SparseArray sparseArray = this.h;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                this.i[this.h.keyAt(i)] = a(((Drawable.ConstantState) this.h.valueAt(i)).newDrawable(this.d));
            }
            this.h = null;
        }
    }

    public void j(int i, int i2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.t = false;
        this.v = false;
    }

    public final void l(Resources resources) {
        if (resources != null) {
            this.d = resources;
            int e = el.e(resources, this.e);
            int i = this.e;
            this.e = e;
            if (i != e) {
                this.o = false;
                this.l = false;
            }
        }
    }
}
