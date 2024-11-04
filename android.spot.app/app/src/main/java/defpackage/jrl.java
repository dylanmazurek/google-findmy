package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrl implements Comparable, Serializable {
    public static final jrl a;
    public static final jrl b;
    public static final jrl c;
    public static final jrl d;
    public final double e;

    static {
        double d2 = jrm.a;
        a = new jrl(0.0d);
        new jrl(2.0d);
        b = new jrl(4.0d);
        c = new jrl(Double.POSITIVE_INFINITY);
        d = new jrl(-1.0d);
    }

    private jrl(double d2) {
        this.e = d2;
        if (d()) {
            return;
        }
        throw new IllegalArgumentException("Invalid length2: " + d2);
    }

    public static jrl a(double d2) {
        jrk jrkVar = new jrk(d2);
        if (jrkVar.b < 0.0d) {
            return d;
        }
        if (jrkVar.equals(jrk.a)) {
            return c;
        }
        double sin = Math.sin(Math.min(3.141592653589793d, jrkVar.b) * 0.5d);
        double d3 = sin + sin;
        return new jrl(d3 * d3);
    }

    public final boolean b() {
        if (this.e == Double.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.e < 0.0d) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.e, ((jrl) obj).e);
    }

    public final boolean d() {
        double d2 = this.e;
        if ((d2 < 0.0d || d2 > 4.0d) && !c() && !b()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jrl) && this.e == ((jrl) obj).e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.e;
        if (d2 == 0.0d) {
            return 0;
        }
        return Double.valueOf(d2).hashCode();
    }

    public final String toString() {
        jrk jrkVar;
        double d2 = d.e;
        double d3 = this.e;
        if (d3 == d2) {
            return "NEGATIVE";
        }
        if (d3 == a.e) {
            return "ZERO";
        }
        if (d3 == b.e) {
            return "STRAIGHT";
        }
        if (d3 != c.e) {
            if (c()) {
                jrkVar = new jrk(-1.0d);
            } else if (b()) {
                jrkVar = jrk.a;
            } else {
                double asin = Math.asin(Math.sqrt(d3) * 0.5d);
                jrkVar = new jrk(asin + asin);
            }
            return jrkVar.toString();
        }
        return "INFINITY";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jrl(defpackage.jro r9, defpackage.jro r10) {
        /*
            r8 = this;
            double r0 = r9.b
            double r2 = r10.b
            double r0 = r0 - r2
            double r2 = r9.c
            double r4 = r10.c
            double r2 = r2 - r4
            double r4 = r9.d
            double r6 = r10.d
            double r4 = r4 - r6
            double r0 = r0 * r0
            double r2 = r2 * r2
            double r0 = r0 + r2
            double r4 = r4 * r4
            double r0 = r0 + r4
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = java.lang.Math.min(r2, r0)
            r8.<init>(r0)
            boolean r9 = defpackage.jrm.a(r9)
            defpackage.hwx.J(r9)
            boolean r9 = defpackage.jrm.a(r10)
            defpackage.hwx.J(r9)
            boolean r9 = r8.d()
            defpackage.hwx.J(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrl.<init>(jro, jro):void");
    }
}
