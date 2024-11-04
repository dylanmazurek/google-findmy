package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iau {
    public final lim a;
    public final byte b;

    public iau() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iau) {
            iau iauVar = (iau) obj;
            if (this.a.equals(iauVar.a) && this.b == iauVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "EidAndHashedFlagsMask{eid=" + String.valueOf(this.a) + ", hashedFlagMask=" + ((int) this.b) + "}";
    }

    public iau(lim limVar, byte b) {
        this.a = limVar;
        this.b = b;
    }
}
