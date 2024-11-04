package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bld {
    public final long a;

    public /* synthetic */ bld(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> (((i3 + i3) + (i2 * 3)) + 46))) & ((1 << (18 - r1)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int b(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int c(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> (((i3 + i3) + (i2 * 3)) + 15))) & ((1 << (18 - r1)) - 1);
    }

    public static final int d(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> 2)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
    }

    public static String e(long j) {
        String valueOf;
        int b = b(j);
        String str = "Infinity";
        if (b == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(b);
        }
        int a = a(j);
        if (a != Integer.MAX_VALUE) {
            str = String.valueOf(a);
        }
        return "Constraints(minWidth = " + d(j) + ", maxWidth = " + valueOf + ", minHeight = " + c(j) + ", maxHeight = " + str + ')';
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof bld) || j != ((bld) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        if ((((int) (j >> (((i3 + i3) + (i2 * 3)) + 46))) & ((1 << (18 - r1)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        if ((((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(long j) {
        int i;
        int i2 = (int) (3 & j);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = i4 + i4 + (i3 * 3);
        int i6 = i5 + 15;
        int i7 = (1 << (18 - i5)) - 1;
        int i8 = ((int) (j >> (i5 + 46))) & i7;
        if (i8 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i8 - 1;
        }
        if ((((int) (j >> i6)) & i7) == i) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j) {
        int i;
        int i2 = (int) (3 & j);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = (1 << (((i4 + i4) + (i3 * 3)) + 13)) - 1;
        int i6 = ((int) (j >> 33)) & i5;
        if (i6 == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = i6 - 1;
        }
        if ((((int) (j >> 2)) & i5) == i) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long k(long j, int i, int i2) {
        if (i2 < 0 || i < 0) {
            bbp.c(a.aj(i, i2, "minHeight(", ") and minWidth(", ") must be >= 0"));
        }
        int b = b(j);
        if (b < i) {
            bbp.c(a.ak((byte) 41, i, b, "maxWidth(", ") must be >= minWidth("));
        }
        int a = a(j);
        if (a < i2) {
            bbp.c(a.ak((byte) 41, i2, a, "maxHeight(", ") must be >= minHeight("));
        }
        return bbc.n(i, b, i2, a);
    }

    public final boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
