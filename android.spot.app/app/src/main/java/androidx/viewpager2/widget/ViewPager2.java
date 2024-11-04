package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import defpackage.a;
import defpackage.af;
import defpackage.ag;
import defpackage.be;
import defpackage.bet;
import defpackage.bwn;
import defpackage.byn;
import defpackage.clj;
import defpackage.clv;
import defpackage.cly;
import defpackage.coj;
import defpackage.cok;
import defpackage.col;
import defpackage.cop;
import defpackage.cor;
import defpackage.cos;
import defpackage.cot;
import defpackage.cou;
import defpackage.cov;
import defpackage.cow;
import defpackage.cox;
import defpackage.coz;
import defpackage.cpb;
import defpackage.cpc;
import defpackage.cpd;
import defpackage.cpe;
import defpackage.cpf;
import defpackage.cpg;
import defpackage.eu;
import defpackage.li;
import defpackage.lj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final cor a;
    public int b;
    public boolean c;
    LinearLayoutManager d;
    public RecyclerView e;
    public cou f;
    public final boolean g;
    public final int h;
    public final eu i;
    public clv j;
    private final Rect k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private li o;
    private cor p;
    private cos q;
    private bet r;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new cor();
        this.c = false;
        this.i = new cov(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, null);
    }

    private final void k(Context context, AttributeSet attributeSet) {
        this.j = new cpc(this);
        cpe cpeVar = new cpe(this, context);
        this.e = cpeVar;
        cpeVar.setId(View.generateViewId());
        this.e.setDescendantFocusability(131072);
        coz cozVar = new coz(this);
        this.d = cozVar;
        this.e.V(cozVar);
        RecyclerView recyclerView = this.e;
        recyclerView.E = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coj.a);
        bwn.p(this, context, coj.a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.d.V(obtainStyledAttributes.getInt(0, 0));
            ((cpc) this.j).d();
            obtainStyledAttributes.recycle();
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView2 = this.e;
            clj cljVar = new clj();
            if (recyclerView2.w == null) {
                recyclerView2.w = new ArrayList();
            }
            recyclerView2.w.add(cljVar);
            this.f = new cou(this);
            cou couVar = this.f;
            RecyclerView recyclerView3 = this.e;
            this.r = new bet(couVar, (byte[]) null);
            cpd cpdVar = new cpd(this);
            this.o = cpdVar;
            RecyclerView recyclerView4 = cpdVar.a;
            if (recyclerView4 != recyclerView3) {
                if (recyclerView4 != null) {
                    recyclerView4.as(cpdVar.b);
                    cpdVar.a.F = null;
                }
                cpdVar.a = recyclerView3;
                RecyclerView recyclerView5 = cpdVar.a;
                if (recyclerView5 != null) {
                    if (recyclerView5.F == null) {
                        recyclerView5.aq(cpdVar.b);
                        RecyclerView recyclerView6 = cpdVar.a;
                        recyclerView6.F = cpdVar;
                        new Scroller(recyclerView6.getContext(), new DecelerateInterpolator());
                        cpdVar.f();
                    } else {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                }
            }
            this.e.aq(this.f);
            cor corVar = new cor();
            this.p = corVar;
            this.f.f = corVar;
            cow cowVar = new cow(this);
            cox coxVar = new cox(this);
            corVar.f(cowVar);
            this.p.f(coxVar);
            clv clvVar = this.j;
            this.e.setImportantForAccessibility(2);
            cpc cpcVar = (cpc) clvVar;
            cpcVar.b = new cpb(cpcVar);
            if (cpcVar.a.getImportantForAccessibility() == 0) {
                cpcVar.a.setImportantForAccessibility(1);
            }
            this.p.f(this.a);
            cos cosVar = new cos();
            this.q = cosVar;
            this.p.f(cosVar);
            RecyclerView recyclerView7 = this.e;
            attachViewToParent(recyclerView7, 0, recyclerView7.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        if (this.d.k == 1) {
            return 1;
        }
        return 0;
    }

    public final int b() {
        return this.f.b;
    }

    public final lj c() {
        return this.e.l;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.e.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.e.canScrollVertically(i);
    }

    public final void d() {
        lj c;
        ag c2;
        if (this.m != -1 && (c = c()) != null) {
            Parcelable parcelable = this.n;
            if (parcelable != null) {
                if (c instanceof cop) {
                    cop copVar = (cop) c;
                    if (copVar.g.m() && copVar.f.m()) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(copVar.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (cop.u(str, "f#")) {
                                long b = cop.b(str, "f#");
                                be beVar = copVar.e;
                                String string = bundle.getString(str);
                                if (string == null) {
                                    c2 = null;
                                } else {
                                    c2 = beVar.c(string);
                                    if (c2 == null) {
                                        beVar.T(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                    }
                                }
                                copVar.f.j(b, c2);
                            } else if (cop.u(str, "s#")) {
                                long b2 = cop.b(str, "s#");
                                af afVar = (af) bundle.getParcelable(str);
                                if (copVar.t(b2)) {
                                    copVar.g.j(b2, afVar);
                                }
                            } else {
                                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
                            }
                        }
                        if (!copVar.f.m()) {
                            copVar.i = true;
                            copVar.h = true;
                            copVar.s();
                            Handler handler = new Handler(Looper.getMainLooper());
                            col colVar = new col(copVar, 0);
                            copVar.a.a(new cok(handler, colVar, 2));
                            handler.postDelayed(colVar, 10000L);
                        }
                    } else {
                        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
                    }
                }
                this.n = null;
            }
            int max = Math.max(0, Math.min(this.m, c.a() - 1));
            this.b = max;
            this.m = -1;
            this.e.T(max);
            ((cpc) this.j).d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof cpf) {
            int i = ((cpf) parcelable).a;
            sparseArray.put(this.e.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        i();
        f(i, z);
    }

    public final void f(int i, boolean z) {
        int i2;
        int i3;
        lj c = c();
        if (c == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (c.a() > 0) {
            int min = Math.min(Math.max(i, 0), c.a() - 1);
            if (min != this.b || !this.f.m()) {
                int i4 = this.b;
                if (min == i4) {
                    if (!z) {
                        z = false;
                    } else {
                        return;
                    }
                }
                this.b = min;
                ((cpc) this.j).d();
                double d = i4;
                if (!this.f.m()) {
                    cou couVar = this.f;
                    couVar.l();
                    cot cotVar = couVar.c;
                    d = cotVar.a + cotVar.b;
                }
                cou couVar2 = this.f;
                if (true != z) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                couVar2.a = i2;
                int i5 = couVar2.d;
                couVar2.d = min;
                couVar2.k(2);
                if (i5 != min) {
                    couVar2.j(min);
                }
                if (!z) {
                    this.e.T(min);
                    return;
                }
                double d2 = min;
                if (Math.abs(d2 - d) > 3.0d) {
                    RecyclerView recyclerView = this.e;
                    if (d2 > d) {
                        i3 = min - 3;
                    } else {
                        i3 = min + 3;
                    }
                    recyclerView.T(i3);
                    RecyclerView recyclerView2 = this.e;
                    recyclerView2.post(new cpg(min, recyclerView2));
                    return;
                }
                this.e.X(min);
            }
        }
    }

    public final void g() {
        li liVar = this.o;
        if (liVar != null) {
            View c = liVar.c(this.d);
            if (c == null) {
                return;
            }
            int be = LinearLayoutManager.be(c);
            if (be != this.b && b() == 0) {
                this.p.e(be);
            }
            this.c = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final boolean h() {
        if (this.d.aq() == 1) {
            return true;
        }
        return false;
    }

    public final void i() {
        Object obj = this.r.a;
    }

    public final void j(cly clyVar) {
        this.a.f(clyVar);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int a;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        clv clvVar = this.j;
        byn bynVar = new byn(accessibilityNodeInfo);
        cpc cpcVar = (cpc) clvVar;
        if (cpcVar.a.c() != null) {
            if (cpcVar.a.a() == 1) {
                i = cpcVar.a.c().a();
                i2 = 1;
            } else {
                i2 = cpcVar.a.c().a();
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        bynVar.v(bet.k(i, i2, 0));
        lj c = cpcVar.a.c();
        if (c != null && (a = c.a()) != 0) {
            ViewPager2 viewPager2 = cpcVar.a;
            if (viewPager2.g) {
                if (viewPager2.b > 0) {
                    bynVar.i(8192);
                }
                if (cpcVar.a.b < a - 1) {
                    bynVar.i(4096);
                }
                bynVar.P(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        this.k.left = getPaddingLeft();
        this.k.right = (i3 - i) - getPaddingRight();
        this.k.top = getPaddingTop();
        this.k.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.k, this.l);
        Rect rect = this.l;
        this.e.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.c) {
            g();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.e, i, i2);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredState = this.e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cpf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cpf cpfVar = (cpf) parcelable;
        super.onRestoreInstanceState(cpfVar.getSuperState());
        this.m = cpfVar.b;
        this.n = cpfVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        cpf cpfVar = new cpf(super.onSaveInstanceState());
        cpfVar.a = this.e.getId();
        int i = this.m;
        if (i == -1) {
            i = this.b;
        }
        cpfVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            cpfVar.c = parcelable;
        } else {
            lj ljVar = this.e.l;
            if (ljVar instanceof cop) {
                cop copVar = (cop) ljVar;
                Bundle bundle = new Bundle(copVar.f.b() + copVar.g.b());
                for (int i2 = 0; i2 < copVar.f.b(); i2++) {
                    long c = copVar.f.c(i2);
                    ag agVar = (ag) copVar.f.e(c);
                    if (agVar != null && agVar.au()) {
                        String c2 = cop.c("f#", c);
                        be beVar = copVar.e;
                        if (agVar.A != beVar) {
                            beVar.T(new IllegalStateException(a.af(agVar, "Fragment ", " is not currently in the FragmentManager")));
                        }
                        bundle.putString(c2, agVar.l);
                    }
                }
                for (int i3 = 0; i3 < copVar.g.b(); i3++) {
                    long c3 = copVar.g.c(i3);
                    if (copVar.t(c3)) {
                        bundle.putParcelable(cop.c("s#", c3), (Parcelable) copVar.g.e(c3));
                    }
                }
                cpfVar.c = bundle;
            }
        }
        return cpfVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        if (this.j.b(i)) {
            clv clvVar = this.j;
            if (clvVar.b(i)) {
                if (i == 8192) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                cpc cpcVar = (cpc) clvVar;
                cpcVar.c(cpcVar.a.b + i2);
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((cpc) this.j).d();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new cor();
        this.c = false;
        this.i = new cov(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new cor();
        this.c = false;
        this.i = new cov(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new cor();
        this.c = false;
        this.i = new cov(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        k(context, attributeSet);
    }
}
