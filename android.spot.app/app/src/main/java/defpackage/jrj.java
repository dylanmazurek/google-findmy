package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrj extends Number {
    private static final double a;
    private static final long serialVersionUID = 1;
    private final double[] b;

    static {
        double d = 1.0d;
        do {
            d *= 0.5d;
        } while (d + 1.0d != 1.0d);
        a = (1 << ((((int) Math.round((-Math.log(d)) / Math.log(2.0d))) + 1) / 2)) + 1;
    }

    private jrj(double... dArr) {
        this.b = dArr;
    }

    public static jrj a(double d, double d2) {
        boolean z;
        boolean z2;
        boolean z3;
        double c = c(d2);
        double d3 = d2 - c;
        double c2 = c(d);
        double d4 = d - c2;
        double d5 = c2 * c;
        double d6 = c * d4;
        double d7 = c2 * d3;
        double d8 = d4 * d3;
        double d9 = d * d2;
        double d10 = d8 - (((d9 - d5) - d6) - d7);
        if (d10 == a) {
            if (d != d9 && d2 != d9) {
                z = false;
            } else {
                z = true;
            }
            if (d != 1.0d && d2 != 1.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (d != a && d2 != a) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z || !z2 ? !(!z3 || d9 != a) : z3) {
                throw new ArithmeticException("twoProductError underflowed");
            }
        }
        return new jrj(d10, d9);
    }

    private static double c(double d) {
        double d2 = a * d;
        return d2 - (d2 - d);
    }

    private static double d(double d, double d2, double d3) {
        double d4 = d3 - d;
        return (d - (d3 - d4)) + (d2 - d4);
    }

    private static boolean e(double d, double d2) {
        boolean z;
        boolean z2;
        if (d2 <= d) {
            z = false;
        } else {
            z = true;
        }
        if (d2 <= (-d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jrj b(defpackage.jrj r24) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrj.b(jrj):jrj");
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        double[] dArr = this.b;
        double d = a;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return Math.round(doubleValue());
    }

    public final String toString() {
        return Double.toString(doubleValue());
    }
}
