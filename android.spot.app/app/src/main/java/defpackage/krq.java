package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krq {
    public final String a;
    public final String b;
    public final krt c;
    public final int d;
    private final String e;

    public krq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krq) {
            krq krqVar = (krq) obj;
            String str = this.e;
            if (str != null ? str.equals(krqVar.e) : krqVar.e == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(krqVar.a) : krqVar.a == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(krqVar.b) : krqVar.b == null) {
                        krt krtVar = this.c;
                        if (krtVar != null ? krtVar.equals(krqVar.c) : krqVar.c == null) {
                            int i = this.d;
                            int i2 = krqVar.d;
                            if (i != 0 ? i == i2 : i2 == 0) {
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.a;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.b;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        krt krtVar = this.c;
        if (krtVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = krtVar.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        int i5 = this.d;
        if (i5 != 0) {
            a.N(i5);
            i = i5;
        }
        return i4 ^ i;
    }

    public final String toString() {
        String str;
        int i = this.d;
        String valueOf = String.valueOf(this.c);
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        String str2 = this.b;
        String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + valueOf + ", responseCode=" + str + "}";
    }

    public krq(String str, String str2, String str3, krt krtVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = krtVar;
        this.d = i;
    }
}
