package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import defpackage.bve;
import defpackage.bvf;
import defpackage.bvg;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.bwn;
import defpackage.cky;
import defpackage.cla;
import defpackage.clb;
import defpackage.clc;
import defpackage.cld;
import defpackage.cle;
import defpackage.clf;
import defpackage.clg;
import defpackage.clh;
import defpackage.cli;
import defpackage.njz;
import defpackage.nl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements bvh, bvg, bve {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {R.attr.enabled};
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation.AnimationListener I;
    private final Animation J;
    private final Animation K;
    public boolean a;
    public int b;
    public cky c;
    public int d;
    public int e;
    public int f;
    public clb g;
    public boolean h;
    public boolean i;
    public njz j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final bvi q;
    private final bvf r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private final Animation m(int i, int i2) {
        cle cleVar = new cle(this, i, i2);
        cleVar.setDuration(300L);
        cky ckyVar = this.c;
        ckyVar.a = null;
        ckyVar.clearAnimation();
        this.c.startAnimation(cleVar);
        return cleVar;
    }

    private final void n() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.c)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void o(float f) {
        if (f > this.o) {
            r(true, true);
            return;
        }
        this.a = false;
        this.g.d(0.0f);
        clf clfVar = new clf(this, 0);
        this.d = this.b;
        this.K.reset();
        this.K.setDuration(200L);
        this.K.setInterpolator(this.B);
        cky ckyVar = this.c;
        ckyVar.a = clfVar;
        ckyVar.clearAnimation();
        this.c.startAnimation(this.K);
        this.g.b(false);
    }

    private final void p(float f) {
        this.g.b(true);
        float min = Math.min(1.0f, Math.abs(f / this.o));
        float max = (float) Math.max(min - 0.4d, 0.0d);
        float abs = Math.abs(f) - this.o;
        float f2 = this.f;
        double max2 = Math.max(0.0f, Math.min(abs, f2 + f2) / f2) / 4.0f;
        float f3 = min * f2;
        float pow = (float) (max2 - Math.pow(max2, 2.0d));
        float f4 = pow + pow;
        float f5 = f2 * f4;
        int i = this.e + ((int) (f3 + f5 + f5));
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        if (f < this.o) {
            if (this.g.getAlpha() > 76 && !v(this.F)) {
                this.F = m(this.g.getAlpha(), 76);
            }
        } else if (this.g.getAlpha() < 255 && !v(this.G)) {
            this.G = m(this.g.getAlpha(), 255);
        }
        float f6 = (max * 5.0f) / 3.0f;
        this.g.d(Math.min(0.8f, f6 * 0.8f));
        this.g.c(Math.min(1.0f, f6));
        clb clbVar = this.g;
        clbVar.a.g = (((f6 * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        clbVar.invalidateSelf();
        j(i - this.b);
    }

    private final void q(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.A = motionEvent.getPointerId(i);
        }
    }

    private final void r(boolean z, boolean z2) {
        if (this.a != z) {
            this.h = z2;
            n();
            this.a = z;
            if (z) {
                int i = this.b;
                Animation.AnimationListener animationListener = this.I;
                this.d = i;
                this.J.reset();
                this.J.setDuration(200L);
                this.J.setInterpolator(this.B);
                if (animationListener != null) {
                    this.c.a = animationListener;
                }
                this.c.clearAnimation();
                this.c.startAnimation(this.J);
                return;
            }
            k(this.I);
        }
    }

    private final void s(boolean z, boolean z2) {
        if (z) {
            if (!this.a) {
                this.a = true;
                j((this.f + this.e) - this.b);
                this.h = z2;
                Animation.AnimationListener animationListener = this.I;
                this.c.setVisibility(0);
                this.g.setAlpha(255);
                clc clcVar = new clc(this);
                this.D = clcVar;
                clcVar.setDuration(this.w);
                if (animationListener != null) {
                    this.c.a = animationListener;
                }
                this.c.clearAnimation();
                this.c.startAnimation(this.D);
                return;
            }
            z = true;
        }
        r(z, false);
    }

    private final void u(float f) {
        float f2 = this.y;
        float f3 = f - f2;
        float f4 = this.n;
        if (f3 > f4 && !this.z) {
            this.x = f2 + f4;
            this.z = true;
            this.g.setAlpha(76);
        }
    }

    private static final boolean v(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    public final void a(float f) {
        j((this.d + ((int) ((this.e - r0) * f))) - this.c.getTop());
    }

    public final void b() {
        this.c.clearAnimation();
        this.g.stop();
        this.c.setVisibility(8);
        this.c.getBackground().setAlpha(255);
        this.g.setAlpha(255);
        j(this.e - this.b);
        this.b = this.c.getTop();
    }

    public final void c(float f) {
        this.c.setScaleX(f);
        this.c.setScaleY(f);
    }

    @Override // defpackage.bvg
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            s(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.h(i, i2, i3, i4, iArr);
    }

    @Override // defpackage.bvg
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.u);
    }

    @Override // defpackage.bvh
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            this.r.i(i, i2, i3, i4, this.t, 0, iArr);
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i8 = this.t[1] + i4;
                i6 = 0;
            } else {
                i6 = i8;
            }
            if (i8 < 0 && !l()) {
                float abs = this.p + Math.abs(i8);
                this.p = abs;
                p(abs);
                iArr[1] = iArr[1] + i6;
            }
        }
    }

    @Override // defpackage.bvg
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    @Override // defpackage.bvg
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r.j();
    }

    public final void i(boolean z) {
        s(z, false);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public final void j(int i) {
        this.c.bringToFront();
        bwn.m(this.c, i);
        this.b = this.c.getTop();
    }

    public final void k(Animation.AnimationListener animationListener) {
        cld cldVar = new cld(this);
        this.E = cldVar;
        cldVar.setDuration(150L);
        cky ckyVar = this.c;
        ckyVar.a = animationListener;
        ckyVar.clearAnimation();
        this.c.startAnimation(this.E);
    }

    public final boolean l() {
        View view = this.m;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !l() && !this.a && !this.v) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                q(motionEvent);
                            }
                        }
                    } else {
                        int i = this.A;
                        if (i == -1) {
                            Log.e(k, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            u(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.z;
                }
                this.z = false;
                this.A = -1;
                return this.z;
            }
            j(this.e - this.c.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.A = pointerId;
            this.z = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.y = motionEvent.getY(findPointerIndex2);
                return this.z;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.m == null) {
                n();
            }
            View view = this.m;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.c.getMeasuredWidth();
                int measuredHeight2 = this.c.getMeasuredHeight();
                cky ckyVar = this.c;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.b;
                int i8 = i5 + i6;
                ckyVar.layout(i5 - i6, i7, i8, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            n();
        }
        View view = this.m;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.c.measure(View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
            this.C = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.c) {
                    this.C = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                p(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.d(i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        cli cliVar = (cli) parcelable;
        super.onRestoreInstanceState(cliVar.getSuperState());
        i(cliVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new cli(super.onSaveInstanceState(), this.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.a && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.q.e();
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            o(f);
            this.p = 0.0f;
        } else {
            post(new nl(this, 20));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || l() || this.a || this.v) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            q(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.A = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A);
                    if (findPointerIndex < 0) {
                        Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    u(y);
                    if (this.z) {
                        float f = (y - this.x) * 0.5f;
                        if (f <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        p(f);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.A);
                if (findPointerIndex2 < 0) {
                    Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.z) {
                    float y2 = (motionEvent.getY(findPointerIndex2) - this.x) * 0.5f;
                    this.z = false;
                    o(y2);
                }
                this.A = -1;
                return false;
            }
        } else {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            b();
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r.l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r.b();
    }

    @Override // defpackage.bvg
    public final boolean t(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = new clf(this, 1);
        this.J = new clg(this);
        this.K = new clh(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (displayMetrics.density * 40.0f);
        this.c = new cky(getContext());
        clb clbVar = new clb(getContext());
        this.g = clbVar;
        cla claVar = clbVar.a;
        float f = clbVar.b.getDisplayMetrics().density;
        claVar.d(2.5f * f);
        claVar.p = 7.5f * f;
        claVar.g();
        claVar.q = (int) (10.0f * f);
        claVar.r = (int) (f * 5.0f);
        clbVar.invalidateSelf();
        this.c.setImageDrawable(this.g);
        this.c.setVisibility(8);
        addView(this.c);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f = i;
        this.o = i;
        this.q = new bvi();
        this.r = new bvf(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.b = i2;
        this.e = i2;
        a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
