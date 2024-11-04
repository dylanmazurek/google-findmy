package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzc {
    public final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final gyz h;

    public gzc() {
        throw null;
    }

    public static gzc a(Object obj) {
        String str;
        String str2;
        boolean z;
        if (obj != null) {
            String ak = frx.ak(obj);
            String am = frx.am(obj);
            str = ((hfl) obj).d;
            String str3 = ((hfl) obj).e;
            str2 = ((hfl) obj).g;
            z = ((hfl) obj).a;
            return new gzc(obj, ak, am, str, str3, str2, z, frx.an(obj));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gzc) {
            gzc gzcVar = (gzc) obj;
            if (this.a.equals(gzcVar.a) && ((str = this.b) != null ? str.equals(gzcVar.b) : gzcVar.b == null) && ((str2 = this.c) != null ? str2.equals(gzcVar.c) : gzcVar.c == null) && ((str3 = this.d) != null ? str3.equals(gzcVar.d) : gzcVar.d == null) && ((str4 = this.e) != null ? str4.equals(gzcVar.e) : gzcVar.e == null) && ((str5 = this.f) != null ? str5.equals(gzcVar.f) : gzcVar.f == null) && this.g == gzcVar.g && this.h.equals(gzcVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i;
        int hashCode5 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = ((hashCode5 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        String str5 = this.f;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i7 ^ i) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        gyz gyzVar = this.h;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=" + this.g + ", gaiaAccountData=" + gyzVar.toString() + "}";
    }

    public gzc(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, gyz gyzVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = gyzVar;
    }
}
