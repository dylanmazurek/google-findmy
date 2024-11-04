package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import defpackage.a;
import defpackage.ag;
import defpackage.bi;
import defpackage.bm;
import defpackage.brd;
import defpackage.bwb;
import defpackage.bwn;
import defpackage.cag;
import defpackage.cob;
import defpackage.coc;
import defpackage.cod;
import defpackage.coe;
import defpackage.cof;
import defpackage.cog;
import defpackage.coh;
import defpackage.coi;
import defpackage.col;
import defpackage.f;
import defpackage.ixa;
import defpackage.kg;
import defpackage.kup;
import defpackage.kuq;
import defpackage.kva;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator p = new kg(10);
    private static final Interpolator q = new cag(2);
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private final boolean F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private final Runnable S;
    private int T;
    public int b;
    public final ArrayList c;
    public cob d;
    public int e;
    public int f;
    public Parcelable g;
    public ClassLoader h;
    public coh i;
    public boolean j;
    public EdgeEffect k;
    public EdgeEffect l;
    public boolean m;
    public List n;
    public List o;
    private final coe r;
    private final Rect s;
    private Scroller t;
    private boolean u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;
    private final int z;

    public ViewPager(Context context) {
        super(context);
        this.c = new ArrayList();
        this.r = new coe();
        this.s = new Rect();
        this.f = -1;
        this.g = null;
        this.h = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.z = 1;
        this.F = true;
        this.K = -1;
        this.m = true;
        this.S = new col(this, 1);
        this.T = 0;
        o(context);
    }

    private final boolean A(float f, float f2) {
        float f3;
        boolean z;
        boolean z2;
        float f4 = this.G - f;
        this.G = f;
        float width = f4 / getWidth();
        float height = f2 / getHeight();
        if (brd.b(this.k) != 0.0f) {
            f3 = -brd.c(this.k, -width, 1.0f - height);
        } else if (brd.b(this.l) != 0.0f) {
            f3 = brd.c(this.l, width, height);
        } else {
            f3 = 0.0f;
        }
        float width2 = f3 * getWidth();
        float f5 = f4 - width2;
        boolean z3 = false;
        boolean z4 = true;
        if (width2 != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f5) < 1.0E-4f) {
            return z;
        }
        float scrollX = getScrollX() + f5;
        float r = r();
        float f6 = this.v * r;
        float f7 = this.w * r;
        coe coeVar = (coe) this.c.get(0);
        coe coeVar2 = (coe) this.c.get(r8.size() - 1);
        if (coeVar.b != 0) {
            f6 = coeVar.e * r;
            z2 = false;
        } else {
            z2 = true;
        }
        if (coeVar2.b != this.d.e() - 1) {
            f7 = coeVar2.e * r;
        } else {
            z3 = true;
        }
        if (scrollX < f6) {
            if (z2) {
                brd.c(this.k, (f6 - scrollX) / r, 1.0f - (f2 / getHeight()));
            } else {
                z4 = z;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z3) {
                brd.c(this.l, (scrollX - f7) / r, f2 / getHeight());
            } else {
                z4 = z;
            }
            scrollX = f7;
        } else {
            z4 = z;
        }
        int i = (int) scrollX;
        this.G += scrollX - i;
        scrollTo(i, getScrollY());
        z(i);
        return z4;
    }

    private final boolean B() {
        this.K = -1;
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        this.k.onRelease();
        this.l.onRelease();
        if (this.k.isFinished() && this.l.isFinished()) {
            return false;
        }
        return true;
    }

    private final void C() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int r() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect s(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final coe t() {
        float f;
        float f2;
        int i;
        int r = r();
        float f3 = 0.0f;
        if (r > 0) {
            f = getScrollX() / r;
        } else {
            f = 0.0f;
        }
        if (r > 0) {
            f2 = 0.0f / r;
        } else {
            f2 = 0.0f;
        }
        coe coeVar = null;
        float f4 = 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        while (i2 < this.c.size()) {
            coe coeVar2 = (coe) this.c.get(i2);
            if (!z && coeVar2.b != (i = i3 + 1)) {
                coeVar2 = this.r;
                coeVar2.e = f3 + f4 + f2;
                coeVar2.b = i;
                coeVar2.d = 1.0f;
                i2--;
            }
            coe coeVar3 = coeVar2;
            f3 = coeVar3.e;
            float f5 = coeVar3.d + f3 + f2;
            if (!z && f < f3) {
                return coeVar;
            }
            if (f >= f5 && i2 != this.c.size() - 1) {
                i3 = coeVar3.b;
                i2++;
                z = false;
                coeVar = coeVar3;
                f4 = coeVar3.d;
            } else {
                return coeVar3;
            }
        }
        return coeVar;
    }

    private final void u(boolean z) {
        boolean z2;
        if (this.T == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            y(false);
            if (!this.t.isFinished()) {
                this.t.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.t.getCurrX();
                int currY = this.t.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        z(currX);
                    }
                }
            }
        }
        this.j = false;
        for (int i = 0; i < this.c.size(); i++) {
            coe coeVar = (coe) this.c.get(i);
            if (coeVar.c) {
                coeVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                Runnable runnable = this.S;
                int[] iArr = bwn.a;
                postOnAnimation(runnable);
                return;
            }
            this.S.run();
        }
    }

    private final void v(int i) {
        TabLayout tabLayout;
        List list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ixa ixaVar = (ixa) this.n.get(i2);
                if (ixaVar != null && (tabLayout = (TabLayout) ((WeakReference) ixaVar.c).get()) != null && tabLayout.a() != i && i < tabLayout.b()) {
                    int i3 = ixaVar.b;
                    boolean z = true;
                    if (i3 != 0 && (i3 != 2 || ixaVar.a != 0)) {
                        z = false;
                    }
                    tabLayout.k(tabLayout.c(i), z);
                }
            }
        }
    }

    private final void w(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.G = motionEvent.getX(i);
            this.K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void x(int i, boolean z, int i2, boolean z2) {
        int i3;
        int scrollX;
        int i4;
        int abs;
        coe c = c(i);
        if (c != null) {
            i3 = (int) (r() * Math.max(this.v, Math.min(c.e, this.w)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                y(false);
            } else {
                Scroller scroller = this.t;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.u) {
                        scrollX = this.t.getCurrX();
                    } else {
                        scrollX = this.t.getStartX();
                    }
                    this.t.abortAnimation();
                    y(false);
                } else {
                    scrollX = getScrollX();
                }
                int i5 = scrollX;
                int scrollY = getScrollY();
                int i6 = i3 - i5;
                int i7 = -scrollY;
                if (i6 == 0) {
                    if (i7 == 0) {
                        u(false);
                        e();
                        j(0);
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = i6;
                }
                y(true);
                j(2);
                int r = r();
                int i8 = r / 2;
                float f = r;
                float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    float f2 = i8;
                    abs = Math.round(Math.abs((f2 + (sin * f2)) / abs2) * 1000.0f) * 4;
                } else {
                    abs = (int) (((Math.abs(i4) / (f + 0.0f)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.u = false;
                this.t.startScroll(i5, scrollY, i4, i7, min);
                postInvalidateOnAnimation();
            }
            if (z2) {
                v(i);
                return;
            }
            return;
        }
        if (z2) {
            v(i);
        }
        u(false);
        scrollTo(i3, 0);
        z(i3);
    }

    private final void y(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    private final boolean z(int i) {
        if (this.c.size() == 0) {
            if (this.m) {
                return false;
            }
            this.Q = false;
            q(0, 0.0f);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        coe t = t();
        float r = r();
        int i2 = t.b;
        float f = (i / r) - t.e;
        float f2 = t.d;
        this.Q = false;
        q(i2, f / (f2 + (0.0f / r)));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    final coe a(int i, int i2) {
        ag kupVar;
        coe coeVar = new coe();
        coeVar.b = i;
        cob cobVar = this.d;
        bi biVar = (bi) cobVar;
        if (biVar.b == null) {
            biVar.b = new f(biVar.a);
        }
        long j = i;
        ag f = biVar.a.f(bi.a(getId(), j));
        if (f != null) {
            biVar.b.n(new bm(7, f));
        } else {
            Bundle bundle = new Bundle();
            if (i != 0) {
                if (i == 1) {
                    bundle.putParcelableArrayList("configs_to_display", ((kuq) cobVar).f);
                    kupVar = new kva();
                    kupVar.ak(bundle);
                } else {
                    throw new IllegalStateException(a.ae(i, "No fragment for index: "));
                }
            } else {
                bundle.putParcelableArrayList("configs_to_display", ((kuq) cobVar).f);
                kupVar = new kup();
                kupVar.ak(bundle);
            }
            f = kupVar;
            biVar.b.p(getId(), f, bi.a(getId(), j));
        }
        if (f != biVar.c) {
            f.am(false);
            f.ar(false);
        }
        coeVar.a = f;
        coeVar.d = 1.0f;
        if (i2 >= 0 && i2 < this.c.size()) {
            this.c.add(i2, coeVar);
        } else {
            this.c.add(coeVar);
        }
        return coeVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        coe b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.e) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        coe b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.e) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new cof();
        }
        cof cofVar = (cof) layoutParams;
        boolean z2 = cofVar.a;
        if (view.getClass().getAnnotation(cod.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        cofVar.a = z3;
        if (this.x) {
            if (cofVar != null && z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            cofVar.d = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    final coe b(View view) {
        for (int i = 0; i < this.c.size(); i++) {
            coe coeVar = (coe) this.c.get(i);
            if (((ag) coeVar.a).P == view) {
                return coeVar;
            }
        }
        return null;
    }

    final coe c(int i) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            coe coeVar = (coe) this.c.get(i2);
            if (coeVar.b == i) {
                return coeVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.d == null) {
            return false;
        }
        int r = r();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (r * this.v))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (r * this.w))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof cof) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.u = true;
        if (!this.t.isFinished() && this.t.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.t.getCurrX();
            int currY = this.t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!z(currX)) {
                    this.t.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        u(true);
    }

    public final void d() {
        boolean z;
        int e = this.d.e();
        this.b = e;
        int i = this.z;
        if (this.c.size() < i + i + 1 && this.c.size() < e) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            Object obj = ((coe) this.c.get(i3)).a;
        }
        Collections.sort(this.c, p);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                cof cofVar = (cof) getChildAt(i4).getLayoutParams();
                if (!cofVar.a) {
                    cofVar.c = 0.0f;
                }
            }
            h(i2, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.k(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.k(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.n()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.k(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.m()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.k(r6)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        coe b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        cob cobVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (cobVar = this.d) == null || cobVar.e() <= 1)) {
            this.k.finish();
            this.l.finish();
            return;
        }
        if (!this.k.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.v * width);
            this.k.setSize(height, width);
            z = this.k.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.l.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.w + 1.0f)) * width2);
            this.l.setSize(height2, width2);
            z |= this.l.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() {
        f(this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:            if (r9 != r10) goto L23;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void f(int r18) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.f(int):void");
    }

    public final void g(int i) {
        this.j = false;
        h(i, !this.m, false);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cof();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cof(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public final void h(int i, boolean z, boolean z2) {
        i(i, z, z2, 0);
    }

    final void i(int i, boolean z, boolean z2, int i2) {
        cob cobVar = this.d;
        boolean z3 = false;
        if (cobVar != null && cobVar.e() > 0) {
            if (!z2 && this.e == i && this.c.size() != 0) {
                y(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.d.e()) {
                i = this.d.e() - 1;
            }
            int i3 = this.z;
            int i4 = this.e;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.c.size(); i5++) {
                    ((coe) this.c.get(i5)).c = true;
                }
            }
            if (this.e != i) {
                z3 = true;
            }
            if (this.m) {
                this.e = i;
                if (z3) {
                    v(i);
                }
                requestLayout();
                return;
            }
            f(i);
            x(i, z, i2, z3);
            return;
        }
        y(false);
    }

    public final void j(int i) {
        if (this.T != i) {
            this.T = i;
            List list = this.n;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ixa ixaVar = (ixa) this.n.get(i2);
                    if (ixaVar != null) {
                        ixaVar.a = ixaVar.b;
                        ixaVar.b = i;
                        TabLayout tabLayout = (TabLayout) ((WeakReference) ixaVar.c).get();
                        if (tabLayout != null) {
                            tabLayout.B = ixaVar.b;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto La9
            if (r1 == r0) goto La9
            if (r6 != r4) goto L89
            android.graphics.Rect r2 = r5.s
            android.graphics.Rect r2 = r5.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.s
            android.graphics.Rect r3 = r5.s(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L84
            if (r2 < r3) goto L84
            boolean r2 = r5.m()
            goto Lbd
        L84:
            boolean r2 = r1.requestFocus()
            goto Lbd
        L89:
            if (r6 != r3) goto Lbd
            android.graphics.Rect r2 = r5.s
            android.graphics.Rect r2 = r5.s(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.s
            android.graphics.Rect r3 = r5.s(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La4
            if (r2 > r3) goto La4
            boolean r2 = r5.n()
            goto Lbd
        La4:
            boolean r2 = r1.requestFocus()
            goto Lbd
        La9:
            if (r6 == r4) goto Lb9
            r0 = 1
            if (r6 != r0) goto Laf
            goto Lb9
        Laf:
            if (r6 == r3) goto Lb4
            r0 = 2
            if (r6 != r0) goto Lbd
        Lb4:
            boolean r2 = r5.n()
            goto Lbd
        Lb9:
            boolean r2 = r5.m()
        Lbd:
            if (r2 == 0) goto Lc6
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int):boolean");
    }

    protected final boolean l(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && l(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    final boolean m() {
        int i = this.e;
        if (i > 0) {
            p(i - 1);
            return true;
        }
        return false;
    }

    final boolean n() {
        if (this.d != null && this.e < r0.e() - 1) {
            p(this.e + 1);
            return true;
        }
        return false;
    }

    final void o(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.t = new Scroller(context, q);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.k = new EdgeEffect(context);
        this.l = new EdgeEffect(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (f + f);
        this.C = (int) (f * 16.0f);
        bwn.q(this, new cog(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        bwb.n(this, new coc(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.A) {
                    return true;
                }
                if (this.B) {
                    return false;
                }
                if (action != 2) {
                    if (action == 6) {
                        w(motionEvent);
                    }
                } else {
                    int i = this.K;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.G;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.J);
                        if (f2 != 0.0f) {
                            float f3 = this.G;
                            if ((this.F || ((f3 >= this.D || f2 <= 0.0f) && (f3 <= getWidth() - this.D || f2 >= 0.0f))) && l(this, false, (int) f2, (int) x, (int) y)) {
                                this.G = x;
                                this.H = y;
                                this.B = true;
                                return false;
                            }
                        }
                        float f4 = this.E;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.A = true;
                            C();
                            j(1);
                            if (f2 > 0.0f) {
                                f = this.I + this.E;
                            } else {
                                f = this.I - this.E;
                            }
                            this.G = f;
                            this.H = y;
                            y(true);
                        } else if (abs2 > f4) {
                            this.B = true;
                        }
                        if (this.A && A(x, y)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.I = x2;
                this.G = x2;
                float y2 = motionEvent.getY();
                this.J = y2;
                this.H = y2;
                this.K = motionEvent.getPointerId(0);
                this.B = false;
                this.u = true;
                this.t.computeScrollOffset();
                if (this.T == 2 && Math.abs(this.t.getFinalX() - this.t.getCurrX()) > this.P) {
                    this.t.abortAnimation();
                    this.j = false;
                    e();
                    this.A = true;
                    C();
                    j(1);
                } else if (brd.b(this.k) == 0.0f && brd.b(this.l) == 0.0f) {
                    u(false);
                    this.A = false;
                } else {
                    this.A = true;
                    j(1);
                    if (brd.b(this.k) != 0.0f) {
                        brd.c(this.k, 0.0f, 1.0f - (this.H / getHeight()));
                    }
                    if (brd.b(this.l) != 0.0f) {
                        brd.c(this.l, 0.0f, this.H / getHeight());
                    }
                }
            }
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.addMovement(motionEvent);
            return this.A;
        }
        B();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        coe b;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i4 = childCount;
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.e && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof coi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        coi coiVar = (coi) parcelable;
        super.onRestoreInstanceState(coiVar.d);
        if (this.d != null) {
            Parcelable parcelable2 = coiVar.b;
            ClassLoader classLoader = coiVar.e;
            h(coiVar.a, false, true);
        } else {
            this.f = coiVar.a;
            this.g = coiVar.b;
            this.h = coiVar.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        coi coiVar = new coi(super.onSaveInstanceState());
        coiVar.a = this.e;
        if (this.d != null) {
            coiVar.b = null;
        }
        return coiVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.c.isEmpty()) {
                if (!this.t.isFinished()) {
                    this.t.setFinalX(this.e * r());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            coe c = c(this.e);
            if (c != null) {
                f = Math.min(c.e, this.w);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
            if (paddingLeft != getScrollX()) {
                u(false);
                scrollTo(paddingLeft, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01bb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        this.j = false;
        h(i, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void q(int r16, float r17) {
        /*
            r15 = this;
            r0 = r15
            int r1 = r0.R
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 <= 0) goto L6b
            int r1 = r15.getScrollX()
            int r5 = r15.getPaddingLeft()
            int r6 = r15.getPaddingRight()
            int r7 = r15.getWidth()
            int r8 = r15.getChildCount()
            r9 = 0
        L1d:
            if (r9 >= r8) goto L6b
            android.view.View r10 = r15.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            cof r11 = (defpackage.cof) r11
            boolean r12 = r11.a
            if (r12 == 0) goto L68
            int r11 = r11.b
            r11 = r11 & 7
            if (r11 == r4) goto L4e
            r12 = 3
            if (r11 == r12) goto L48
            r12 = 5
            if (r11 == r12) goto L3b
            r11 = r5
            goto L5c
        L3b:
            int r11 = r7 - r6
            int r12 = r10.getMeasuredWidth()
            int r11 = r11 - r12
            int r12 = r10.getMeasuredWidth()
            int r6 = r6 + r12
            goto L59
        L48:
            int r11 = r10.getWidth()
            int r11 = r11 + r5
            goto L5c
        L4e:
            int r11 = r10.getMeasuredWidth()
            int r11 = r7 - r11
            int r11 = r11 / r2
            int r11 = java.lang.Math.max(r11, r5)
        L59:
            r14 = r11
            r11 = r5
            r5 = r14
        L5c:
            int r5 = r5 + r1
            int r12 = r10.getLeft()
            int r5 = r5 - r12
            if (r5 == 0) goto L67
            r10.offsetLeftAndRight(r5)
        L67:
            r5 = r11
        L68:
            int r9 = r9 + 1
            goto L1d
        L6b:
            java.util.List r1 = r0.n
            if (r1 == 0) goto Lae
            int r1 = r1.size()
            r5 = 0
        L74:
            if (r5 >= r1) goto Lae
            java.util.List r6 = r0.n
            java.lang.Object r6 = r6.get(r5)
            ixa r6 = (defpackage.ixa) r6
            if (r6 == 0) goto Lab
            java.lang.Object r7 = r6.c
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r7.get()
            r8 = r7
            com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
            if (r8 == 0) goto Lab
            int r7 = r6.b
            if (r7 != r2) goto L98
            int r9 = r6.a
            if (r9 != r4) goto L96
            goto L98
        L96:
            r11 = 0
            goto L99
        L98:
            r11 = 1
        L99:
            if (r7 != r2) goto La2
            int r6 = r6.a
            if (r6 == 0) goto La0
            goto La2
        La0:
            r12 = 0
            goto La3
        La2:
            r12 = 1
        La3:
            r13 = 0
            r9 = r16
            r10 = r17
            r8.m(r9, r10, r11, r12, r13)
        Lab:
            int r5 = r5 + 1
            goto L74
        Lae:
            r0.Q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int, float):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new cof();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.r = new coe();
        this.s = new Rect();
        this.f = -1;
        this.g = null;
        this.h = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.z = 1;
        this.F = true;
        this.K = -1;
        this.m = true;
        this.S = new col(this, 1);
        this.T = 0;
        o(context);
    }
}
