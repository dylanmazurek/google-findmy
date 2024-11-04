package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjw {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final int i;
    public final int j;
    private final String k;
    private final int l;

    public hjw() {
        throw null;
    }

    public static hjv a() {
        hjv hjvVar = new hjv();
        hjvVar.c(false);
        hjvVar.e(1);
        hjvVar.d(true);
        hjvVar.h = 1;
        hjvVar.g = 1;
        return hjvVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hjw) {
            hjw hjwVar = (hjw) obj;
            if (this.a.equals(hjwVar.a) && this.b == hjwVar.b && ((str = this.c) != null ? str.equals(hjwVar.c) : hjwVar.c == null) && ((str2 = this.d) != null ? str2.equals(hjwVar.d) : hjwVar.d == null) && ((str3 = this.e) != null ? str3.equals(hjwVar.e) : hjwVar.e == null) && ((str4 = this.f) != null ? str4.equals(hjwVar.f) : hjwVar.f == null) && this.g == hjwVar.g) {
                int i = this.i;
                int i2 = hjwVar.i;
                if (i != 0) {
                    if (i == i2) {
                        int i3 = this.j;
                        int i4 = hjwVar.j;
                        if (i3 != 0) {
                            if (i3 == i4 && ((str5 = this.h) != null ? str5.equals(hjwVar.h) : hjwVar.h == null) && ((str6 = this.k) != null ? str6.equals(hjwVar.k) : hjwVar.k == null)) {
                                int i5 = this.l;
                                int i6 = hjwVar.l;
                                if (i5 != 0) {
                                    if (i5 == i6) {
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
        int hashCode5;
        int hashCode6 = this.a.hashCode() ^ 1000003;
        String str = this.c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((((hashCode6 * 1000003) ^ i) * 1000003) ^ hashCode) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 ^ hashCode3) * 1000003;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 ^ hashCode4) * 1000003;
        if (true == this.g) {
            i3 = 1231;
        }
        int i8 = this.i;
        a.V(i8);
        int i9 = (((i7 ^ i3) * 1000003) ^ i8) * 1000003;
        int i10 = this.j;
        a.V(i10);
        int i11 = (i9 ^ i10) * 1000003;
        String str5 = this.h;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        String str6 = this.k;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i13 = this.l;
        a.N(i13);
        return ((i12 ^ i2) * 1000003) ^ i13;
    }

    public final String toString() {
        String str;
        int i = this.l;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "TWENTY_ONE_OR_OLDER";
                    }
                } else {
                    str = "EIGHTEEN_TO_TWENTY";
                }
            } else {
                str = "LESS_THAN_EIGHTEEN";
            }
        } else {
            str = "UNKNOWN";
        }
        int i2 = this.j;
        int i3 = this.i;
        String str2 = this.k;
        String str3 = this.h;
        boolean z = this.g;
        String str4 = this.f;
        String str5 = this.e;
        String str6 = this.d;
        String str7 = this.c;
        boolean z2 = this.b;
        return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + z2 + ", displayName=" + str7 + ", givenName=" + str6 + ", familyName=" + str5 + ", obfuscatedGaiaId=" + str4 + ", isG1User=" + z + ", isDasherUser=" + hog.D(i3) + ", isUnicornUser=" + hog.D(i2) + ", avatarUrl=" + str3 + ", defaultAvatarUrl=" + str2 + ", ageRange=" + str + "}";
    }

    public hjw(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, int i, int i2, String str6, String str7, int i3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.i = i;
        this.j = i2;
        this.h = str6;
        this.k = str7;
        this.l = i3;
    }
}
