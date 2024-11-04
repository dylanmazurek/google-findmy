package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmo {
    public static boolean a = false;
    public static long b;
    public final ksr j;
    private final bmn r;
    private bmn s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private bmr[] p = new bmr[1000];
    private int q = 0;
    bmn[] e = new bmn[32];

    public bmo() {
        t();
        ksr ksrVar = new ksr();
        this.j = ksrVar;
        this.r = new bmq(ksrVar);
        this.s = new bmn(ksrVar);
    }

    public static final int o(Object obj) {
        bmr bmrVar = ((bmv) obj).h;
        if (bmrVar != null) {
            return (int) (bmrVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(bmn bmnVar) {
        int i;
        if (bmnVar.d) {
            bmnVar.a.d(this, bmnVar.b);
        } else {
            bmn[] bmnVarArr = this.e;
            int i2 = this.i;
            bmnVarArr[i2] = bmnVar;
            bmr bmrVar = bmnVar.a;
            bmrVar.d = i2;
            this.i = i2 + 1;
            bmrVar.e(this, bmnVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                bmn bmnVar2 = this.e[i3];
                if (bmnVar2 != null && bmnVar2.d) {
                    bmnVar2.a.d(this, bmnVar2.b);
                    ((njm) this.j.a).m(bmnVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        bmn[] bmnVarArr2 = this.e;
                        int i6 = i4 - 1;
                        bmn bmnVar3 = bmnVarArr2[i4];
                        bmnVarArr2[i6] = bmnVar3;
                        bmr bmrVar2 = bmnVar3.a;
                        if (bmrVar2.d == i4) {
                            bmrVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            bmn bmnVar = this.e[i];
            bmnVar.a.f = bmnVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (bmn[]) Arrays.copyOf(this.e, i2);
        this.j.c = (bmr[]) Arrays.copyOf((Object[]) this.j.c, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            bmn bmnVar = this.e[i];
            if (bmnVar != null) {
                ((njm) this.j.a).m(bmnVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(bmn bmnVar) {
        bmm bmmVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 < i4 + i4) {
                bmr bmrVar = bmnVar.a;
                if (bmrVar != null) {
                    this.n[bmrVar.c] = true;
                }
                bmr k = bmnVar.k(this.n);
                if (k != null) {
                    boolean[] zArr = this.n;
                    int i5 = k.c;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    } else {
                        return;
                    }
                }
                if (k != null) {
                    float f = Float.MAX_VALUE;
                    int i6 = -1;
                    for (int i7 = 0; i7 < this.i; i7++) {
                        bmn bmnVar2 = this.e[i7];
                        if (bmnVar2.a.n != 1 && !bmnVar2.d && (i = (bmmVar = bmnVar2.e).e) != -1) {
                            int i8 = 0;
                            while (true) {
                                if (i != -1 && i8 < bmmVar.a) {
                                    if (bmmVar.b[i] == k.c) {
                                        float a2 = bmnVar2.e.a(k);
                                        if (a2 < 0.0f) {
                                            float f2 = (-bmnVar2.b) / a2;
                                            if (f2 < f) {
                                                i6 = i7;
                                                f = f2;
                                            }
                                        }
                                    } else {
                                        i = bmmVar.c[i];
                                        i8++;
                                    }
                                }
                            }
                        }
                    }
                    if (i6 >= 0) {
                        bmn bmnVar3 = this.e[i6];
                        bmnVar3.a.d = -1;
                        bmnVar3.b(k);
                        bmr bmrVar2 = bmnVar3.a;
                        bmrVar2.d = i6;
                        bmrVar2.e(this, bmnVar3);
                    }
                    z = false;
                }
            } else {
                return;
            }
        }
    }

    private final bmr v(int i) {
        bmr bmrVar = (bmr) ((njm) this.j.b).l();
        if (bmrVar == null) {
            bmrVar = new bmr(i);
            bmrVar.n = i;
        } else {
            bmrVar.c();
            bmrVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (bmr[]) Arrays.copyOf(this.p, i4);
        }
        bmr[] bmrVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        bmrVarArr[i5] = bmrVar;
        return bmrVar;
    }

    public final bmn a() {
        bmn bmnVar = (bmn) ((njm) this.j.a).l();
        if (bmnVar == null) {
            bmn bmnVar2 = new bmn(this.j);
            b++;
            bmnVar = bmnVar2;
        } else {
            bmnVar.a = null;
            bmnVar.e.f();
            bmnVar.b = 0.0f;
            bmnVar.d = false;
        }
        bmr.a++;
        return bmnVar;
    }

    public final bmr b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        bmv bmvVar = (bmv) obj;
        bmr bmrVar = bmvVar.h;
        if (bmrVar == null) {
            bmvVar.m();
            bmrVar = bmvVar.h;
        }
        int i = bmrVar.c;
        if (i != -1) {
            if (i > this.d || ((bmr[]) this.j.c)[i] == null) {
                if (i != -1) {
                    bmrVar.c();
                }
            }
            return bmrVar;
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        bmrVar.c = i2;
        bmrVar.n = 1;
        ((bmr[]) this.j.c)[i2] = bmrVar;
        return bmrVar;
    }

    public final bmr c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        bmr v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        ((bmr[]) this.j.c)[i] = v;
        return v;
    }

    public final void d(bmr bmrVar, bmr bmrVar2, int i, float f, bmr bmrVar3, bmr bmrVar4, int i2, int i3) {
        bmn a2 = a();
        if (bmrVar2 == bmrVar3) {
            a2.e.g(bmrVar, 1.0f);
            a2.e.g(bmrVar4, 1.0f);
            a2.e.g(bmrVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(bmrVar, 1.0f);
            a2.e.g(bmrVar2, -1.0f);
            a2.e.g(bmrVar3, -1.0f);
            a2.e.g(bmrVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(bmrVar, -1.0f);
            a2.e.g(bmrVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(bmrVar4, -1.0f);
            a2.e.g(bmrVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(bmrVar, f2);
            a2.e.g(bmrVar2, -f2);
            a2.e.g(bmrVar3, -f);
            a2.e.g(bmrVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01be A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.bmn r17) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmo.e(bmn):void");
    }

    public final void f(bmr bmrVar, int i) {
        int i2 = bmrVar.d;
        if (i2 == -1) {
            bmrVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                bmr bmrVar2 = ((bmr[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 != -1) {
            bmn bmnVar = this.e[i2];
            if (bmnVar.d) {
                bmnVar.b = i;
                return;
            }
            if (bmnVar.e.a == 0) {
                bmnVar.d = true;
                bmnVar.b = i;
                return;
            }
            bmn a2 = a();
            if (i < 0) {
                a2.b = -i;
                a2.e.g(bmrVar, 1.0f);
            } else {
                a2.b = i;
                a2.e.g(bmrVar, -1.0f);
            }
            e(a2);
            return;
        }
        float f = i;
        bmn a3 = a();
        a3.a = bmrVar;
        bmrVar.f = f;
        a3.b = f;
        a3.d = true;
        e(a3);
    }

    public final void g(bmr bmrVar, bmr bmrVar2, int i, int i2) {
        bmn a2 = a();
        bmr c = c();
        c.e = 0;
        a2.h(bmrVar, bmrVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(bmr bmrVar, bmr bmrVar2, int i, int i2) {
        bmn a2 = a();
        bmr c = c();
        c.e = 0;
        a2.i(bmrVar, bmrVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(bmn bmnVar, int i, int i2) {
        bmnVar.e.g(p(i2), i);
    }

    public final void j() {
        bmn bmnVar = this.r;
        if (bmnVar.e()) {
            r();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.i; i++) {
                if (!this.e[i].d) {
                    l(this.r);
                    return;
                }
            }
            r();
            return;
        }
        l(bmnVar);
    }

    public final void k() {
        ksr ksrVar;
        int i = 0;
        while (true) {
            ksrVar = this.j;
            bmr[] bmrVarArr = (bmr[]) ksrVar.c;
            if (i >= bmrVarArr.length) {
                break;
            }
            bmr bmrVar = bmrVarArr[i];
            if (bmrVar != null) {
                bmrVar.c();
            }
            i++;
        }
        Object obj = ksrVar.b;
        bmr[] bmrVarArr2 = this.p;
        int i2 = this.q;
        int length = bmrVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            bmr bmrVar2 = bmrVarArr2[i3];
            njm njmVar = (njm) obj;
            int i4 = njmVar.a;
            if (i4 < 256) {
                ((Object[]) njmVar.b)[i4] = bmrVar2;
                njmVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) this.j.c, (Object) null);
        this.d = 0;
        bmq bmqVar = (bmq) this.r;
        bmqVar.f = 0;
        bmqVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            bmn bmnVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new bmn(this.j);
    }

    final void l(bmn bmnVar) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            bmn bmnVar2 = this.e[i];
            if (bmnVar2.a.n != 1) {
                float f = 0.0f;
                if (bmnVar2.b < 0.0f) {
                    boolean z3 = false;
                    int i2 = 0;
                    while (!z3) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.i) {
                            bmn bmnVar3 = this.e[i3];
                            if (bmnVar3.a.n != 1 && !bmnVar3.d && bmnVar3.b < f) {
                                int i7 = bmnVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    bmr d = bmnVar3.e.d(i8);
                                    float a2 = bmnVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            bmn bmnVar4 = this.e[i4];
                            bmnVar4.a.d = -1;
                            bmnVar4.b(((bmr[]) this.j.c)[i5]);
                            bmr bmrVar = bmnVar4.a;
                            bmrVar.d = i4;
                            bmrVar.e(this, bmnVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 > this.h / 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z3 = (!z2) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(bmnVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.bmr r6, defpackage.bmr r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L18
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = 8
        L18:
            bmn r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L39
            if (r8 >= 0) goto L27
            int r8 = -r8
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2e
            goto L39
        L2e:
            bmm r8 = r1.e
            r8.g(r6, r2)
            bmm r6 = r1.e
            r6.g(r7, r3)
            goto L43
        L39:
            bmm r8 = r1.e
            r8.g(r6, r3)
            bmm r6 = r1.e
            r6.g(r7, r2)
        L43:
            if (r9 == r0) goto L48
            r1.f(r5, r9)
        L48:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmo.m(bmr, bmr, int, int):void");
    }

    public final void n(bmr bmrVar, bmr bmrVar2, bmr bmrVar3, bmr bmrVar4, float f) {
        bmn a2 = a();
        a2.g(bmrVar, bmrVar2, bmrVar3, bmrVar4, f);
        e(a2);
    }

    public final bmr p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        bmr v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        ((bmr[]) this.j.c)[i2] = v;
        bmq bmqVar = (bmq) this.r;
        bmp bmpVar = bmqVar.g;
        bmpVar.a = v;
        Arrays.fill(bmpVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        bmqVar.m(v);
        return v;
    }
}
