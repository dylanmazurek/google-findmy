package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icr {
    public final ico a;
    public final jer b;
    public final jer c;
    public final jer d;

    public icr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icr) {
            icr icrVar = (icr) obj;
            if (this.a.equals(icrVar.a) && this.b.equals(icrVar.b) && this.c.equals(icrVar.c) && this.d.equals(icrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        jer jerVar = this.d;
        jer jerVar2 = this.c;
        jer jerVar3 = this.b;
        return "ExecuteRequest{dataId=" + String.valueOf(this.a) + ", authenticationKey=" + String.valueOf(jerVar3) + ", protocolMajorVersion=" + String.valueOf(jerVar2) + ", nonce=" + String.valueOf(jerVar) + "}";
    }

    public icr(ico icoVar, jer jerVar, jer jerVar2, jer jerVar3) {
        this.a = icoVar;
        this.b = jerVar;
        this.c = jerVar2;
        this.d = jerVar3;
    }
}
