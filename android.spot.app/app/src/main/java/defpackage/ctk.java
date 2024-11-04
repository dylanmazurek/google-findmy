package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ctk(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctk)) {
            return false;
        }
        ctk ctkVar = (ctk) obj;
        if (this.a == ctkVar.a && this.b == ctkVar.b && this.c == ctkVar.c && this.d == ctkVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = a.i(this.a);
        boolean z = this.d;
        return (((((i * 31) + a.i(this.b)) * 31) + a.i(this.c)) * 31) + a.i(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
