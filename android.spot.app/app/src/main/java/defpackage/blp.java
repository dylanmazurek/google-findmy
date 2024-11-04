package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blp {
    private static final blq[] b = {new blq(0), new blq(4294967296L), new blq(8589934592L)};
    public static final long a = bef.k(0, Float.NaN);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return j & 1095216660480L;
    }

    public static final long c(long j) {
        return b[(int) (b(j) >>> 32)].a;
    }

    public static String d(long j) {
        long c = c(j);
        if (a.n(c, 0L)) {
            return "Unspecified";
        }
        if (a.n(c, 4294967296L)) {
            return a(j) + ".sp";
        }
        if (a.n(c, 8589934592L)) {
            return a(j) + ".em";
        }
        return "Invalid";
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
