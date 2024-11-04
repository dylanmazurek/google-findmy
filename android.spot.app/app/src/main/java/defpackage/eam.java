package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eam {
    public final String a;
    public final int b;

    public eam() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eam) {
            eam eamVar = (eam) obj;
            if (this.a.equals(eamVar.a) && this.b == eamVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "WifiConnectivityInfo{ssid=" + this.a + ", signalStrength=" + this.b + "}";
    }

    public eam(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null ssid");
        }
        this.a = str;
        this.b = i;
    }
}
