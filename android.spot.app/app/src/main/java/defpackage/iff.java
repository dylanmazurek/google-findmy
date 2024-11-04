package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iff {
    public final jer a;
    public final jer b;
    public final jer c;
    public final int d;

    public iff() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iff) {
            iff iffVar = (iff) obj;
            if (this.a.equals(iffVar.a) && this.b.equals(iffVar.b) && this.c.equals(iffVar.c)) {
                int i = this.d;
                int i2 = iffVar.d;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = this.d;
        a.N(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.d;
        jer jerVar = this.c;
        jer jerVar2 = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(jerVar2);
        String valueOf3 = String.valueOf(jerVar);
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "ACTIONABLE_STATUS";
            }
        } else {
            str = "OK";
        }
        return "ProximityData{rssi=" + valueOf + ", rangeMeters=" + valueOf2 + ", bearingRads=" + valueOf3 + ", precisionFindingStatus=" + str + "}";
    }

    public iff(jer jerVar, jer jerVar2, jer jerVar3, int i) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = jerVar3;
        this.d = i;
    }
}
