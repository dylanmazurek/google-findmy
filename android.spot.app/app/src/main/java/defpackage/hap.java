package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hap {
    public final String a;
    public final fpt b;
    public final String c;
    public final String d;
    public final String e;

    public hap() {
        throw null;
    }

    public static String a(jvv jvvVar, String str) {
        List b = jvvVar.b(str);
        if (b.size() != 1) {
            return null;
        }
        return (String) b.get(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hap) {
            hap hapVar = (hap) obj;
            if (this.a.equals(hapVar.a) && this.b.equals(hapVar.b) && this.c.equals(hapVar.c) && this.d.equals(hapVar.d) && this.e.equals(hapVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        fpt fptVar = this.b;
        if (fptVar.y()) {
            i = fptVar.i();
        } else {
            int i2 = fptVar.y;
            if (i2 == 0) {
                i2 = fptVar.i();
                fptVar.y = i2;
            }
            i = i2;
        }
        return (((((((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ValidCriticalAlertData{accountId=" + this.a + ", criticalAlertData=" + this.b.toString() + ", rfn=" + this.c + ", rfnc=" + this.d + ", securityEventId=" + this.e + "}";
    }

    public hap(String str, fpt fptVar, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null accountId");
        }
        this.a = str;
        if (fptVar != null) {
            this.b = fptVar;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            return;
        }
        throw new NullPointerException("Null criticalAlertData");
    }
}
