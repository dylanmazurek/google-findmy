package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcr {
    public final hcq a;

    public hcr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcr) {
            return this.a.equals(((hcr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CardRetrieverWrapper{cardRetriever=" + this.a.toString() + "}";
    }

    public hcr(hcq hcqVar) {
        this.a = hcqVar;
    }
}
