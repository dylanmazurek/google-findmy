package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asg {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    private final double f = 0.0d;
    private final double g = 0.0d;

    public /* synthetic */ asg(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(0.0d) && !Double.isNaN(0.0d) && !Double.isNaN(d)) {
            if (d5 >= 0.0d && d5 <= 1.0d) {
                if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
                    throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
                }
                if (d5 >= 1.0d && d4 == 0.0d) {
                    throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
                }
                if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                    throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                }
                if (d4 >= 0.0d) {
                    if (d2 >= 0.0d && d >= 0.0d) {
                        return;
                    } else {
                        throw new IllegalArgumentException("The transfer function must be positive or increasing");
                    }
                }
                throw new IllegalArgumentException("The transfer function must be increasing");
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        throw new IllegalArgumentException("Parameters cannot be NaN");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asg)) {
            return false;
        }
        asg asgVar = (asg) obj;
        if (Double.compare(this.a, asgVar.a) != 0 || Double.compare(this.b, asgVar.b) != 0 || Double.compare(this.c, asgVar.c) != 0 || Double.compare(this.d, asgVar.d) != 0 || Double.compare(this.e, asgVar.e) != 0) {
            return false;
        }
        double d = asgVar.f;
        if (Double.compare(0.0d, 0.0d) != 0) {
            return false;
        }
        double d2 = asgVar.g;
        if (Double.compare(0.0d, 0.0d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((ku.c(this.a) * 31) + ku.c(this.b)) * 31) + ku.c(this.c)) * 31) + ku.c(this.d)) * 31) + ku.c(this.e)) * 31) + ku.c(0.0d)) * 31) + ku.c(0.0d);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=0.0, f=0.0)";
    }
}
