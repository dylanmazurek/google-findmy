package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.adm.R;
import defpackage.bet;
import defpackage.bpu;
import defpackage.buf;
import defpackage.bug;
import defpackage.buh;
import defpackage.bwb;
import defpackage.byn;
import defpackage.cob;
import defpackage.cod;
import defpackage.eb;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.inc;
import defpackage.ioj;
import defpackage.iqh;
import defpackage.isa;
import defpackage.iuu;
import defpackage.ivc;
import defpackage.ivf;
import defpackage.iwp;
import defpackage.iwq;
import defpackage.iwr;
import defpackage.iws;
import defpackage.iwt;
import defpackage.iwu;
import defpackage.iww;
import defpackage.iwy;
import defpackage.iwz;
import defpackage.ixa;
import defpackage.ixb;
import defpackage.ixe;
import defpackage.iyj;
import defpackage.kuq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cod
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    private static final buf D = new buh(16);
    public ViewPager A;
    public int B;
    public iuu C;
    private final ArrayList E;
    private iwz F;
    private int G;
    private final int H;
    private final int I;
    private final int J;
    private int K;
    private final ArrayList L;
    private iwu M;
    private ValueAnimator N;
    private cob O;
    private DataSetObserver P;
    private ixa Q;
    private iwt R;
    private boolean S;
    private final buf T;
    public int a;
    final iwy b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final TimeInterpolator z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int q(int i, float f) {
        View childAt;
        View view;
        int i2 = this.u;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.b.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.b.getChildCount()) {
            view = this.b.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private final int r() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.J;
    }

    private static ColorStateList s(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void t(View view) {
        if (view instanceof iws) {
            iws iwsVar = (iws) view;
            iwz d = d();
            CharSequence charSequence = iwsVar.a;
            Drawable drawable = iwsVar.b;
            int i = iwsVar.c;
            if (!TextUtils.isEmpty(iwsVar.getContentDescription())) {
                d.b = iwsVar.getContentDescription();
                d.b();
            }
            f(d, this.E.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void u(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            iwy iwyVar = this.b;
            int childCount = iwyVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (iwyVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int q = q(i, 0.0f);
            if (scrollX != q) {
                if (this.N == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.N = valueAnimator;
                    valueAnimator.setInterpolator(this.z);
                    this.N.setDuration(this.s);
                    this.N.addUpdateListener(new ioj(this, 7));
                }
                this.N.setIntValues(scrollX, q);
                this.N.start();
            }
            iwy iwyVar2 = this.b;
            int i3 = this.s;
            ValueAnimator valueAnimator2 = iwyVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && iwyVar2.b.a != i) {
                iwyVar2.a.cancel();
            }
            iwyVar2.d(true, i, i3);
            return;
        }
        p(i);
    }

    private final void v(int i) {
        boolean z;
        int childCount = this.b.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                iwy iwyVar = this.b;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                View childAt = iwyVar.getChildAt(i2);
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof ixb) {
                        ((ixb) childAt).c();
                    }
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                }
            }
        }
    }

    private final void w(LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean x() {
        int i = this.u;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    private final void y(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A;
        if (viewPager2 != null) {
            ixa ixaVar = this.Q;
            if (ixaVar != null && (list2 = viewPager2.n) != null) {
                list2.remove(ixaVar);
            }
            iwt iwtVar = this.R;
            if (iwtVar != null && (list = this.A.o) != null) {
                list.remove(iwtVar);
            }
        }
        iwu iwuVar = this.M;
        if (iwuVar != null) {
            this.L.remove(iwuVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.A = viewPager;
            if (this.Q == null) {
                this.Q = new ixa(this);
            }
            ixa ixaVar2 = this.Q;
            ixaVar2.b = 0;
            ixaVar2.a = 0;
            if (viewPager.n == null) {
                viewPager.n = new ArrayList();
            }
            viewPager.n.add(ixaVar2);
            ixe ixeVar = new ixe(viewPager, 1);
            this.M = ixeVar;
            e(ixeVar);
            cob cobVar = viewPager.d;
            if (cobVar != null) {
                l(cobVar, true);
            }
            if (this.R == null) {
                this.R = new iwt(this);
            }
            iwt iwtVar2 = this.R;
            iwtVar2.a = true;
            if (viewPager.o == null) {
                viewPager.o = new ArrayList();
            }
            viewPager.o.add(iwtVar2);
            p(viewPager.e);
        } else {
            this.A = null;
            l(null, false);
        }
        this.S = z;
    }

    public final int a() {
        iwz iwzVar = this.F;
        if (iwzVar != null) {
            return iwzVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        t(view);
    }

    public final int b() {
        return this.E.size();
    }

    public final iwz c(int i) {
        if (i >= 0 && i < b()) {
            return (iwz) this.E.get(i);
        }
        return null;
    }

    public final iwz d() {
        ixb ixbVar;
        iwz iwzVar = (iwz) D.a();
        if (iwzVar == null) {
            iwzVar = new iwz();
        }
        iwzVar.f = this;
        buf bufVar = this.T;
        if (bufVar != null) {
            ixbVar = (ixb) bufVar.a();
        } else {
            ixbVar = null;
        }
        if (ixbVar == null) {
            ixbVar = new ixb(this, getContext());
        }
        ixbVar.a(iwzVar);
        ixbVar.setFocusable(true);
        ixbVar.setMinimumWidth(r());
        if (TextUtils.isEmpty(iwzVar.b)) {
            ixbVar.setContentDescription(iwzVar.a);
        } else {
            ixbVar.setContentDescription(iwzVar.b);
        }
        iwzVar.g = ixbVar;
        if (iwzVar.h != -1) {
            iwzVar.g.setId(0);
        }
        return iwzVar;
    }

    @Deprecated
    public final void e(iwu iwuVar) {
        if (!this.L.contains(iwuVar)) {
            this.L.add(iwuVar);
        }
    }

    public final void f(iwz iwzVar, boolean z) {
        int size = this.E.size();
        if (iwzVar.f == this) {
            iwzVar.c = size;
            this.E.add(size, iwzVar);
            int size2 = this.E.size();
            int i = -1;
            for (int i2 = size + 1; i2 < size2; i2++) {
                if (((iwz) this.E.get(i2)).c == this.a) {
                    i = i2;
                }
                ((iwz) this.E.get(i2)).c = i2;
            }
            this.a = i;
            ixb ixbVar = iwzVar.g;
            ixbVar.setSelected(false);
            ixbVar.setActivated(false);
            iwy iwyVar = this.b;
            int i3 = iwzVar.c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            w(layoutParams);
            iwyVar.addView(ixbVar, i3, layoutParams);
            if (z) {
                iwzVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:            if (r0 != 2) goto L52;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r4 = this;
            int r0 = r4.u
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.K
            int r3 = r4.c
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            iwy r3 = r4.b
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.u
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L25
            if (r0 == r1) goto L25
            goto L50
        L25:
            int r0 = r4.r
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            iwy r0 = r4.b
            r0.setGravity(r3)
            goto L50
        L34:
            int r0 = r4.r
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r1) goto L48
            goto L50
        L3d:
            iwy r0 = r4.b
            r0.setGravity(r3)
            goto L50
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            iwy r0 = r4.b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L50:
            r4.o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.g():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        i();
        cob cobVar = this.O;
        if (cobVar != null) {
            int e = cobVar.e();
            for (int i2 = 0; i2 < e; i2++) {
                iwz d = d();
                d.c((CharSequence) kuq.e.get(i2));
                f(d, false);
            }
            ViewPager viewPager = this.A;
            if (viewPager != null && e > 0 && (i = viewPager.e) != a() && i < b()) {
                j(c(i));
            }
        }
    }

    public final void i() {
        for (int childCount = this.b.getChildCount() - 1; childCount >= 0; childCount--) {
            ixb ixbVar = (ixb) this.b.getChildAt(childCount);
            this.b.removeViewAt(childCount);
            if (ixbVar != null) {
                ixbVar.a(null);
                ixbVar.setSelected(false);
                this.T.b(ixbVar);
            }
            requestLayout();
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            iwz iwzVar = (iwz) it.next();
            it.remove();
            iwzVar.f = null;
            iwzVar.g = null;
            iwzVar.h = -1;
            iwzVar.a = null;
            iwzVar.b = null;
            iwzVar.c = -1;
            iwzVar.d = null;
            D.b(iwzVar);
        }
        this.F = null;
    }

    public final void j(iwz iwzVar) {
        k(iwzVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:            if (r0.c == (-1)) goto L60;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.iwz r4, boolean r5) {
        /*
            r3 = this;
            iwz r0 = r3.F
            r1 = -1
            if (r0 != r4) goto L24
            if (r0 == 0) goto L7a
            java.util.ArrayList r5 = r3.L
            int r5 = r5.size()
            int r5 = r5 + r1
        Le:
            if (r5 < 0) goto L1e
            java.util.ArrayList r0 = r3.L
            java.lang.Object r0 = r0.get(r5)
            iwu r0 = (defpackage.iwu) r0
            r0.b()
            int r5 = r5 + (-1)
            goto Le
        L1e:
            int r4 = r4.c
            r3.u(r4)
            return
        L24:
            if (r4 == 0) goto L29
            int r2 = r4.c
            goto L2a
        L29:
            r2 = -1
        L2a:
            if (r5 == 0) goto L42
            if (r0 == 0) goto L33
            int r5 = r0.c
            if (r5 != r1) goto L3a
            goto L34
        L33:
            r0 = 0
        L34:
            if (r2 == r1) goto L3a
            r3.p(r2)
            goto L3d
        L3a:
            r3.u(r2)
        L3d:
            if (r2 == r1) goto L42
            r3.v(r2)
        L42:
            r3.F = r4
            if (r0 == 0) goto L61
            com.google.android.material.tabs.TabLayout r5 = r0.f
            if (r5 == 0) goto L61
            java.util.ArrayList r5 = r3.L
            int r5 = r5.size()
            int r5 = r5 + r1
        L51:
            if (r5 < 0) goto L61
            java.util.ArrayList r0 = r3.L
            java.lang.Object r0 = r0.get(r5)
            iwu r0 = (defpackage.iwu) r0
            r0.c()
            int r5 = r5 + (-1)
            goto L51
        L61:
            if (r4 == 0) goto L7a
            java.util.ArrayList r5 = r3.L
            int r5 = r5.size()
            int r5 = r5 + r1
        L6a:
            if (r5 < 0) goto L7a
            java.util.ArrayList r0 = r3.L
            java.lang.Object r0 = r0.get(r5)
            iwu r0 = (defpackage.iwu) r0
            r0.a(r4)
            int r5 = r5 + (-1)
            goto L6a
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.k(iwz, boolean):void");
    }

    public final void l(cob cobVar, boolean z) {
        DataSetObserver dataSetObserver;
        cob cobVar2 = this.O;
        if (cobVar2 != null && (dataSetObserver = this.P) != null) {
            cobVar2.d.unregisterObserver(dataSetObserver);
        }
        this.O = cobVar;
        if (z && cobVar != null) {
            if (this.P == null) {
                this.P = new iww(this);
            }
            cobVar.d.registerObserver(this.P);
        }
        h();
    }

    public final void m(int i, float f, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0 && round < this.b.getChildCount()) {
            if (z2) {
                iwy iwyVar = this.b;
                iwyVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = iwyVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    iwyVar.a.cancel();
                }
                iwyVar.c(iwyVar.getChildAt(i), iwyVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            int q = q(i, f);
            int scrollX = getScrollX();
            if ((i < a() && q >= scrollX) || ((i > a() && q <= scrollX) || i == a())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getLayoutDirection() == 1) {
                if ((i < a() && q <= scrollX) || ((i > a() && q >= scrollX) || i == a())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 || this.B == 1 || z3) {
                if (i < 0) {
                    q = 0;
                }
                scrollTo(q, 0);
            }
            if (z) {
                v(round);
            }
        }
    }

    public final void n(ViewPager viewPager) {
        y(viewPager, false);
    }

    public final void o(boolean z) {
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            childAt.setMinimumWidth(r());
            w((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivc.b(this);
        if (this.A == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                y((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            n(null);
            this.S = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ixb ixbVar;
        Drawable drawable;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof ixb) && (drawable = (ixbVar = (ixb) childAt).c) != null) {
                drawable.setBounds(ixbVar.getLeft(), ixbVar.getTop(), ixbVar.getRight(), ixbVar.getBottom());
                ixbVar.c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new byn(accessibilityNodeInfo).v(bet.k(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (x() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.E;
        Context context = getContext();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        int round = Math.round(hwx.j(context, 48));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i4 = this.I;
            if (i4 <= 0) {
                i4 = (int) (size2 - hwx.j(getContext(), 56));
            }
            this.q = i4;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.u;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !x()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(int i) {
        m(i, 0.0f, true, true, true);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ivc.a(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) <= 0) {
            return false;
        }
        return true;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        t(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        iuu iwpVar;
        this.a = -1;
        this.E = new ArrayList();
        this.i = -1;
        this.G = 0;
        this.q = Integer.MAX_VALUE;
        this.x = -1;
        this.L = new ArrayList();
        this.T = new bug(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        iwy iwyVar = new iwy(this, context2);
        this.b = iwyVar;
        super.addView(iwyVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = isa.a(context2, attributeSet, iwr.a, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList b = iqh.b(getBackground());
        if (b != null) {
            ivf ivfVar = new ivf();
            ivfVar.L(b);
            ivfVar.I(context2);
            ivfVar.K(bwb.a(this));
            setBackground(ivfVar);
        }
        Drawable j = hzc.j(context2, a, 5);
        Drawable mutate = bpu.i(j == null ? new GradientDrawable() : j).mutate();
        this.l = mutate;
        iqh.f(mutate, this.G);
        int i2 = this.x;
        iwyVar.b(i2 == -1 ? this.l.getIntrinsicHeight() : i2);
        int color = a.getColor(8, 0);
        this.G = color;
        iqh.f(this.l, color);
        o(false);
        iwyVar.b(a.getDimensionPixelSize(11, -1));
        int i3 = a.getInt(10, 0);
        if (this.t != i3) {
            this.t = i3;
            iwyVar.postInvalidateOnAnimation();
        }
        int i4 = a.getInt(7, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                iwpVar = new iwp();
            } else if (i4 == 2) {
                iwpVar = new iwq();
            } else {
                throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
            }
            this.C = iwpVar;
        } else {
            this.C = new iuu();
        }
        this.w = a.getBoolean(9, true);
        iwyVar.a();
        iwyVar.postInvalidateOnAnimation();
        int dimensionPixelSize = a.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = a.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = a.getDimensionPixelSize(20, this.d);
        this.e = a.getDimensionPixelSize(18, this.e);
        this.f = a.getDimensionPixelSize(17, this.f);
        this.g = true != isa.d(context2) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = a.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, eb.v);
        try {
            this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = hzc.i(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(22)) {
                this.i = a.getResourceId(22, resourceId);
            }
            int i5 = this.i;
            if (i5 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i5, eb.v);
                try {
                    this.n = obtainStyledAttributes.getDimensionPixelSize(0, (int) this.m);
                    ColorStateList i6 = hzc.i(context2, obtainStyledAttributes, 3);
                    if (i6 != null) {
                        this.j = s(this.j.getDefaultColor(), i6.getColorForState(new int[]{android.R.attr.state_selected}, i6.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (a.hasValue(25)) {
                this.j = hzc.i(context2, a, 25);
            }
            if (a.hasValue(23)) {
                this.j = s(this.j.getDefaultColor(), a.getColor(23, 0));
            }
            hzc.i(context2, a, 3);
            a.getInt(4, -1);
            this.k = hzc.i(context2, a, 21);
            this.s = a.getInt(6, 300);
            this.z = hwx.h(context2, R.attr.motionEasingEmphasizedInterpolator, inc.b);
            this.H = a.getDimensionPixelSize(14, -1);
            this.I = a.getDimensionPixelSize(13, -1);
            this.p = a.getResourceId(0, 0);
            this.K = a.getDimensionPixelSize(1, 0);
            this.u = a.getInt(15, 1);
            this.r = a.getInt(2, 0);
            this.v = a.getBoolean(12, false);
            this.y = a.getBoolean(26, false);
            a.recycle();
            Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.J = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            g();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }
}
