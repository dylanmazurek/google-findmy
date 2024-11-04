package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibl {
    public final jer a;
    private final jer b;

    public ibl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibl) {
            ibl iblVar = (ibl) obj;
            if (this.a.equals(iblVar.a) && this.b.equals(iblVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.b;
        return "DeviceKeys{ringKey=" + String.valueOf(this.a) + ", accountKey=" + String.valueOf(jerVar) + "}";
    }

    public ibl(jer jerVar, jer jerVar2) {
        this.a = jerVar;
        this.b = jerVar2;
    }
}
