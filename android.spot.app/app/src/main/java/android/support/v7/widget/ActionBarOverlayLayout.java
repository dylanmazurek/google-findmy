package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.apps.adm.R;
import defpackage.brq;
import defpackage.bvg;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.bvz;
import defpackage.bwn;
import defpackage.bxp;
import defpackage.bxq;
import defpackage.bxr;
import defpackage.bxs;
import defpackage.bya;
import defpackage.ea;
import defpackage.fq;
import defpackage.gh;
import defpackage.gs;
import defpackage.hf;
import defpackage.hg;
import defpackage.hh;
import defpackage.hi;
import defpackage.ho;
import defpackage.jn;
import defpackage.ne;
import defpackage.nj;
import defpackage.w;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements jn, bvg, bvh {
    private static final bya l;
    private static final Rect m;
    private bya A;
    private bya B;
    private bya C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final bvi G;
    private final hi H;
    private nj I;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public hg h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int n;
    private ContentFrameLayout o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private boolean y;
    private bya z;
    private static final Rect k = new Rect();
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    static {
        bxs bxpVar;
        if (Build.VERSION.SDK_INT >= 30) {
            bxpVar = new bxr();
        } else if (Build.VERSION.SDK_INT >= 29) {
            bxpVar = new bxq();
        } else {
            bxpVar = new bxp();
        }
        bxpVar.c(brq.d(0, 1, 0, 1));
        l = bxpVar.a();
        m = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        boolean z = false;
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.p = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    private static final boolean w(View view, Rect rect, boolean z) {
        boolean z2;
        hh hhVar = (hh) view.getLayoutParams();
        if (hhVar.leftMargin != rect.left) {
            hhVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (hhVar.topMargin != rect.top) {
            hhVar.topMargin = rect.top;
            z2 = true;
        }
        if (hhVar.rightMargin != rect.right) {
            hhVar.rightMargin = rect.right;
            z2 = true;
        }
        if (z && hhVar.bottomMargin != rect.bottom) {
            hhVar.bottomMargin = rect.bottom;
            return true;
        }
        return z2;
    }

    private static final boolean x(View view, Rect rect) {
        if (view.getPaddingLeft() == rect.left && view.getPaddingTop() == rect.top && view.getPaddingRight() == rect.right) {
            return false;
        }
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
        return true;
    }

    @Override // defpackage.jn
    public final void a() {
        i();
        this.I.c();
    }

    public final void b() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.jn
    public final void c(int i) {
        i();
        if (i != 109) {
            return;
        }
        this.d = true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hh;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.p != null) {
            if (this.c.getVisibility() == 0) {
                i = (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.p.setBounds(0, i, getWidth(), this.p.getIntrinsicHeight() + i);
            this.p.draw(canvas);
        }
    }

    @Override // defpackage.bvg
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.bvh
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.bvg
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hh();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hh(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.G.a();
    }

    @Override // defpackage.bvg
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.o == null) {
            this.o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof Toolbar) {
                this.I = ((Toolbar) findViewById).y();
                return;
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (!z) {
                b();
                j(0);
            }
        }
    }

    @Override // defpackage.jn
    public final void l(Menu menu, gs gsVar) {
        i();
        nj njVar = this.I;
        ho hoVar = njVar.f;
        if (hoVar == null) {
            njVar.f = new ho(njVar.a.getContext());
            hoVar = njVar.f;
            hoVar.g = R.id.action_menu_presenter;
        }
        hoVar.e = gsVar;
        Toolbar toolbar = njVar.a;
        if (menu != null || toolbar.a != null) {
            toolbar.l();
            gh ghVar = toolbar.a.a;
            if (ghVar == menu) {
                return;
            }
            if (ghVar != null) {
                ghVar.m(toolbar.w);
                ghVar.m(toolbar.x);
            }
            if (toolbar.x == null) {
                toolbar.x = new ne(toolbar);
            }
            hoVar.q();
            if (menu != null) {
                gh ghVar2 = (gh) menu;
                ghVar2.h(hoVar, toolbar.i);
                ghVar2.h(toolbar.x, toolbar.i);
            } else {
                hoVar.c(toolbar.i, null);
                toolbar.x.c(toolbar.i, null);
                hoVar.f(true);
                toolbar.x.f(true);
            }
            toolbar.a.j(toolbar.j);
            toolbar.a.k(hoVar);
            toolbar.w = hoVar;
            toolbar.u();
        }
    }

    @Override // defpackage.jn
    public final void m() {
        i();
        this.I.f();
    }

    @Override // defpackage.jn
    public final void n(Window.Callback callback) {
        i();
        this.I.d = callback;
    }

    @Override // defpackage.jn
    public final void o(CharSequence charSequence) {
        i();
        this.I.i(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:            if (r4 != false) goto L31;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.i()
            int r0 = r7.getWindowSystemUiVisibility()
            r1 = r0 & 256(0x100, float:3.59E-43)
            r0 = r0 & 1536(0x600, float:2.152E-42)
            hi r2 = r7.H
            bya r3 = android.support.v7.widget.ActionBarOverlayLayout.l
            android.graphics.Rect r4 = r7.w
            defpackage.bwb.f(r2, r3, r4)
            android.graphics.Rect r2 = r7.w
            android.graphics.Rect r3 = android.support.v7.widget.ActionBarOverlayLayout.m
            boolean r2 = r2.equals(r3)
            r3 = r2 ^ 1
            r7.x = r3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r2 != 0) goto L30
            if (r1 == 0) goto L2e
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            r7.y = r0
            hg r2 = r7.h
            if (r2 == 0) goto L42
            if (r1 != 0) goto L3d
            if (r0 != 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            ea r2 = (defpackage.ea) r2
            r2.j = r0
        L42:
            bya r8 = defpackage.bya.n(r8, r7)
            android.graphics.Rect r0 = r7.v
            int r1 = r8.b()
            int r2 = r8.d()
            int r5 = r8.c()
            int r6 = r8.a()
            r0.set(r1, r2, r5, r6)
            android.support.v7.widget.ActionBarContainer r0 = r7.c
            android.graphics.Rect r1 = r7.v
            boolean r2 = r7.y
            if (r2 == 0) goto L6e
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = w(r0, r2, r3)
            boolean r0 = x(r0, r1)
            goto L78
        L6e:
            android.graphics.Rect r2 = android.support.v7.widget.ActionBarOverlayLayout.k
            boolean r2 = x(r0, r2)
            boolean r0 = w(r0, r1, r3)
        L78:
            r0 = r0 | r2
            android.graphics.Rect r1 = r7.s
            defpackage.bwb.f(r7, r8, r1)
            android.graphics.Rect r1 = r7.s
            int r2 = r1.left
            int r3 = r1.top
            int r5 = r1.right
            int r1 = r1.bottom
            bya r1 = r8.l(r2, r3, r5, r1)
            r7.z = r1
            bya r2 = r7.A
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L9b
            bya r0 = r7.z
            r7.A = r0
            goto L9c
        L9b:
            r4 = r0
        L9c:
            android.graphics.Rect r0 = r7.t
            android.graphics.Rect r1 = r7.s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
            android.graphics.Rect r0 = r7.t
            android.graphics.Rect r1 = r7.s
            r0.set(r1)
            goto Lb0
        Lae:
            if (r4 == 0) goto Lb3
        Lb0:
            r7.requestLayout()
        Lb3:
            bya r8 = r8.i()
            bya r8 = r8.k()
            bya r8 = r8.j()
            android.view.WindowInsets r8 = r8.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        bvz.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                hh hhVar = (hh) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = hhVar.leftMargin + paddingLeft;
                int i7 = hhVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        brq d;
        bxs bxpVar;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        hh hhVar = (hh) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + hhVar.leftMargin + hhVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + hhVar.topMargin + hhVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = bwn.a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.n;
            if (this.y) {
                i3 += this.v.top;
            }
        } else if (this.c.getVisibility() != 8) {
            i3 = this.c.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        this.u.set(this.s);
        bya byaVar = this.z;
        this.B = byaVar;
        if (!this.d && !z && this.x) {
            if (this.y) {
                Rect rect = this.u;
                rect.top = Math.max(rect.top, i3);
                Rect rect2 = this.u;
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                this.u.top += i3;
                Rect rect3 = this.u;
                rect3.bottom = rect3.bottom;
            }
            this.B = this.B.l(0, i3, 0, 0);
        } else {
            if (this.y) {
                d = brq.d(byaVar.b(), Math.max(this.B.d(), i3), this.B.c(), Math.max(this.B.a(), 0));
            } else {
                d = brq.d(byaVar.b(), this.B.d() + i3, this.B.c(), this.B.a());
            }
            bya byaVar2 = this.B;
            if (Build.VERSION.SDK_INT >= 30) {
                bxpVar = new bxr(byaVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                bxpVar = new bxq(byaVar2);
            } else {
                bxpVar = new bxp(byaVar2);
            }
            bxpVar.c(d);
            this.B = bxpVar.a();
        }
        w(this.o, this.u, true);
        if (!this.C.equals(this.B)) {
            bya byaVar3 = this.B;
            this.C = byaVar3;
            bwn.d(this.o, byaVar3);
        }
        measureChildWithMargins(this.o, i, 0, i2, 0);
        hh hhVar2 = (hh) this.o.getLayoutParams();
        int max3 = Math.max(max, this.o.getMeasuredWidth() + hhVar2.leftMargin + hhVar2.rightMargin);
        int max4 = Math.max(max2, this.o.getMeasuredHeight() + hhVar2.topMargin + hhVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.q && z) {
            this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.D.getFinalY() > this.c.getHeight()) {
                b();
                this.F.run();
            } else {
                b();
                this.E.run();
            }
            this.f = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        int i2;
        ea eaVar;
        fq fqVar;
        this.G.d(i);
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        } else {
            i2 = 0;
        }
        this.r = i2;
        b();
        hg hgVar = this.h;
        if (hgVar != null && (fqVar = (eaVar = (ea) hgVar).l) != null) {
            fqVar.a();
            eaVar.l = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.c.getVisibility() == 0) {
            return this.q;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.q && !this.f) {
            if (this.r <= this.c.getHeight()) {
                b();
                postDelayed(this.E, 600L);
            } else {
                b();
                postDelayed(this.F, 600L);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        hg hgVar = this.h;
        if (hgVar != null) {
            if ((i & 256) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = i & 4;
            ea eaVar = (ea) hgVar;
            eaVar.j = z2;
            if (i3 != 0 && z) {
                if (!eaVar.k) {
                    eaVar.k = true;
                    eaVar.x(true);
                }
            } else if (eaVar.k) {
                eaVar.k = false;
                eaVar.x(true);
            }
        }
        if ((i2 & 256) != 0 && this.h != null) {
            bvz.c(this);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        hg hgVar = this.h;
        if (hgVar != null) {
            ((ea) hgVar).i = i;
        }
    }

    @Override // defpackage.jn
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.I.a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jn
    public final boolean q() {
        i();
        return this.I.k();
    }

    @Override // defpackage.jn
    public final boolean r() {
        ho hoVar;
        i();
        ActionMenuView actionMenuView = this.I.a.a;
        if (actionMenuView == null || (hoVar = actionMenuView.c) == null) {
            return false;
        }
        if (hoVar.m == null && !hoVar.m()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jn
    public final boolean s() {
        i();
        return this.I.l();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.bvg
    public final boolean t(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jn
    public final boolean u() {
        i();
        return this.I.m();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = true;
        this.y = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.z = bya.a;
        bya byaVar = bya.a;
        this.A = byaVar;
        this.B = byaVar;
        this.C = byaVar;
        this.j = new hf(this);
        this.E = new w(this, 9, null);
        this.F = new w(this, 10, null);
        v(context);
        this.G = new bvi();
        hi hiVar = new hi(context);
        this.H = hiVar;
        addView(hiVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hh(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.bvg
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
