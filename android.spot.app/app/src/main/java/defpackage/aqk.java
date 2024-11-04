package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqk {
    public final long a;

    public static final float a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long f(long j) {
        return j ^ (-9223372034707292160L);
    }

    public static String g(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            return "Offset(" + ix.d(b(j)) + ", " + ix.d(c(j)) + ')';
        }
        return "Offset.Unspecified";
    }

    public static final boolean h(long j) {
        long j2 = j & 9223372034707292159L;
        if (((~j2) & ((-9187343246269874177L) + j2) & (-9223372034707292160L)) == -9223372034707292160L) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aqk) && this.a == ((aqk) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
