package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrm {
    public static final double a;
    public static final double b;
    public static final jrk c;
    public static final double d;
    public static final jro[] e;

    static {
        double d2;
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        a = Math.sqrt(3.0d);
        double d3 = 1.0d;
        do {
            d3 /= 2.0d;
            d2 = d3 / 2.0d;
        } while (d2 + 1.0d != 1.0d);
        b = d3;
        jrk jrkVar = new jrk(8.0d * d2);
        c = jrkVar;
        double d4 = jrkVar.b / d2;
        double d5 = a;
        d = ((d5 * 32.0d) * d2) / (d4 - ((d5 + d5) + 1.0d));
        e = new jro[]{new jro(1.0d, 0.0053d, 0.00457d), new jro(0.012d, 1.0d, 0.00457d), new jro(0.012d, 0.0053d, 1.0d)};
    }

    public static boolean a(jro jroVar) {
        if (Math.abs(jroVar.b() - 1.0d) <= b * 5.0d) {
            return true;
        }
        return false;
    }
}
