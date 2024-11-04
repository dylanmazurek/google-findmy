package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igi implements Comparable {
    public final long a;
    public final ihy b;

    public igi() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((igi) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof igi) {
            igi igiVar = (igi) obj;
            if (this.a == igiVar.a && this.b.equals(igiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EidMetadata{timestrampSeconds=" + this.a + ", componentSetOrComponentless=" + this.b.toString() + "}";
    }

    public igi(long j, ihy ihyVar) {
        this.a = j;
        if (ihyVar == null) {
            throw new NullPointerException("Null componentSetOrComponentless");
        }
        this.b = ihyVar;
    }
}
