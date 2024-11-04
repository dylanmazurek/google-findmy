package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asc extends ars {
    private static final float[] d;
    private static final float[] e;
    private static final float[] f;
    private static final float[] g;

    static {
        float[] fArr = arr.a.b;
        ash ashVar = asa.a;
        float[] k = kk.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, kk.i(fArr, asa.b.a(), asa.d.a()));
        d = k;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr2;
        f = kk.j(k);
        g = kk.j(fArr2);
    }

    public asc() {
        super("Oklab", 12884901890L, 17);
    }

    @Override // defpackage.ars
    public final float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // defpackage.ars
    public final float b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // defpackage.ars
    public final float c(float f2, float f3, float f4) {
        float[] fArr = g;
        float f5 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f6 = f5 * f2;
        float f7 = fArr[3];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f8 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        float f9 = f7 * f3;
        float f10 = fArr[6];
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f8 = f4;
        }
        float f11 = f10 * f8;
        float f12 = fArr[1] * f2;
        float f13 = fArr[4] * f3;
        float f14 = fArr[7] * f8;
        float f15 = fArr[2] * f2;
        float f16 = fArr[5] * f3;
        float f17 = fArr[8] * f8;
        float[] fArr2 = f;
        float f18 = f6 + f9 + f11;
        float f19 = f12 + f13 + f14;
        float f20 = f15 + f16 + f17;
        return (fArr2[2] * f18 * f18 * f18) + (fArr2[5] * f19 * f19 * f19) + (fArr2[8] * f20 * f20 * f20);
    }

    @Override // defpackage.ars
    public final long d(float f2, float f3, float f4) {
        float f5;
        float[] fArr = g;
        float f6 = fArr[0];
        float f7 = 0.0f;
        if (f2 >= 0.0f) {
            f7 = f2;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f6 * f7;
        float f9 = fArr[3];
        float f10 = -0.5f;
        if (f3 < -0.5f) {
            f5 = -0.5f;
        } else {
            f5 = f3;
        }
        float f11 = 0.5f;
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        float f12 = f9 * f5;
        float f13 = fArr[6];
        if (f4 >= -0.5f) {
            f10 = f4;
        }
        if (f10 <= 0.5f) {
            f11 = f10;
        }
        float f14 = fArr[1] * f7;
        float f15 = fArr[4] * f5;
        float f16 = fArr[7] * f11;
        float f17 = fArr[2] * f7;
        float f18 = fArr[5] * f5;
        float f19 = fArr[8] * f11;
        float[] fArr2 = f;
        float f20 = f8 + f12 + (f13 * f11);
        float f21 = f20 * f20 * f20;
        float f22 = fArr2[0] * f21;
        float f23 = f14 + f15 + f16;
        float f24 = f23 * f23 * f23;
        float f25 = fArr2[3] * f24;
        float f26 = f17 + f18 + f19;
        float f27 = f26 * f26 * f26;
        float f28 = fArr2[6] * f27;
        float f29 = fArr2[1] * f21;
        float f30 = fArr2[4] * f24;
        float f31 = fArr2[7] * f27;
        return (Float.floatToRawIntBits((f22 + f25) + f28) << 32) | (Float.floatToRawIntBits(f29 + f30 + f31) & 4294967295L);
    }

    @Override // defpackage.ars
    public final long e(float f2, float f3, float f4, float f5, ars arsVar) {
        float[] fArr = d;
        float f6 = fArr[0] * f2;
        float f7 = fArr[3] * f3;
        float f8 = fArr[6] * f4;
        float f9 = fArr[1] * f2;
        float f10 = fArr[4] * f3;
        float f11 = fArr[7] * f4;
        float f12 = fArr[2] * f2;
        float f13 = fArr[5] * f3;
        float f14 = fArr[8] * f4;
        float b = beh.b(f6 + f7 + f8);
        float b2 = beh.b(f9 + f10 + f11);
        float b3 = beh.b(f12 + f13 + f14);
        float[] fArr2 = e;
        float f15 = fArr2[0] * b;
        float f16 = fArr2[3] * b2;
        float f17 = fArr2[6] * b3;
        float f18 = fArr2[1] * b;
        float f19 = fArr2[4] * b2;
        return jw.g(f15 + f16 + f17, f18 + f19 + (fArr2[7] * b3), (fArr2[2] * b) + (fArr2[5] * b2) + (fArr2[8] * b3), f5, arsVar);
    }
}
