package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqg {
    public final jer a;

    public eqg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqg) {
            return this.a.equals(((eqg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ContactInfoUpdateStatus{contactInfo=" + this.a.toString() + "}";
    }

    public eqg(jer jerVar) {
        this.a = jerVar;
    }
}
