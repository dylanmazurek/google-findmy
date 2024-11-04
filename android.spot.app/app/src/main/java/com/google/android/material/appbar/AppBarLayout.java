package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.boo;
import defpackage.bop;
import defpackage.bos;
import defpackage.bpu;
import defpackage.bpv;
import defpackage.bve;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.bya;
import defpackage.cad;
import defpackage.dvf;
import defpackage.hhn;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.inc;
import defpackage.inj;
import defpackage.ink;
import defpackage.inl;
import defpackage.inn;
import defpackage.inp;
import defpackage.inq;
import defpackage.inr;
import defpackage.inu;
import defpackage.iqg;
import defpackage.iqh;
import defpackage.irk;
import defpackage.isa;
import defpackage.ivc;
import defpackage.ivf;
import defpackage.iwx;
import defpackage.iyj;
import defpackage.kuv;
import defpackage.lir;
import defpackage.njz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements boo {
    public boolean a;
    public int b;
    public bya c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g;
    public Drawable h;
    public Integer i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private WeakReference p;
    private final boolean q;
    private ValueAnimator r;
    private ValueAnimator.AnimatorUpdateListener s;
    private final long t;
    private final TimeInterpolator u;
    private int[] v;
    private final float w;
    private Behavior x;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class BaseBehavior extends inp {
        public int a;
        private int c;
        private ValueAnimator d;
        private ink e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((bos) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (bwn.a(coordinatorLayout) != null) {
                return;
            }
            bwn.q(coordinatorLayout, new inj(this, appBarLayout, coordinatorLayout));
        }

        private final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int e = appBarLayout.e() + appBarLayout.getPaddingTop();
            int w = w() - e;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = appBarLayout.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    inl inlVar = (inl) childAt.getLayoutParams();
                    if (K(inlVar.a, 32)) {
                        top -= inlVar.topMargin;
                        bottom += inlVar.bottomMargin;
                    }
                    int i2 = -w;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                inl inlVar2 = (inl) childAt2.getLayoutParams();
                int i3 = inlVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.e();
                    }
                    if (K(i3, 2)) {
                        i5 += childAt2.getMinimumHeight();
                    } else if (K(i3, 5)) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (w < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (K(i3, 32)) {
                        i4 += inlVar2.topMargin;
                        i5 -= inlVar2.bottomMargin;
                    }
                    if (w < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    L(coordinatorLayout, appBarLayout, bpv.e(i4 + e, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean K(int i, int i2) {
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            float abs = Math.abs(w() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int w = w();
            if (w == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(inc.e);
                this.d.addUpdateListener(new iwx(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(height, 600));
            this.d.setIntValues(w, i);
            this.d.start();
        }

        private static final View M(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof bve) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List list;
            View view;
            boolean z2;
            Drawable foreground;
            Drawable foreground2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                list = null;
                if (i3 < childCount) {
                    view = appBarLayout.getChildAt(i3);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i4 = ((inl) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.f) {
                z2 = appBarLayout.m(M(coordinatorLayout));
            }
            boolean l = appBarLayout.l(z2);
            if (!z) {
                if (l) {
                    ArrayList g = coordinatorLayout.h.g(appBarLayout);
                    if (g != null) {
                        list = new ArrayList(g);
                    }
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        bop bopVar = ((bos) ((View) list.get(i5)).getLayoutParams()).a;
                        if (bopVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bopVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                foreground = appBarLayout.getForeground();
                if (foreground != null) {
                    foreground2 = appBarLayout.getForeground();
                    foreground2.jumpToCurrentState();
                }
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        final void A(ink inkVar, boolean z) {
            if (this.e != null && !z) {
                return;
            }
            this.e = inkVar;
        }

        @Override // defpackage.inp
        public final /* bridge */ /* synthetic */ boolean B(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            if (view2 != null && view2.isShown() && !view2.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.f();
                    i2 = i4;
                    i3 = appBarLayout.b() + i4;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = E(coordinatorLayout, appBarLayout, i, i2, i3);
                }
            }
            if (appBarLayout.f) {
                appBarLayout.l(appBarLayout.m(view));
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                J(coordinatorLayout, appBarLayout);
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view2));
                }
            }
            this.f = new WeakReference(view2);
        }

        @Override // defpackage.ins, defpackage.bop
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.e(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            ink inkVar = this.e;
            if (inkVar != null && (i2 & 8) == 0) {
                if (inkVar.a) {
                    F(coordinatorLayout, appBarLayout, -appBarLayout.f());
                } else if (inkVar.b) {
                    F(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(inkVar.e);
                    int i3 = -childAt.getBottom();
                    if (this.e.g) {
                        round = childAt.getMinimumHeight() + appBarLayout.e();
                    } else {
                        round = Math.round(childAt.getHeight() * this.e.f);
                    }
                    F(coordinatorLayout, appBarLayout, i3 + round);
                }
            } else if (i2 != 0) {
                int i4 = i2 & 4;
                if ((i2 & 2) != 0) {
                    int i5 = -appBarLayout.f();
                    if (i4 != 0) {
                        L(coordinatorLayout, appBarLayout, i5);
                    } else {
                        F(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i2 & 1) != 0) {
                    if (i4 != 0) {
                        L(coordinatorLayout, appBarLayout, 0);
                    } else {
                        F(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.e = null;
            H(bpv.e(G(), -appBarLayout.f(), 0));
            N(coordinatorLayout, appBarLayout, G(), 0, true);
            appBarLayout.h(G());
            I(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((bos) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = E(coordinatorLayout, appBarLayout, i3, -appBarLayout.c(), 0);
            }
            if (i3 == 0) {
                I(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ void o(View view, Parcelable parcelable) {
            if (parcelable instanceof ink) {
                A((ink) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            } else {
                this.e = null;
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ Parcelable p(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            ink y = y(absSavedState, (AppBarLayout) view);
            if (y == null) {
                return absSavedState;
            }
            return y;
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.f || appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        @Override // defpackage.inp
        public final /* bridge */ /* synthetic */ int u(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.inp
        public final /* synthetic */ int v(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.inp
        public final int w() {
            return G() + this.a;
        }

        @Override // defpackage.inp
        public final /* bridge */ /* synthetic */ int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int w = w();
            int i6 = 0;
            if (i2 != 0 && w >= i2 && w <= i3) {
                int e = bpv.e(i, i2, i3);
                if (w != e) {
                    if (appBarLayout.a) {
                        int abs = Math.abs(e);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            inl inlVar = (inl) childAt.getLayoutParams();
                            Interpolator interpolator = inlVar.b;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i8 = inlVar.a;
                                    if ((i8 & 1) != 0) {
                                        i5 = childAt.getHeight() + inlVar.topMargin + inlVar.bottomMargin;
                                        if ((i8 & 2) != 0) {
                                            i5 -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        i5 = 0;
                                    }
                                    if (childAt.getFitsSystemWindows()) {
                                        i5 -= appBarLayout.e();
                                    }
                                    if (i5 > 0) {
                                        float f = i5;
                                        i4 = Integer.signum(e) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                    }
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                    i4 = e;
                    boolean H = H(i4);
                    int i9 = w - e;
                    this.a = e - i4;
                    int i10 = 1;
                    if (H) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            inl inlVar2 = (inl) appBarLayout.getChildAt(i11).getLayoutParams();
                            kuv kuvVar = inlVar2.c;
                            if (kuvVar != null && (inlVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                float G = G();
                                Rect rect = (Rect) kuvVar.b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float abs2 = ((Rect) kuvVar.b).top - Math.abs(G);
                                if (abs2 <= 0.0f) {
                                    float d = 1.0f - bpv.d(Math.abs(abs2 / ((Rect) kuvVar.b).height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((((Rect) kuvVar.b).height() * 0.3f) * (1.0f - (d * d)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) kuvVar.a);
                                    ((Rect) kuvVar.a).offset(0, (int) (-height));
                                    if (height >= ((Rect) kuvVar.a).height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds((Rect) kuvVar.a);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.h(G());
                    if (e < w) {
                        i10 = -1;
                    }
                    N(coordinatorLayout, appBarLayout, e, i10, false);
                    i6 = i9;
                }
            } else {
                this.a = 0;
            }
            I(coordinatorLayout, appBarLayout);
            return i6;
        }

        final ink y(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int G = G();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + G;
                if (childAt.getTop() + G <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = cad.c;
                    }
                    ink inkVar = new ink(parcelable);
                    if (G == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    inkVar.b = z;
                    if (!z && (-G) >= appBarLayout.f()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    inkVar.a = z2;
                    inkVar.e = i;
                    if (bottom == childAt.getMinimumHeight() + appBarLayout.e()) {
                        z3 = true;
                    }
                    inkVar.g = z3;
                    inkVar.f = bottom / childAt.getHeight();
                    return inkVar;
                }
            }
            return null;
        }

        @Override // defpackage.inp
        public final /* bridge */ /* synthetic */ void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            J(coordinatorLayout, appBarLayout);
            if (appBarLayout.f) {
                appBarLayout.l(appBarLayout.m(M(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class ScrollingViewBehavior extends inq {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout x(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.ins, defpackage.bop
        public /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.e(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.bop
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout x = x(coordinatorLayout.a(view));
            if (x != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    x.j(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.bop
        public final boolean h(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.bop
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            bop bopVar = ((bos) view2.getLayoutParams()).a;
            if (bopVar instanceof BaseBehavior) {
                bwn.m(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bopVar).a) + this.c) - y(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view));
                }
            }
        }

        @Override // defpackage.bop
        public final void j(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                bwn.q(coordinatorLayout, null);
            }
        }

        @Override // defpackage.bop
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            bya byaVar;
            int i5 = view.getLayoutParams().height;
            if (i5 != -1) {
                if (i5 != -2) {
                    return false;
                }
                i5 = -2;
            }
            View w = w(coordinatorLayout.a(view));
            if (w == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (w.getFitsSystemWindows() && (byaVar = coordinatorLayout.e) != null) {
                    size += byaVar.d() + byaVar.a();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int v = size + v(w);
            int measuredHeight = w.getMeasuredHeight();
            if (A()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                v -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(v, i4));
            return true;
        }

        @Override // defpackage.inq
        public final float u(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int f = appBarLayout.f();
                int b = appBarLayout.b();
                bop bopVar = ((bos) appBarLayout.getLayoutParams()).a;
                if (bopVar instanceof BaseBehavior) {
                    i = ((BaseBehavior) bopVar).w();
                } else {
                    i = 0;
                }
                if ((b == 0 || f + i > b) && (i2 = f - b) != 0) {
                    return (i / i2) + 1.0f;
                }
                return 0.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.inq
        public final int v(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.inq
        public final /* bridge */ /* synthetic */ View w(List list) {
            return x(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inr.f);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final inl n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new inl((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new inl((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new inl(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.x;
        ink inkVar = null;
        if (behavior != null && this.k != -1 && this.b == 0) {
            inkVar = behavior.y(cad.c, this);
        }
        this.k = -1;
        this.l = -1;
        this.m = -1;
        if (inkVar != null) {
            this.x.A(inkVar, false);
        }
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (true != z) {
            i = 2;
        } else {
            i = 1;
        }
        int i3 = 0;
        if (true != z2) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        int i4 = i | i2;
        if (true == z3) {
            i3 = 8;
        }
        this.b = i4 | i3;
        requestLayout();
    }

    private final void q(float f, float f2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.r = ofFloat;
        ofFloat.setDuration(this.t);
        this.r.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.s;
        if (animatorUpdateListener != null) {
            this.r.addUpdateListener(animatorUpdateListener);
        }
        this.r.start();
    }

    private final boolean r() {
        if (this.h != null && e() > 0) {
            return true;
        }
        return false;
    }

    private final boolean s() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.boo
    public final bop a() {
        Behavior behavior = new Behavior();
        this.x = behavior;
        return behavior;
    }

    public final int b() {
        int i;
        int minimumHeight;
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                inl inlVar = (inl) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = inlVar.a;
                if ((i4 & 5) == 5) {
                    int i5 = inlVar.topMargin + inlVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - e());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - e());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.l = max;
        return max;
    }

    final int c() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                inl inlVar = (inl) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + inlVar.topMargin + inlVar.bottomMargin;
                int i4 = inlVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.m = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof inl;
    }

    public final int d() {
        int e = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.j);
            this.h.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        bya byaVar = this.c;
        if (byaVar != null) {
            return byaVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                inl inlVar = (inl) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = inlVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + inlVar.topMargin + inlVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        i3 -= e();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.k = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final inl generateLayoutParams(AttributeSet attributeSet) {
        return new inl(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new inl();
    }

    final void h(int i) {
        int i2;
        this.j = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                njz njzVar = (njz) this.d.get(i3);
                if (njzVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) njzVar.a;
                    collapsingToolbarLayout.d = i;
                    bya byaVar = collapsingToolbarLayout.e;
                    if (byaVar != null) {
                        i2 = byaVar.d();
                    } else {
                        i2 = 0;
                    }
                    int childCount = ((CollapsingToolbarLayout) njzVar.a).getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = ((CollapsingToolbarLayout) njzVar.a).getChildAt(i4);
                        inn innVar = (inn) childAt.getLayoutParams();
                        lir g = CollapsingToolbarLayout.g(childAt);
                        int i5 = innVar.a;
                        if (i5 != 1) {
                            if (i5 == 2) {
                                g.S(Math.round((-i) * innVar.b));
                            }
                        } else {
                            g.S(bpv.e(-i, 0, ((CollapsingToolbarLayout) njzVar.a).a(childAt)));
                        }
                    }
                    ((CollapsingToolbarLayout) njzVar.a).f();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) njzVar.a;
                    if (collapsingToolbarLayout2.c != null && i2 > 0) {
                        collapsingToolbarLayout2.postInvalidateOnAnimation();
                    }
                    CollapsingToolbarLayout collapsingToolbarLayout3 = (CollapsingToolbarLayout) njzVar.a;
                    int height = collapsingToolbarLayout3.getHeight();
                    int minimumHeight = height - collapsingToolbarLayout3.getMinimumHeight();
                    int b = height - ((CollapsingToolbarLayout) njzVar.a).b();
                    Object obj = njzVar.a;
                    int i6 = minimumHeight - i2;
                    float f = b;
                    float f2 = i6;
                    float min = Math.min(1.0f, f / f2);
                    irk irkVar = ((CollapsingToolbarLayout) obj).a;
                    irkVar.c = min;
                    irkVar.d = irkVar.a();
                    CollapsingToolbarLayout collapsingToolbarLayout4 = (CollapsingToolbarLayout) njzVar.a;
                    int i7 = collapsingToolbarLayout4.d + i6;
                    irk irkVar2 = collapsingToolbarLayout4.a;
                    irkVar2.e = i7;
                    irkVar2.r(Math.abs(i) / f2);
                }
            }
        }
    }

    public final void i(boolean z) {
        j(z, isLaidOut());
    }

    public final void j(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void k() {
        setWillNotDraw(!r());
    }

    final boolean l(boolean z) {
        float f;
        float f2;
        if (this.e != z) {
            this.e = z;
            refreshDrawableState();
            if (!(getBackground() instanceof ivf)) {
                return true;
            }
            float f3 = 0.0f;
            if (this.q) {
                if (true != z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                if (true == z) {
                    f3 = 1.0f;
                }
                q(f2, f3);
                return true;
            }
            if (!this.f) {
                return true;
            }
            if (z) {
                f = 0.0f;
            } else {
                f = this.w;
            }
            if (z) {
                f3 = this.w;
            }
            q(f, f3);
            return true;
        }
        return false;
    }

    final boolean m(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.p == null && (i = this.o) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.o);
            }
            if (view2 != null) {
                this.p = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null) {
            return false;
        }
        if (!view.canScrollVertically(-1) && view.getScrollY() <= 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivc.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int i2;
        boolean z;
        int i3;
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.n;
        if (true != z2) {
            i2 = -2130969889;
        } else {
            i2 = R.attr.state_liftable;
        }
        boolean z3 = false;
        iArr[0] = i2;
        int i4 = -2130969890;
        if (z2) {
            if (this.e) {
                i4 = R.attr.state_lifted;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i4;
        if (true != z3) {
            i3 = R.attr.state_collapsible;
        } else {
            i3 = -2130969885;
        }
        iArr[2] = i3;
        int i5 = -2130969884;
        if (z && this.e) {
            i5 = R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = r1.getFitsSystemWindows()
            if (r2 == 0) goto L23
            boolean r2 = r1.s()
            if (r2 == 0) goto L23
            int r2 = r1.e()
            int r3 = r1.getChildCount()
        L17:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            defpackage.bwn.m(r4, r2)
            goto L17
        L23:
            r1.o()
            r2 = 0
            r1.a = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L2e:
            r5 = 1
            if (r4 >= r3) goto L45
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            inl r6 = (defpackage.inl) r6
            android.view.animation.Interpolator r6 = r6.b
            if (r6 == 0) goto L42
            r1.a = r5
            goto L45
        L42:
            int r4 = r4 + 1
            goto L2e
        L45:
            android.graphics.drawable.Drawable r3 = r1.h
            if (r3 == 0) goto L54
            int r4 = r1.getWidth()
            int r6 = r1.e()
            r3.setBounds(r2, r2, r4, r6)
        L54:
            boolean r3 = r1.f
            if (r3 != 0) goto L77
            int r3 = r1.getChildCount()
            r4 = 0
        L5d:
            if (r4 >= r3) goto L78
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            inl r6 = (defpackage.inl) r6
            int r6 = r6.a
            r0 = r6 & 1
            if (r0 != r5) goto L74
            r6 = r6 & 10
            if (r6 == 0) goto L74
            goto L77
        L74:
            int r4 = r4 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            boolean r3 = r1.n
            if (r3 == r2) goto L81
            r1.n = r2
            r1.refreshDrawableState()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += e();
                }
            } else {
                measuredHeight = bpv.e(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ivc.a(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(1);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.h) {
            return false;
        }
        return true;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new inl();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, 2132018522), attributeSet, i);
        Integer valueOf;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.b = 0;
        this.g = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = inu.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = inu.a;
        Context context3 = getContext();
        TypedArray a = isa.a(context3, attributeSet, inu.a, i, 2132018522, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = isa.a(context2, attributeSet, inr.a, i, 2132018522, new int[0]);
            setBackground(a2.getDrawable(0));
            final ColorStateList i2 = hzc.i(context2, a2, 6);
            this.q = i2 != null;
            final ColorStateList b = iqh.b(getBackground());
            if (b != null) {
                final ivf ivfVar = new ivf();
                ivfVar.L(b);
                if (i2 != null) {
                    final Integer h = iqg.h(getContext(), R.attr.colorSurface);
                    this.s = new ValueAnimator.AnimatorUpdateListener() { // from class: ini
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            int f = iqg.f(b.getDefaultColor(), i2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList valueOf2 = ColorStateList.valueOf(f);
                            ivf ivfVar2 = ivfVar;
                            ivfVar2.L(valueOf2);
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            if (appBarLayout.h != null && (num = appBarLayout.i) != null && num.equals(h)) {
                                bsc.f(appBarLayout.h, f);
                            }
                            if (!appBarLayout.g.isEmpty()) {
                                for (inm inmVar : appBarLayout.g) {
                                    if (ivfVar2.A() != null) {
                                        inmVar.a();
                                    }
                                }
                            }
                        }
                    };
                    setBackground(ivfVar);
                } else {
                    ivfVar.I(context2);
                    this.s = new hhn(this, ivfVar, 2);
                    setBackground(ivfVar);
                }
            }
            this.t = hzc.n(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.u = hwx.h(context2, R.attr.motionEasingStandardInterpolator, inc.a);
            if (a2.hasValue(4)) {
                p(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                inu.a(this, a2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.hasValue(2)) {
                    setKeyboardNavigationCluster(a2.getBoolean(2, false));
                }
                if (a2.hasValue(1)) {
                    setTouchscreenBlocksFocus(a2.getBoolean(1, false));
                }
            }
            this.w = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f = a2.getBoolean(5, false);
            this.o = a2.getResourceId(7, -1);
            Drawable drawable = a2.getDrawable(8);
            Drawable drawable2 = this.h;
            if (drawable2 != drawable) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                this.h = mutate;
                if (mutate instanceof ivf) {
                    valueOf = Integer.valueOf(((ivf) mutate).v);
                } else {
                    ColorStateList b2 = iqh.b(mutate);
                    valueOf = b2 != null ? Integer.valueOf(b2.getDefaultColor()) : null;
                }
                this.i = valueOf;
                Drawable drawable3 = this.h;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.h.setState(getDrawableState());
                    }
                    bpu.k(this.h, getLayoutDirection());
                    this.h.setVisible(getVisibility() == 0, false);
                    this.h.setCallback(this);
                }
                k();
                postInvalidateOnAnimation();
            }
            a2.recycle();
            bwb.n(this, new dvf(this, 4, null));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
