package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kug {
    public final String a;

    public kug() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof kug) && this.a.equals(((kug) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    public kug(String str) {
        this.a = str;
    }
}
