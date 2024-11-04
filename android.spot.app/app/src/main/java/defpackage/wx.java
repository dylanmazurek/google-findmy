package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wx implements ws {
    public final int a;
    public final int b;
    private final sc c;
    private final se d;
    private final vg e;
    private int[] f;
    private float[] g;
    private va h;
    private va i;
    private va j;
    private va k;
    private float[] l;
    private float[] m;
    private bet n;

    public wx(sc scVar, se seVar, int i, int i2, vg vgVar) {
        this.c = scVar;
        this.d = seVar;
        this.a = i;
        this.b = i2;
        this.e = vgVar;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        vg vgVar;
        float f;
        sc scVar = this.c;
        if (i >= scVar.b - 1) {
            f = i2;
        } else {
            int a = scVar.a(i);
            int a2 = this.c.a(i + 1);
            if (i2 == a) {
                f = a;
            } else {
                int i3 = a2 - a;
                ww wwVar = (ww) this.d.a(a);
                if (wwVar == null || (vgVar = wwVar.b) == null) {
                    vgVar = this.e;
                }
                float f2 = i3;
                float a3 = vgVar.a((i2 - a) / f2);
                if (z) {
                    return a3;
                }
                f = (f2 * a3) + a;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        sc scVar = this.c;
        int i3 = scVar.b;
        if (i3 < 0) {
            qz.f("fromIndex(0) > toIndex(" + i3 + ')');
        }
        if (i3 <= scVar.b) {
            int i4 = i3 - 1;
            int i5 = 0;
            while (true) {
                if (i5 <= i4) {
                    i2 = (i5 + i4) >>> 1;
                    int a = scVar.a(i2);
                    if (a < i) {
                        i5 = i2 + 1;
                    } else {
                        if (a <= i) {
                            break;
                        }
                        i4 = i2 - 1;
                    }
                } else {
                    i2 = -(i5 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        throw new IndexOutOfBoundsException(a.ae(i3, "Index out of range: "));
    }

    private final void k(va vaVar, va vaVar2, va vaVar3) {
        boolean z;
        float[] fArr;
        float[] fArr2;
        bet betVar = this.n;
        va vaVar4 = this.h;
        if (betVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (vaVar4 == null) {
            this.h = vaVar.c();
            this.i = vaVar3.c();
            int i = this.c.b;
            float[] fArr3 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr3[i2] = this.c.a(i2) / 1000.0f;
            }
            this.g = fArr3;
            int i3 = this.c.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                z |= !a.m(0, 0);
                iArr[i4] = 0;
            }
            this.f = iArr;
        }
        if (z) {
            float[] fArr4 = null;
            if (this.n != null) {
                va vaVar5 = this.j;
                if (vaVar5 == null) {
                    mpd.b("lastInitialValue");
                    vaVar5 = null;
                }
                if (amr.i(vaVar5, vaVar)) {
                    va vaVar6 = this.k;
                    if (vaVar6 == null) {
                        mpd.b("lastTargetValue");
                        vaVar6 = null;
                    }
                    if (amr.i(vaVar6, vaVar2)) {
                        return;
                    }
                }
            }
            this.j = vaVar;
            this.k = vaVar2;
            int b = (vaVar.b() & 1) + vaVar.b();
            this.l = new float[b];
            this.m = new float[b];
            int i5 = this.c.b;
            float[][] fArr5 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int a = this.c.a(i6);
                if (a == 0) {
                    if (!se.b(this.d, 0)) {
                        fArr2 = new float[b];
                        for (int i7 = 0; i7 < b; i7++) {
                            fArr2[i7] = vaVar.a(i7);
                        }
                    } else {
                        fArr2 = new float[b];
                        Object a2 = this.d.a(0);
                        a2.getClass();
                        va vaVar7 = ((ww) a2).a;
                        for (int i8 = 0; i8 < b; i8++) {
                            fArr2[i8] = vaVar7.a(i8);
                        }
                    }
                } else {
                    if (a == this.a) {
                        if (!se.b(this.d, a)) {
                            fArr2 = new float[b];
                            for (int i9 = 0; i9 < b; i9++) {
                                fArr2[i9] = vaVar2.a(i9);
                            }
                        } else {
                            fArr = new float[b];
                            Object a3 = this.d.a(a);
                            a3.getClass();
                            va vaVar8 = ((ww) a3).a;
                            for (int i10 = 0; i10 < b; i10++) {
                                fArr[i10] = vaVar8.a(i10);
                            }
                        }
                    } else {
                        fArr = new float[b];
                        Object a4 = this.d.a(a);
                        a4.getClass();
                        va vaVar9 = ((ww) a4).a;
                        for (int i11 = 0; i11 < b; i11++) {
                            fArr[i11] = vaVar9.a(i11);
                        }
                    }
                    fArr2 = fArr;
                }
                fArr5[i6] = fArr2;
            }
            int[] iArr2 = this.f;
            if (iArr2 == null) {
                mpd.b("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.g;
            if (fArr6 == null) {
                mpd.b("times");
            } else {
                fArr4 = fArr6;
            }
            this.n = new bet(iArr2, fArr4, fArr5);
        }
    }

    @Override // defpackage.wq
    public final /* synthetic */ long a(va vaVar, va vaVar2, va vaVar3) {
        return rf.b(this);
    }

    @Override // defpackage.wq
    public final /* synthetic */ va b(va vaVar, va vaVar2, va vaVar3) {
        return rc.c(this, vaVar, vaVar2, vaVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f A[RETURN] */
    @Override // defpackage.wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.va c(long r11, defpackage.va r13, defpackage.va r14, defpackage.va r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.c(long, va, va, va):va");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0057, code lost:            if (r0 > r5) goto L15;     */
    @Override // defpackage.wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.va d(long r17, defpackage.va r19, defpackage.va r20, defpackage.va r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.d(long, va, va, va):va");
    }

    @Override // defpackage.wq
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.ws
    public final int f() {
        return this.b;
    }

    @Override // defpackage.ws
    public final int g() {
        return this.a;
    }
}
