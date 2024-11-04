package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arb {
    public static final long a(float[] fArr, long j) {
        float b = aqk.b(j);
        float c = aqk.c(j);
        float f = 1.0f / (((fArr[3] * b) + (fArr[7] * c)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return a.k(((fArr[0] * b) + (fArr[4] * c) + fArr[12]) * f, f * ((fArr[1] * b) + (fArr[5] * c) + fArr[13]));
    }

    public static final void b(float[] fArr, aqj aqjVar) {
        long a = a(fArr, a.k(aqjVar.a, aqjVar.b));
        long a2 = a(fArr, a.k(aqjVar.a, aqjVar.d));
        long a3 = a(fArr, a.k(aqjVar.c, aqjVar.b));
        long a4 = a(fArr, a.k(aqjVar.c, aqjVar.d));
        aqjVar.a = Math.min(Math.min(aqk.b(a), aqk.b(a2)), Math.min(aqk.b(a3), aqk.b(a4)));
        aqjVar.b = Math.min(Math.min(aqk.c(a), aqk.c(a2)), Math.min(aqk.c(a3), aqk.c(a4)));
        aqjVar.c = Math.max(Math.max(aqk.b(a), aqk.b(a2)), Math.max(aqk.b(a3), aqk.b(a4)));
        aqjVar.d = Math.max(Math.max(aqk.c(a), aqk.c(a2)), Math.max(aqk.c(a3), aqk.c(a4)));
    }

    public static final void c(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[(i2 * 4) + i] = f;
            }
        }
    }

    public static final void d(float[] fArr, float[] fArr2) {
        float a = amr.a(fArr, 0, fArr2, 0);
        float a2 = amr.a(fArr, 0, fArr2, 1);
        float a3 = amr.a(fArr, 0, fArr2, 2);
        float a4 = amr.a(fArr, 0, fArr2, 3);
        float a5 = amr.a(fArr, 1, fArr2, 0);
        float a6 = amr.a(fArr, 1, fArr2, 1);
        float a7 = amr.a(fArr, 1, fArr2, 2);
        float a8 = amr.a(fArr, 1, fArr2, 3);
        float a9 = amr.a(fArr, 2, fArr2, 0);
        float a10 = amr.a(fArr, 2, fArr2, 1);
        float a11 = amr.a(fArr, 2, fArr2, 2);
        float a12 = amr.a(fArr, 2, fArr2, 3);
        float a13 = amr.a(fArr, 3, fArr2, 0);
        float a14 = amr.a(fArr, 3, fArr2, 1);
        float a15 = amr.a(fArr, 3, fArr2, 2);
        float a16 = amr.a(fArr, 3, fArr2, 3);
        fArr[0] = a;
        fArr[1] = a2;
        fArr[2] = a3;
        fArr[3] = a4;
        fArr[4] = a5;
        fArr[5] = a6;
        fArr[6] = a7;
        fArr[7] = a8;
        fArr[8] = a9;
        fArr[9] = a10;
        fArr[10] = a11;
        fArr[11] = a12;
        fArr[12] = a13;
        fArr[13] = a14;
        fArr[14] = a15;
        fArr[15] = a16;
    }

    public static /* synthetic */ float[] e() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static /* synthetic */ void f(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
