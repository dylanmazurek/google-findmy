package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lov extends hzc {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lov(String str) {
        super(null);
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lov) && amr.i(this.c, ((lov) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DeepLinkSpotIdentifier(canonicDeviceId=" + this.c + ")";
    }
}
