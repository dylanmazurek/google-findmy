package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kut {
    public final kus a;
    public final String b;
    public final boolean c;

    public kut() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kut) {
            kut kutVar = (kut) obj;
            if (this.a.equals(kutVar.a) && ((str = this.b) != null ? str.equals(kutVar.b) : kutVar.b == null) && this.c == kutVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "RpcServiceState{rpcServiceInfo=" + this.a.toString() + ", override=" + this.b + ", isUsingSystemProperty=" + this.c + "}";
    }

    public kut(kus kusVar, String str, boolean z) {
        if (kusVar == null) {
            throw new NullPointerException("Null rpcServiceInfo");
        }
        this.a = kusVar;
        this.b = str;
        this.c = z;
    }
}
