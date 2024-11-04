package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrk implements Comparable, Serializable {
    public static final jrk a = new jrk(Double.POSITIVE_INFINITY);
    public final double b;

    public jrk(double d) {
        this.b = d;
    }

    public static jrk a(int i) {
        return new jrk(i * 1.0E-7d * 0.017453292519943295d);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d = ((jrk) obj).b;
        double d2 = this.b;
        if (d2 < d) {
            return -1;
        }
        if (d2 <= d) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jrk) || this.b != ((jrk) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return (this.b * 57.29577951308232d) + "d";
    }

    public jrk() {
        this(0.0d);
    }
}
