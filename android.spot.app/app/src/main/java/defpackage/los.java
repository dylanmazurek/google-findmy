package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class los extends hzc {
    public final lqf c;

    public los(lqf lqfVar) {
        super(null);
        this.c = lqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof los) && this.c == ((los) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DeepLinkDeviceType(deviceType=" + this.c + ")";
    }
}
