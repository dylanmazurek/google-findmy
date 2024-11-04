package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyi {
    public final jis a;

    public hyi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyi) {
            return hzc.L(this.a, ((hyi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CapabilityRequestMessage{requestedRangingTechnologies=" + String.valueOf(this.a) + "}";
    }

    public hyi(jis jisVar) {
        this.a = jisVar;
    }
}
