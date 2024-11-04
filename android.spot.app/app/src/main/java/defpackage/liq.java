package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class liq {
    public static final /* synthetic */ int e = 0;
    private static volatile int f = 100;
    int a;
    final int b = f;
    public int c = Integer.MAX_VALUE;
    lir d;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long I(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static liq J(InputStream inputStream) {
        if (inputStream == null) {
            return K(ljw.b);
        }
        return new lip(inputStream);
    }

    public static liq K(byte[] bArr) {
        int length = bArr.length;
        return L(bArr, 0);
    }

    public static liq L(byte[] bArr, int i) {
        return M(bArr, 0, i);
    }

    public static liq M(byte[] bArr, int i, int i2) {
        lin linVar = new lin(bArr, i, i2);
        try {
            linVar.e(i2);
            return linVar;
        } catch (ljy e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract lim w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
