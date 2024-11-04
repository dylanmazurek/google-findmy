package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a;
import defpackage.boo;
import defpackage.bop;
import defpackage.bos;
import defpackage.bpu;
import defpackage.bqd;
import defpackage.bqx;
import defpackage.bwn;
import defpackage.hzc;
import defpackage.ing;
import defpackage.iqk;
import defpackage.iqq;
import defpackage.iqr;
import defpackage.ira;
import defpackage.irb;
import defpackage.irc;
import defpackage.ird;
import defpackage.irl;
import defpackage.isa;
import defpackage.isg;
import defpackage.iuv;
import defpackage.ivc;
import defpackage.ivf;
import defpackage.ivl;
import defpackage.ivw;
import defpackage.iwm;
import defpackage.iwo;
import defpackage.iyj;
import defpackage.mjp;
import defpackage.njz;
import defpackage.ta;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingActionButton extends isg implements ivw, boo {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private ira m;
    private final iwm n;
    private final mjp o;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class BaseBehavior extends bop {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean u(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof bos) {
                return ((bos) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean v(View view, FloatingActionButton floatingActionButton) {
            bos bosVar = (bos) floatingActionButton.getLayoutParams();
            if (!this.b || bosVar.f != view.getId() || floatingActionButton.d != 0) {
                return false;
            }
            return true;
        }

        private final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!v(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            irl.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.e();
            return true;
        }

        private final boolean x(View view, FloatingActionButton floatingActionButton) {
            if (!v(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((bos) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.e();
            return true;
        }

        @Override // defpackage.bop
        public final void a(bos bosVar) {
            if (bosVar.h == 0) {
                bosVar.h = 80;
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List a = coordinatorLayout.a(floatingActionButton);
            int size = a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) a.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (u(view2) && x(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                bos bosVar = (bos) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - bosVar.rightMargin) {
                    i2 = rect.right;
                } else if (floatingActionButton.getLeft() <= bosVar.leftMargin) {
                    i2 = -rect.left;
                } else {
                    i2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - bosVar.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= bosVar.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    bwn.m(floatingActionButton, i3);
                }
                if (i2 != 0) {
                    bwn.l(floatingActionButton, i2);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (u(view2)) {
                x(view2, floatingActionButton);
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ird.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        }
        return h(0);
    }

    private final ira i() {
        if (this.m == null) {
            this.m = new irc(this, new njz(this, null));
        }
        return this.m;
    }

    @Override // defpackage.boo
    public final bop a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        i().i(ivlVar);
    }

    final void d() {
        AnimatorSet d;
        ira i = i();
        if (i.B.getVisibility() == 0) {
            if (i.A == 1) {
                return;
            }
        } else if (i.A != 2) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        if (i.n()) {
            ing ingVar = i.x;
            if (ingVar != null) {
                d = i.c(ingVar, 0.0f, 0.0f, 0.0f);
            } else {
                d = i.d(0.0f, 0.4f, 0.4f, ira.d, ira.e);
            }
            d.addListener(new iqq(i));
            d.start();
            return;
        }
        i.B.f(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ira i = i();
        getDrawableState();
        if (Build.VERSION.SDK_INT == 21) {
            irc ircVar = (irc) i;
            if (ircVar.B.isEnabled()) {
                ircVar.B.setElevation(ircVar.r);
                if (ircVar.B.isPressed()) {
                    ircVar.B.setTranslationZ(ircVar.t);
                    return;
                } else if (!ircVar.B.isFocused() && !ircVar.B.isHovered()) {
                    ircVar.B.setTranslationZ(0.0f);
                    return;
                } else {
                    ircVar.B.setTranslationZ(ircVar.s);
                    return;
                }
            }
            ircVar.B.setElevation(0.0f);
            ircVar.B.setTranslationZ(0.0f);
        }
    }

    final void e() {
        AnimatorSet d;
        ira i = i();
        if (i.B.getVisibility() != 0) {
            if (i.A == 2) {
                return;
            }
        } else if (i.A != 1) {
            return;
        }
        Animator animator = i.v;
        if (animator != null) {
            animator.cancel();
        }
        ing ingVar = i.w;
        if (i.n()) {
            if (i.B.getVisibility() != 0) {
                float f = 0.0f;
                i.B.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = i.B;
                if (ingVar == null) {
                    f = 0.4f;
                }
                floatingActionButton.setScaleY(f);
                i.B.setScaleX(f);
                i.h(f);
            }
            ing ingVar2 = i.w;
            if (ingVar2 != null) {
                d = i.c(ingVar2, 1.0f, 1.0f, 1.0f);
            } else {
                d = i.d(1.0f, 1.0f, 1.0f, ira.b, ira.c);
            }
            d.addListener(new iqr(i));
            d.start();
            return;
        }
        i.B.f(0, false);
        i.B.setAlpha(1.0f);
        i.B.setScaleY(1.0f);
        i.B.setScaleX(1.0f);
        i.h(1.0f);
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ira i = i();
        ivf ivfVar = i.m;
        if (ivfVar != null) {
            ivc.c(i.B, ivfVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ira i = i();
        i.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = i.C;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.k) / 2;
        i().k();
        int min = Math.min(View.resolveSize(b, i), View.resolveSize(b, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof iwo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iwo iwoVar = (iwo) parcelable;
        super.onRestoreInstanceState(iwoVar.d);
        iwm iwmVar = this.n;
        Bundle bundle = (Bundle) iwoVar.a.get("expandableWidgetHelper");
        bqd.n(bundle);
        iwmVar.b = bundle.getBoolean("expanded", false);
        iwmVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (iwmVar.b) {
            ViewParent parent = ((View) iwmVar.c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b((View) iwmVar.c);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        iwo iwoVar = new iwo(onSaveInstanceState);
        ta taVar = iwoVar.a;
        iwm iwmVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", iwmVar.b);
        bundle.putInt("expandedComponentIdHint", iwmVar.a);
        taVar.put("expandableWidgetHelper", bundle);
        return iwoVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            rect.left += this.c.left;
            rect.top += this.c.top;
            rect.right -= this.c.right;
            rect.bottom -= this.c.bottom;
            int i = -this.m.b();
            rect.inset(i, i);
            if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ira i = i();
            ivf ivfVar = i.m;
            if (ivfVar != null) {
                ivfVar.setTintList(colorStateList);
            }
            iqk iqkVar = i.o;
            if (iqkVar != null) {
                iqkVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            ivf ivfVar = i().m;
            if (ivfVar != null) {
                ivfVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        i().l(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.s(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        bpu.j(drawable);
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        boolean z;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = isa.a(context2, attributeSet, ird.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = hzc.i(context2, a, 1);
        this.f = a.h(a.getInt(2, -1), null);
        this.g = hzc.i(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = a.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        ira i2 = i();
        if (i2.z != dimensionPixelSize2) {
            i2.z = dimensionPixelSize2;
            i2.j();
        }
        ing a2 = ing.a(context2, a, 15);
        ing a3 = ing.a(context2, a, 8);
        ivl ivlVar = new ivl(ivl.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, ivl.a));
        boolean z2 = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        mjp mjpVar = new mjp((ImageView) this);
        this.o = mjpVar;
        mjpVar.q(attributeSet, i);
        this.n = new iwm(this);
        i().i(ivlVar);
        ira i3 = i();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i4 = this.h;
        irc ircVar = (irc) i3;
        ivl ivlVar2 = ircVar.l;
        bqd.n(ivlVar2);
        ircVar.m = new irb(ivlVar2);
        ircVar.m.setTintList(colorStateList);
        if (mode != null) {
            ircVar.m.setTintMode(mode);
        }
        ircVar.m.I(ircVar.B.getContext());
        if (i4 > 0) {
            Context context3 = ircVar.B.getContext();
            ivl ivlVar3 = ircVar.l;
            bqd.n(ivlVar3);
            iqk iqkVar = new iqk(ivlVar3);
            int c = bqx.c(context3, R.color.design_fab_stroke_top_outer_color);
            int c2 = bqx.c(context3, R.color.design_fab_stroke_top_inner_color);
            int c3 = bqx.c(context3, R.color.design_fab_stroke_end_inner_color);
            z = z2;
            int c4 = bqx.c(context3, R.color.design_fab_stroke_end_outer_color);
            iqkVar.c = c;
            iqkVar.d = c2;
            iqkVar.e = c3;
            iqkVar.f = c4;
            float f = i4;
            if (iqkVar.b != f) {
                iqkVar.b = f;
                iqkVar.a.setStrokeWidth(f * 1.3333f);
                iqkVar.g = true;
                iqkVar.invalidateSelf();
            }
            iqkVar.b(colorStateList);
            ircVar.o = iqkVar;
            iqk iqkVar2 = ircVar.o;
            bqd.n(iqkVar2);
            ivf ivfVar = ircVar.m;
            bqd.n(ivfVar);
            drawable2 = new LayerDrawable(new Drawable[]{iqkVar2, ivfVar});
            drawable = null;
        } else {
            z = z2;
            drawable = null;
            ircVar.o = null;
            drawable2 = ircVar.m;
        }
        ircVar.n = new RippleDrawable(iuv.b(colorStateList2), drawable2, drawable);
        ircVar.p = ircVar.n;
        i().u = dimensionPixelSize;
        ira i5 = i();
        if (i5.r != dimension) {
            i5.r = dimension;
            i5.g(dimension, i5.s, i5.t);
        }
        ira i6 = i();
        if (i6.s != dimension2) {
            i6.s = dimension2;
            i6.g(i6.r, dimension2, i6.t);
        }
        ira i7 = i();
        if (i7.t != dimension3) {
            i7.t = dimension3;
            i7.g(i7.r, i7.s, dimension3);
        }
        i().w = a2;
        i().x = a3;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }
}
