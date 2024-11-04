package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asb extends ars {
    public asb() {
        super("Generic L*a*b*", 12884901890L, 15);
    }

    @Override // defpackage.ars
    public final float a(int i) {
        if (i == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    @Override // defpackage.ars
    public final float b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    @Override // defpackage.ars
    public final float c(float f, float f2, float f3) {
        float f4;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f5 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        if (f5 > 0.20689656f) {
            f4 = f5 * f5 * f5;
        } else {
            f4 = 0.12841855f * (f5 - 0.13793103f);
        }
        ash ashVar = asa.a;
        return f4 * asa.e[2];
    }

    @Override // defpackage.ars
    public final long d(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        if (f7 > 0.20689656f) {
            f4 = f7 * f7 * f7;
        } else {
            f4 = (f7 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f5 = f6 * f6 * f6;
        } else {
            f5 = (f6 - 0.13793103f) * 0.12841855f;
        }
        ash ashVar = asa.a;
        float[] fArr = asa.e;
        float f8 = f4 * fArr[0];
        float f9 = f5 * fArr[1];
        return (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    @Override // defpackage.ars
    public final long e(float f, float f2, float f3, float f4, ars arsVar) {
        float f5;
        float f6;
        float f7;
        ash ashVar = asa.a;
        float[] fArr = asa.e;
        float f8 = f / fArr[0];
        float f9 = f2 / fArr[1];
        float f10 = f3 / fArr[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.cbrt(f8);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.cbrt(f9);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.cbrt(f10);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        float f11 = 116.0f * f6;
        float f12 = f5 - f6;
        float f13 = f6 - f7;
        float f14 = f11 - 16.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        float f15 = f12 * 500.0f;
        float f16 = -128.0f;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        float f17 = 128.0f;
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        float f18 = f13 * 200.0f;
        if (f18 >= -128.0f) {
            f16 = f18;
        }
        if (f16 <= 128.0f) {
            f17 = f16;
        }
        return jw.g(f14, f15, f17, f4, arsVar);
    }
}
