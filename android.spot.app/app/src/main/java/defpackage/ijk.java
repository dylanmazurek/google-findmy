package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijk {
    public final lim a;
    public final lim b;

    public ijk() {
        throw null;
    }

    public final ijd a() {
        return (ijd) new ijh().e(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ijk) {
            ijk ijkVar = (ijk) obj;
            if (this.a.equals(ijkVar.a) && this.b.equals(ijkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        lim limVar = this.b;
        return "AsymmetricKey{privateKey=" + String.valueOf(this.a) + ", publicKey=" + String.valueOf(limVar) + "}";
    }

    public ijk(lim limVar, lim limVar2) {
        this.a = limVar;
        this.b = limVar2;
    }
}
