package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brn {
    static final brn a;
    public final float b;
    public final float c;
    public final float d;
    public final float e = 0.69f;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = brb.c;
        double c = brb.c();
        float[][] fArr2 = brb.a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = fArr3[2] * f5;
        float[] fArr4 = fArr2[1];
        float f7 = fArr4[0] * f;
        float f8 = fArr4[1] * f3;
        float f9 = fArr4[2] * f5;
        float[] fArr5 = fArr2[2];
        float f10 = f * fArr5[0];
        float f11 = f3 * fArr5[1];
        float f12 = f5 * fArr5[2];
        float f13 = (float) ((c * 63.66197723675813d) / 100.0d);
        float exp = 1.0f - (((float) Math.exp(((-f13) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f14 = f7 + f8 + f9;
        float f15 = f2 + f4 + f6;
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / ((f10 + f11) + f12)) * exp) + 1.0f) - exp};
        float f16 = 1.0f / ((5.0f * f13) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float f19 = f17 * f13;
        float cbrt = (float) Math.cbrt(f13 * 5.0d);
        float c2 = brb.c() / fArr[1];
        double d2 = c2;
        float sqrt = (float) Math.sqrt(d2);
        float pow = (float) Math.pow(d2, 0.2d);
        float f20 = f19 + (0.1f * f18 * f18 * cbrt);
        float pow2 = (float) Math.pow(((fArr6[0] * f20) * f15) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((fArr6[1] * f20) * f14) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow(((fArr6[2] * f20) * r5) / 100.0d, 0.42d);
        float[] fArr7 = {pow2, pow3, pow4};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (400.0f * pow4) / (pow4 + 27.13f);
        float[] fArr8 = {f22, (f23 * 400.0f) / (f23 + 27.13f), f24};
        float f25 = fArr8[0];
        float f26 = 0.725f / pow;
        a = new brn(c2, (f25 + f25 + fArr8[1] + (f24 * 0.05f)) * f26, f26, f26, fArr6, f20, (float) Math.pow(f20, 0.25d), sqrt + 1.48f);
    }

    private brn(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.f = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = fArr;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }
}
