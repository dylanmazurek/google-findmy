package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krh {
    public final String a;
    private final long b;
    private final long c;

    public krh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krh) {
            krh krhVar = (krh) obj;
            if (this.a.equals(krhVar.a) && this.b == krhVar.b && this.c == krhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = j ^ (j >>> 32);
        long j3 = this.b;
        return (((hashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public krh(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
