package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jro implements Comparable, Serializable {
    public static final jro a = new jro(0.0d, 0.0d, 0.0d);
    public final double b;
    public final double c;
    public final double d;

    public jro(double d, double d2, double d3) {
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public static final jro c(jro jroVar, jro jroVar2) {
        double d = jroVar.d;
        double d2 = jroVar2.d;
        return new jro(jroVar.b + jroVar2.b, jroVar.c + jroVar2.c, d + d2);
    }

    public static final jro d(jro jroVar, jro jroVar2) {
        double d = jroVar.c;
        double d2 = jroVar2.d;
        double d3 = d * d2;
        double d4 = jroVar.d;
        double d5 = jroVar2.c;
        double d6 = d4 * d5;
        double d7 = jroVar2.b;
        double d8 = d4 * d7;
        double d9 = jroVar.b;
        return new jro(d3 - d6, d8 - (d2 * d9), (d9 * d5) - (d * d7));
    }

    public static final jro e(jro jroVar, double d) {
        double d2 = jroVar.d;
        return new jro(d * jroVar.b, d * jroVar.c, d * d2);
    }

    public static final jro f(jro jroVar) {
        double sqrt = Math.sqrt(jroVar.b());
        if (sqrt != 0.0d) {
            sqrt = 1.0d / sqrt;
        }
        return e(jroVar, sqrt);
    }

    public static final jro g(jro jroVar, jro jroVar2) {
        double d = jroVar.d;
        double d2 = jroVar2.d;
        return new jro(jroVar.b - jroVar2.b, jroVar.c - jroVar2.c, d - d2);
    }

    public final double a(jro jroVar) {
        double d = this.d;
        double d2 = jroVar.d;
        return (this.b * jroVar.b) + (this.c * jroVar.c) + (d * d2);
    }

    public final double b() {
        double d = this.d;
        double d2 = this.c;
        double d3 = this.b;
        return (d3 * d3) + (d2 * d2) + (d * d);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jro jroVar = (jro) obj;
        if (i(jroVar)) {
            return -1;
        }
        if (!h(jroVar)) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jro)) {
            return false;
        }
        jro jroVar = (jro) obj;
        if (this.b != jroVar.b || this.c != jroVar.c || this.d != jroVar.d) {
            return false;
        }
        return true;
    }

    public final boolean h(jro jroVar) {
        if (this.b == jroVar.b && this.c == jroVar.c && this.d == jroVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.b)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.c));
        long doubleToLongBits3 = doubleToLongBits2 + (37 * doubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.d));
        return (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
    }

    public final boolean i(jro jroVar) {
        double d = this.b;
        double d2 = jroVar.b;
        if (d < d2) {
            return true;
        }
        if (d2 < d) {
            return false;
        }
        double d3 = this.c;
        double d4 = jroVar.c;
        if (d3 < d4) {
            return true;
        }
        if (d4 >= d3 && this.d < jroVar.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "(" + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public jro() {
        this(0.0d, 0.0d, 0.0d);
    }
}
