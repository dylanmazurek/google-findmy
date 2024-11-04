package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import defpackage.bpu;
import defpackage.bvz;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.bya;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.inc;
import defpackage.inn;
import defpackage.inr;
import defpackage.ioj;
import defpackage.iqg;
import defpackage.iqi;
import defpackage.irk;
import defpackage.irl;
import defpackage.isa;
import defpackage.iwb;
import defpackage.iyj;
import defpackage.lir;
import defpackage.njz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private boolean E;
    private njz F;
    final irk a;
    final iqi b;
    Drawable c;
    int d;
    public bya e;
    private boolean f;
    private int g;
    private ViewGroup h;
    private View i;
    private View j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final Rect o;
    private boolean p;
    private boolean q;
    private Drawable r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private final TimeInterpolator w;
    private final TimeInterpolator x;
    private int y;
    private int z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lir g(View view) {
        lir lirVar = (lir) view.getTag(R.id.view_offset_helper);
        if (lirVar == null) {
            lir lirVar2 = new lir(view);
            view.setTag(R.id.view_offset_helper, lirVar2);
            return lirVar2;
        }
        return lirVar;
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private final void i(AppBarLayout appBarLayout) {
        if (o()) {
            appBarLayout.f = false;
        }
    }

    private final void j() {
        View view;
        if (!this.f) {
            return;
        }
        ViewGroup viewGroup = null;
        this.h = null;
        this.i = null;
        int i = this.g;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.h = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view2 = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                    parent = parent.getParent();
                    view2 = view2;
                }
                this.i = view2;
            }
        }
        if (this.h == null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.h = viewGroup;
        }
        if (!this.p && (view = this.j) != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.j);
            }
        }
        if (this.p && this.h != null) {
            if (this.j == null) {
                this.j = new View(getContext());
            }
            if (this.j.getParent() == null) {
                this.h.addView(this.j, -1, -1);
            }
        }
        this.f = false;
    }

    private final void k(Drawable drawable, int i, int i2) {
        l(drawable, this.h, i, i2);
    }

    private final void l(Drawable drawable, View view, int i, int i2) {
        if (o() && view != null && this.p) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void m(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.p && (view = this.j) != null) {
            int i11 = 0;
            if (view.isAttachedToWindow() && this.j.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.q = z2;
            if (!z2) {
                if (z) {
                    z3 = true;
                } else {
                    return;
                }
            } else {
                z3 = z;
            }
            int layoutDirection = getLayoutDirection();
            if (layoutDirection == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            View view2 = this.i;
            if (view2 == null) {
                view2 = this.h;
            }
            int a = a(view2);
            irl.a(this, this.j, this.o);
            ViewGroup viewGroup = this.h;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i11 = toolbar.n;
                i6 = toolbar.o;
                i7 = toolbar.p;
                i5 = toolbar.q;
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    ViewGroup viewGroup2 = this.h;
                    if (viewGroup2 instanceof android.widget.Toolbar) {
                        android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup2;
                        i11 = toolbar2.getTitleMarginStart();
                        i6 = toolbar2.getTitleMarginEnd();
                        i7 = toolbar2.getTitleMarginTop();
                        i5 = toolbar2.getTitleMarginBottom();
                    }
                }
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            irk irkVar = this.a;
            Rect rect = this.o;
            if (layoutDirection == 1) {
                i8 = i6;
            } else {
                i8 = i11;
            }
            int i12 = rect.left + i8;
            int i13 = this.o.top + a;
            Rect rect2 = this.o;
            if (layoutDirection != 1) {
                i11 = i6;
            }
            irkVar.j(i12, i13 + i7, rect2.right - i11, (this.o.bottom + a) - i5);
            irk irkVar2 = this.a;
            if (z4) {
                i9 = this.m;
            } else {
                i9 = this.k;
            }
            int i14 = this.o.top + this.l;
            int i15 = i3 - i;
            if (z4) {
                i10 = this.k;
            } else {
                i10 = this.m;
            }
            irkVar2.n(i9, i14, i15 - i10, (i4 - i2) - this.n);
            this.a.h(z3);
        }
    }

    private final void n() {
        CharSequence charSequence;
        if (this.h != null && this.p && TextUtils.isEmpty(this.a.k)) {
            ViewGroup viewGroup = this.h;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).s;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            e(charSequence);
        }
    }

    private final boolean o() {
        if (this.A == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(View view) {
        return ((getHeight() - g(view).b) - view.getHeight()) - ((inn) view.getLayoutParams()).bottomMargin;
    }

    public final int b() {
        int i;
        int i2 = this.y;
        if (i2 >= 0) {
            return i2 + this.B + this.D;
        }
        bya byaVar = this.e;
        if (byaVar != null) {
            i = byaVar.d();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min(minimumHeight + minimumHeight + i, getHeight());
        }
        return getHeight() / 3;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                k(drawable3, getWidth(), getHeight());
                this.r.setCallback(this);
                this.r.setAlpha(this.s);
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof inn;
    }

    public final void d(int i) {
        ViewGroup viewGroup;
        if (i != this.s) {
            if (this.r != null && (viewGroup = this.h) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.s = i;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        j();
        if (this.h == null && (drawable = this.r) != null && this.s > 0) {
            drawable.mutate().setAlpha(this.s);
            this.r.draw(canvas);
        }
        if (this.p && this.q) {
            if (this.h != null && this.r != null && this.s > 0 && o()) {
                irk irkVar = this.a;
                if (irkVar.a < irkVar.d) {
                    int save = canvas.save();
                    canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                    this.a.d(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.a.d(canvas);
        }
        if (this.c != null && this.s > 0) {
            bya byaVar = this.e;
            if (byaVar != null) {
                i = byaVar.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.c.setBounds(0, -this.d, getWidth(), i - this.d);
                this.c.mutate().setAlpha(this.s);
                this.c.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable != null && this.s > 0 && ((view2 = this.i) == null || view2 == this ? view == this.h : view == view2)) {
            l(drawable, view, getWidth(), getHeight());
            this.r.mutate().setAlpha(this.s);
            this.r.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        irk irkVar = this.a;
        if (irkVar != null) {
            z |= irkVar.z(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        this.a.t(charSequence);
        if (this.p) {
            charSequence2 = this.a.k;
        } else {
            charSequence2 = null;
        }
        setContentDescription(charSequence2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        boolean z2;
        TimeInterpolator timeInterpolator;
        if (this.r != null || this.c != null) {
            int height = getHeight() + this.d;
            int b = b();
            int i = 0;
            if (height < b) {
                z = true;
            } else {
                z = false;
            }
            if (isLaidOut() && !isInEditMode()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.t != z) {
                if (height < b) {
                    i = 255;
                }
                if (z2) {
                    j();
                    ValueAnimator valueAnimator = this.u;
                    if (valueAnimator == null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        this.u = valueAnimator2;
                        if (i > this.s) {
                            timeInterpolator = this.w;
                        } else {
                            timeInterpolator = this.x;
                        }
                        valueAnimator2.setInterpolator(timeInterpolator);
                        this.u.addUpdateListener(new ioj(this, 1));
                    } else if (valueAnimator.isRunning()) {
                        this.u.cancel();
                    }
                    this.u.setDuration(this.v);
                    this.u.setIntValues(this.s, i);
                    this.u.start();
                } else {
                    d(i);
                }
                this.t = z;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new inn();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            i(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.F == null) {
                this.F = new njz(this, null);
            }
            njz njzVar = this.F;
            if (appBarLayout.d == null) {
                appBarLayout.d = new ArrayList();
            }
            if (njzVar != null && !appBarLayout.d.contains(njzVar)) {
                appBarLayout.d.add(njzVar);
            }
            bvz.c(this);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.f(configuration);
        if (this.z != configuration.orientation && this.E && this.a.a == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.b == 0) {
                    appBarLayout.b = 2;
                }
            }
        }
        this.z = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        njz njzVar = this.F;
        if (njzVar != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).d) != null) {
            list.remove(njzVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bya byaVar = this.e;
        if (byaVar != null) {
            int d = byaVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    bwn.m(childAt, d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            g(getChildAt(i6)).R();
        }
        m(i, i2, i3, i4, false);
        n();
        f();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            g(getChildAt(i7)).Q();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        j();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        bya byaVar = this.e;
        if (byaVar != null) {
            i3 = byaVar.d();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.C) && i3 > 0) {
            this.B = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.E && this.a.q > 1) {
            n();
            m(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            irk irkVar = this.a;
            int i4 = irkVar.i;
            if (i4 > 1) {
                irkVar.e(irkVar.n);
                this.D = Math.round((-irkVar.n.ascent()) + irkVar.n.descent()) * (i4 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.D, 1073741824));
            } else {
                this.D = 0;
            }
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            View view = this.i;
            if (view != null && view != this) {
                setMinimumHeight(h(view));
            } else {
                setMinimumHeight(h(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            k(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.c;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (drawable != null && drawable.isVisible() != z) {
            this.c.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.r.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.r && drawable != this.c) {
            return false;
        }
        return true;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new inn();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new inn(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, 2132018525), attributeSet, i);
        int b;
        int i2;
        ColorStateList i3;
        TextUtils.TruncateAt truncateAt;
        this.f = true;
        this.o = new Rect();
        this.y = -1;
        this.B = 0;
        this.D = 0;
        Context context2 = getContext();
        this.z = getResources().getConfiguration().orientation;
        irk irkVar = new irk(this);
        this.a = irkVar;
        irkVar.u(inc.e);
        irkVar.m = false;
        iqi iqiVar = new iqi(context2);
        this.b = iqiVar;
        TypedArray a = isa.a(context2, attributeSet, inr.c, i, 2132018525, new int[0]);
        irkVar.p(a.getInt(4, 8388691));
        irkVar.m(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(5, 0);
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        if (a.hasValue(8)) {
            this.k = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(7)) {
            this.m = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(9)) {
            this.l = a.getDimensionPixelSize(9, 0);
        }
        if (a.hasValue(6)) {
            this.n = a.getDimensionPixelSize(6, 0);
        }
        this.p = a.getBoolean(20, true);
        e(a.getText(18));
        irkVar.o(2132017879);
        irkVar.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a.hasValue(10)) {
            irkVar.o(a.getResourceId(10, 0));
        }
        if (a.hasValue(1)) {
            irkVar.k(a.getResourceId(1, 0));
        }
        if (a.hasValue(22)) {
            int i4 = a.getInt(22, -1);
            if (i4 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i4 != 1) {
                truncateAt = i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
            irkVar.j = truncateAt;
            irkVar.g();
        }
        if (a.hasValue(11) && irkVar.g != (i3 = hzc.i(context2, a, 11))) {
            irkVar.g = i3;
            irkVar.g();
        }
        if (a.hasValue(2)) {
            irkVar.l(hzc.i(context2, a, 2));
        }
        this.y = a.getDimensionPixelSize(16, -1);
        if (a.hasValue(14) && (i2 = a.getInt(14, 1)) != irkVar.q) {
            irkVar.q = i2;
            irkVar.g();
        }
        if (a.hasValue(21)) {
            irkVar.s(AnimationUtils.loadInterpolator(context2, a.getResourceId(21, 0)));
        }
        this.v = a.getInt(15, 600);
        this.w = hwx.h(context2, R.attr.motionEasingStandardInterpolator, inc.c);
        this.x = hwx.h(context2, R.attr.motionEasingStandardInterpolator, inc.d);
        c(a.getDrawable(3));
        Drawable drawable = a.getDrawable(17);
        Drawable drawable2 = this.c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.c = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.c.setState(getDrawableState());
                }
                bpu.k(this.c, getLayoutDirection());
                this.c.setVisible(getVisibility() == 0, false);
                this.c.setCallback(this);
                this.c.setAlpha(this.s);
            }
            postInvalidateOnAnimation();
        }
        this.A = a.getInt(19, 0);
        boolean o = o();
        irkVar.b = o;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            i((AppBarLayout) parent);
        }
        if (o && this.r == null) {
            ColorStateList g = iqg.g(getContext(), R.attr.colorSurfaceContainer);
            if (g != null) {
                b = g.getDefaultColor();
            } else {
                b = iqiVar.b(iqiVar.b, getResources().getDimension(R.dimen.design_appbar_elevation));
            }
            c(new ColorDrawable(b));
        }
        this.g = a.getResourceId(23, -1);
        this.C = a.getBoolean(13, false);
        this.E = a.getBoolean(12, false);
        a.recycle();
        setWillNotDraw(false);
        bwb.n(this, new iwb(this, 1));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new inn(layoutParams);
    }
}
