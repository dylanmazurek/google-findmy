package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbp {
    public static final void a(float[] fArr, float[] fArr2) {
        float a = amr.a(fArr2, 0, fArr, 0);
        float a2 = amr.a(fArr2, 0, fArr, 1);
        float a3 = amr.a(fArr2, 0, fArr, 2);
        float a4 = amr.a(fArr2, 0, fArr, 3);
        float a5 = amr.a(fArr2, 1, fArr, 0);
        float a6 = amr.a(fArr2, 1, fArr, 1);
        float a7 = amr.a(fArr2, 1, fArr, 2);
        float a8 = amr.a(fArr2, 1, fArr, 3);
        float a9 = amr.a(fArr2, 2, fArr, 0);
        float a10 = amr.a(fArr2, 2, fArr, 1);
        float a11 = amr.a(fArr2, 2, fArr, 2);
        float a12 = amr.a(fArr2, 2, fArr, 3);
        float a13 = amr.a(fArr2, 3, fArr, 0);
        float a14 = amr.a(fArr2, 3, fArr, 1);
        float a15 = amr.a(fArr2, 3, fArr, 2);
        float a16 = amr.a(fArr2, 3, fArr, 3);
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

    public static final mnb b() {
        return (mnb) bbv.a.a();
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static float e(blj bljVar, long j) {
        if (!a.n(blp.c(j), 4294967296L)) {
            d("Only Sp can convert to Px");
        }
        int i = bls.a;
        if (!bls.a(bljVar.b())) {
            return blp.a(j) * bljVar.b();
        }
        blr b = bls.b(bljVar.b());
        if (b == null) {
            return blp.a(j) * bljVar.b();
        }
        return b.b(blp.a(j));
    }

    public static long f(blj bljVar, float f) {
        float b;
        int i = bls.a;
        if (!bls.a(bljVar.b())) {
            return bef.i(f / bljVar.b());
        }
        blr b2 = bls.b(bljVar.b());
        if (b2 != null) {
            b = b2.a(f);
        } else {
            b = f / bljVar.b();
        }
        return bef.i(b);
    }
}
