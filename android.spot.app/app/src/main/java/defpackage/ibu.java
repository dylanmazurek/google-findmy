package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibu {
    public final ihy a;
    public final idt b;

    public ibu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibu) {
            ibu ibuVar = (ibu) obj;
            if (this.b.equals(ibuVar.b) && this.a.equals(ibuVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        ihy ihyVar = this.a;
        return "GattClientWithMetadata{gattClient=" + this.b.toString() + ", deviceOrComponentless=" + ihyVar.toString() + "}";
    }

    public ibu(idt idtVar, ihy ihyVar) {
        if (idtVar == null) {
            throw new NullPointerException("Null gattClient");
        }
        this.b = idtVar;
        this.a = ihyVar;
    }
}
