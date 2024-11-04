package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.a;
import defpackage.fai;
import defpackage.fak;
import defpackage.fal;
import defpackage.fao;
import defpackage.fap;
import defpackage.faq;
import defpackage.far;
import defpackage.le;
import defpackage.lf;
import defpackage.lg;
import defpackage.lq;
import defpackage.lr;
import defpackage.ls;
import defpackage.lw;
import defpackage.mc;
import defpackage.md;
import defpackage.me;
import defpackage.ngj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlexboxLayoutManager extends lr implements fai, mc {
    private static final Rect h = new Rect();
    private final Context K;
    private View L;
    public int a;
    public int b;
    public boolean c;
    public lg e;
    public lg f;
    private int i;
    private boolean k;
    private lw l;
    private me m;
    private faq n;
    private far p;
    private final int j = -1;
    public List d = new ArrayList();
    public final ngj g = new ngj(this);
    private final fao o = new fao(this);
    private int q = -1;
    private int G = Integer.MIN_VALUE;
    private int H = Integer.MIN_VALUE;
    private int I = Integer.MIN_VALUE;
    private final SparseArray J = new SparseArray();
    private int M = -1;
    private final fal N = new fal();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        lq at = at(context, attributeSet, i, i2);
        int i3 = at.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (at.c) {
                    Q(3);
                } else {
                    Q(2);
                }
            }
        } else if (at.c) {
            Q(1);
        } else {
            Q(0);
        }
        if (this.b != 1) {
            aK();
            by();
            this.b = 1;
            this.e = null;
            this.f = null;
            aQ();
        }
        if (this.i != 4) {
            aK();
            by();
            this.i = 4;
            aQ();
        }
        this.K = context;
    }

    private final int R(me meVar) {
        if (an() != 0) {
            int a = meVar.a();
            bA();
            View ak = ak(a);
            View bu = bu(a);
            if (meVar.a() != 0 && ak != null && bu != null) {
                return Math.min(this.e.k(), this.e.a(bu) - this.e.d(ak));
            }
            return 0;
        }
        return 0;
    }

    private final int V(me meVar) {
        if (an() != 0) {
            int a = meVar.a();
            View ak = ak(a);
            View bu = bu(a);
            if (meVar.a() != 0 && ak != null && bu != null) {
                int be = be(ak);
                int be2 = be(bu);
                int a2 = this.e.a(bu) - this.e.d(ak);
                ngj ngjVar = this.g;
                int abs = Math.abs(a2);
                int i = ((int[]) ngjVar.b)[be];
                if (i != 0 && i != -1) {
                    return Math.round((i * (abs / ((((int[]) this.g.b)[be2] - i) + 1))) + (this.e.j() - this.e.d(ak)));
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    private final int W(me meVar) {
        int be;
        if (an() != 0) {
            int a = meVar.a();
            View ak = ak(a);
            View bu = bu(a);
            if (meVar.a() != 0 && ak != null && bu != null) {
                View bI = bI(0, an());
                if (bI == null) {
                    be = -1;
                } else {
                    be = be(bI);
                }
                int N = N();
                return (int) ((Math.abs(this.e.a(bu) - this.e.d(ak)) / ((N - be) + 1)) * meVar.a());
            }
        }
        return 0;
    }

    private final int aa(lw lwVar, me meVar, faq faqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        View view2;
        int i12 = faqVar.f;
        if (i12 != Integer.MIN_VALUE) {
            int i13 = faqVar.a;
            if (i13 < 0) {
                faqVar.f = i12 + i13;
            }
            bB(lwVar, faqVar);
        }
        int i14 = faqVar.a;
        boolean K = K();
        int i15 = i14;
        int i16 = 0;
        while (true) {
            if (i15 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i17 = faqVar.d;
            if (i17 < 0 || i17 >= meVar.a() || (i = faqVar.c) < 0 || i >= list.size()) {
                break;
            }
            fak fakVar = (fak) this.d.get(faqVar.c);
            faqVar.d = fakVar.o;
            if (K()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i18 = this.C;
                int i19 = faqVar.e;
                if (faqVar.i == -1) {
                    i19 -= fakVar.g;
                }
                int i20 = faqVar.d;
                int i21 = i18 - paddingRight;
                float f = this.o.d;
                float max = Math.max(0.0f, 0.0f);
                int i22 = fakVar.h;
                float f2 = i21 - f;
                float f3 = paddingLeft - f;
                int i23 = i20;
                int i24 = 0;
                while (i23 < i20 + i22) {
                    View t = t(i23);
                    int i25 = i20;
                    int i26 = i14;
                    if (faqVar.i == 1) {
                        aB(t, h);
                        az(t);
                    } else {
                        aB(t, h);
                        aA(t, i24);
                        i24++;
                    }
                    int i27 = i24;
                    long j = ((long[]) this.g.c)[i23];
                    int i28 = (int) j;
                    int u = ngj.u(j);
                    if (bH(t, i28, u, (fap) t.getLayoutParams())) {
                        t.measure(i28, u);
                    }
                    float bd = r4.leftMargin + bd(t) + f3;
                    float bf = f2 - (r4.rightMargin + bf(t));
                    int bg = i19 + bg(t);
                    if (this.c) {
                        i10 = i22;
                        i11 = i23;
                        i9 = i19;
                        view2 = t;
                        this.g.p(t, fakVar, Math.round(bf) - t.getMeasuredWidth(), bg, Math.round(bf), bg + t.getMeasuredHeight());
                    } else {
                        i9 = i19;
                        i10 = i22;
                        i11 = i23;
                        view2 = t;
                        this.g.p(view2, fakVar, Math.round(bd), bg, Math.round(bd) + view2.getMeasuredWidth(), bg + view2.getMeasuredHeight());
                    }
                    f3 = view2.getMeasuredWidth() + r4.rightMargin + bf(view2) + max + bd;
                    f2 = bf - (((view2.getMeasuredWidth() + r4.leftMargin) + bd(view2)) + max);
                    i23 = i11 + 1;
                    i20 = i25;
                    i14 = i26;
                    i24 = i27;
                    i22 = i10;
                    i19 = i9;
                }
                i2 = i14;
                faqVar.c += this.n.i;
                i6 = fakVar.g;
                i5 = i15;
            } else {
                i2 = i14;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i29 = this.D;
                int i30 = faqVar.e;
                if (faqVar.i == -1) {
                    int i31 = fakVar.g;
                    i4 = i30 + i31;
                    i3 = i30 - i31;
                } else {
                    i3 = i30;
                    i4 = i3;
                }
                int i32 = faqVar.d;
                int i33 = i29 - paddingBottom;
                float f4 = this.o.d;
                float max2 = Math.max(0.0f, 0.0f);
                int i34 = fakVar.h;
                float f5 = i33 - f4;
                float f6 = paddingTop - f4;
                int i35 = i32;
                int i36 = 0;
                while (i35 < i32 + i34) {
                    View t2 = t(i35);
                    int i37 = i15;
                    long j2 = ((long[]) this.g.c)[i35];
                    int i38 = (int) j2;
                    int u2 = ngj.u(j2);
                    if (bH(t2, i38, u2, (fap) t2.getLayoutParams())) {
                        t2.measure(i38, u2);
                    }
                    float bg2 = f6 + r7.topMargin + bg(t2);
                    float ba = f5 - (r7.rightMargin + ba(t2));
                    if (faqVar.i == 1) {
                        aB(t2, h);
                        az(t2);
                    } else {
                        aB(t2, h);
                        aA(t2, i36);
                        i36++;
                    }
                    int i39 = i36;
                    int bd2 = i3 + bd(t2);
                    int bf2 = i4 - bf(t2);
                    if (this.c) {
                        if (this.k) {
                            view = t2;
                            i7 = i34;
                            i8 = i32;
                            this.g.q(t2, fakVar, true, bf2 - t2.getMeasuredWidth(), Math.round(ba) - t2.getMeasuredHeight(), bf2, Math.round(ba));
                        } else {
                            view = t2;
                            i7 = i34;
                            i8 = i32;
                            this.g.q(view, fakVar, true, bf2 - view.getMeasuredWidth(), Math.round(bg2), bf2, Math.round(bg2) + view.getMeasuredHeight());
                        }
                    } else {
                        view = t2;
                        i7 = i34;
                        i8 = i32;
                        if (this.k) {
                            this.g.q(view, fakVar, false, bd2, Math.round(ba) - view.getMeasuredHeight(), bd2 + view.getMeasuredWidth(), Math.round(ba));
                        } else {
                            this.g.q(view, fakVar, false, bd2, Math.round(bg2), bd2 + view.getMeasuredWidth(), Math.round(bg2) + view.getMeasuredHeight());
                        }
                    }
                    f6 = bg2 + view.getMeasuredHeight() + r7.topMargin + ba(view) + max2;
                    f5 = ba - (((view.getMeasuredHeight() + r7.bottomMargin) + bg(view)) + max2);
                    i35++;
                    i15 = i37;
                    i36 = i39;
                    i34 = i7;
                    i32 = i8;
                }
                i5 = i15;
                faqVar.c += this.n.i;
                i6 = fakVar.g;
            }
            i16 += i6;
            if (!K && this.c) {
                faqVar.e -= fakVar.g * faqVar.i;
            } else {
                faqVar.e += fakVar.g * faqVar.i;
            }
            i15 = i5 - fakVar.g;
            i14 = i2;
        }
        int i40 = i14;
        int i41 = faqVar.a - i16;
        faqVar.a = i41;
        int i42 = faqVar.f;
        if (i42 != Integer.MIN_VALUE) {
            int i43 = i42 + i16;
            faqVar.f = i43;
            if (i41 < 0) {
                faqVar.f = i43 + i41;
            }
            bB(lwVar, faqVar);
        }
        return i40 - faqVar.a;
    }

    private final int ac(int i, lw lwVar, me meVar, boolean z) {
        int i2;
        int f;
        if (!K() && this.c) {
            int j = i - this.e.j();
            if (j <= 0) {
                return 0;
            }
            i2 = ah(j, lwVar, meVar);
        } else {
            int f2 = this.e.f() - i;
            if (f2 <= 0) {
                return 0;
            }
            i2 = -ah(-f2, lwVar, meVar);
        }
        int i3 = i + i2;
        if (z && (f = this.e.f() - i3) > 0) {
            this.e.n(f);
            return f + i2;
        }
        return i2;
    }

    private final int ag(int i, lw lwVar, me meVar, boolean z) {
        int i2;
        int j;
        if (!K() && this.c) {
            int f = this.e.f() - i;
            if (f <= 0) {
                return 0;
            }
            i2 = ah(-f, lwVar, meVar);
        } else {
            int j2 = i - this.e.j();
            if (j2 <= 0) {
                return 0;
            }
            i2 = -ah(j2, lwVar, meVar);
        }
        int i3 = i + i2;
        if (z && (j = i3 - this.e.j()) > 0) {
            this.e.n(-j);
            return i2 - j;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int ah(int r18, defpackage.lw r19, defpackage.me r20) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.ah(int, lw, me):int");
    }

    private final int ai(int i) {
        int height;
        int i2;
        int i3;
        if (an() != 0 && i != 0) {
            bA();
            boolean K = K();
            if (K) {
                height = this.L.getWidth();
            } else {
                height = this.L.getHeight();
            }
            if (K) {
                i2 = this.C;
            } else {
                i2 = this.D;
            }
            if (aq() == 1) {
                int abs = Math.abs(i);
                if (i < 0) {
                    return -Math.min((i2 + this.o.d) - height, abs);
                }
                i3 = this.o.d;
                if (i3 + i <= 0) {
                    return i;
                }
            } else {
                if (i > 0) {
                    return Math.min((i2 - this.o.d) - height, i);
                }
                i3 = this.o.d;
                if (i3 + i >= 0) {
                    return i;
                }
            }
            return -i3;
        }
        return 0;
    }

    private final View ak(int i) {
        View bw = bw(0, an(), i);
        if (bw != null) {
            ngj ngjVar = this.g;
            int i2 = ((int[]) ngjVar.b)[be(bw)];
            if (i2 != -1) {
                return bt(bw, (fak) this.d.get(i2));
            }
            return null;
        }
        return null;
    }

    private final void bA() {
        if (this.e != null) {
            return;
        }
        if (K()) {
            if (this.b == 0) {
                this.e = new le(this);
                this.f = new lf(this);
                return;
            } else {
                this.e = new lf(this);
                this.f = new le(this);
                return;
            }
        }
        if (this.b == 0) {
            this.e = new lf(this);
            this.f = new le(this);
        } else {
            this.e = new le(this);
            this.f = new lf(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bB(defpackage.lw r12, defpackage.faq r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.bB(lw, faq):void");
    }

    private final void bC(lw lwVar, int i, int i2) {
        while (i2 >= i) {
            aO(i2, lwVar);
            i2--;
        }
    }

    private final void bD() {
        int i;
        if (K()) {
            i = this.B;
        } else {
            i = this.A;
        }
        faq faqVar = this.n;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        faqVar.b = z;
    }

    private final void bE(int i) {
        if (i < N()) {
            int an = an();
            this.g.n(an);
            this.g.o(an);
            this.g.m(an);
            if (i < ((int[]) this.g.b).length) {
                this.M = i;
                View bx = bx();
                if (bx != null) {
                    this.q = be(bx);
                    if (!K() && this.c) {
                        this.G = this.e.a(bx) + this.e.g();
                    } else {
                        this.G = this.e.d(bx) - this.e.j();
                    }
                }
            }
        }
    }

    private final void bF(fao faoVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            bD();
        } else {
            this.n.b = false;
        }
        if (!K() && this.c) {
            this.n.a = faoVar.c - getPaddingRight();
        } else {
            this.n.a = this.e.f() - faoVar.c;
        }
        faq faqVar = this.n;
        faqVar.d = faoVar.a;
        faqVar.h = 1;
        faq faqVar2 = this.n;
        faqVar2.i = 1;
        faqVar2.e = faoVar.c;
        faqVar2.f = Integer.MIN_VALUE;
        faqVar2.c = faoVar.b;
        if (z && this.d.size() > 1 && (i = faoVar.b) >= 0 && i < this.d.size() - 1) {
            fak fakVar = (fak) this.d.get(faoVar.b);
            faq faqVar3 = this.n;
            faqVar3.c++;
            faqVar3.d += fakVar.h;
        }
    }

    private final void bG(fao faoVar, boolean z, boolean z2) {
        if (z2) {
            bD();
        } else {
            this.n.b = false;
        }
        if (!K() && this.c) {
            this.n.a = (this.L.getWidth() - faoVar.c) - this.e.j();
        } else {
            this.n.a = faoVar.c - this.e.j();
        }
        faq faqVar = this.n;
        faqVar.d = faoVar.a;
        faqVar.h = 1;
        faq faqVar2 = this.n;
        faqVar2.i = -1;
        faqVar2.e = faoVar.c;
        faqVar2.f = Integer.MIN_VALUE;
        faqVar2.c = faoVar.b;
        if (z && faoVar.b > 0) {
            int size = this.d.size();
            int i = faoVar.b;
            if (size > i) {
                fak fakVar = (fak) this.d.get(i);
                r4.c--;
                this.n.d -= fakVar.h;
            }
        }
    }

    private final boolean bH(View view, int i, int i2, ls lsVar) {
        if (!view.isLayoutRequested() && this.w && a.j(view.getWidth(), i, lsVar.width) && a.j(view.getHeight(), i2, lsVar.height)) {
            return false;
        }
        return true;
    }

    private final View bI(int i, int i2) {
        boolean z;
        int i3 = i;
        while (i3 != i2) {
            View av = av(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.C - getPaddingRight();
            int paddingBottom = this.D - getPaddingBottom();
            int bp = bp(av) - ((ls) av.getLayoutParams()).leftMargin;
            int br = br(av) - ((ls) av.getLayoutParams()).topMargin;
            int bq = bq(av) + ((ls) av.getLayoutParams()).rightMargin;
            int bo = bo(av) + ((ls) av.getLayoutParams()).bottomMargin;
            boolean z2 = false;
            int i4 = 1;
            if (bp < paddingRight && bq < paddingLeft) {
                z = false;
            } else {
                z = true;
            }
            if (br >= paddingBottom || bo >= paddingTop) {
                z2 = true;
            }
            if (z && z2) {
                return av;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    private final View bt(View view, fak fakVar) {
        boolean K = K();
        int i = fakVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View av = av(i2);
            if (av != null && av.getVisibility() != 8) {
                if (this.c && !K) {
                    if (this.e.a(view) >= this.e.a(av)) {
                    }
                    view = av;
                } else {
                    if (this.e.d(view) <= this.e.d(av)) {
                    }
                    view = av;
                }
            }
        }
        return view;
    }

    private final View bu(int i) {
        View bw = bw(an() - 1, -1, i);
        if (bw == null) {
            return null;
        }
        return bv(bw, (fak) this.d.get(((int[]) this.g.b)[be(bw)]));
    }

    private final View bv(View view, fak fakVar) {
        boolean K = K();
        int an = an() - fakVar.h;
        for (int an2 = an() - 2; an2 > an - 1; an2--) {
            View av = av(an2);
            if (av != null && av.getVisibility() != 8) {
                if (this.c && !K) {
                    if (this.e.d(view) <= this.e.d(av)) {
                    }
                    view = av;
                } else {
                    if (this.e.a(view) >= this.e.a(av)) {
                    }
                    view = av;
                }
            }
        }
        return view;
    }

    private final View bw(int i, int i2, int i3) {
        int i4;
        int be;
        bA();
        bz();
        int j = this.e.j();
        int f = this.e.f();
        View view = null;
        int i5 = i;
        View view2 = null;
        while (i5 != i2) {
            View av = av(i5);
            if (av != null && (be = be(av)) >= 0 && be < i3) {
                if (((ls) av.getLayoutParams()).cD()) {
                    if (view2 == null) {
                        view2 = av;
                    }
                } else {
                    if (this.e.d(av) >= j && this.e.a(av) <= f) {
                        return av;
                    }
                    if (view == null) {
                        view = av;
                    }
                }
            }
            if (i2 > i) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            i5 += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    private final View bx() {
        return av(0);
    }

    private final void by() {
        this.d.clear();
        this.o.b();
        this.o.d = 0;
    }

    private final void bz() {
        if (this.n == null) {
            this.n = new faq();
        }
    }

    @Override // defpackage.lr
    public final void A(int i, int i2) {
        bk(i);
        bE(i);
    }

    @Override // defpackage.lr
    public final int B(me meVar) {
        return R(meVar);
    }

    @Override // defpackage.lr
    public final int C(me meVar) {
        return V(meVar);
    }

    @Override // defpackage.lr
    public final int D(me meVar) {
        return W(meVar);
    }

    @Override // defpackage.lr
    public final int E(me meVar) {
        return R(meVar);
    }

    @Override // defpackage.lr
    public final int F(me meVar) {
        return V(meVar);
    }

    @Override // defpackage.lr
    public final int G(me meVar) {
        return W(meVar);
    }

    @Override // defpackage.fai
    public final void I(List list) {
        this.d = list;
    }

    @Override // defpackage.fai
    public final void J(int i, View view) {
        this.J.put(i, view);
    }

    @Override // defpackage.fai
    public final boolean K() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mc
    public final PointF L(int i) {
        View av;
        int i2;
        if (an() != 0 && (av = av(0)) != null) {
            if (i < be(av)) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            float f = i2;
            if (K()) {
                return new PointF(0.0f, f);
            }
            return new PointF(f, 0.0f);
        }
        return null;
    }

    @Override // defpackage.lr
    public final Parcelable M() {
        far farVar = this.p;
        if (farVar != null) {
            return new far(farVar);
        }
        far farVar2 = new far();
        if (an() > 0) {
            View bx = bx();
            farVar2.a = be(bx);
            farVar2.b = this.e.d(bx) - this.e.j();
        } else {
            farVar2.a();
        }
        return farVar2;
    }

    public final int N() {
        View bI = bI(an() - 1, -1);
        if (bI == null) {
            return -1;
        }
        return be(bI);
    }

    public final void Q(int i) {
        if (this.a != i) {
            aK();
            this.a = i;
            this.e = null;
            this.f = null;
            by();
            aQ();
        }
    }

    @Override // defpackage.lr
    public final void T(Parcelable parcelable) {
        if (parcelable instanceof far) {
            this.p = (far) parcelable;
            aQ();
        }
    }

    @Override // defpackage.lr
    public final void U(int i) {
        this.q = i;
        this.G = Integer.MIN_VALUE;
        far farVar = this.p;
        if (farVar != null) {
            farVar.a();
        }
        aQ();
    }

    @Override // defpackage.lr
    public final boolean X() {
        int i;
        if (this.b == 0) {
            return K();
        }
        if (K()) {
            int i2 = this.C;
            View view = this.L;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.lr
    public final boolean Y() {
        int i;
        if (this.b == 0) {
            if (!K()) {
                return true;
            }
            return false;
        }
        if (!K()) {
            int i2 = this.D;
            View view = this.L;
            if (view != null) {
                i = view.getHeight();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lr
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fai
    public final int a() {
        return 5;
    }

    @Override // defpackage.lr
    public final void aH(RecyclerView recyclerView) {
        this.L = (View) recyclerView.getParent();
    }

    @Override // defpackage.lr
    public final void al(RecyclerView recyclerView, int i) {
        md mdVar = new md(recyclerView.getContext());
        mdVar.b = i;
        aW(mdVar);
    }

    @Override // defpackage.fai
    public final int b() {
        return this.i;
    }

    @Override // defpackage.lr
    public final void bj() {
        aK();
    }

    @Override // defpackage.lr
    public final void bk(int i) {
        bE(i);
    }

    @Override // defpackage.fai
    public final int c(int i, int i2, int i3) {
        return ao(this.D, this.B, i2, i3, Y());
    }

    @Override // defpackage.lr
    public final int d(int i, lw lwVar, me meVar) {
        if (K() && this.b != 0) {
            int ai = ai(i);
            this.o.d += ai;
            this.f.n(-ai);
            return ai;
        }
        int ah = ah(i, lwVar, meVar);
        this.J.clear();
        return ah;
    }

    @Override // defpackage.lr
    public final int e(int i, lw lwVar, me meVar) {
        if (!K() && (this.b != 0 || K())) {
            int ai = ai(i);
            this.o.d += ai;
            this.f.n(-ai);
            return ai;
        }
        int ah = ah(i, lwVar, meVar);
        this.J.clear();
        return ah;
    }

    @Override // defpackage.lr
    public final ls f() {
        return new fap();
    }

    @Override // defpackage.fai
    public final int g(int i, int i2, int i3) {
        return ao(this.C, this.A, i2, i3, X());
    }

    @Override // defpackage.lr
    public final ls h(Context context, AttributeSet attributeSet) {
        return new fap(context, attributeSet);
    }

    @Override // defpackage.fai
    public final int i(View view) {
        int bd;
        int bf;
        if (K()) {
            bd = bg(view);
            bf = ba(view);
        } else {
            bd = bd(view);
            bf = bf(view);
        }
        return bd + bf;
    }

    @Override // defpackage.fai
    public final int j(View view, int i, int i2) {
        int bg;
        int ba;
        if (K()) {
            bg = bd(view);
            ba = bf(view);
        } else {
            bg = bg(view);
            ba = ba(view);
        }
        return bg + ba;
    }

    @Override // defpackage.fai
    public final int k() {
        return this.a;
    }

    @Override // defpackage.fai
    public final int l() {
        return this.m.a();
    }

    @Override // defpackage.fai
    public final int m() {
        return this.b;
    }

    @Override // defpackage.fai
    public final int n() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((fak) this.d.get(i2)).e);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x002e, code lost:            if (r5 == 1) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0038, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0036, code lost:            r5 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0031, code lost:            if (r5 != 1) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0034, code lost:            if (r5 == 1) goto L21;     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.lw r21, defpackage.me r22) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.o(lw, me):void");
    }

    @Override // defpackage.lr
    public final void p(me meVar) {
        this.p = null;
        this.q = -1;
        this.G = Integer.MIN_VALUE;
        this.M = -1;
        this.o.b();
        this.J.clear();
    }

    @Override // defpackage.fai
    public final int q() {
        return this.j;
    }

    @Override // defpackage.fai
    public final int r() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((fak) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.lr
    public final boolean s(ls lsVar) {
        return lsVar instanceof fap;
    }

    @Override // defpackage.fai
    public final View t(int i) {
        View view = (View) this.J.get(i);
        if (view != null) {
            return view;
        }
        return this.l.b(i);
    }

    @Override // defpackage.fai
    public final View u(int i) {
        return t(i);
    }

    @Override // defpackage.fai
    public final List v() {
        return this.d;
    }

    @Override // defpackage.lr
    public final void w(int i, int i2) {
        bE(i);
    }

    @Override // defpackage.fai
    public final void x(View view, int i, int i2, fak fakVar) {
        aB(view, h);
        if (K()) {
            int bd = bd(view) + bf(view);
            fakVar.e += bd;
            fakVar.f += bd;
        } else {
            int bg = bg(view) + ba(view);
            fakVar.e += bg;
            fakVar.f += bg;
        }
    }

    @Override // defpackage.lr
    public final void y(int i, int i2) {
        bE(Math.min(i, i2));
    }

    @Override // defpackage.lr
    public final void z(int i, int i2) {
        bE(i);
    }

    @Override // defpackage.fai
    public final void H(fak fakVar) {
    }

    @Override // defpackage.lr
    public final void aj(RecyclerView recyclerView) {
    }
}
