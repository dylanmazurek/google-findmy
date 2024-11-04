package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agb {
    public final afx a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public se s;
    private final acy t;
    private final acy u;
    private final acy v;
    private aem w;

    public agb(afx afxVar) {
        this.a = afxVar;
        this.b = afxVar.a;
        this.c = afxVar.c;
        this.d = afxVar.h;
        this.e = afxVar.i;
        this.s = afxVar.j;
        int i = afxVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = afxVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.t = new acy();
        this.u = new acy();
        this.v = new acy();
        this.p = i;
        this.q = -1;
    }

    public static final int W(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static /* synthetic */ void Y(agb agbVar) {
        int i = agbVar.q;
        int h = agbVar.h(i);
        if (!afz.t(agbVar.b, h)) {
            int[] iArr = agbVar.b;
            int i2 = (h * 5) + 1;
            iArr[i2] = iArr[i2] | 134217728;
            if (!afz.r(iArr, h)) {
                agbVar.Q(agbVar.l(i));
            }
        }
    }

    private final int ab(int[] iArr, int i) {
        return c(iArr, i) + afz.a(iArr[(i * 5) + 1] >> 29);
    }

    private final int ac(int[] iArr, int i) {
        return ad(afz.h(iArr, h(i)));
    }

    private final int ad(int i) {
        if (i > -2) {
            return i;
        }
        return f() + i + 2;
    }

    private final int ae(int i, int i2) {
        if (i < i2) {
            return i;
        }
        return -((f() - i) + 2);
    }

    private final void af() {
        this.u.e((e() - this.g) - this.p);
    }

    private final void ag(int i, Object obj, boolean z, Object obj2) {
        int c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        acy acyVar = this.v;
        int i7 = this.q;
        int i8 = this.m;
        acyVar.e(this.n);
        if (i8 > 0) {
            int i9 = this.o;
            int c2 = c(this.b, h(i9));
            E(1);
            this.h = c2;
            this.i = c2;
            int h = h(i9);
            Object obj3 = abh.a;
            if (obj != obj3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!z && obj2 != obj3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i10 = this.k;
            int i11 = this.j;
            int length = this.c.length;
            int W = W(c2, i11, i10, length);
            if (W >= 0 && this.l < i9) {
                W = -(((length - i10) - W) + 1);
            }
            int[] iArr = this.b;
            int i12 = this.q;
            if (true != z) {
                i4 = 0;
            } else {
                i4 = 1073741824;
            }
            if (obj != obj3) {
                i5 = 536870912;
            } else {
                i5 = 0;
            }
            if (1 != i3) {
                i6 = 0;
            } else {
                i6 = 268435456;
            }
            int i13 = h * 5;
            iArr[i13] = i;
            iArr[i13 + 1] = i6 | i5 | i4;
            iArr[i13 + 2] = i12;
            iArr[i13 + 3] = 0;
            iArr[i13 + 4] = W;
            int i14 = (z ? 1 : 0) + i2 + i3;
            if (i14 > 0) {
                F(i14, i9);
                Object[] objArr = this.c;
                int i15 = this.h;
                if (z) {
                    objArr[i15] = obj2;
                    i15++;
                }
                if (i2 != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
                if (i3 != 0) {
                    objArr[i15] = obj2;
                    i15++;
                }
                this.h = i15;
            }
            this.n = 0;
            c = i9 + 1;
            this.q = i9;
            this.o = c;
            if (i7 >= 0 && t(i7) != null) {
                throw null;
            }
        } else {
            this.t.e(i7);
            af();
            int i16 = this.o;
            int h2 = h(i16);
            if (!amr.i(obj2, abh.a)) {
                if (z) {
                    R(this.o, obj2);
                } else {
                    P(obj2);
                }
            }
            this.h = n(this.b, h2);
            this.i = c(this.b, h(this.o + 1));
            this.n = afz.f(this.b, h2);
            this.q = i16;
            this.o = i16 + 1;
            c = i16 + afz.c(this.b, h2);
        }
        this.p = c;
    }

    private static final int ah(int i, int i2, int i3) {
        if (i < 0) {
            return (i3 - i2) + i + 1;
        }
        return i;
    }

    private final void ai() {
        this.p = (e() - this.g) - this.u.c();
    }

    public final void A(boolean z) {
        this.r = true;
        if (z && this.t.f()) {
            G(f());
            H(this.c.length - this.k, this.f);
            int i = this.j;
            mkm.e(this.c, null, i, this.k + i);
            I();
        }
        afx afxVar = this.a;
        int[] iArr = this.b;
        int i2 = this.f;
        Object[] objArr = this.c;
        int i3 = this.j;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        se seVar = this.s;
        if (!afxVar.f) {
            ael.a("Unexpected writer close()");
        }
        afxVar.f = false;
        afxVar.g(iArr, i2, objArr, i3, arrayList, hashMap, seVar);
    }

    public final void B() {
        if (this.m <= 0) {
            ael.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.v.b != this.t.b) {
                abr.i("startGroup/endGroup mismatch while inserting");
            }
            ai();
        }
    }

    public final void C(int i) {
        if (this.m > 0) {
            abr.i("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                abr.i(a.ad(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            M();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void D(int i, int i2, int i3) {
        int ae = ae(i, this.f);
        while (i3 < i2) {
            afz.p(this.b, h(i3), ae);
            int c = afz.c(this.b, h(i3)) + i3;
            D(i3, c, i3 + 1);
            i3 = c;
        }
    }

    public final void E(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.o;
            G(i3);
            int i4 = this.f;
            int i5 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length + length, i6 + i), 32);
                int i8 = max * 5;
                int i9 = max - i6;
                int[] iArr2 = new int[i8];
                mkm.p(iArr, iArr2, 0, 0, i4 * 5);
                mkm.p(iArr, iArr2, (i4 + i9) * 5, (i5 + i4) * 5, length * 5);
                this.b = iArr2;
                i5 = i9;
            }
            int i10 = this.p;
            if (i10 >= i4) {
                this.p = i10 + i;
            }
            int i11 = i4 + i;
            this.f = i11;
            this.g = i5 - i;
            if (i6 > 0) {
                i2 = b(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.l >= i4) {
                i7 = this.j;
            }
            int W = W(i2, i7, this.k, this.c.length);
            for (int i12 = i4; i12 < i11; i12++) {
                afz.m(this.b, i12, W);
            }
            int i13 = this.l;
            if (i13 >= i4) {
                this.l = i13 + i;
            }
        }
    }

    public final void F(int i, int i2) {
        if (i > 0) {
            H(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                mkm.q(objArr, objArr2, 0, 0, i3);
                mkm.q(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:            r2 = r7.b;        r3 = r8 * 5;        r4 = r0 * 5;        r5 = r1 * 5;        r6 = r3 + r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:            if (r8 >= r1) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:            defpackage.mkm.p(r2, r2, r6, r3, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:            defpackage.mkm.p(r2, r2, r5, r4 + r5, r6);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(int r8) {
        /*
            r7 = this;
            int r0 = r7.g
            int r1 = r7.f
            if (r1 == r8) goto L9e
            java.util.ArrayList r2 = r7.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r7.g
            int r3 = r7.e()
            int r3 = r3 - r2
            if (r1 >= r8) goto L39
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.afz.e(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            aav r4 = (defpackage.aav) r4
            int r5 = r4.a
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r8) goto L5b
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.afz.e(r2, r8, r3)
        L3f:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            aav r4 = (defpackage.aav) r4
            int r5 = r4.a
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L71
            int[] r2 = r7.b
            int r3 = r8 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            int r6 = r3 + r4
            if (r8 >= r1) goto L6d
            defpackage.mkm.p(r2, r2, r6, r3, r5)
            goto L71
        L6d:
            int r4 = r4 + r5
            defpackage.mkm.p(r2, r2, r5, r4, r6)
        L71:
            if (r8 >= r1) goto L75
            int r1 = r8 + r0
        L75:
            int r2 = r7.e()
            if (r1 >= r2) goto L7d
            r3 = 1
            goto L7e
        L7d:
            r3 = 0
        L7e:
            defpackage.abr.m(r3)
        L81:
            if (r1 >= r2) goto L9e
            int[] r3 = r7.b
            int r3 = defpackage.afz.h(r3, r1)
            int r4 = r7.ad(r3)
            int r4 = r7.ae(r4, r8)
            if (r4 == r3) goto L98
            int[] r3 = r7.b
            defpackage.afz.p(r3, r1, r4)
        L98:
            int r1 = r1 + 1
            if (r1 != r8) goto L81
            int r1 = r1 + r0
            goto L81
        L9e:
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agb.G(int):void");
    }

    public final void H(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                mkm.q(objArr, objArr, i + i3, i, i4);
            } else {
                mkm.q(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, f());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int h = h(min);
                int h2 = h(i5);
                int i6 = this.f;
                while (h < h2) {
                    int b = afz.b(this.b, h);
                    if (b < 0) {
                        abr.i("Unexpected anchor value, expected a positive anchor");
                    }
                    afz.m(this.b, h, -((length - b) + 1));
                    h++;
                    if (h == i6) {
                        h += this.g;
                    }
                }
            } else {
                int h3 = h(i5);
                int h4 = h(min);
                while (h3 < h4) {
                    int b2 = afz.b(this.b, h3);
                    if (b2 >= 0) {
                        abr.i("Unexpected anchor value, expected a negative anchor");
                    }
                    afz.m(this.b, h3, b2 + length + 1);
                    h3++;
                    if (h3 == this.f) {
                        h3 += this.g;
                    }
                }
            }
            this.l = min;
        }
        this.j = i;
    }

    public final void I() {
        boolean z;
        aem aemVar = this.w;
        if (aemVar != null) {
            while (aemVar.c()) {
                int a = aemVar.a();
                int h = h(a);
                int i = a + 1;
                int j = j(a) + a;
                while (true) {
                    if (i < j) {
                        if (afz.q(this.b, h(i))) {
                            z = true;
                            break;
                        }
                        i += j(i);
                    } else {
                        z = false;
                        break;
                    }
                }
                if (afz.r(this.b, h) != z) {
                    int[] iArr = this.b;
                    int i2 = (h * 5) + 1;
                    if (z) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & (-67108865);
                    }
                    int l = l(a);
                    if (l >= 0) {
                        aemVar.b(l);
                    }
                }
            }
        }
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            H(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            mkm.e(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void K() {
        int i = this.p;
        this.o = i;
        this.h = c(this.b, h(i));
    }

    public final void L(int i, Object obj, Object obj2) {
        ag(i, obj, false, obj2);
    }

    public final void M() {
        if (this.m != 0) {
            abr.i("Key must be supplied when inserting");
        }
        Object obj = abh.a;
        ag(0, obj, false, obj);
    }

    public final void N(int i, Object obj) {
        ag(i, obj, false, abh.a);
    }

    public final void O(int i, Object obj) {
        ag(i, obj, true, abh.a);
    }

    public final void P(Object obj) {
        int h = h(this.o);
        if (!afz.s(this.b, h)) {
            abr.i("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(ab(this.b, h))] = obj;
    }

    public final void Q(int i) {
        if (i >= 0) {
            aem aemVar = this.w;
            if (aemVar == null) {
                aemVar = new aem(null);
                this.w = aemVar;
            }
            aemVar.b(i);
        }
    }

    public final void R(int i, Object obj) {
        int h = h(i);
        int[] iArr = this.b;
        if (h >= iArr.length || !afz.v(iArr, h)) {
            abr.i(a.am(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, h))] = obj;
    }

    public final boolean S(int i, int i2) {
        int e;
        int j;
        if (i2 == this.q) {
            e = this.p;
        } else {
            if (i2 > this.t.b(0)) {
                j = j(i2);
            } else {
                acy acyVar = this.t;
                int i3 = acyVar.b;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (acyVar.a[i4] == i2) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    j = j(i2);
                } else {
                    e = (e() - this.g) - this.u.a[i4];
                }
            }
            e = j + i2;
        }
        if (i <= i2 || i >= e) {
            return false;
        }
        return true;
    }

    public final boolean T(int i) {
        return afz.v(this.b, h(i));
    }

    public final boolean U() {
        if (this.m != 0) {
            abr.i("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int c = c(this.b, h(i));
        int m = m();
        if (t(this.q) != null && s(i) != null) {
            throw null;
        }
        aem aemVar = this.w;
        if (aemVar != null) {
            while (aemVar.c() && ((Number) mkm.W(aemVar.a)).intValue() >= i) {
                aemVar.a();
            }
        }
        boolean V = V(i, this.o - i);
        J(c, this.h - c, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= m;
        return V;
    }

    public final boolean V(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            G(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int e = afz.e(this.d, i3, e() - this.g);
                if (e >= this.d.size()) {
                    e--;
                }
                int i4 = e + 1;
                int i5 = 0;
                while (e >= 0) {
                    aav aavVar = (aav) this.d.get(e);
                    int a = a(aavVar);
                    if (a < i) {
                        break;
                    }
                    if (a < i3) {
                        aavVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = e + 1;
                        }
                        i4 = e;
                    }
                    e--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && afz.r(this.b, h(i8))) {
                Q(i8);
            }
        }
        return z;
    }

    public final void X() {
        int i;
        int h;
        int i2 = this.m;
        int i3 = this.o;
        int i4 = this.p;
        int i5 = this.q;
        int h2 = h(i5);
        int i6 = i3 - i5;
        int i7 = this.n;
        boolean v = afz.v(this.b, h2);
        int i8 = 0;
        if (i2 > 0) {
            afz.n(this.b, h2, i6);
            afz.o(this.b, h2, i7);
            acy acyVar = this.v;
            if (true == v) {
                i7 = 1;
            }
            this.n = acyVar.c() + i7;
            int ac = ac(this.b, i5);
            this.q = ac;
            if (ac < 0) {
                h = f();
            } else {
                h = h(ac + 1);
            }
            if (h >= 0) {
                i8 = c(this.b, h);
            }
            this.h = i8;
            this.i = i8;
            return;
        }
        if (i3 != i4) {
            abr.i("Expected to be at the end of a group");
        }
        int c = afz.c(this.b, h2);
        int f = afz.f(this.b, h2);
        afz.n(this.b, h2, i6);
        afz.o(this.b, h2, i7);
        int c2 = this.t.c();
        ai();
        this.q = c2;
        int ac2 = ac(this.b, i5);
        int c3 = this.v.c();
        this.n = c3;
        if (ac2 == c2) {
            if (!v) {
                i8 = i7 - f;
            }
            this.n = c3 + i8;
            return;
        }
        int i9 = i6 - c;
        if (v) {
            i = 0;
        } else {
            i = i7 - f;
        }
        if (i9 != 0 || i != 0) {
            while (ac2 != 0 && ac2 != c2) {
                if (i == 0) {
                    if (i9 == 0) {
                        break;
                    } else {
                        i = 0;
                    }
                }
                int h3 = h(ac2);
                if (i9 != 0) {
                    afz.n(this.b, h3, afz.c(this.b, h3) + i9);
                }
                if (i != 0) {
                    int[] iArr = this.b;
                    afz.o(iArr, h3, afz.f(iArr, h3) + i);
                }
                if (true == afz.v(this.b, h3)) {
                    i = 0;
                }
                ac2 = ac(this.b, ac2);
            }
            i8 = i;
        }
        this.n += i8;
    }

    public final void Z(afx afxVar, int i) {
        boolean z;
        int i2;
        if (this.m > 0) {
            z = true;
        } else {
            z = false;
        }
        abr.m(z);
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int c = afz.c(afxVar.a, 0);
                int i3 = afxVar.b;
                if (c == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap hashMap = this.e;
                    se seVar = this.s;
                    int[] iArr2 = afxVar.a;
                    Object[] objArr2 = afxVar.c;
                    int i4 = afxVar.d;
                    HashMap hashMap2 = afxVar.i;
                    se seVar2 = afxVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = afxVar.h;
                    this.f = i3;
                    this.g = (iArr2.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = hashMap2;
                    this.s = seVar2;
                    afxVar.g(iArr, 0, objArr, 0, arrayList, hashMap, seVar);
                    return;
                }
            }
            i2 = 0;
        } else {
            i2 = i;
        }
        agb c2 = afxVar.c();
        try {
            aga.a(c2, i2, this, true, true, false);
            c2.A(true);
        } catch (Throwable th) {
            c2.A(false);
            throw th;
        }
    }

    public final int a(aav aavVar) {
        int i = aavVar.a;
        if (i < 0) {
            return f() + i;
        }
        return i;
    }

    public final void aa(Object obj) {
        if (this.m > 0) {
            F(1, this.q);
        }
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            abr.i("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    public final int b(int i) {
        return c(this.b, h(i));
    }

    public final int c(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        return ah(afz.b(iArr, i), this.k, this.c.length);
    }

    public final int d(int i) {
        if (i < this.j) {
            return i;
        }
        return i + this.k;
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.g;
    }

    public final int g() {
        return this.c.length - this.k;
    }

    public final int h(int i) {
        if (i < this.f) {
            return i;
        }
        return i + this.g;
    }

    public final int i(int i) {
        return afz.d(this.b, h(i));
    }

    public final int j(int i) {
        return afz.c(this.b, h(i));
    }

    public final int k(int i) {
        return afz.f(this.b, h(i));
    }

    public final int l(int i) {
        return ac(this.b, i);
    }

    public final int m() {
        int i = this.o;
        int h = h(i);
        int c = i + afz.c(this.b, h);
        this.o = c;
        this.h = c(this.b, h(c));
        if (afz.v(this.b, h)) {
            return 1;
        }
        return afz.f(this.b, h);
    }

    public final int n(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        return ah(afz.j(iArr, i), this.k, this.c.length);
    }

    public final int o(int i, int i2) {
        int n = n(this.b, h(i));
        int c = c(this.b, h(i + 1));
        int i3 = n + i2;
        if (i3 < n || i3 >= c) {
            abr.i(a.ad(i, i2, "Write to an invalid slot index ", " for group "));
        }
        return i3;
    }

    public final int p(int i) {
        return c(this.b, h(i + j(i)));
    }

    public final int q(int i) {
        return n(this.b, h(i));
    }

    public final aav r(int i) {
        ArrayList arrayList = this.d;
        int i2 = afz.i(arrayList, i, f());
        if (i2 < 0) {
            if (i > this.f) {
                i = -(f() - i);
            }
            aav aavVar = new aav(i);
            arrayList.add(-(i2 + 1), aavVar);
            return aavVar;
        }
        return (aav) arrayList.get(i2);
    }

    public final aav s(int i) {
        if (i >= 0 && i < f()) {
            return afz.k(this.d, i, f());
        }
        return null;
    }

    public final acx t(int i) {
        aav s;
        HashMap hashMap = this.e;
        if (hashMap == null || (s = s(i)) == null) {
            return null;
        }
        return (acx) hashMap.get(s);
    }

    public final String toString() {
        return "SlotWriter(current = " + this.o + " end=" + this.p + " size = " + f() + " gap=" + this.f + '-' + (this.f + this.g) + ')';
    }

    public final Object u(int i) {
        int h = h(i);
        if (afz.s(this.b, h)) {
            return this.c[ab(this.b, h)];
        }
        return abh.a;
    }

    public final Object v(int i) {
        int h = h(i);
        if (afz.u(this.b, h)) {
            return this.c[afz.g(this.b, h)];
        }
        return null;
    }

    public final Object w(int i) {
        int h = h(i);
        if (afz.v(this.b, h)) {
            return this.c[d(c(this.b, h))];
        }
        return null;
    }

    public final Object x(int i, int i2, Object obj) {
        int d = d(o(i, i2));
        Object[] objArr = this.c;
        Object obj2 = objArr[d];
        objArr[d] = obj;
        return obj2;
    }

    public final void y(int i) {
        if (i < 0) {
            abr.i("Cannot seek backwards");
        }
        if (this.m > 0) {
            ael.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        if (i2 < this.q || i2 > this.p) {
            abr.i("Cannot seek outside the current group (" + this.q + '-' + this.p + ')');
        }
        this.o = i2;
        int c = c(this.b, h(i2));
        this.h = c;
        this.i = c;
    }

    public final void z() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            af();
        }
    }
}
