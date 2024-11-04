package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eak {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public eak() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eak) {
            eak eakVar = (eak) obj;
            if (this.a.equals(eakVar.a) && this.b == eakVar.b && this.c.equals(eakVar.c) && this.d == eakVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "BatteryInfo{batteryLevelText=" + this.a + ", batteryImageResourceId=" + this.b + ", batteryLevelDescription=" + this.c + ", errorColor=" + this.d + "}";
    }

    public eak(String str, int i, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }
}
