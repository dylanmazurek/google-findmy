package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lot extends hzc {
    public final lim c;

    public lot(lim limVar) {
        super(null);
        this.c = limVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lot) && amr.i(this.c, ((lot) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DeepLinkLegacyFmaIdentifier(accountKey=" + this.c + ")";
    }
}
