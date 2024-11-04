package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ve implements vg {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public ve(float f, float f2, float f3, float f4) {
        int e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            qz.f("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f4 - f2) * 3.0f;
        double d = f5;
        float f6 = (f2 + 0.0f) * 3.0f;
        double d2 = f6;
        double d3 = d + d;
        float f7 = (1.0f - f4) * 3.0f;
        double d4 = f7;
        double d5 = (d2 - d3) + d4;
        if (d5 == 0.0d) {
            e = d == d4 ? 0 : ja.e((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int e2 = ja.e((float) ((-(d6 + d7)) / d5), fArr, 0);
            e = ja.e((float) ((d6 - d7) / d5), fArr, e2) + e2;
            if (e > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    e = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f7 - f5;
        float f12 = f10 + f10;
        int e3 = e + ja.e((-f12) / ((f11 + f11) - f12), fArr, e);
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < e3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + 0.0f) * f13) + (((f4 - (f2 + f2)) + 0.0f) * 3.0f)) * f13) + f6) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long k = a.k(min, max);
        this.e = Float.intBitsToFloat((int) (k >> 32));
        this.f = Float.intBitsToFloat((int) (k & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e8, code lost:            if (r2 >= (-8.34465E-7f)) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f6, code lost:            if (r2 <= 1.0000008f) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0218, code lost:            if (r2 >= (-8.34465E-7f)) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0227, code lost:            if (r2 <= 1.0000008f) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:            if (r2 >= (-8.34465E-7f)) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x021a, code lost:            r2 = 0.0f;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:            if (r2 <= 1.0000008f) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0229, code lost:            r2 = 1.0f;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:            if (r2 >= (-8.34465E-7f)) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:            if (r2 <= 1.0000008f) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019d, code lost:            if (r2 >= (-8.34465E-7f)) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:            if (r2 <= 1.0000008f) goto L125;     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187  */
    @Override // defpackage.vg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r26) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ve) {
            ve veVar = (ve) obj;
            if (this.a == veVar.a && this.b == veVar.b && this.c == veVar.c && this.d == veVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
