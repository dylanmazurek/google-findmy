package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq {
    public final long a;

    public final boolean equals(Object obj) {
        if ((obj instanceof blq) && this.a == ((blq) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (a.n(j, 0L)) {
            return "Unspecified";
        }
        if (a.n(j, 4294967296L)) {
            return "Sp";
        }
        if (a.n(j, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }
}
