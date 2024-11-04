package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asf extends ars {
    private static final arz o = new art(2);
    public final ash d;
    public final float e;
    public final float f;
    public final asg g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final arz k;
    public final arz l;
    public final arz m;
    public final arz n;
    private final boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asf(java.lang.String r17, float[] r18, defpackage.ash r19, final double r20, float r22, float r23, int r24) {
        /*
            r16 = this;
            r1 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb
            arz r3 = defpackage.asf.o
            goto L11
        Lb:
            ase r3 = new ase
            r4 = 1
            r3.<init>()
        L11:
            r11 = r3
            if (r0 != 0) goto L17
            arz r0 = defpackage.asf.o
            goto L1d
        L17:
            ase r0 = new ase
            r3 = 0
            r0.<init>()
        L1d:
            r12 = r0
            asg r14 = new asg
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r14
            r1 = r20
            r0.<init>(r1, r3, r5, r7, r9)
            r9 = 0
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r11
            r11 = r12
            r12 = r22
            r13 = r23
            r15 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asf.<init>(java.lang.String, float[], ash, double, float, float, int):void");
    }

    @Override // defpackage.ars
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.ars
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.ars
    public final float c(float f, float f2, float f3) {
        float a = (float) this.n.a(f);
        float a2 = (float) this.n.a(f2);
        float a3 = (float) this.n.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * a) + (fArr[5] * a2) + (fArr[8] * a3);
    }

    @Override // defpackage.ars
    public final long d(float f, float f2, float f3) {
        float a = (float) this.n.a(f);
        float a2 = (float) this.n.a(f2);
        float a3 = (float) this.n.a(f3);
        float[] fArr = this.i;
        float f4 = fArr[0] * a;
        float f5 = fArr[3] * a2;
        float f6 = fArr[6] * a3;
        float f7 = fArr[1] * a;
        float f8 = fArr[4] * a2;
        float f9 = fArr[7] * a3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.ars
    public final long e(float f, float f2, float f3, float f4, ars arsVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        return jw.g((float) this.l.a(f5 + f6 + f7), (float) this.l.a(f8 + f9 + f10), (float) this.l.a(f11 + f12 + (fArr[8] * f3)), f4, arsVar);
    }

    @Override // defpackage.ars
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        asf asfVar = (asf) obj;
        if (Float.compare(asfVar.e, this.e) != 0 || Float.compare(asfVar.f, this.f) != 0 || !amr.i(this.d, asfVar.d) || !Arrays.equals(this.h, asfVar.h)) {
            return false;
        }
        asg asgVar = this.g;
        if (asgVar != null) {
            return amr.i(asgVar, asfVar.g);
        }
        if (asfVar.g == null) {
            return true;
        }
        if (!amr.i(this.k, asfVar.k)) {
            return false;
        }
        return amr.i(this.m, asfVar.m);
    }

    @Override // defpackage.ars
    public final boolean f() {
        return this.p;
    }

    @Override // defpackage.ars
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = ((hashCode * 31) + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        asg asgVar = this.g;
        if (asgVar != null) {
            i = asgVar.hashCode();
        }
        int i4 = i3 + i;
        if (this.g == null) {
            return (((i4 * 31) + this.k.hashCode()) * 31) + this.m.hashCode();
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asf(java.lang.String r12, float[] r13, defpackage.ash r14, final defpackage.asg r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            asd r5 = new asd
            r0 = 3
            r5.<init>()
            asd r6 = new asd
            r0 = 0
            r6.<init>()
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asf.<init>(java.lang.String, float[], ash, asg, int):void");
    }

    public asf(String str, float[] fArr, ash ashVar, float[] fArr2, arz arzVar, arz arzVar2, float f, float f2, asg asgVar, int i) {
        super(str, 12884901888L, i);
        this.d = ashVar;
        this.e = f;
        this.f = f2;
        this.g = asgVar;
        this.k = arzVar;
        boolean z = true;
        z = true;
        final int i2 = z ? 1 : 0;
        this.l = new arz() { // from class: asd
            @Override // defpackage.arz
            public final double a(double d) {
                int i3 = i2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            asg asgVar2 = (asg) this;
                            double d2 = asgVar2.a;
                            double d3 = asgVar2.e;
                            return kk.f(d, asgVar2.b, asgVar2.c, asgVar2.d, d3, d2);
                        }
                        return ((asf) this).m.a(moz.Y(d, r0.e, r0.f));
                    }
                    asf asfVar = (asf) this;
                    return moz.Y(asfVar.k.a(d), asfVar.e, asfVar.f);
                }
                asg asgVar3 = (asg) this;
                double d4 = asgVar3.a;
                double d5 = asgVar3.e;
                return kk.g(d, asgVar3.b, asgVar3.c, asgVar3.d, d5, d4);
            }
        };
        this.m = arzVar2;
        final int i3 = 2;
        this.n = new arz() { // from class: asd
            @Override // defpackage.arz
            public final double a(double d) {
                int i32 = i3;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            asg asgVar2 = (asg) this;
                            double d2 = asgVar2.a;
                            double d3 = asgVar2.e;
                            return kk.f(d, asgVar2.b, asgVar2.c, asgVar2.d, d3, d2);
                        }
                        return ((asf) this).m.a(moz.Y(d, r0.e, r0.f));
                    }
                    asf asfVar = (asf) this;
                    return moz.Y(asfVar.k.a(d), asfVar.e, asfVar.f);
                }
                asg asgVar3 = (asg) this;
                double d4 = asgVar3.a;
                double d5 = asgVar3.e;
                return kk.g(d, asgVar3.b, asgVar3.c, asgVar3.d, d5, d4);
            }
        };
        int length = fArr.length;
        if (f < f2) {
            float[] fArr3 = new float[6];
            fArr.getClass();
            System.arraycopy(fArr, 0, fArr3, 0, 6);
            this.h = fArr3;
            if (fArr2 == null) {
                float f3 = fArr3[0];
                float f4 = fArr3[1];
                float f5 = fArr3[2];
                float f6 = fArr3[3];
                float f7 = fArr3[4];
                float f8 = fArr3[5];
                float f9 = ashVar.a;
                float f10 = ashVar.b;
                float f11 = 1.0f - f3;
                float f12 = f11 / f4;
                float f13 = 1.0f - f5;
                float f14 = 1.0f - f7;
                float f15 = (1.0f - f9) / f10;
                float f16 = f3 / f4;
                float f17 = (f7 / f8) - f16;
                float f18 = (f5 / f6) - f16;
                float f19 = (f9 / f10) - f16;
                float f20 = (f13 / f6) - f12;
                float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
                float f22 = (f19 - (f17 * f21)) / f18;
                float f23 = (1.0f - f22) - f21;
                float f24 = f23 / f4;
                float f25 = f22 / f6;
                float f26 = f21 / f8;
                this.i = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            } else {
                this.i = fArr2;
            }
            this.j = kk.j(this.i);
            float d = ku.d(fArr3);
            float[] fArr4 = aru.a;
            if (d / ku.d(aru.b) > 0.9f) {
                float f27 = fArr3[0];
                float f28 = fArr3[1];
                float f29 = fArr3[2];
                float f30 = fArr3[3];
                float f31 = fArr3[4];
                float f32 = fArr3[5];
            }
            if (i != 0) {
                float[] fArr5 = aru.a;
                if (fArr3 != fArr5) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (Float.compare(fArr3[i4], fArr5[i4]) != 0 && Math.abs(fArr3[i4] - fArr5[i4]) > 0.001f) {
                            break;
                        }
                    }
                }
                ash ashVar2 = asa.a;
                if (kk.h(ashVar, asa.d) && f == 0.0f && f2 == 1.0f) {
                    asf asfVar = aru.c;
                    for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                        if (ku.e(d2, arzVar, asfVar.k) && ku.e(d2, arzVar2, asfVar.m)) {
                        }
                    }
                }
                z = false;
            }
            this.p = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }
}
