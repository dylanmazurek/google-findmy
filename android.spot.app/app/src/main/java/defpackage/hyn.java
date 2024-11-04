package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyn {
    public final jis a;

    public hyn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyn) {
            return hzc.L(this.a, ((hyn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StopRangingMessage{rangingTechnologiesToStop=" + String.valueOf(this.a) + "}";
    }

    public hyn(jis jisVar) {
        this.a = jisVar;
    }
}
