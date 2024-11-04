package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hus {
    public final String a;
    public final String b;

    public hus() {
        throw null;
    }

    public final String a() {
        return this.a + "#null#" + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hus) {
            hus husVar = (hus) obj;
            if (this.a.equals(husVar.a)) {
                String str = this.b;
                String str2 = husVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * (-721379959)) ^ hashCode;
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", moduleName=null, instanceId=" + this.b + "}";
    }

    public hus(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = str2;
    }
}
