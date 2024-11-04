package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbc {
    public static final void a(byn bynVar, bfh bfhVar) {
        if (bbb.b(bfhVar)) {
            bfe bfeVar = bfhVar.c;
            bfn bfnVar = bfd.a;
            if (((bev) bej.b(bfeVar, bfd.u)) != null) {
                bynVar.j(new byi(R.id.accessibilityActionPageUp));
            }
            if (((bev) bej.b(bfhVar.c, bfd.w)) != null) {
                bynVar.j(new byi(R.id.accessibilityActionPageDown));
            }
            if (((bev) bej.b(bfhVar.c, bfd.v)) != null) {
                bynVar.j(new byi(R.id.accessibilityActionPageLeft));
            }
            if (((bev) bej.b(bfhVar.c, bfd.x)) != null) {
                bynVar.j(new byi(R.id.accessibilityActionPageRight));
            }
        }
    }

    public static float b(ble bleVar, float f) {
        return f / bleVar.a();
    }

    public static float c(ble bleVar, int i) {
        return i / bleVar.a();
    }

    public static float d(ble bleVar, long j) {
        if (a.n(blp.c(j), 4294967296L)) {
            return bleVar.ci(bleVar.cc(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float e(ble bleVar, float f) {
        return f * bleVar.a();
    }

    public static int f(ble bleVar, float f) {
        float ci = bleVar.ci(f);
        if (Float.isInfinite(ci)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(ci);
    }

    public static long g(ble bleVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return a.k(bleVar.ci(Float.intBitsToFloat((int) (j >> 32))), bleVar.ci(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public static long h(ble bleVar, float f) {
        return bleVar.cl(bleVar.cf(f));
    }

    public static final int i(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return moz.ac(i + i2, 0);
    }

    public static final int j(long j, int i) {
        return moz.ae(i, bld.c(j), bld.a(j));
    }

    public static final int k(long j, int i) {
        return moz.ae(i, bld.d(j), bld.b(j));
    }

    public static final long l(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            bbp.c(a.ak((byte) 41, i, i2, "maxWidth(", ") must be >= than minWidth("));
        }
        if (i4 < i3) {
            bbp.c(a.ak((byte) 41, i3, i4, "maxHeight(", ") must be >= than minHeight("));
        }
        if (i < 0 || i3 < 0) {
            bbp.c(a.aj(i3, i, "minWidth(", ") and minHeight(", ") must be >= 0"));
        }
        return n(i, i2, i3, i4);
    }

    public static final long m(long j, long j2) {
        return bef.m(moz.ae(blm.b(j2), bld.d(j), bld.b(j)), moz.ae(blm.a(j2), bld.c(j), bld.a(j)));
    }

    public static final long n(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i4 == Integer.MAX_VALUE) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        if (i2 == Integer.MAX_VALUE) {
            i6 = i;
        } else {
            i6 = i2;
        }
        int p = p(i5);
        int p2 = p(i6);
        if (p + p2 <= 31) {
            int i7 = i2 + 1;
            int i8 = i7 >> 31;
            int i9 = i4 + 1;
            int i10 = i9 >> 31;
            int i11 = 0;
            if (p2 != 13) {
                if (p2 != 18) {
                    if (p2 != 15) {
                        if (p2 == 16) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 1;
                    }
                } else {
                    i11 = 3;
                }
            }
            int i12 = i9 & (~i10);
            int i13 = i7 & (~i8);
            int i14 = i11 & 1;
            int i15 = i14 + i14 + (((i11 & 2) >> 1) * 3);
            return (i13 << 33) | (i << 2) | i11 | (i3 << (i15 + 15)) | (i12 << (i15 + 46));
        }
        throw new IllegalArgumentException(a.aj(i5, i6, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long o(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return l(0, i, 0, i2);
    }

    private static final int p(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i >= 262143) {
            return 255;
        }
        return 18;
    }
}
