package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import defpackage.bqx;
import defpackage.bro;
import defpackage.buw;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.cec;
import defpackage.ced;
import defpackage.frx;
import defpackage.hep;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.hlh;
import defpackage.hli;
import defpackage.hlj;
import defpackage.hlk;
import defpackage.hll;
import defpackage.hlm;
import defpackage.hln;
import defpackage.hlo;
import defpackage.hlp;
import defpackage.hmi;
import defpackage.hog;
import defpackage.hwx;
import defpackage.ind;
import defpackage.iqg;
import defpackage.iqi;
import defpackage.iqu;
import defpackage.ivf;
import defpackage.ivj;
import defpackage.ivl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandableDialogView extends ViewGroup implements bvh, hjs {
    public static final /* synthetic */ int m = 0;
    private static final TimeInterpolator n = new cec();
    private static final Property o = new hlm(Integer.class);
    private static final Property p = new hln(RectF.class);
    private static final Property q = new hlo(Integer.class);
    private boolean A;
    private boolean B;
    private int C;
    private final Paint D;
    private final Paint E;
    private final Paint F;
    private final RectF G;
    private final ObjectAnimator H;
    private final ObjectAnimator I;
    private final int J;
    private final iqi K;
    private final Paint L;
    private final int M;
    private final boolean N;
    private final boolean O;
    private final buw P;
    private OverScrollControlledNestedScrollView Q;
    private View R;
    private boolean S;
    private Configuration T;
    private boolean U;
    private boolean V;
    private boolean W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    public final float b;
    public final RectF c;
    public View d;
    public final ivf e;
    public final float f;
    public float g;
    public View h;
    public int i;
    public Runnable j;
    public Window k;
    public int l;
    private final bvi r;
    private final Rect s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private float z;

    public ExpandableDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        this.r = new bvi();
        this.s = new Rect();
        this.a = new Rect();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        this.G = new RectF();
        RectF rectF = new RectF();
        this.c = rectF;
        Paint paint4 = new Paint(1);
        this.L = paint4;
        this.t = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.v = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.w = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.x = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.y = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        float X = frx.X(getContext(), R.attr.ogDialogCornerRadius);
        this.b = X;
        this.f = frx.X(getContext(), R.attr.ogDialogHeaderElevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        int k = iqg.k(R.dimen.m3_sys_elevation_level2, getContext());
        this.J = k;
        int i = frx.ab(context, R.attr.elevationOverlayEnabled).data;
        int d = iqg.d(context, R.attr.elevationOverlayColor, 0);
        int d2 = iqg.d(context, R.attr.elevationOverlayAccentColor, 0);
        float f = context.getResources().getDisplayMetrics().density;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.K = new iqi(z, d, d2, k, f);
        int Y = frx.Y(getContext(), R.attr.ogLightGrey);
        this.M = Y;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hmi.a, 0, 0);
        try {
            this.N = obtainStyledAttributes.getBoolean(2, false);
            this.O = obtainStyledAttributes.getBoolean(0, false);
            this.u = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            obtainStyledAttributes.recycle();
            paint3.setColor(k);
            if (Build.VERSION.SDK_INT >= 26) {
                paint.setColor(bro.c(k, Math.round(204.0f)));
            } else {
                paint.setColor(bqx.c(context, R.color.google_scrim));
            }
            paint2.setColor(Y);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, (Property<ExpandableDialogView, Integer>) o, 0);
            this.I = ofInt;
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new ced());
            ofInt.addListener(new hli(this));
            ivf C = ivf.C(getContext());
            this.e = C;
            C.L(ColorStateList.valueOf(k));
            ivj ivjVar = new ivj();
            ivjVar.f(X);
            ivjVar.g(X);
            C.cy(new ivl(ivjVar));
            ObjectAnimator ofObject = ObjectAnimator.ofObject(this, (Property<ExpandableDialogView, V>) p, new iqu(new RectF(), 1), rectF);
            this.H = ofObject;
            ofObject.setDuration(300L);
            ofObject.setInterpolator(new ced());
            ofObject.addListener(new hlj(this));
            setClipToOutline(true);
            setOutlineProvider(new hlk(this));
            setClipChildren(false);
            q(getResources().getConfiguration());
            buw buwVar = new buw(getContext(), new hll(this));
            this.P = buwVar;
            buwVar.a(false);
            this.l = 1;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void o(int i) {
        int i2;
        int height = this.a.height();
        int round = Math.round(this.t * (1.0f - a()));
        if (this.U && i > this.w) {
            this.a.top = this.C + this.s.top;
            int i3 = this.w;
            int i4 = this.l;
            int i5 = i4 - 1;
            if (i4 != 0) {
                if (i5 == 0) {
                    this.a.left = ((((i - this.s.left) - this.s.right) - i3) / 2) + this.s.left;
                }
                Rect rect = this.a;
                rect.right = rect.left + i3;
                Rect rect2 = this.a;
                rect2.bottom = rect2.top + height;
                this.G.set(this.a);
                return;
            }
            throw null;
        }
        Rect rect3 = this.a;
        int i6 = this.s.top;
        if (m()) {
            i2 = 0;
        } else {
            i2 = this.C - this.i;
        }
        rect3.top = i6 + i2;
        this.a.left = this.s.left + round;
        this.a.right = (i - this.s.right) - round;
        if (!this.A && !v()) {
            if (this.i <= 0) {
                Rect rect4 = this.a;
                rect4.bottom = rect4.top + this.d.getMeasuredHeight() + this.ab;
            } else {
                this.a.bottom = this.s.top + this.C + this.d.getMeasuredHeight() + this.ab + Math.round((this.aa - r0) * a());
            }
        } else {
            Rect rect5 = this.a;
            rect5.bottom = rect5.top + height;
        }
        if (m()) {
            this.G.set(0.0f, 0.0f, i, this.aa);
            return;
        }
        this.G.set(this.a.left, this.a.top - (n.getInterpolation(Math.max(0.0f, (a() - 0.6f) / 0.39999998f)) * this.s.top), this.a.right, this.a.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(float f) {
        this.R.setTranslationY(f);
    }

    private final void q(Configuration configuration) {
        boolean z;
        boolean z2 = true;
        if (configuration.smallestScreenWidthDp >= 600) {
            z = true;
        } else {
            z = false;
        }
        this.U = z;
        if (configuration.orientation != 2) {
            z2 = false;
        }
        this.V = z2;
        this.W = hog.I(getContext());
        requestLayout();
    }

    private final void r(float f) {
        this.z = f;
        s();
    }

    private final void s() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
        if (overScrollControlledNestedScrollView != null) {
            boolean z = true;
            if (!m() && !this.U) {
                z = false;
            }
            overScrollControlledNestedScrollView.g = z;
        }
    }

    private final boolean u() {
        int i = this.i;
        if (i >= -290 && i > this.ae) {
            return false;
        }
        return true;
    }

    private final boolean v() {
        if ((this.V || this.W) && !this.U) {
            return true;
        }
        return false;
    }

    public final float a() {
        if (this.U) {
            return 0.0f;
        }
        if (v()) {
            return 1.0f;
        }
        return this.z;
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.b(findViewById(R.id.og_container_header), 93522);
        hjpVar.b(findViewById(R.id.og_header_close_button), 93521);
        View view = this.h;
        view.getClass();
        hjpVar.b(view, 90573);
    }

    public final int c(float f) {
        return this.K.b(this.J, f + hwx.k(this));
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        hjpVar.e(findViewById(R.id.og_header_close_button));
        hjpVar.e(findViewById(R.id.og_container_header));
        View view = this.h;
        view.getClass();
        hjpVar.e(view);
    }

    @Override // defpackage.bvg
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 > 0 && (i4 = this.i) < (i5 = this.C)) {
            if (!this.A && !this.B) {
                i5 = 0;
            }
            int min = Math.min(i2, i5 - i4);
            iArr[1] = min;
            i(this.i + min);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Rect rect = this.a;
        int save = canvas.save();
        canvas.clipRect(rect.left, this.a.top, this.a.right, this.c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        if (Build.VERSION.SDK_INT < 23) {
            onDrawForeground(canvas);
        }
    }

    @Override // defpackage.bvh
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            if (i5 == 0 || this.i < this.C) {
                int max = Math.max(i4 + this.i, this.ae);
                iArr[1] = max - this.i;
                i(max);
            }
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        this.s.set(rect);
        return true;
    }

    @Override // defpackage.bvg
    public final void g(View view, View view2, int i, int i2) {
        this.r.b(i, i2);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    @Override // defpackage.bvg
    public final void h(View view, int i) {
        this.r.c(i);
        if (i == 1) {
            this.S = false;
        }
        if (!this.S && !m()) {
            if (u()) {
                this.I.setIntValues(this.ad);
                ObjectAnimator objectAnimator = this.I;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(50L);
                animatorSet.setInterpolator(new AccelerateInterpolator());
                if (this.k != null) {
                    int c = bqx.c(getContext(), R.color.google_scrim);
                    animatorSet.playTogether(objectAnimator, ObjectAnimator.ofObject(this.k.getDecorView(), (Property<View, V>) q, new ind(), Integer.valueOf(c), Integer.valueOf(bro.c(c, 0))));
                } else {
                    animatorSet.playTogether(objectAnimator);
                }
                animatorSet.start();
                return;
            }
            if (this.i >= 145) {
                this.I.setIntValues(this.C);
            } else {
                this.I.setIntValues(0);
            }
            this.I.start();
        }
    }

    public final void i(int i) {
        Runnable runnable;
        if (this.i != i) {
            r(Math.max(0.0f, i / this.C));
            this.Q.offsetTopAndBottom(this.i - i);
            this.i = i;
            this.H.cancel();
            o(getWidth());
            if (!this.A) {
                j(this.G);
            }
            this.c.set(this.G);
            k();
            invalidate();
            invalidateOutline();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            View view = this.d;
            Rect rect = this.a;
            view.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
            if (!this.N) {
                OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
                int i2 = this.a.left;
                int bottom = this.d.getBottom();
                Rect rect2 = this.a;
                overScrollControlledNestedScrollView.layout(i2, bottom, rect2.right, rect2.bottom);
            }
            if (i <= this.ad && (runnable = this.j) != null) {
                runnable.run();
            }
        }
    }

    public final void j(RectF rectF) {
        this.c.set(rectF);
        p((rectF.bottom - this.Q.getTop()) - this.ac);
        k();
        invalidate();
        invalidateOutline();
    }

    public final void k() {
        boolean z;
        Window window;
        Rect rect = this.s;
        RectF rectF = this.c;
        boolean l = l();
        boolean z2 = !l;
        int i = 0;
        boolean z3 = true;
        if (rectF.top < rect.top / 2.0f) {
            z = true;
        } else {
            z = false;
        }
        hog.G(this, z, z2);
        float f = this.c.bottom;
        int height = getHeight() - this.s.bottom;
        Window window2 = this.k;
        if (f < height) {
            z3 = false;
        }
        if (window2 != null) {
            if (!this.V && z3) {
                window2.setNavigationBarColor(this.af);
            } else {
                window2.setNavigationBarColor(0);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (!this.V || this.U) {
                if (!z3) {
                    setSystemUiVisibility(getSystemUiVisibility() & (-17));
                } else if (Build.VERSION.SDK_INT > 26 && Build.VERSION.SDK_INT < 29 && !l) {
                    setSystemUiVisibility(getSystemUiVisibility() | 16);
                }
                if (Build.VERSION.SDK_INT >= 28 && (window = this.k) != null) {
                    if (z3) {
                        i = this.M;
                    }
                    window.setNavigationBarDividerColor(i);
                }
            }
        }
    }

    public final boolean l() {
        Configuration configuration = this.T;
        if (configuration != null && (configuration.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    final boolean m() {
        if (a() == 1.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.s.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 26) {
            post(new hep(this, 15));
        }
        if (this.k != null && Build.VERSION.SDK_INT < 29) {
            i = this.k.getNavigationBarColor();
        } else {
            i = 0;
        }
        this.af = i;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(configuration);
        s();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float a = this.b * (1.0f - a());
        canvas.drawRoundRect(this.c, a, a, this.F);
        ivj ivjVar = new ivj();
        ivjVar.f(a);
        ivjVar.g(a);
        this.e.cy(new ivl(ivjVar));
        if (m()) {
            this.L.setColor(c(bwb.a(this.d)));
            canvas.drawRect(this.s.left, -this.s.top, this.c.right - this.s.right, this.d.getTop(), this.L);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        float a = 1.0f - a();
        canvas.save();
        canvas.clipRect(0, getHeight() - this.s.bottom, getWidth(), getHeight());
        RectF rectF = this.c;
        Paint paint = this.D;
        float f = this.b * a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.drawRect(0.0f, getHeight() - this.s.bottom, getWidth(), (getHeight() - this.s.bottom) + 1, this.E);
        }
        canvas.restore();
        if (Build.VERSION.SDK_INT >= 26 && m()) {
            if (this.s.left > 0) {
                canvas.drawRect(this.s.left - 1, 0.0f, this.s.left, getHeight(), this.E);
            }
            if (this.s.right > 0) {
                canvas.drawRect(getWidth() - this.s.right, 0.0f, (getWidth() - this.s.right) + 1, getHeight(), this.E);
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), this.s.top);
            canvas.drawRoundRect(this.c, f, f, this.D);
            canvas.restore();
        }
        if (Build.VERSION.SDK_INT < 26 && m()) {
            if (this.s.left > 0) {
                canvas.drawRect(-this.s.left, 0.0f, this.s.left, getHeight(), this.D);
            }
            if (this.s.right > 0) {
                canvas.drawRect(getWidth() - this.s.right, 0.0f, getWidth() + this.s.right, getHeight(), this.D);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.d = childAt;
        int[] iArr = bwn.a;
        childAt.setBackground(this.e);
        this.d.setOutlineProvider(null);
        this.Q = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.R = findViewById(R.id.og_container_footer);
        this.h = findViewById(R.id.og_dialog_scrim_ve);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.J);
        if (Build.VERSION.SDK_INT <= 26) {
            this.Q.findViewById(R.id.og_container_scroll_root).setFocusableInTouchMode(true);
        }
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        Rect rect2 = this.a;
        this.d.layout(rect2.left, rect2.top, rect2.right, rect2.top + this.d.getMeasuredHeight());
        if (!this.U && this.N) {
            rect = this.s;
        } else {
            rect = this.a;
        }
        int i5 = rect.left;
        this.Q.layout(i5, this.d.getBottom(), this.Q.getMeasuredWidth() + i5, this.a.bottom);
        if (this.i == 0) {
            this.Q.setScrollY(0);
        }
        k();
        if (getResources().getConfiguration().equals(this.T)) {
            if (!this.c.equals(this.G)) {
                this.H.setObjectValues(this.G);
                this.H.start();
                return;
            }
            return;
        }
        this.T = getResources().getConfiguration();
        this.c.set(this.G);
        invalidateOutline();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int width;
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        o(size);
        int i7 = (size2 - this.s.top) - this.s.bottom;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        int measuredHeight = this.d.getMeasuredHeight();
        if (!this.U && this.N) {
            width = (size - this.s.left) - this.s.right;
        } else {
            width = this.a.width();
        }
        int i8 = i7 - measuredHeight;
        boolean z = this.U;
        if (z) {
            i3 = (i8 - this.u) - this.v;
        } else {
            i3 = i8 - this.u;
        }
        boolean z2 = false;
        if (z) {
            i4 = this.y;
        } else {
            i4 = 0;
        }
        this.aa = size2 - this.s.bottom;
        this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.Q.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE));
        this.ab = this.Q.getMeasuredHeight();
        if (this.Q.getMeasuredHeight() - i3 >= i4) {
            z2 = true;
        }
        this.A = z2;
        if (m() || (!this.U && z2 && this.Q.getMeasuredHeight() < i8)) {
            this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i8);
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
        }
        if (!m() && !this.A) {
            i5 = this.Q.getMeasuredHeight();
            r(0.0f);
        } else if (this.U) {
            i5 = Math.min(this.x - measuredHeight, i3);
        } else {
            i5 = i8;
        }
        if (this.O && !m() && !this.U) {
            this.C = Math.max(this.u, (i8 - i5) / 2);
        } else {
            this.C = this.u;
        }
        int i9 = -size2;
        this.ad = this.s.top + i9 + this.C;
        this.ae = (i9 / 2) + this.s.top + this.C;
        Rect rect = this.a;
        rect.bottom = rect.top + i5 + measuredHeight;
        RectF rectF = this.G;
        if (m()) {
            i6 = this.aa;
        } else {
            i6 = this.a.bottom;
        }
        rectF.bottom = i6;
        this.ac = this.Q.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.i < this.C) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        float f;
        hlp hlpVar = (hlp) parcelable;
        super.onRestoreInstanceState(hlpVar.b);
        if (true != hlpVar.a) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        r(f);
        this.i = Math.round(this.z * this.u);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        float f = this.z;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            return new hlh(z, onSaveInstanceState);
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P.b(motionEvent);
    }

    @Override // defpackage.bvg
    public final boolean t(View view, View view2, int i, int i2) {
        if (!u()) {
            this.I.cancel();
            if (!this.U && !v()) {
                if (i2 == 1) {
                    this.S = true;
                }
                this.B = m();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.bvg
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
