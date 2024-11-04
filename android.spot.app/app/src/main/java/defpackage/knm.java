package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knm {
    private final long a;
    private final long b;
    private final long c;

    public knm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knm) {
            knm knmVar = (knm) obj;
            if (this.a == knmVar.a && this.b == knmVar.b && this.c == knmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = j ^ (j >>> 32);
        long j4 = this.b;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }

    public knm(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
