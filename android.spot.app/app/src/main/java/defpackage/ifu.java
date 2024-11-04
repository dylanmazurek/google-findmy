package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifu {
    public final int a;
    public final lim b;
    public final lim c;

    protected ifu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ifu) {
            ifu ifuVar = (ifu) obj;
            if (this.a == ifuVar.a && this.b.equals(ifuVar.b) && this.c.equals(ifuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        lim limVar = this.c;
        return "FastpairField{type=" + this.a + ", data=" + String.valueOf(this.b) + ", headerAndData=" + String.valueOf(limVar) + "}";
    }

    public ifu(int i, lim limVar, lim limVar2) {
        this.a = i;
        this.b = limVar;
        this.c = limVar2;
    }
}
