package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyz {
    public final hyh a;
    public final double b;
    public final long c;
    private final int d;

    public hyz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyz) {
            hyz hyzVar = (hyz) obj;
            if (this.a.equals(hyzVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(hyzVar.b) && this.d == hyzVar.d && this.c == hyzVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long doubleToLongBits = (Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b);
        long j = this.c;
        return (((((hashCode * 1000003) ^ ((int) doubleToLongBits)) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RangingData{rangingTechnology=" + String.valueOf(this.a) + ", rangeDistance=" + this.b + ", rssi=" + this.d + ", timestamp=" + this.c + "}";
    }

    public hyz(hyh hyhVar, double d, int i, long j) {
        this.a = hyhVar;
        this.b = d;
        this.d = i;
        this.c = j;
    }
}
