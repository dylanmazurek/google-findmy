package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hys {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final hyr f;

    public hys() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hys) {
            hys hysVar = (hys) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(hysVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(hysVar.b)) {
                    if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(hysVar.c)) {
                        if (Double.doubleToLongBits(this.d) == Double.doubleToLongBits(hysVar.d)) {
                            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(hysVar.e) && this.f.equals(hysVar.f)) {
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
        long doubleToLongBits = (Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = (Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = (Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = (Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e);
        int i = (int) doubleToLongBits;
        return this.f.hashCode() ^ ((((((((((i ^ 1000003) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003) ^ ((int) doubleToLongBits3)) * 1000003) ^ ((int) doubleToLongBits4)) * 1000003) ^ ((int) doubleToLongBits5)) * 1000003);
    }

    public final String toString() {
        return "FusionData{fusionRange=" + this.a + ", fusionRangeErrorStdDev=" + this.b + ", fusionBearing=" + this.c + ", fusionBearingErrorStdDev=" + this.d + ", fusionEstimatedBeaconPositionErrorStdDevM=" + this.e + ", arCoreState=" + String.valueOf(this.f) + "}";
    }

    public hys(double d, double d2, double d3, double d4, double d5, hyr hyrVar) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = hyrVar;
    }
}
