package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqn {
    public final long a;

    public static final float a(long j) {
        if (j == 9205357640488583168L) {
            ix.c();
            j = 9205357640488583168L;
        }
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        if (j == 9205357640488583168L) {
            ix.c();
            j = 9205357640488583168L;
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + ix.d(b(j)) + ", " + ix.d(a(j)) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aqn) && this.a == ((aqn) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
