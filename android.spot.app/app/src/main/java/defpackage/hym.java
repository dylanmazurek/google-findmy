package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hym {
    public final jis a;

    public hym() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hym) {
            return hzc.L(this.a, ((hym) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StatusResponseMessage{successfulRangingTechnologies=" + String.valueOf(this.a) + "}";
    }

    public hym(jis jisVar) {
        this.a = jisVar;
    }
}
