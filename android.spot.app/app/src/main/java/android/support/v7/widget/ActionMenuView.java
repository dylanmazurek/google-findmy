package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.gf;
import defpackage.gg;
import defpackage.gh;
import defpackage.gj;
import defpackage.gs;
import defpackage.gv;
import defpackage.ho;
import defpackage.hp;
import defpackage.hq;
import defpackage.hr;
import defpackage.hs;
import defpackage.kn;
import defpackage.ko;
import defpackage.njz;
import defpackage.nr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends ko implements gg, gv {
    public gh a;
    public boolean b;
    public ho c;
    public gf d;
    public njz e;
    private Context i;
    private int j;
    private gs k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final hr n() {
        hr hrVar = new hr();
        hrVar.gravity = 16;
        return hrVar;
    }

    public static final hr o(ViewGroup.LayoutParams layoutParams) {
        hr hrVar;
        if (layoutParams != null) {
            if (layoutParams instanceof hr) {
                hrVar = new hr((hr) layoutParams);
            } else {
                hrVar = new hr(layoutParams);
            }
            if (hrVar.gravity <= 0) {
                hrVar.gravity = 16;
            }
            return hrVar;
        }
        return n();
    }

    @Override // defpackage.gv
    public final void a(gh ghVar) {
        this.a = ghVar;
    }

    @Override // defpackage.gg
    public final boolean b(gj gjVar) {
        return this.a.z(gjVar, 0);
    }

    @Override // defpackage.ko, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hr generateLayoutParams(AttributeSet attributeSet) {
        return new hr(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ko
    /* renamed from: cX */
    public final /* bridge */ /* synthetic */ kn generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    @Override // defpackage.ko, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ko
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ kn generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            gh ghVar = new gh(context);
            this.a = ghVar;
            ghVar.p(new hs(this, 0));
            ho hoVar = new ho(context);
            this.c = hoVar;
            hoVar.r();
            ho hoVar2 = this.c;
            gs gsVar = this.k;
            if (gsVar == null) {
                gsVar = new hq();
            }
            hoVar2.e = gsVar;
            this.a.h(this.c, this.i);
            this.c.k(this);
        }
        return this.a;
    }

    @Override // defpackage.ko, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h() {
        ho hoVar = this.c;
        if (hoVar != null) {
            hoVar.p();
        }
    }

    public final void i(gs gsVar, gf gfVar) {
        this.k = gsVar;
        this.d = gfVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(ho hoVar) {
        this.c = hoVar;
        hoVar.k(this);
    }

    protected final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof hp)) {
            z = ((hp) childAt).c();
        }
        if (i > 0 && (childAt2 instanceof hp)) {
            return ((hp) childAt2).d() | z;
        }
        return z;
    }

    public final boolean m() {
        ho hoVar = this.c;
        if (hoVar != null && hoVar.m()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ho hoVar = this.c;
        if (hoVar != null) {
            hoVar.f(false);
            if (this.c.m()) {
                this.c.l();
                this.c.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ko, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = this.h;
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = nr.a(this);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i5 = i8 / 2;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                hr hrVar = (hr) childAt.getLayoutParams();
                if (hrVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i11)) {
                        measuredWidth += i9;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + hrVar.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - hrVar.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i5 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + hrVar.leftMargin) + hrVar.rightMargin;
                    l(i11);
                    i13++;
                }
            }
            i11++;
        }
        if (childCount == 1) {
            if (i12 != 0) {
                childCount = 1;
            } else {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i15 = i5 - (measuredHeight2 / 2);
                int i16 = (i10 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i16, i15, measuredWidth2 + i16, measuredHeight2 + i15);
                return;
            }
        }
        int i17 = i13 - (i12 ^ 1);
        if (i17 > 0) {
            i6 = paddingRight / i17;
        } else {
            i6 = 0;
        }
        int max = Math.max(0, i6);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                hr hrVar2 = (hr) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !hrVar2.a) {
                    int i19 = width2 - hrVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + hrVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            hr hrVar3 = (hr) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !hrVar3.a) {
                int i22 = paddingLeft + hrVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = i22 + measuredWidth4 + hrVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v22 */
    @Override // defpackage.ko, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r6;
        boolean z5;
        boolean z6;
        int i10;
        int i11;
        int i12;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i13;
        boolean z8;
        gh ghVar;
        boolean z9 = this.l;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        if (z9 != z) {
            this.m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.l && (ghVar = this.a) != null && size != this.m) {
            this.m = size;
            ghVar.l(true);
        }
        int childCount = getChildCount();
        if (this.l && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i14 = size2 - paddingLeft;
            int i15 = this.n;
            int i16 = i14 / i15;
            int i17 = i14 % i15;
            if (i16 == 0) {
                setMeasuredDimension(i14, 0);
                return;
            }
            int i18 = i15 + (i17 / i16);
            int childCount2 = getChildCount();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            long j = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < childCount2) {
                View childAt = getChildAt(i21);
                if (childAt.getVisibility() == 8) {
                    i11 = i14;
                    i9 = size3;
                    i12 = paddingTop;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i24 = i19 + 1;
                    if (z11) {
                        int i25 = this.o;
                        i9 = size3;
                        r6 = 0;
                        childAt.setPadding(i25, 0, i25, 0);
                        z5 = true;
                    } else {
                        i9 = size3;
                        r6 = 0;
                        z5 = false;
                    }
                    hr hrVar = (hr) childAt.getLayoutParams();
                    hrVar.f = r6;
                    hrVar.c = r6;
                    hrVar.b = r6;
                    hrVar.d = r6;
                    hrVar.leftMargin = r6;
                    hrVar.rightMargin = r6;
                    if (z5 && ((ActionMenuItemView) childAt).b()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    hrVar.e = z6;
                    if (true != hrVar.a) {
                        i10 = i16;
                    } else {
                        i10 = 1;
                    }
                    hr hrVar2 = (hr) childAt.getLayoutParams();
                    i11 = i14;
                    i12 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.b()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i10 > 0 && (!z7 || i10 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i18, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i13 = measuredWidth / i18;
                        if (measuredWidth % i18 != 0) {
                            i13++;
                        }
                        if (z7 && i13 < 2) {
                            i13 = 2;
                        }
                    } else {
                        i13 = 0;
                    }
                    if (!hrVar2.a && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    hrVar2.d = z8;
                    hrVar2.b = i13;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i18, 1073741824), makeMeasureSpec);
                    i22 = Math.max(i22, i13);
                    if (hrVar.d) {
                        i20++;
                    }
                    z10 |= hrVar.a;
                    i16 -= i13;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i13 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i24;
                }
                i21++;
                size3 = i9;
                paddingTop = i12;
                i14 = i11;
            }
            int i26 = i14;
            int i27 = size3;
            int i28 = i22;
            int i29 = i23;
            if (z10 && i19 == 2) {
                z2 = true;
                i19 = 2;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i20 > 0 && i16 > 0) {
                int i30 = Integer.MAX_VALUE;
                int i31 = 0;
                int i32 = 0;
                long j2 = 0;
                while (i32 < childCount2) {
                    int i33 = i29;
                    hr hrVar3 = (hr) getChildAt(i32).getLayoutParams();
                    boolean z13 = z12;
                    if (hrVar3.d) {
                        int i34 = hrVar3.b;
                        if (i34 < i30) {
                            j2 = 1 << i32;
                            i31 = 1;
                            i30 = i34;
                        } else if (i34 == i30) {
                            j2 |= 1 << i32;
                            i31++;
                        }
                    }
                    i32++;
                    z12 = z13;
                    i29 = i33;
                }
                i3 = i29;
                z3 = z12;
                j |= j2;
                if (i31 > i16) {
                    break;
                }
                int i35 = i30 + 1;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    hr hrVar4 = (hr) childAt2.getLayoutParams();
                    int i37 = i20;
                    long j3 = 1 << i36;
                    if ((j2 & j3) == 0) {
                        if (hrVar4.b == i35) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && hrVar4.e && i16 == 1) {
                            int i38 = this.o;
                            childAt2.setPadding(i38 + i18, 0, i38, 0);
                            i16 = 1;
                        }
                        hrVar4.b++;
                        hrVar4.f = true;
                        i16--;
                    }
                    i36++;
                    i20 = i37;
                }
                i29 = i3;
                i20 = i20;
                z12 = true;
            }
            i3 = i29;
            z3 = z12;
            if (!z10 && i19 == 1) {
                z4 = true;
                i4 = 1;
            } else {
                i4 = i19;
                z4 = false;
            }
            if (i16 > 0 && j != 0 && (i16 < i4 - 1 || z4 || i28 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    int i39 = childCount2 - 1;
                    if ((j & 1) != 0 && !((hr) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                    if ((j & (1 << i39)) != 0 && !((hr) getChildAt(i39).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i7 = (int) ((i16 * i18) / bitCount);
                } else {
                    i7 = 0;
                }
                int i40 = 0;
                while (i40 < childCount2) {
                    if ((j & (1 << i40)) != 0) {
                        View childAt3 = getChildAt(i40);
                        hr hrVar5 = (hr) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            hrVar5.c = i7;
                            hrVar5.f = true;
                            if (i40 == 0) {
                                if (!hrVar5.e) {
                                    hrVar5.leftMargin = (-i7) / 2;
                                }
                                i40 = 0;
                            }
                        } else if (hrVar5.a) {
                            hrVar5.c = i7;
                            hrVar5.f = true;
                            hrVar5.rightMargin = (-i7) / 2;
                        } else {
                            int i41 = childCount2 - 1;
                            if (i40 != 0) {
                                hrVar5.leftMargin = i7 / 2;
                            }
                            if (i40 != i41) {
                                hrVar5.rightMargin = i7 / 2;
                            }
                        }
                        i8 = 1;
                        z3 = true;
                        i40 += i8;
                    }
                    i8 = 1;
                    i40 += i8;
                }
            }
            if (z3) {
                for (int i42 = 0; i42 < childCount2; i42++) {
                    View childAt4 = getChildAt(i42);
                    hr hrVar6 = (hr) childAt4.getLayoutParams();
                    if (hrVar6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((hrVar6.b * i18) + hrVar6.c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode == 1073741824) {
                i6 = i27;
                i5 = i26;
            } else {
                i5 = i26;
                i6 = i3;
            }
            setMeasuredDimension(i5, i6);
            return;
        }
        for (int i43 = 0; i43 < childCount; i43++) {
            hr hrVar7 = (hr) getChildAt(i43).getLayoutParams();
            hrVar7.rightMargin = 0;
            hrVar7.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    @Override // defpackage.ko, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }
}
