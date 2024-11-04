package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bli {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bli) && this.a == ((bli) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j != 9205357640488583168L) {
            return "(" + ((Object) blh.a(a(j))) + ", " + ((Object) blh.a(b(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
