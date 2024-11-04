package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vd {
    public double a;
    public double b;

    public vd(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        if (Double.compare(this.a, vdVar.a) == 0 && Double.compare(this.b, vdVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (qn.c(this.a) * 31) + qn.c(this.b);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
