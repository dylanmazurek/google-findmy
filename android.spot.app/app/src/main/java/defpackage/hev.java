package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hev {
    public final String a;
    public final hdp b;
    public final hdp c;
    public final String d;

    public hev() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hev) {
            hev hevVar = (hev) obj;
            if (this.a.equals(hevVar.a) && this.b.equals(hevVar.b) && this.c.equals(hevVar.c) && this.d.equals(hevVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        hdp hdpVar = this.c;
        return "AccountMessagesResources{recommendedActions=" + this.a + ", yellowAlertIcon=" + String.valueOf(this.b) + ", shieldIcon=" + String.valueOf(hdpVar) + ", appPackageName=" + this.d + "}";
    }

    public hev(String str, hdp hdpVar, hdp hdpVar2, String str2) {
        this.a = str;
        this.b = hdpVar;
        this.c = hdpVar2;
        this.d = str2;
    }
}
