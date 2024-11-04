package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyc {
    public final int a;
    public final double b;
    public final double c;
    private final int d;
    private final double e;
    private final double f;
    private final long g;

    public hyc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyc) {
            hyc hycVar = (hyc) obj;
            if (this.a == hycVar.a && this.d == hycVar.d) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(hycVar.b)) {
                    if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(hycVar.e)) {
                        if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(hycVar.c)) {
                            if (Double.doubleToLongBits(this.f) == Double.doubleToLongBits(hycVar.f) && this.g == hycVar.g) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e);
        long doubleToLongBits3 = (Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = (Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f);
        int i = this.a;
        long j = this.g;
        return ((((((((((((i ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ ((int) doubleToLongBits)) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003) ^ ((int) doubleToLongBits3)) * 1000003) ^ ((int) doubleToLongBits4)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PrecisionFindingEstimate{estimateLevel=" + this.a + ", arCoreState=" + this.d + ", rangeM=" + this.b + ", rangeErrorStdDevM=" + this.e + ", bearingRad=" + this.c + ", bearingErrorStdDevRad=" + this.f + ", timestampMs=" + this.g + "}";
    }

    public hyc(int i, int i2, double d, double d2, double d3, double d4, long j) {
        this.a = i;
        this.d = i2;
        this.b = d;
        this.e = d2;
        this.c = d3;
        this.f = d4;
        this.g = j;
    }
}
