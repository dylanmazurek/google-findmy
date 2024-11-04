package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvx {
    public static final joo a = joo.m("GnpSdk");
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Boolean f;
    public final Boolean g;

    public gvx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gvx) {
            gvx gvxVar = (gvx) obj;
            if (this.b.equals(gvxVar.b) && ((str = this.c) != null ? str.equals(gvxVar.c) : gvxVar.c == null) && this.d.equals(gvxVar.d) && this.e.equals(gvxVar.e) && this.f.equals(gvxVar.f) && this.g.equals(gvxVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() ^ 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "GnpMedia{url=" + this.b + ", accountName=" + this.c + ", width=" + this.d + ", height=" + this.e + ", shouldAuthenticateFifeUrls=" + this.f + ", shouldApplyFifeOptions=" + this.g + "}";
    }

    public gvx(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = bool;
        this.g = bool2;
    }
}
