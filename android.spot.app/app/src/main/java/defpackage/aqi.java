package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqi {
    public static final long a = iv.d(0.0f, 0.0f);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (a(j) == b(j)) {
            return "CornerRadius.circular(" + ix.d(a(j)) + ')';
        }
        return "CornerRadius.elliptical(" + ix.d(a(j)) + ", " + ix.d(b(j)) + ')';
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
