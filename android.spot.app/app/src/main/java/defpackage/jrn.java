package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrn implements Serializable {
    private final double a;
    private final double b;

    private jrn(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public static jrn a(int i, int i2) {
        return new jrn(jrk.a(i).b, jrk.a(i2).b);
    }

    public final jro b() {
        double d = this.a;
        double cos = Math.cos(d);
        double d2 = this.b;
        return new jro(Math.cos(d2) * cos, cos * Math.sin(d2), Math.sin(d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jrn) {
            jrn jrnVar = (jrn) obj;
            if (this.a == jrnVar.a && this.b == jrnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public jrn() {
        this(0.0d, 0.0d);
    }
}
