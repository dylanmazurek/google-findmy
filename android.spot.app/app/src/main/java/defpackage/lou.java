package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lou extends hzc {
    public final String c;

    public lou(String str) {
        super(null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lou) && amr.i(this.c, ((lou) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DeepLinkSpotFmaIdentifier(canonicDeviceId=" + this.c + ")";
    }
}
