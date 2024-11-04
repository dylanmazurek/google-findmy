package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihd {
    public final lim a;

    public ihd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihd) {
            return this.a.equals(((ihd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SharingInvitationToken{byteString=" + this.a.toString() + "}";
    }

    public ihd(lim limVar) {
        this.a = limVar;
    }
}
