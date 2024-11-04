package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpw {
    public final jra a;
    public final String b;

    public jpw(jra jraVar, String str) {
        jraVar.getClass();
        this.a = jraVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpw) {
            jpw jpwVar = (jpw) obj;
            if (this.a.equals(jpwVar.a) && this.b.equals(jpwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
