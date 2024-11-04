package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dig {
    public final int a;
    public final int b;

    public dig(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (dtq.k(i)) {
            if (dtq.k(i2)) {
                return;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dig)) {
            return false;
        }
        dig digVar = (dig) obj;
        if (this.a == digVar.a && this.b == digVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
