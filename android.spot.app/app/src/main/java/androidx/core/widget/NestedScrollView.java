package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.a;
import defpackage.bql;
import defpackage.brd;
import defpackage.bus;
import defpackage.bve;
import defpackage.bvf;
import defpackage.bvh;
import defpackage.bvi;
import defpackage.bwn;
import defpackage.bzq;
import defpackage.bzr;
import defpackage.bzs;
import defpackage.bzt;
import defpackage.bzu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements bvh, bve {
    private static final float g = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final bzq h = new bzq();
    private static final int[] i = {R.attr.fillViewport};
    private int A;
    private int B;
    private bzu C;
    private final bvi D;
    private final bvf E;
    private float F;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    public bzt d;
    final bzs e;
    bus f;
    private final float j;
    private long k;
    private final Rect l;
    private int m;
    private boolean n;
    private boolean o;
    private View p;
    private boolean q;
    private VelocityTracker r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private final int[] y;
    private final int[] z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final void A() {
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
    }

    private final void B(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.i(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private final void C(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.x) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.m = (int) motionEvent.getY(i2);
            this.x = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void D() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    private final void E(boolean z) {
        if (z) {
            p(2, 1);
        } else {
            j(1);
        }
        this.B = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void F(View view) {
        view.getDrawingRect(this.l);
        offsetDescendantRectToMyCoords(view, this.l);
        int b = b(this.l);
        if (b != 0) {
            scrollBy(0, b);
        }
    }

    private final boolean G(View view) {
        if (I(view, 0, getHeight())) {
            return false;
        }
        return true;
    }

    private static boolean H(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && H((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private final boolean I(View view, int i2, int i3) {
        view.getDrawingRect(this.l);
        offsetDescendantRectToMyCoords(view, this.l);
        if (this.l.bottom + i2 >= getScrollY() && this.l.top - i2 <= getScrollY() + i3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:            if (r18 == 33) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:            r2 = r20 - r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0075, code lost:            r2 = r19 - r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0073, code lost:            if (r18 == 33) goto L94;     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean J(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 2
            java.util.ArrayList r6 = r0.getFocusables(r6)
            int r7 = r6.size()
            r9 = 0
            r10 = 0
            r11 = 0
        L1d:
            r12 = 33
            r13 = 1
            if (r10 >= r7) goto L67
            java.lang.Object r14 = r6.get(r10)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r8 = r14.getBottom()
            if (r2 >= r8) goto L64
            if (r15 >= r3) goto L64
            if (r2 >= r15) goto L3b
            if (r8 >= r3) goto L3b
            r16 = 1
            goto L3d
        L3b:
            r16 = 0
        L3d:
            if (r9 != 0) goto L43
            r9 = r14
            r11 = r16
            goto L64
        L43:
            if (r1 != r12) goto L4c
            int r8 = r9.getTop()
            if (r15 < r8) goto L52
            goto L54
        L4c:
            int r12 = r9.getBottom()
            if (r8 <= r12) goto L54
        L52:
            r8 = 1
            goto L55
        L54:
            r8 = 0
        L55:
            if (r11 == 0) goto L5c
            if (r16 == 0) goto L64
            if (r8 == 0) goto L64
            goto L63
        L5c:
            if (r16 == 0) goto L61
            r9 = r14
            r11 = 1
            goto L64
        L61:
            if (r8 == 0) goto L64
        L63:
            r9 = r14
        L64:
            int r10 = r10 + 1
            goto L1d
        L67:
            if (r9 != 0) goto L6a
            r9 = r0
        L6a:
            if (r2 < r5) goto L73
            if (r3 > r4) goto L70
            r8 = 0
            goto L7e
        L70:
            if (r1 != r12) goto L77
            goto L75
        L73:
            if (r1 != r12) goto L77
        L75:
            int r2 = r2 - r5
            goto L79
        L77:
            int r2 = r3 - r4
        L79:
            r3 = 0
            r0.x(r2, r3, r13, r13)
            r8 = 1
        L7e:
            android.view.View r2 = r17.findFocus()
            if (r9 == r2) goto L87
            r9.requestFocus(r1)
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int):boolean");
    }

    private final boolean K(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float b = brd.b(edgeEffect) * getHeight();
        double log = Math.log((Math.abs(-i2) * 0.35f) / (this.j * 0.015f));
        double d = g;
        if (((float) (this.j * 0.015f * Math.exp((d / ((-1.0d) + d)) * log))) < b) {
            return true;
        }
        return false;
    }

    private final boolean L(MotionEvent motionEvent) {
        boolean z;
        if (brd.b(this.b) != 0.0f) {
            brd.c(this.b, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (brd.b(this.c) != 0.0f) {
            brd.c(this.c, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private final void M(int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            E(z);
        } else {
            if (!this.a.isFinished()) {
                y();
            }
            scrollBy(i2, i3);
        }
        this.k = AnimationUtils.currentAnimationTimeMillis();
    }

    private static int w(int i2, int i3, int i4) {
        if (i3 < i4 && i2 >= 0) {
            if (i3 + i2 > i4) {
                return i4 - i3;
            }
            return i2;
        }
        return 0;
    }

    private final int x(int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            p(2, 1);
        }
        if (l(0, i2, this.z, this.y, i4)) {
            i5 = i2 - this.z[1];
            i6 = this.y[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int c = c();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && c() > 0)) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (r(i5, 0, scrollY, c) && !o(i4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.z;
        iArr[1] = 0;
        q(scrollY2, i5 - scrollY2, this.y, i4, iArr);
        int i7 = i6 + this.y[1];
        int i8 = i5 - this.z[1];
        int i9 = scrollY + i8;
        if (i9 < 0) {
            if (z2) {
                brd.c(this.b, (-i8) / getHeight(), i3 / getWidth());
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (i9 > c && z2) {
            brd.c(this.c, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (this.b.isFinished() && this.c.isFinished()) {
            if (z3 && i4 == 0 && (velocityTracker = this.r) != null) {
                velocityTracker.clear();
            }
        } else {
            postInvalidateOnAnimation();
        }
        if (i4 == 1) {
            j(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return i7;
    }

    private final void y() {
        this.a.abortAnimation();
        j(1);
    }

    private final void z() {
        this.x = -1;
        this.q = false;
        D();
        j(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    public final float a() {
        float f = this.F;
        if (f == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
                this.F = dimension;
                return dimension;
            }
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        return f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    protected final int b(Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i5 - verticalFadingEdgeLength;
        } else {
            i2 = i5;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = rect.top - scrollY;
            } else {
                i4 = rect.bottom - i2;
            }
            return Math.min(i4, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        if (rect.height() > height) {
            i3 = -(i2 - rect.bottom);
        } else {
            i3 = -(scrollY - rect.top);
        }
        return Math.max(i3, -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY <= max) {
            return bottom;
        }
        return bottom + (scrollY - max);
    }

    @Override // defpackage.bvg
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        l(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.E.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.E.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return l(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.E.h(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.b.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (bzr.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (bzr.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.c.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(c(), scrollY) + height2;
            if (bzr.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i3 = getPaddingLeft();
            }
            if (bzr.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i3 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.c.setSize(width2, height2);
            if (this.c.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.bvg
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        B(i5, i6, null);
    }

    @Override // defpackage.bvh
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        B(i5, i6, iArr);
    }

    @Override // defpackage.bvg
    public final void g(View view, View view2, int i2, int i3) {
        this.D.b(i2, i3);
        p(2, i3);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.D.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.bvg
    public final void h(View view, int i2) {
        this.D.c(i2);
        j(i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return o(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            E(true);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.a;
    }

    public final void j(int i2) {
        this.E.c(i2);
    }

    public final boolean k(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus != null && I(findNextFocus, height, getHeight())) {
            findNextFocus.getDrawingRect(this.l);
            offsetDescendantRectToMyCoords(findNextFocus, this.l);
            x(b(this.l), 0, 1, true);
            findNextFocus.requestFocus(i2);
        } else {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            x(height, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && G(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean l(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.E.g(i2, i3, iArr, iArr2, i4);
    }

    public final boolean m(KeyEvent keyEvent) {
        this.l.setEmpty();
        int i2 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                        s(130);
                                        return false;
                                    }
                                    s(33);
                                    return false;
                                }
                                return n(130);
                            }
                            return n(33);
                        }
                        if (true == keyEvent.isShiftPressed()) {
                            i2 = 33;
                        }
                        s(i2);
                        return false;
                    }
                    if (keyEvent.isAltPressed()) {
                        return n(130);
                    }
                    return k(130);
                }
                if (keyEvent.isAltPressed()) {
                    return n(33);
                }
                return k(33);
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i2) {
        int childCount;
        Rect rect = this.l;
        int height = getHeight();
        rect.top = 0;
        this.l.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.l.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.l;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.l;
        return J(i2, rect3.top, rect3.bottom);
    }

    public final boolean o(int i2) {
        return this.E.k(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        float f;
        int i3;
        if (motionEvent.getAction() == 8 && !this.q) {
            if (bql.c(motionEvent, 2)) {
                i2 = 9;
                f = motionEvent.getAxisValue(9);
                i3 = (int) motionEvent.getX();
            } else if (bql.c(motionEvent, 4194304)) {
                f = motionEvent.getAxisValue(26);
                i3 = getWidth() / 2;
                i2 = 26;
            } else {
                i2 = 0;
                f = 0.0f;
                i3 = 0;
            }
            if (f != 0.0f) {
                x(-((int) (f * a())), i3, 1, bql.c(motionEvent, 8194));
                this.f.a(motionEvent, i2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.q) {
                return true;
            }
            action = 2;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 6) {
                            C(motionEvent);
                        }
                    }
                } else {
                    int i3 = this.x;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", a.am(i3, "Invalid pointerId=", " in onInterceptTouchEvent"));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.m) > this.u && (2 & getNestedScrollAxes()) == 0) {
                                this.q = true;
                                this.m = y;
                                A();
                                this.r.addMovement(motionEvent);
                                this.A = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.q = false;
            this.x = -1;
            D();
            if (this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                postInvalidateOnAnimation();
            }
            j(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.m = y2;
                    this.x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.r;
                    if (velocityTracker == null) {
                        this.r = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.r.addMovement(motionEvent);
                    this.a.computeScrollOffset();
                    if (!L(motionEvent) && this.a.isFinished()) {
                        z = false;
                    }
                    this.q = z;
                    p(2, 0);
                }
            }
            if (!L(motionEvent) && this.a.isFinished()) {
                z = false;
            }
            this.q = z;
            D();
        }
        return this.q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        this.n = false;
        View view = this.p;
        if (view != null && H(view, this)) {
            F(this.p);
        }
        this.p = null;
        if (!this.o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.a);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int w = w(scrollY, paddingTop, i6);
            if (w != scrollY) {
                scrollTo(getScrollX(), w);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.s && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            i((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        B(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect != null && !G(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bzu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bzu bzuVar = (bzu) parcelable;
        super.onRestoreInstanceState(bzuVar.getSuperState());
        this.C = bzuVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        bzu bzuVar = new bzu(super.onSaveInstanceState());
        bzuVar.a = getScrollY();
        return bzuVar;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        bzt bztVar = this.d;
        if (bztVar != null) {
            bztVar.a(this);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && I(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.l);
            offsetDescendantRectToMyCoords(findFocus, this.l);
            int b = b(this.l);
            if (b != 0) {
                if (this.t) {
                    u(b);
                } else {
                    scrollBy(0, b);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i2, int i3) {
        return this.E.m(i2, i3);
    }

    public final void q(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.E.i(0, i2, 0, i3, iArr, i4, iArr2);
    }

    final boolean r(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        if (i3 > 0 || i3 < 0) {
            z = true;
        } else {
            z = false;
        }
        int i6 = i4 + i2;
        if (i6 > i5) {
            z2 = true;
        } else if (i6 < 0) {
            z2 = true;
            i5 = 0;
        } else {
            i5 = i6;
            z2 = false;
        }
        if (z2 && !o(1)) {
            this.a.springBack(0, i5, 0, 0, 0, c());
        }
        onOverScrolled(0, i5, z, z2);
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n) {
            F(view2);
        } else {
            this.p = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b = b(rect);
        if (b != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, b);
            } else {
                u(b);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.n = true;
        super.requestLayout();
    }

    public final void s(int i2) {
        int height = getHeight();
        if (i2 == 130) {
            this.l.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.l.top + height > bottom) {
                    this.l.top = bottom - height;
                }
            }
        } else {
            this.l.top = getScrollY() - height;
            if (this.l.top < 0) {
                this.l.top = 0;
            }
        }
        Rect rect = this.l;
        rect.bottom = rect.top + height;
        Rect rect2 = this.l;
        J(i2, rect2.top, rect2.bottom);
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int w = w(i2, width, width2);
            int w2 = w(i3, height, height2);
            if (w != getScrollX() || w2 != getScrollY()) {
                super.scrollTo(w, w2);
            }
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.E.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return p(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        j(0);
    }

    @Override // defpackage.bvg
    public boolean t(View view, View view2, int i2, int i3) {
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void u(int i2) {
        M(0, i2, false);
    }

    public final void v(int i2) {
        M(-getScrollX(), i2 - getScrollY(), true);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new Rect();
        this.n = true;
        this.o = false;
        this.p = null;
        this.q = false;
        this.t = true;
        this.x = -1;
        this.y = new int[2];
        this.z = new int[2];
        bzs bzsVar = new bzs(this, 0);
        this.e = bzsVar;
        this.f = new bus(getContext(), bzsVar);
        this.b = brd.d(context, attributeSet);
        this.c = brd.d(context, attributeSet);
        this.j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.u = viewConfiguration.getScaledTouchSlop();
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, i2, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.s) {
            this.s = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.D = new bvi();
        this.E = new bvf(this);
        setNestedScrollingEnabled(true);
        bwn.q(this, h);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
