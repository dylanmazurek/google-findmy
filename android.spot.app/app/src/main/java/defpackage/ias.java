package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ias {
    public final int a;
    private final boolean b;

    public ias() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ias)) {
            return false;
        }
        ias iasVar = (ias) obj;
        int i = this.a;
        int i2 = iasVar.a;
        if (i != 0) {
            if (i == i2 && this.b == iasVar.b) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a;
        a.N(i2);
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i2 ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "AdvertisedBeaconState{batteryLevel=" + hwx.c(this.a) + ", unwantedTrackingModeEnabled=" + this.b + "}";
    }

    public ias(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
