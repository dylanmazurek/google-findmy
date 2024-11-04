package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.bwn;
import defpackage.fai;
import defpackage.faj;
import defpackage.fak;
import defpackage.fal;
import defpackage.fam;
import defpackage.fan;
import defpackage.fas;
import defpackage.ngj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements fai {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private List o;
    private fal p;
    private ngj q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private final void A() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean B(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View d = d(i - i3);
            if (d != null && d.getVisibility() != 8) {
                if (K()) {
                    if ((this.j & 2) != 0) {
                        return true;
                    }
                    return false;
                }
                if ((this.i & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (K()) {
            if ((this.j & 1) != 0) {
                return true;
            }
            return false;
        }
        if ((this.i & 1) != 0) {
            return true;
        }
        return false;
    }

    private final boolean C(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((fak) this.o.get(i2)).a() > 0) {
                    if (K()) {
                        if ((this.i & 2) == 0) {
                            return false;
                        }
                        return true;
                    }
                    if ((this.j & 2) == 0) {
                        return false;
                    }
                    return true;
                }
            }
            if (K()) {
                if ((this.i & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean D(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = i + 1; i2 < this.o.size(); i2++) {
                if (((fak) this.o.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (K()) {
                if ((this.i & 4) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void h(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.o.size();
        for (int i3 = 0; i3 < size; i3++) {
            fak fakVar = (fak) this.o.get(i3);
            for (int i4 = 0; i4 < fakVar.h; i4++) {
                int i5 = fakVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    fan fanVar = (fan) d.getLayoutParams();
                    if (B(i5, i4)) {
                        if (z) {
                            left = d.getRight() + fanVar.rightMargin;
                        } else {
                            left = (d.getLeft() - fanVar.leftMargin) - this.l;
                        }
                        s(canvas, left, fakVar.b, fakVar.g);
                    }
                    if (i4 == fakVar.h - 1 && (this.j & 4) > 0) {
                        if (z) {
                            right = (d.getLeft() - fanVar.leftMargin) - this.l;
                        } else {
                            right = d.getRight() + fanVar.rightMargin;
                        }
                        s(canvas, right, fakVar.b, fakVar.g);
                    }
                }
            }
            if (C(i3)) {
                if (z2) {
                    i2 = fakVar.d;
                } else {
                    i2 = fakVar.b - this.k;
                }
                p(canvas, paddingLeft, i2, max);
            }
            if (D(i3) && (this.i & 4) > 0) {
                if (z2) {
                    i = fakVar.b - this.k;
                } else {
                    i = fakVar.d;
                }
                p(canvas, paddingLeft, i, max);
            }
        }
    }

    private final void o(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.o.size();
        for (int i3 = 0; i3 < size; i3++) {
            fak fakVar = (fak) this.o.get(i3);
            for (int i4 = 0; i4 < fakVar.h; i4++) {
                int i5 = fakVar.o + i4;
                View d = d(i5);
                if (d != null && d.getVisibility() != 8) {
                    fan fanVar = (fan) d.getLayoutParams();
                    if (B(i5, i4)) {
                        if (z2) {
                            top = d.getBottom() + fanVar.bottomMargin;
                        } else {
                            top = (d.getTop() - fanVar.topMargin) - this.k;
                        }
                        p(canvas, fakVar.a, top, fakVar.g);
                    }
                    if (i4 == fakVar.h - 1 && (this.i & 4) > 0) {
                        if (z2) {
                            bottom = (d.getTop() - fanVar.topMargin) - this.k;
                        } else {
                            bottom = d.getBottom() + fanVar.bottomMargin;
                        }
                        p(canvas, fakVar.a, bottom, fakVar.g);
                    }
                }
            }
            if (C(i3)) {
                if (z) {
                    i2 = fakVar.c;
                } else {
                    i2 = fakVar.a - this.l;
                }
                s(canvas, i2, paddingTop, max);
            }
            if (D(i3) && (this.j & 4) > 0) {
                if (z) {
                    i = fakVar.a - this.l;
                } else {
                    i = fakVar.c;
                }
                s(canvas, i, paddingTop, max);
            }
        }
    }

    private final void p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private final void s(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.y(boolean, boolean, int, int, int, int):void");
    }

    private final void z(int i, int i2, int i3, int i4) {
        int r;
        int n;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(a.ae(i, "Invalid flex direction: "));
            }
            r = n();
            n = r() + getPaddingLeft() + getPaddingRight();
        } else {
            r = r() + getPaddingTop() + getPaddingBottom();
            n = n();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < n) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException(a.ae(mode, "Unknown width mode is set: "));
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(n, i2, i4);
            }
        } else {
            if (size < n) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = n;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < r) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException(a.ae(mode2, "Unknown height mode is set: "));
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(r, i3, i4);
            }
        } else {
            if (size2 < r) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = r;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // defpackage.fai
    public final void H(fak fakVar) {
        int i;
        int i2;
        if (K()) {
            if ((this.j & 4) > 0) {
                i = fakVar.e;
                i2 = this.l;
            } else {
                return;
            }
        } else if ((this.i & 4) > 0) {
            i = fakVar.e;
            i2 = this.k;
        } else {
            return;
        }
        fakVar.e = i + i2;
        fakVar.f += i2;
    }

    @Override // defpackage.fai
    public final void I(List list) {
        this.o = list;
    }

    @Override // defpackage.fai
    public final boolean K() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fai
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, fai] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        ngj ngjVar = this.q;
        SparseIntArray sparseIntArray = this.n;
        int l = ngjVar.d.l();
        List e = ngjVar.e(l);
        fam famVar = new fam();
        if (view != null && (layoutParams instanceof faj)) {
            famVar.b = ((faj) layoutParams).n();
        } else {
            famVar.b = 1;
        }
        if (i != -1 && i != l) {
            if (i < ngjVar.d.l()) {
                famVar.a = i;
                for (int i2 = i; i2 < l; i2++) {
                    ((fam) e.get(i2)).a++;
                }
            } else {
                famVar.a = l;
            }
        } else {
            famVar.a = l;
        }
        e.add(famVar);
        this.m = ngj.v(l + 1, e, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.fai
    public final int b() {
        return this.d;
    }

    @Override // defpackage.fai
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fan;
    }

    public final View d(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
            return null;
        }
        return null;
    }

    public final void e(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        this.k = drawable.getIntrinsicHeight();
        A();
        requestLayout();
    }

    public final void f(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        this.l = drawable.getIntrinsicWidth();
        A();
        requestLayout();
    }

    @Override // defpackage.fai
    public final int g(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new fan(getContext(), attributeSet);
    }

    @Override // defpackage.fai
    public final int i(View view) {
        return 0;
    }

    @Override // defpackage.fai
    public final int j(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (K()) {
            if (B(i, i2)) {
                i4 = this.l;
            }
            if ((this.j & 4) > 0) {
                i3 = this.l;
                return i4 + i3;
            }
            return i4;
        }
        if (B(i, i2)) {
            i4 = this.k;
        }
        if ((this.i & 4) > 0) {
            i3 = this.k;
            return i4 + i3;
        }
        return i4;
    }

    @Override // defpackage.fai
    public final int k() {
        return this.a;
    }

    @Override // defpackage.fai
    public final int l() {
        return getChildCount();
    }

    @Override // defpackage.fai
    public final int m() {
        return this.b;
    }

    @Override // defpackage.fai
    public final int n() {
        Iterator it = this.o.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, ((fak) it.next()).e);
        }
        return i;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.h != null || this.g != null) {
            if (this.i != 0 || this.j != 0) {
                int[] iArr = bwn.a;
                int layoutDirection = getLayoutDirection();
                int i = this.a;
                boolean z5 = false;
                boolean z6 = true;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return;
                            }
                            if (layoutDirection == 1) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (layoutDirection == 1) {
                                z5 = true;
                            }
                            if (this.b != 2) {
                                z4 = z5;
                            }
                            o(canvas, z4, true);
                            return;
                        }
                        if (layoutDirection == 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (layoutDirection != 1) {
                            z6 = false;
                        }
                        if (this.b != 2) {
                            z3 = z6;
                        }
                        o(canvas, z3, false);
                        return;
                    }
                    if (layoutDirection != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.b == 2) {
                        z5 = true;
                    }
                    h(canvas, z2, z5);
                    return;
                }
                if (layoutDirection == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.b == 2) {
                    z5 = true;
                }
                h(canvas, z, z5);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int[] iArr = bwn.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.a;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (layoutDirection == 1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (layoutDirection == 1) {
                            z6 = true;
                        }
                        if (this.b != 2) {
                            z5 = z6;
                        }
                        y(z5, true, i, i2, i3, i4);
                        return;
                    }
                    throw new IllegalStateException(a.ae(i5, "Invalid flex direction is set: "));
                }
                if (layoutDirection == 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (layoutDirection == 1) {
                    z6 = true;
                }
                if (this.b != 2) {
                    z4 = z6;
                }
                y(z4, false, i, i2, i3, i4);
                return;
            }
            if (layoutDirection != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            w(z3, i, i2, i3, i4);
            return;
        }
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        w(z2, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, fai] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, fai] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    @Override // defpackage.fai
    public final int q() {
        return this.f;
    }

    @Override // defpackage.fai
    public final int r() {
        int i;
        int i2;
        int size = this.o.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            fak fakVar = (fak) this.o.get(i4);
            if (C(i4)) {
                if (K()) {
                    i2 = this.k;
                } else {
                    i2 = this.l;
                }
                i3 += i2;
            }
            if (D(i4)) {
                if (K()) {
                    i = this.k;
                } else {
                    i = this.l;
                }
                i3 += i;
            }
            i3 += fakVar.g;
        }
        return i3;
    }

    @Override // defpackage.fai
    public final View t(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.fai
    public final View u(int i) {
        return d(i);
    }

    @Override // defpackage.fai
    public final List v() {
        return this.o;
    }

    @Override // defpackage.fai
    public final void x(View view, int i, int i2, fak fakVar) {
        int i3;
        int i4;
        if (B(i, i2)) {
            if (K()) {
                i3 = fakVar.e;
                i4 = this.l;
            } else {
                i3 = fakVar.e;
                i4 = this.k;
            }
            fakVar.e = i3 + i4;
            fakVar.f += i4;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof fan) {
            return new fan((fan) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new fan((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new fan(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.q = new ngj(this);
        this.o = new ArrayList();
        this.p = new fal();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fas.a, i, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.c = obtainStyledAttributes.getInt(7, 0);
        this.d = obtainStyledAttributes.getInt(1, 4);
        this.e = obtainStyledAttributes.getInt(0, 5);
        this.f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            e(drawable);
            f(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            e(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            f(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.fai
    public final void J(int i, View view) {
    }
}
