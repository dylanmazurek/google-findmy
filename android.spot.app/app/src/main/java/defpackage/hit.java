package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hit {
    public final String a;
    public final String b;
    public final boolean c;
    private final String d;
    private final String e;

    public hit() {
        throw null;
    }

    public static hit a(Object obj) {
        String str;
        boolean z;
        String aj = frx.aj(obj);
        String ak = frx.ak(obj);
        String am = frx.am(obj);
        str = ((hfl) obj).g;
        z = ((hfl) obj).a;
        return new hit(aj, ak, am, str, z);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hit) {
            hit hitVar = (hit) obj;
            if (this.d.equals(hitVar.d) && this.a.equals(hitVar.a) && ((str = this.b) != null ? str.equals(hitVar.b) : hitVar.b == null) && ((str2 = this.e) != null ? str2.equals(hitVar.e) : hitVar.e == null) && this.c == hitVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = 1231;
        int i4 = (((i2 ^ i) * 1000003) ^ 1231) * 1000003;
        if (true != this.c) {
            i3 = 1237;
        }
        return i4 ^ i3;
    }

    public final String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.d + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.e + ", isGaiaAccount=true, isMetadataAvailable=" + this.c + "}";
    }

    public hit(String str, String str2, String str3, String str4, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.d = str;
        if (str2 != null) {
            this.a = str2;
            this.b = str3;
            this.e = str4;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null accountName");
    }
}
