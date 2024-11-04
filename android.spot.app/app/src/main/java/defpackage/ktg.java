package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktg {
    public final String a;
    public final String b;

    public ktg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktg) {
            ktg ktgVar = (ktg) obj;
            if (this.a.equals(ktgVar.a) && this.b.equals(ktgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }

    public ktg(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }
}
