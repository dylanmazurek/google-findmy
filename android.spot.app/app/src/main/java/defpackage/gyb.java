package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyb {
    private final int a;

    public gyb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gyb) && this.a == ((gyb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimit(limit=" + this.a + ")";
    }
}
