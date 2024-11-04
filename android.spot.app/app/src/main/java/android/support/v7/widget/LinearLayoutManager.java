package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.byi;
import defpackage.byn;
import defpackage.ij;
import defpackage.kh;
import defpackage.kp;
import defpackage.kq;
import defpackage.kr;
import defpackage.ks;
import defpackage.lg;
import defpackage.lj;
import defpackage.lq;
import defpackage.lr;
import defpackage.ls;
import defpackage.lw;
import defpackage.mc;
import defpackage.md;
import defpackage.me;
import defpackage.mh;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends lr implements mc {
    private kr a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final kq f;
    private final int g;
    private final int[] h;
    public int k;
    lg l;
    boolean m;
    int n;
    int o;
    ks p;
    final kp q;

    public LinearLayoutManager() {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new kp();
        this.f = new kq();
        this.g = 2;
        this.h = new int[2];
        V(1);
        W(false);
    }

    private final View bA() {
        int i;
        if (this.m) {
            i = an() - 1;
        } else {
            i = 0;
        }
        return av(i);
    }

    private final void bB(lw lwVar, kr krVar) {
        if (krVar.a && !krVar.m) {
            int i = krVar.g;
            int i2 = krVar.i;
            if (krVar.f == -1) {
                int an = an();
                if (i >= 0) {
                    int e = (this.l.e() - i) + i2;
                    if (this.m) {
                        for (int i3 = 0; i3 < an; i3++) {
                            View av = av(i3);
                            if (this.l.d(av) < e || this.l.m(av) < e) {
                                bC(lwVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = an - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View av2 = av(i5);
                        if (this.l.d(av2) < e || this.l.m(av2) < e) {
                            bC(lwVar, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i >= 0) {
                int i6 = i - i2;
                int an2 = an();
                if (this.m) {
                    int i7 = an2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View av3 = av(i8);
                        if (this.l.a(av3) > i6 || this.l.l(av3) > i6) {
                            bC(lwVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < an2; i9++) {
                    View av4 = av(i9);
                    if (this.l.a(av4) > i6 || this.l.l(av4) > i6) {
                        bC(lwVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    private final void bC(lw lwVar, int i, int i2) {
        if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    aO(i, lwVar);
                    i--;
                }
            } else {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        aO(i2, lwVar);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void bD() {
        boolean z;
        if (this.k != 1 && aa()) {
            z = !this.c;
        } else {
            z = this.c;
        }
        this.m = z;
    }

    private final void bE(int i, int i2, boolean z, me meVar) {
        int i3;
        int j;
        this.a.m = ac();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        Q(meVar, iArr);
        int max = Math.max(0, this.h[0]);
        int max2 = Math.max(0, this.h[1]);
        if (i == 1) {
            i3 = max2;
        } else {
            i3 = max;
        }
        kr krVar = this.a;
        krVar.h = i3;
        if (i != 1) {
            max = max2;
        }
        krVar.i = max;
        if (i == 1) {
            krVar.h = i3 + this.l.g();
            View bz = bz();
            kr krVar2 = this.a;
            if (true == this.m) {
                i4 = -1;
            }
            krVar2.e = i4;
            int be = be(bz);
            kr krVar3 = this.a;
            krVar2.d = be + krVar3.e;
            krVar3.b = this.l.a(bz);
            j = this.l.a(bz) - this.l.f();
        } else {
            View bA = bA();
            this.a.h += this.l.j();
            kr krVar4 = this.a;
            if (true != this.m) {
                i4 = -1;
            }
            krVar4.e = i4;
            int be2 = be(bA);
            kr krVar5 = this.a;
            krVar4.d = be2 + krVar5.e;
            krVar5.b = this.l.d(bA);
            j = (-this.l.d(bA)) + this.l.j();
        }
        kr krVar6 = this.a;
        krVar6.c = i2;
        if (z) {
            krVar6.c = i2 - j;
        }
        krVar6.g = j;
    }

    private final void bF(kp kpVar) {
        bG(kpVar.b, kpVar.c);
    }

    private final void bG(int i, int i2) {
        int i3;
        this.a.c = this.l.f() - i2;
        kr krVar = this.a;
        if (true != this.m) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        krVar.e = i3;
        krVar.d = i;
        krVar.f = 1;
        krVar.b = i2;
        krVar.g = Integer.MIN_VALUE;
    }

    private final void bH(kp kpVar) {
        bI(kpVar.b, kpVar.c);
    }

    private final void bI(int i, int i2) {
        this.a.c = i2 - this.l.j();
        kr krVar = this.a;
        krVar.d = i;
        int i3 = 1;
        if (true != this.m) {
            i3 = -1;
        }
        krVar.e = i3;
        krVar.f = -1;
        krVar.b = i2;
        krVar.g = Integer.MIN_VALUE;
    }

    private final int bt(me meVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return ij.d(meVar, this.l, ah(!this.e), ag(!this.e), this, this.e, this.m);
    }

    private final int bu(me meVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return ij.e(meVar, this.l, ah(!this.e), ag(!this.e), this, this.e);
    }

    private final int bv(int i, lw lwVar, me meVar, boolean z) {
        int f;
        int f2 = this.l.f() - i;
        if (f2 > 0) {
            int i2 = -K(-f2, lwVar, meVar);
            int i3 = i + i2;
            if (z && (f = this.l.f() - i3) > 0) {
                this.l.n(f);
                return f + i2;
            }
            return i2;
        }
        return 0;
    }

    private final int bw(int i, lw lwVar, me meVar, boolean z) {
        int j;
        int j2 = i - this.l.j();
        if (j2 > 0) {
            int i2 = -K(j2, lwVar, meVar);
            int i3 = i + i2;
            if (z && (j = i3 - this.l.j()) > 0) {
                this.l.n(-j);
                return i2 - j;
            }
            return i2;
        }
        return 0;
    }

    private final View bx() {
        return N(0, an());
    }

    private final View by() {
        return N(an() - 1, -1);
    }

    private final View bz() {
        int an;
        if (this.m) {
            an = 0;
        } else {
            an = an() - 1;
        }
        return av(an);
    }

    private final int c(me meVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return ij.c(meVar, this.l, ah(!this.e), ag(!this.e), this, this.e);
    }

    @Override // defpackage.lr
    public final int B(me meVar) {
        return c(meVar);
    }

    @Override // defpackage.lr
    public final int C(me meVar) {
        return bt(meVar);
    }

    @Override // defpackage.lr
    public final int D(me meVar) {
        return bu(meVar);
    }

    @Override // defpackage.lr
    public final int E(me meVar) {
        return c(meVar);
    }

    @Override // defpackage.lr
    public final int F(me meVar) {
        return bt(meVar);
    }

    @Override // defpackage.lr
    public final int G(me meVar) {
        return bu(meVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L36
            r2 = 2
            if (r6 == r2) goto L29
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L22
            r2 = 33
            if (r6 == r2) goto L23
            r0 = 66
            if (r6 == r0) goto L21
            r0 = 130(0x82, float:1.82E-43)
            if (r6 == r0) goto L1b
            return r4
        L1b:
            int r6 = r5.k
            if (r6 != r1) goto L20
            return r1
        L20:
            return r4
        L21:
            r0 = 1
        L22:
            r1 = 0
        L23:
            int r6 = r5.k
            if (r6 != r1) goto L28
            return r0
        L28:
            return r4
        L29:
            int r6 = r5.k
            if (r6 != r1) goto L2e
            return r1
        L2e:
            boolean r6 = r5.aa()
            if (r6 == 0) goto L35
            return r0
        L35:
            return r1
        L36:
            int r6 = r5.k
            if (r6 != r1) goto L3b
            return r0
        L3b:
            boolean r6 = r5.aa()
            if (r6 == 0) goto L42
            return r1
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.H(int):int");
    }

    final int I(lw lwVar, kr krVar, me meVar, boolean z) {
        int i = krVar.c;
        int i2 = krVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                krVar.g = i2 + i;
            }
            bB(lwVar, krVar);
        }
        int i3 = krVar.c + krVar.h;
        kq kqVar = this.f;
        while (true) {
            if ((!krVar.m && i3 <= 0) || !krVar.d(meVar)) {
                break;
            }
            kqVar.a = 0;
            kqVar.b = false;
            kqVar.c = false;
            kqVar.d = false;
            k(lwVar, meVar, krVar, kqVar);
            if (!kqVar.b) {
                int i4 = krVar.b;
                int i5 = kqVar.a;
                krVar.b = i4 + (krVar.f * i5);
                if (!kqVar.c || krVar.l != null || !meVar.g) {
                    krVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = krVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    krVar.g = i7;
                    int i8 = krVar.c;
                    if (i8 < 0) {
                        krVar.g = i7 + i8;
                    }
                    bB(lwVar, krVar);
                }
                if (z && kqVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - krVar.c;
    }

    public final int J() {
        View ai = ai(0, an(), false);
        if (ai == null) {
            return -1;
        }
        return be(ai);
    }

    final int K(int i, lw lwVar, me meVar) {
        int i2;
        if (an() != 0 && i != 0) {
            R();
            this.a.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            bE(i2, abs, true, meVar);
            kr krVar = this.a;
            int I = krVar.g + I(lwVar, krVar, meVar, false);
            if (I >= 0) {
                if (abs > I) {
                    i = i2 * I;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.mc
    public final PointF L(int i) {
        if (an() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < be(av(0))) {
            z = true;
        }
        if (z != this.m) {
            i2 = -1;
        }
        float f = i2;
        if (this.k == 0) {
            return new PointF(f, 0.0f);
        }
        return new PointF(0.0f, f);
    }

    @Override // defpackage.lr
    public final Parcelable M() {
        ks ksVar = this.p;
        if (ksVar != null) {
            return new ks(ksVar);
        }
        ks ksVar2 = new ks();
        if (an() > 0) {
            R();
            boolean z = this.b ^ this.m;
            ksVar2.c = z;
            if (z) {
                View bz = bz();
                ksVar2.b = this.l.f() - this.l.a(bz);
                ksVar2.a = be(bz);
            } else {
                View bA = bA();
                ksVar2.a = be(bA);
                ksVar2.b = this.l.d(bA) - this.l.j();
            }
        } else {
            ksVar2.a();
        }
        return ksVar2;
    }

    final View N(int i, int i2) {
        int i3;
        int i4;
        R();
        if (i2 <= i && i2 >= i) {
            return av(i);
        }
        int d = this.l.d(av(i));
        int j = this.l.j();
        if (d < j) {
            i3 = 16388;
        } else {
            i3 = 4097;
        }
        if (d < j) {
            i4 = 16644;
        } else {
            i4 = 4161;
        }
        if (this.k == 0) {
            return this.E.l(i, i2, i4, i3);
        }
        return this.F.l(i, i2, i4, i3);
    }

    @Override // defpackage.lr
    public final View O(int i) {
        int an = an();
        if (an == 0) {
            return null;
        }
        int be = i - be(av(0));
        if (be >= 0 && be < an) {
            View av = av(be);
            if (be(av) == i) {
                return av;
            }
        }
        return super.O(i);
    }

    @Override // defpackage.lr
    public final void P(String str) {
        if (this.p == null) {
            super.P(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(me meVar, int[] iArr) {
        int i;
        int i2;
        if (meVar.a != -1) {
            i = this.l.k();
        } else {
            i = 0;
        }
        int i3 = this.a.f;
        if (i3 == -1) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (i3 != -1) {
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        if (this.a == null) {
            this.a = new kr();
        }
    }

    @Override // defpackage.lr
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (an() > 0) {
            accessibilityEvent.setFromIndex(J());
            int i = -1;
            View ai = ai(an() - 1, -1, false);
            if (ai != null) {
                i = be(ai);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    @Override // defpackage.lr
    public final void T(Parcelable parcelable) {
        if (parcelable instanceof ks) {
            ks ksVar = (ks) parcelable;
            this.p = ksVar;
            if (this.n != -1) {
                ksVar.a();
            }
            aQ();
        }
    }

    @Override // defpackage.lr
    public final void U(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        ks ksVar = this.p;
        if (ksVar != null) {
            ksVar.a();
        }
        aQ();
    }

    public final void V(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.ae(i, "invalid orientation:"));
        }
        P(null);
        if (i == this.k && this.l != null) {
            return;
        }
        lg p = lg.p(this, i);
        this.l = p;
        this.q.a = p;
        this.k = i;
        aQ();
    }

    public final void W(boolean z) {
        P(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aQ();
    }

    @Override // defpackage.lr
    public final boolean X() {
        if (this.k == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean Y() {
        if (this.k == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aa() {
        if (aq() == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean ab() {
        return this.c;
    }

    final boolean ac() {
        if (this.l.h() == 0 && this.l.e() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public final boolean ad() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int an = an();
            for (int i = 0; i < an; i++) {
                ViewGroup.LayoutParams layoutParams = av(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lr
    public final void ae(int i, int i2, me meVar, kh khVar) {
        int i3;
        if (1 == this.k) {
            i = i2;
        }
        if (an() != 0 && i != 0) {
            R();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            bE(i3, Math.abs(i), true, meVar);
            v(meVar, this.a, khVar);
        }
    }

    @Override // defpackage.lr
    public final void af(int i, kh khVar) {
        boolean z;
        int i2;
        ks ksVar = this.p;
        int i3 = -1;
        if (ksVar != null && ksVar.b()) {
            z = ksVar.c;
            i2 = ksVar.a;
        } else {
            bD();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            khVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ag(boolean z) {
        if (this.m) {
            return ai(0, an(), z);
        }
        return ai(an() - 1, -1, z);
    }

    final View ah(boolean z) {
        if (this.m) {
            return ai(an() - 1, -1, z);
        }
        return ai(0, an(), z);
    }

    final View ai(int i, int i2, boolean z) {
        int i3;
        R();
        int i4 = this.k;
        if (true != z) {
            i3 = 320;
        } else {
            i3 = 24579;
        }
        if (i4 == 0) {
            return this.E.l(i, i2, i3, 320);
        }
        return this.F.l(i, i2, i3, 320);
    }

    public final void ak(int i) {
        this.n = i;
        this.o = 0;
        ks ksVar = this.p;
        if (ksVar != null) {
            ksVar.a();
        }
        aQ();
    }

    @Override // defpackage.lr
    public final void al(RecyclerView recyclerView, int i) {
        md mdVar = new md(recyclerView.getContext());
        mdVar.b = i;
        aW(mdVar);
    }

    @Override // defpackage.lr
    public View cH(View view, int i, lw lwVar, me meVar) {
        int H;
        View by;
        View bz;
        View bx;
        bD();
        if (an() == 0 || (H = H(i)) == Integer.MIN_VALUE) {
            return null;
        }
        R();
        bE(H, (int) (this.l.k() * 0.33333334f), false, meVar);
        kr krVar = this.a;
        krVar.g = Integer.MIN_VALUE;
        krVar.a = false;
        I(lwVar, krVar, meVar, true);
        if (H == -1) {
            if (this.m) {
                bx = by();
            } else {
                bx = bx();
            }
            by = bx;
            H = -1;
        } else if (this.m) {
            by = bx();
        } else {
            by = by();
        }
        if (H == -1) {
            bz = bA();
        } else {
            bz = bz();
        }
        if (bz.hasFocusable()) {
            if (by == null) {
                return null;
            }
            return bz;
        }
        return by;
    }

    @Override // defpackage.lr
    public void cI(lw lwVar, me meVar, byn bynVar) {
        super.cI(lwVar, meVar, bynVar);
        lj ljVar = this.s.l;
        if (ljVar != null && ljVar.a() > 0 && Build.VERSION.SDK_INT >= 23) {
            bynVar.j(byi.i);
        }
    }

    @Override // defpackage.lr
    public boolean cL(int i, Bundle bundle) {
        int min;
        if (super.cL(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                min = Math.min(i2, cF(recyclerView.e, recyclerView.M) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                min = Math.min(i3, cE(recyclerView2.e, recyclerView2.M) - 1);
            }
            if (min >= 0) {
                ak(min);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lr
    public boolean cM() {
        if (this.p == null && this.b == this.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lr
    public int d(int i, lw lwVar, me meVar) {
        if (this.k == 1) {
            return 0;
        }
        return K(i, lwVar, meVar);
    }

    @Override // defpackage.lr
    public int e(int i, lw lwVar, me meVar) {
        if (this.k == 0) {
            return 0;
        }
        return K(i, lwVar, meVar);
    }

    @Override // defpackage.lr
    public ls f() {
        return new ls(-2, -2);
    }

    public View i(lw lwVar, me meVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        R();
        int an = an();
        if (z2) {
            i = -1;
            i2 = an() - 1;
            i3 = -1;
        } else {
            i = an;
            i2 = 0;
            i3 = 1;
        }
        int a = meVar.a();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View av = av(i2);
            int be = be(av);
            int d = this.l.d(av);
            int a2 = this.l.a(av);
            if (be >= 0 && be < a) {
                if (((ls) av.getLayoutParams()).cD()) {
                    if (view3 == null) {
                        view3 = av;
                    }
                } else {
                    if (a2 <= j && d < j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (d >= f && a2 > f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return av;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = av;
                        }
                        view2 = av;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = av;
                        }
                        view2 = av;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    public void k(lw lwVar, me meVar, kr krVar, kq kqVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View a = krVar.a(lwVar);
        if (a == null) {
            kqVar.b = true;
            return;
        }
        ls lsVar = (ls) a.getLayoutParams();
        if (krVar.l == null) {
            boolean z3 = this.m;
            if (krVar.f != -1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z3 == z2) {
                az(a);
            } else {
                aA(a, 0);
            }
        } else {
            boolean z4 = this.m;
            if (krVar.f != -1) {
                z = false;
            } else {
                z = true;
            }
            if (z4 == z) {
                ax(a);
            } else {
                ay(a, 0);
            }
        }
        ls lsVar2 = (ls) a.getLayoutParams();
        Rect e = this.s.e(a);
        int i5 = e.left + e.right;
        int i6 = e.top + e.bottom;
        int ao = lr.ao(this.C, this.A, getPaddingLeft() + getPaddingRight() + lsVar2.leftMargin + lsVar2.rightMargin + i5, lsVar2.width, X());
        int ao2 = lr.ao(this.D, this.B, getPaddingTop() + getPaddingBottom() + lsVar2.topMargin + lsVar2.bottomMargin + i6, lsVar2.height, Y());
        if (aZ(a, ao, ao2, lsVar2)) {
            a.measure(ao, ao2);
        }
        kqVar.a = this.l.b(a);
        if (this.k == 1) {
            if (aa()) {
                i4 = this.C - getPaddingRight();
                i = i4 - this.l.c(a);
            } else {
                i = getPaddingLeft();
                i4 = this.l.c(a) + i;
            }
            if (krVar.f == -1) {
                i2 = krVar.b;
                i3 = i2 - kqVar.a;
            } else {
                i3 = krVar.b;
                i2 = kqVar.a + i3;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.l.c(a) + paddingTop;
            if (krVar.f == -1) {
                int i7 = krVar.b;
                int i8 = i7 - kqVar.a;
                i4 = i7;
                i2 = c;
                i = i8;
                i3 = paddingTop;
            } else {
                int i9 = krVar.b;
                int i10 = kqVar.a + i9;
                i = i9;
                i2 = c;
                i3 = paddingTop;
                i4 = i10;
            }
        }
        bi(a, i, i3, i4, i2);
        if (lsVar.cD() || lsVar.cC()) {
            kqVar.c = true;
        }
        kqVar.d = a.hasFocusable();
    }

    @Override // defpackage.lr
    public void o(lw lwVar, me meVar) {
        View i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int d;
        int i3;
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int bv;
        int i8;
        View O;
        int d2;
        int i9;
        int i10 = -1;
        if ((this.p == null && this.n == -1) || meVar.a() != 0) {
            ks ksVar = this.p;
            if (ksVar != null && ksVar.b()) {
                this.n = ksVar.a;
            }
            R();
            this.a.a = false;
            bD();
            View aw = aw();
            kp kpVar = this.q;
            if (kpVar.e && this.n == -1 && this.p == null) {
                if (aw != null && (this.l.d(aw) >= this.l.f() || this.l.a(aw) <= this.l.j())) {
                    this.q.c(aw, be(aw));
                }
            } else {
                kpVar.d();
                kp kpVar2 = this.q;
                kpVar2.d = this.m ^ this.d;
                if (!meVar.g && (i2 = this.n) != -1) {
                    if (i2 >= 0 && i2 < meVar.a()) {
                        int i11 = this.n;
                        kpVar2.b = i11;
                        ks ksVar2 = this.p;
                        if (ksVar2 != null && ksVar2.b()) {
                            boolean z6 = ksVar2.c;
                            kpVar2.d = z6;
                            if (z6) {
                                kpVar2.c = this.l.f() - this.p.b;
                            } else {
                                kpVar2.c = this.l.j() + this.p.b;
                            }
                        } else if (this.o == Integer.MIN_VALUE) {
                            View O2 = O(i11);
                            if (O2 != null) {
                                if (this.l.b(O2) > this.l.k()) {
                                    kpVar2.a();
                                } else if (this.l.d(O2) - this.l.j() < 0) {
                                    kpVar2.c = this.l.j();
                                    kpVar2.d = false;
                                } else if (this.l.f() - this.l.a(O2) < 0) {
                                    kpVar2.c = this.l.f();
                                    kpVar2.d = true;
                                } else {
                                    if (kpVar2.d) {
                                        d = this.l.a(O2) + this.l.o();
                                    } else {
                                        d = this.l.d(O2);
                                    }
                                    kpVar2.c = d;
                                }
                            } else {
                                if (an() > 0) {
                                    if (this.n >= be(av(0))) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3 == this.m) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    kpVar2.d = z4;
                                }
                                kpVar2.a();
                            }
                        } else {
                            boolean z7 = this.m;
                            kpVar2.d = z7;
                            if (z7) {
                                kpVar2.c = this.l.f() - this.o;
                            } else {
                                kpVar2.c = this.l.j() + this.o;
                            }
                        }
                        this.q.e = true;
                    } else {
                        this.n = -1;
                        this.o = Integer.MIN_VALUE;
                    }
                }
                if (an() != 0) {
                    View aw2 = aw();
                    if (aw2 != null) {
                        ls lsVar = (ls) aw2.getLayoutParams();
                        if (!lsVar.cD() && lsVar.cB() >= 0 && lsVar.cB() < meVar.a()) {
                            kpVar2.c(aw2, be(aw2));
                            this.q.e = true;
                        }
                    }
                    boolean z8 = this.b;
                    boolean z9 = this.d;
                    if (z8 == z9 && (i = i(lwVar, meVar, kpVar2.d, z9)) != null) {
                        kpVar2.b(i, be(i));
                        if (!meVar.g && cM()) {
                            int d3 = this.l.d(i);
                            int a = this.l.a(i);
                            int j = this.l.j();
                            int f = this.l.f();
                            if (a <= j && d3 < j) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d3 >= f && a > f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                if (true == kpVar2.d) {
                                    j = f;
                                }
                                kpVar2.c = j;
                            }
                        }
                        this.q.e = true;
                    }
                }
                kpVar2.a();
                kpVar2.b = this.d ? meVar.a() - 1 : 0;
                this.q.e = true;
            }
            kr krVar = this.a;
            if (krVar.k >= 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            krVar.f = i3;
            int[] iArr = this.h;
            iArr[0] = 0;
            iArr[1] = 0;
            Q(meVar, iArr);
            int max = Math.max(0, this.h[0]) + this.l.j();
            int max2 = Math.max(0, this.h[1]) + this.l.g();
            if (meVar.g && (i8 = this.n) != -1 && this.o != Integer.MIN_VALUE && (O = O(i8)) != null) {
                if (this.m) {
                    i9 = this.l.f() - this.l.a(O);
                    d2 = this.o;
                } else {
                    d2 = this.l.d(O) - this.l.j();
                    i9 = this.o;
                }
                int i12 = i9 - d2;
                if (i12 > 0) {
                    max += i12;
                } else {
                    max2 -= i12;
                }
            }
            kp kpVar3 = this.q;
            if (!kpVar3.d ? true != this.m : true == this.m) {
                i10 = 1;
            }
            l(lwVar, meVar, kpVar3, i10);
            aC(lwVar);
            this.a.m = ac();
            kr krVar2 = this.a;
            krVar2.j = meVar.g;
            krVar2.i = 0;
            kp kpVar4 = this.q;
            if (kpVar4.d) {
                bH(kpVar4);
                kr krVar3 = this.a;
                krVar3.h = max;
                I(lwVar, krVar3, meVar, false);
                kr krVar4 = this.a;
                i5 = krVar4.b;
                int i13 = krVar4.d;
                int i14 = krVar4.c;
                if (i14 > 0) {
                    max2 += i14;
                }
                bF(this.q);
                kr krVar5 = this.a;
                krVar5.h = max2;
                krVar5.d += krVar5.e;
                I(lwVar, krVar5, meVar, false);
                kr krVar6 = this.a;
                i4 = krVar6.b;
                int i15 = krVar6.c;
                if (i15 > 0) {
                    bI(i13, i5);
                    kr krVar7 = this.a;
                    krVar7.h = i15;
                    I(lwVar, krVar7, meVar, false);
                    i5 = this.a.b;
                }
            } else {
                bF(kpVar4);
                kr krVar8 = this.a;
                krVar8.h = max2;
                I(lwVar, krVar8, meVar, false);
                kr krVar9 = this.a;
                i4 = krVar9.b;
                int i16 = krVar9.d;
                int i17 = krVar9.c;
                if (i17 > 0) {
                    max += i17;
                }
                bH(this.q);
                kr krVar10 = this.a;
                krVar10.h = max;
                krVar10.d += krVar10.e;
                I(lwVar, krVar10, meVar, false);
                kr krVar11 = this.a;
                i5 = krVar11.b;
                int i18 = krVar11.c;
                if (i18 > 0) {
                    bG(i16, i4);
                    kr krVar12 = this.a;
                    krVar12.h = i18;
                    I(lwVar, krVar12, meVar, false);
                    i4 = this.a.b;
                }
            }
            if (an() > 0) {
                if (this.m ^ this.d) {
                    int bv2 = bv(i4, lwVar, meVar, true);
                    i6 = i5 + bv2;
                    i7 = i4 + bv2;
                    bv = bw(i6, lwVar, meVar, false);
                } else {
                    int bw = bw(i5, lwVar, meVar, true);
                    i6 = i5 + bw;
                    i7 = i4 + bw;
                    bv = bv(i7, lwVar, meVar, false);
                }
                i5 = i6 + bv;
                i4 = i7 + bv;
            }
            if (meVar.k && an() != 0 && !meVar.g && cM()) {
                List list = lwVar.d;
                int size = list.size();
                int be = be(av(0));
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    mh mhVar = (mh) list.get(i21);
                    if (!mhVar.s()) {
                        if (mhVar.b() >= be) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5 != this.m) {
                            i19 += this.l.b(mhVar.b);
                        } else {
                            i20 += this.l.b(mhVar.b);
                        }
                    }
                }
                this.a.l = list;
                if (i19 > 0) {
                    bI(be(bA()), i5);
                    kr krVar13 = this.a;
                    krVar13.h = i19;
                    krVar13.c = 0;
                    krVar13.b();
                    I(lwVar, this.a, meVar, false);
                }
                if (i20 > 0) {
                    bG(be(bz()), i4);
                    kr krVar14 = this.a;
                    krVar14.h = i20;
                    krVar14.c = 0;
                    krVar14.b();
                    I(lwVar, this.a, meVar, false);
                }
                this.a.l = null;
            }
            if (!meVar.g) {
                lg lgVar = this.l;
                lgVar.b = lgVar.k();
            } else {
                this.q.d();
            }
            this.b = this.d;
            return;
        }
        aL(lwVar);
    }

    @Override // defpackage.lr
    public void p(me meVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void r(boolean z) {
        P(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aQ();
    }

    public void v(me meVar, kr krVar, kh khVar) {
        int i = krVar.d;
        if (i >= 0 && i < meVar.a()) {
            khVar.a(i, Math.max(0, krVar.g));
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new kp();
        this.f = new kq();
        this.g = 2;
        this.h = new int[2];
        lq at = at(context, attributeSet, i, i2);
        V(at.a);
        W(at.c);
        r(at.d);
    }

    @Override // defpackage.lr
    public final void aj(RecyclerView recyclerView) {
    }

    public void l(lw lwVar, me meVar, kp kpVar, int i) {
    }
}
