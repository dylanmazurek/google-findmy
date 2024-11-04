package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfq {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public bfq(Object obj, int i, int i2) {
        this(obj, i, i2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfq)) {
            return false;
        }
        bfq bfqVar = (bfq) obj;
        if (amr.i(this.a, bfqVar.a) && this.b == bfqVar.b && this.c == bfqVar.c && amr.i(this.d, bfqVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public bfq(Object obj, int i, int i2, byte[] bArr) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = "";
        if (i > i2) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }
}
