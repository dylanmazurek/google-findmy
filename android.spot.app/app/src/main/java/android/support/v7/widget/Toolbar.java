package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.adm.R;
import defpackage.apc;
import defpackage.buz;
import defpackage.bwn;
import defpackage.cf;
import defpackage.eb;
import defpackage.fo;
import defpackage.gf;
import defpackage.gh;
import defpackage.gj;
import defpackage.gs;
import defpackage.ho;
import defpackage.hs;
import defpackage.id;
import defpackage.in;
import defpackage.ksr;
import defpackage.mp;
import defpackage.nd;
import defpackage.ne;
import defpackage.nf;
import defpackage.ng;
import defpackage.nj;
import defpackage.njz;
import defpackage.nl;
import defpackage.nr;
import defpackage.w;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements buz {
    public boolean A;
    public final apc B;
    public njz C;
    private ImageButton D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private nj O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final njz S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public mp r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public ArrayList v;
    public ho w;
    public ne x;
    public gs y;
    public gf z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int A(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    private final int B(View view, int i) {
        int i2;
        nf nfVar = (nf) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = nfVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i4 < nfVar.topMargin) {
                    i4 = nfVar.topMargin;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    if (i5 < nfVar.bottomMargin) {
                        i4 = Math.max(0, i4 - (nfVar.bottomMargin - i5));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - nfVar.bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    private final int C(View view, int i, int[] iArr, int i2) {
        nf nfVar = (nf) view.getLayoutParams();
        int i3 = nfVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int B = B(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, B, max + measuredWidth, view.getMeasuredHeight() + B);
        return max + measuredWidth + nfVar.rightMargin;
    }

    private final int D(View view, int i, int[] iArr, int i2) {
        nf nfVar = (nf) view.getLayoutParams();
        int i3 = nfVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int B = B(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, B, max, view.getMeasuredHeight() + B);
        return max - (measuredWidth + nfVar.leftMargin);
    }

    private final int E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void F(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                nf nfVar = (nf) childAt.getLayoutParams();
                if (nfVar.b == 0 && K(childAt) && A(nfVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt2 = getChildAt(childCount);
                nf nfVar2 = (nf) childAt2.getLayoutParams();
                if (nfVar2.b == 0 && K(childAt2) && A(nfVar2.a) == absoluteGravity) {
                    list.add(childAt2);
                }
            } else {
                return;
            }
        }
    }

    private final void G(View view, boolean z) {
        nf nfVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            nfVar = new nf();
        } else if (!checkLayoutParams(layoutParams)) {
            nfVar = z(layoutParams);
        } else {
            nfVar = (nf) layoutParams;
        }
        nfVar.b = 1;
        if (z && this.h != null) {
            view.setLayoutParams(nfVar);
            this.u.add(view);
        } else {
            addView(view, nfVar);
        }
    }

    private final void H() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void I() {
        if (this.D == null) {
            this.D = new id(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            nf nfVar = new nf();
            nfVar.a = (this.m & 112) | 8388611;
            this.D.setLayoutParams(nfVar);
        }
    }

    private final boolean J(View view) {
        if (view.getParent() != this && !this.u.contains(view)) {
            return false;
        }
        return true;
    }

    private final boolean K(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private static final int L(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int M(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void N(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected static final nf z(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof nf) {
            return new nf((nf) layoutParams);
        }
        if (layoutParams instanceof cf) {
            return new nf((cf) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new nf((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new nf(layoutParams);
    }

    public final int a() {
        mp mpVar = this.r;
        if (mpVar != null) {
            if (mpVar.g) {
                return mpVar.a;
            }
            return mpVar.b;
        }
        return 0;
    }

    public final int b() {
        mp mpVar = this.r;
        if (mpVar != null) {
            if (mpVar.g) {
                return mpVar.b;
            }
            return mpVar.a;
        }
        return 0;
    }

    public final int c() {
        gh ghVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && (ghVar = actionMenuView.a) != null && ghVar.hasVisibleItems()) {
            return Math.max(a(), Math.max(this.G, 0));
        }
        return a();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof nf)) {
            return true;
        }
        return false;
    }

    public final int d() {
        if (e() != null) {
            return Math.max(b(), Math.max(this.F, 0));
        }
        return b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu g = actionMenuView.g();
            if (this.x == null) {
                this.x = new ne(this);
            }
            this.a.c.q();
            ((gh) g).h(this.x, this.i);
            u();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new fo(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new nf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new nf(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu f = f();
        for (int i = 0; i < f.size(); i++) {
            arrayList.add(f.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        gj gjVar;
        ne neVar = this.x;
        if (neVar == null) {
            gjVar = null;
        } else {
            gjVar = neVar.b;
        }
        if (gjVar != null) {
            gjVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.r == null) {
            this.r = new mp();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.y, new hs(this, 2));
            nf nfVar = new nf();
            nfVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(nfVar);
            G(this.a, false);
        }
    }

    public void m(int i) {
        g().inflate(i, f());
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            H();
            if (!J(this.d)) {
                G(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && J(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            I();
        }
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            in.b(this.D, charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.L = true;
                }
                if (i != 10 || i == 3) {
                    this.L = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.L = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ba A[LOOP:0: B:45:0x02b8->B:46:0x02ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dc A[LOOP:1: B:49:0x02da->B:50:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0300 A[LOOP:2: B:53:0x02fe->B:54:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0350 A[LOOP:3: B:62:0x034e->B:63:0x0350, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = nr.a(this);
        int i9 = !a ? 1 : 0;
        int i10 = 0;
        if (K(this.D)) {
            N(this.D, i, 0, i2, this.E);
            i3 = this.D.getMeasuredWidth() + L(this.D);
            i4 = Math.max(0, this.D.getMeasuredHeight() + M(this.D));
            i5 = View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (K(this.g)) {
            N(this.g, i, 0, i2, this.E);
            i3 = this.g.getMeasuredWidth() + L(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + M(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int[] iArr = this.N;
        int d = d();
        int max = Math.max(d, i3);
        iArr[a ? 1 : 0] = Math.max(0, d - i3);
        if (K(this.a)) {
            N(this.a, i, max, i2, this.E);
            i6 = this.a.getMeasuredWidth() + L(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + M(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (K(this.h)) {
            max2 += E(this.h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + M(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (K(this.d)) {
            max2 += E(this.d, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + M(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((nf) childAt.getLayoutParams()).b == 0 && K(childAt)) {
                max2 += E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + M(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.p + this.q;
        int i13 = this.n + this.o;
        if (K(this.b)) {
            E(this.b, i, max2 + i13, i2, i12, iArr);
            i10 = this.b.getMeasuredWidth() + L(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + M(this.b);
            i7 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (K(this.c)) {
            i10 = Math.max(i10, E(this.c, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += this.c.getMeasuredHeight() + M(this.c);
            i7 = View.combineMeasuredStates(i7, this.c.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i14 = max2 + i10 + paddingLeft;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14, getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        gh ghVar;
        MenuItem findItem;
        if (!(parcelable instanceof ng)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ng ngVar = (ng) parcelable;
        super.onRestoreInstanceState(ngVar.d);
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            ghVar = actionMenuView.a;
        } else {
            ghVar = null;
        }
        int i = ngVar.a;
        if (i != 0 && this.x != null && ghVar != null && (findItem = ghVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (ngVar.b) {
            removeCallbacks(this.R);
            post(this.R);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        mp mpVar = this.r;
        boolean z = mpVar.g;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        mpVar.g = z2;
        if (mpVar.h) {
            if (z2) {
                int i2 = mpVar.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = mpVar.e;
                }
                mpVar.a = i2;
                int i3 = mpVar.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = mpVar.f;
                }
                mpVar.b = i3;
                return;
            }
            int i4 = mpVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = mpVar.e;
            }
            mpVar.a = i4;
            int i5 = mpVar.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = mpVar.f;
            }
            mpVar.b = i5;
            return;
        }
        mpVar.a = mpVar.e;
        mpVar.b = mpVar.f;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        gj gjVar;
        ng ngVar = new ng(super.onSaveInstanceState());
        ne neVar = this.x;
        if (neVar != null && (gjVar = neVar.b) != null) {
            ngVar.a = gjVar.a;
        }
        ngVar.b = w();
        return ngVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void p(Drawable drawable) {
        if (drawable != null) {
            I();
            if (!J(this.D)) {
                G(this.D, true);
            }
        } else {
            ImageButton imageButton = this.D;
            if (imageButton != null && J(imageButton)) {
                removeView(this.D);
                this.u.remove(this.D);
            }
        }
        ImageButton imageButton2 = this.D;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void q(View.OnClickListener onClickListener) {
        I();
        this.D.setOnClickListener(onClickListener);
    }

    public final void r(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void s(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!J(this.c)) {
                G(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && J(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void t(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!J(this.b)) {
                G(this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && J(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void u() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher b = nd.b(this);
            if (v() && b != null && isAttachedToWindow() && this.A) {
                if (this.Q == null) {
                    if (this.P == null) {
                        this.P = nd.a(new w(this, 19));
                    }
                    nd.c(b, this.P);
                    this.Q = b;
                    return;
                }
                return;
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
            if (onBackInvokedDispatcher != null) {
                nd.d(onBackInvokedDispatcher, this.P);
                this.Q = null;
            }
        }
    }

    public final boolean v() {
        ne neVar = this.x;
        if (neVar != null && neVar.b != null) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && actionMenuView.m()) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        ho hoVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null && (hoVar = actionMenuView.c) != null && hoVar.o()) {
            return true;
        }
        return false;
    }

    public final nj y() {
        if (this.O == null) {
            this.O = new nj(this, true);
        }
        return this.O;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return z(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.u = new ArrayList();
        this.N = new int[2];
        this.B = new apc(new w(this, 20));
        this.v = new ArrayList();
        this.S = new njz(this, null);
        this.R = new nl(this, 1, null);
        ksr F = ksr.F(getContext(), attributeSet, eb.w, i, 0);
        bwn.p(this, context, eb.w, attributeSet, (TypedArray) F.b, i, 0);
        this.k = F.s(28, 0);
        this.l = F.s(19, 0);
        this.H = F.q(0, this.H);
        this.m = F.q(2, 48);
        int n = F.n(22, 0);
        n = F.A(27) ? F.n(27, n) : n;
        this.q = n;
        this.p = n;
        this.o = n;
        this.n = n;
        int n2 = F.n(25, -1);
        if (n2 >= 0) {
            this.n = n2;
        }
        int n3 = F.n(24, -1);
        if (n3 >= 0) {
            this.o = n3;
        }
        int n4 = F.n(26, -1);
        if (n4 >= 0) {
            this.p = n4;
        }
        int n5 = F.n(23, -1);
        if (n5 >= 0) {
            this.q = n5;
        }
        this.E = F.o(13, -1);
        int n6 = F.n(9, Integer.MIN_VALUE);
        int n7 = F.n(5, Integer.MIN_VALUE);
        int o = F.o(7, 0);
        int o2 = F.o(8, 0);
        k();
        mp mpVar = this.r;
        mpVar.h = false;
        if (o != Integer.MIN_VALUE) {
            mpVar.e = o;
            mpVar.a = o;
        }
        if (o2 != Integer.MIN_VALUE) {
            mpVar.f = o2;
            mpVar.b = o2;
        }
        if (n6 != Integer.MIN_VALUE || n7 != Integer.MIN_VALUE) {
            mpVar.a(n6, n7);
        }
        this.F = F.n(10, Integer.MIN_VALUE);
        this.G = F.n(6, Integer.MIN_VALUE);
        this.e = F.u(4);
        this.f = F.w(3);
        CharSequence w = F.w(21);
        if (!TextUtils.isEmpty(w)) {
            t(w);
        }
        CharSequence w2 = F.w(18);
        if (!TextUtils.isEmpty(w2)) {
            s(w2);
        }
        this.i = getContext();
        r(F.s(17, 0));
        Drawable u = F.u(16);
        if (u != null) {
            p(u);
        }
        CharSequence w3 = F.w(15);
        if (!TextUtils.isEmpty(w3)) {
            o(w3);
        }
        Drawable u2 = F.u(11);
        if (u2 != null) {
            n(u2);
        }
        CharSequence w4 = F.w(12);
        if (!TextUtils.isEmpty(w4)) {
            if (!TextUtils.isEmpty(w4)) {
                H();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(w4);
            }
        }
        if (F.A(29)) {
            ColorStateList t = F.t(29);
            this.I = t;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(t);
            }
        }
        if (F.A(20)) {
            ColorStateList t2 = F.t(20);
            this.J = t2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(t2);
            }
        }
        if (F.A(14)) {
            m(F.s(14, 0));
        }
        F.y();
    }
}
