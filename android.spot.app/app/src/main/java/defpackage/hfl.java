package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfl {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    private final String i;
    private final int j;

    public hfl() {
        throw null;
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
        if (obj instanceof hfl) {
            hfl hflVar = (hfl) obj;
            if (this.a == hflVar.a && ((str = this.b) != null ? str.equals(hflVar.b) : hflVar.b == null) && this.c.equals(hflVar.c) && ((str2 = this.d) != null ? str2.equals(hflVar.d) : hflVar.d == null) && ((str3 = this.e) != null ? str3.equals(hflVar.e) : hflVar.e == null) && this.f == hflVar.f) {
                int i = this.j;
                int i2 = hflVar.j;
                if (i != 0) {
                    if (i == i2 && ((str4 = this.i) != null ? str4.equals(hflVar.i) : hflVar.i == null) && ((str5 = this.g) != null ? str5.equals(hflVar.g) : hflVar.g == null)) {
                        int i3 = this.h;
                        int i4 = hflVar.h;
                        if (i3 != 0) {
                            if (i3 == i4) {
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode5 = ((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = ((hashCode5 * 1000003) ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        if (true == this.f) {
            i3 = 1231;
        }
        int i6 = this.j;
        a.V(i6);
        int i7 = (((i5 ^ i3) * 1000003) ^ i6) * 1000003;
        String str4 = this.i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i8 = (i7 ^ hashCode4) * 1000003;
        String str5 = this.g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        int i9 = (i8 ^ i2) * 1000003;
        int i10 = this.h;
        a.V(i10);
        return i9 ^ i10;
    }

    public final String toString() {
        return "DeviceOwner{isMetadataAvailable=" + this.a + ", displayName=" + this.b + ", accountName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", isG1User=" + this.f + ", isDasherUser=" + frx.aA(this.j) + ", obfuscatedGaiaId=" + this.i + ", avatarUrl=" + this.g + ", isUnicornUser=" + frx.aA(this.h) + "}";
    }

    public hfl(boolean z, String str, String str2, String str3, String str4, boolean z2, int i, String str5, String str6, int i2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.j = i;
        this.i = str5;
        this.g = str6;
        this.h = i2;
    }
}
