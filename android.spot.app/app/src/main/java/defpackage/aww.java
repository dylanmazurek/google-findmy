package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aww {
    public static final /* synthetic */ int a = 0;
    private static final long b = nq.f(Float.NaN, Float.NaN);

    public static final float a(long j) {
        if (j == b) {
            ll.g("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        if (j == b) {
            ll.g("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j & 4294967295L));
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
