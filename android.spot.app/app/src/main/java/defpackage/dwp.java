package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwp {
    public final jer a;
    public final jer b;

    public dwp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwp) {
            dwp dwpVar = (dwp) obj;
            if (this.a.equals(dwpVar.a) && this.b.equals(dwpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        jer jerVar = this.b;
        return "BugAdditionalInformation{titlePrefix=" + this.a.toString() + ", hotlistId=" + jerVar.toString() + "}";
    }

    public dwp(jer jerVar, jer jerVar2) {
        this.a = jerVar;
        this.b = jerVar2;
    }
}
