package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hil {
    private final hog a;

    public hil() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hil) {
            return this.a.equals(((hil) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogoViewFeature{logoViewInflater=" + this.a.toString() + "}";
    }

    public hil(hog hogVar) {
        this.a = hogVar;
    }
}
