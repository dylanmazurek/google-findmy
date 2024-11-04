package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loq extends hzc {
    public final long c;

    public loq(long j) {
        super(null);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof loq) && this.c == ((loq) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.c);
    }

    public final String toString() {
        return "DeepLinkAndroidIdentifier(androidId=" + this.c + ")";
    }
}
