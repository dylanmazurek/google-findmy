package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifq {
    public final jer a;
    private final boolean b;

    public ifq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ifq) {
            ifq ifqVar = (ifq) obj;
            if (this.b == ifqVar.b && this.a.equals(ifqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "RingingCapabilities{hasButton=" + this.b + ", maxTimeoutMillis=" + String.valueOf(this.a) + "}";
    }

    public ifq(boolean z, jer jerVar) {
        this.b = z;
        this.a = jerVar;
    }
}
