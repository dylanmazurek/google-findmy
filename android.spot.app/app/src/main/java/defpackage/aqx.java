package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqx {
    public static final long a = jw.f(4278190080L);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public final long f;

    static {
        jw.f(4282664004L);
        jw.f(4287137928L);
        jw.f(4291611852L);
        jw.f(4294967295L);
        b = jw.f(4294901760L);
        jw.f(4278255360L);
        c = jw.f(4278190335L);
        jw.f(4294967040L);
        jw.f(4278255615L);
        jw.f(4294902015L);
        d = jw.e(0);
        float[] fArr = aru.a;
        e = jw.g(0.0f, 0.0f, 0.0f, 0.0f, aru.e);
    }

    public /* synthetic */ aqx(long j) {
        this.f = j;
    }

    public static final float a(long j) {
        float m;
        float f;
        if ((63 & j) == 0) {
            m = (float) mjo.m(j >>> 56);
            f = 255.0f;
        } else {
            m = (float) mjo.m((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return m / f;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) mjo.m((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - aqz.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) mjo.m((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - aqz.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) mjo.m(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 == 0) {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - aqz.a;
                if (i5 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, ars arsVar) {
        arx arxVar;
        ars f = f(j);
        int i = f.c;
        int i2 = arsVar.c;
        if ((i | i2) < 0) {
            arxVar = kk.o(f, arsVar);
        } else {
            int i3 = i | (i2 << 6);
            se seVar = ary.a;
            Object a2 = seVar.a(i3);
            if (a2 == null) {
                a2 = kk.o(f, arsVar);
                seVar.d(i3, a2);
            }
            arxVar = (arx) a2;
        }
        return arxVar.a(j);
    }

    public static final ars f(long j) {
        float[] fArr = aru.a;
        return aru.g[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public static /* synthetic */ long h(long j, float f) {
        return jw.g(d(j), c(j), b(j), f, f(j));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aqx) && this.f == ((aqx) obj).f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.f);
    }

    public final String toString() {
        return g(this.f);
    }
}
