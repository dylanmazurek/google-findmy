package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibv {
    public final ihy a;
    public final fze b;
    private final int c;

    public ibv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibv) {
            ibv ibvVar = (ibv) obj;
            if (this.c == ibvVar.c && this.a.equals(ibvVar.a) && this.b.equals(ibvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.N(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                str = "E2EE_EID";
            } else {
                str = "ACCOUNT_KEY";
            }
        } else {
            str = "STATIC_UID";
        }
        ihy ihyVar = this.a;
        fze fzeVar = this.b;
        return "ScanResultWithMetadata{advertisedIdType=" + str + ", deviceOrComponentless=" + ihyVar.toString() + ", scanResult=" + fzeVar.toString() + "}";
    }

    public ibv(int i, ihy ihyVar, fze fzeVar) {
        this.c = i;
        if (ihyVar == null) {
            throw new NullPointerException("Null deviceOrComponentless");
        }
        this.a = ihyVar;
        this.b = fzeVar;
    }
}
