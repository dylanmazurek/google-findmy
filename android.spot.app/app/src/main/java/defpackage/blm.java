package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blm {
    public final long a;

    public /* synthetic */ blm(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static String c(long j) {
        return b(j) + " x " + a(j);
    }

    public static boolean d(long j, Object obj) {
        if (!(obj instanceof blm) || j != ((blm) obj).a) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
