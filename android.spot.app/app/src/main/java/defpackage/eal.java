package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eal {
    public final String a;
    public final int b;

    public eal() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eal) {
            eal ealVar = (eal) obj;
            if (this.a.equals(ealVar.a) && this.b == ealVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "CellularConnectivityInfo{carrierName=" + this.a + ", signalStrength=" + this.b + "}";
    }

    public eal(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null carrierName");
        }
        this.a = str;
        this.b = i;
    }
}
