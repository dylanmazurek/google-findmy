package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blk {
    public final long a;

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long c(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long d(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static String e(long j) {
        return "(" + a(j) + ", " + b(j) + ')';
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof blk) && this.a == ((blk) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
