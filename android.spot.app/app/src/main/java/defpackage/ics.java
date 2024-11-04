package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ics {
    public final lim a;
    private final icx b;

    public ics() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ics) {
            ics icsVar = (ics) obj;
            if (this.a.equals(icsVar.a) && this.b.equals(icsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        icx icxVar = this.b;
        return "ExecuteResult{result=" + String.valueOf(this.a) + ", protocolMajorVersion=" + String.valueOf(icxVar) + "}";
    }

    public ics(lim limVar, icx icxVar) {
        this.a = limVar;
        this.b = icxVar;
    }
}
