package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axz {
    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int b(long j, long j2) {
        boolean c = c(j);
        if (c != c(j2)) {
            if (c) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(a(j) - a(j2));
    }

    public static final boolean c(long j) {
        if (((int) (j & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
