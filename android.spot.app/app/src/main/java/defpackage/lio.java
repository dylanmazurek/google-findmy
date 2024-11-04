package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lio extends liq {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int l;
    private long n;
    private long o;
    private long p;
    private int k = Integer.MAX_VALUE;
    private int m = 0;

    public lio(Iterable iterable, int i) {
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        if (i == 0) {
            this.h = ljw.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        Q();
    }

    private final int G() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    private final long N() {
        return this.p - this.n;
    }

    private final void O() {
        if (this.g.hasNext()) {
            Q();
            return;
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void P() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i > i2) {
            int i3 = i - i2;
            this.j = i3;
            this.i = i - i3;
            return;
        }
        this.j = 0;
    }

    private final void Q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long e = llu.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }

    private final void R(byte[] bArr, int i) {
        if (i <= G()) {
            int i2 = i;
            while (i2 > 0) {
                if (N() == 0) {
                    O();
                }
                int min = Math.min(i2, (int) N());
                long j = min;
                llu.k(this.n, bArr, i - i2, j);
                i2 -= min;
                this.n += j;
            }
            return;
        }
        if (i <= 0) {
        } else {
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.liq
    public final void A(int i) {
        this.k = i;
        P();
    }

    public final void B(int i) {
        if (i >= 0) {
            if (i <= ((this.i - this.m) - this.n) + this.o) {
                while (i > 0) {
                    if (N() == 0) {
                        O();
                    }
                    int min = Math.min(i, (int) N());
                    i -= min;
                    this.n += min;
                }
                return;
            }
        }
        if (i < 0) {
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final boolean C() {
        if ((this.m + this.n) - this.o == this.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.liq
    public final boolean D() {
        if (r() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.liq
    public final boolean E(int i) {
        int m;
        int b = llz.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return false;
                        }
                        if (b == 5) {
                            B(4);
                            return true;
                        }
                        throw new ljx();
                    }
                    do {
                        m = m();
                        if (m == 0) {
                            break;
                        }
                    } while (E(m));
                    z(llz.c(llz.a(i), 4));
                    return true;
                }
                B(j());
                return true;
            }
            B(8);
            return true;
        }
        for (int i2 = 0; i2 < 10; i2++) {
            if (a() >= 0) {
                return true;
            }
        }
        throw new ljy("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.liq
    public final byte[] F() {
        int j = j();
        if (j >= 0) {
            long j2 = j;
            if (j2 <= N()) {
                byte[] bArr = new byte[j];
                llu.k(this.n, bArr, 0L, j2);
                this.n += j2;
                return bArr;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            R(bArr2, j);
            return bArr2;
        }
        if (j <= 0) {
            if (j == 0) {
                return ljw.b;
            }
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final byte a() {
        if (N() == 0) {
            O();
        }
        long j = this.n;
        this.n = 1 + j;
        return llu.a(j);
    }

    @Override // defpackage.liq
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.liq
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.liq
    public final int d() {
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // defpackage.liq
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            int i2 = this.k;
            if (d <= i2) {
                this.k = d;
                P();
                return i2;
            }
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.liq
    public final int f() {
        return j();
    }

    @Override // defpackage.liq
    public final int g() {
        return i();
    }

    @Override // defpackage.liq
    public final int h() {
        return j();
    }

    public final int i() {
        if (N() >= 4) {
            long j = this.n;
            this.n = 4 + j;
            int a = llu.a(j) & 255;
            int a2 = (llu.a(1 + j) & 255) << 8;
            return ((llu.a(j + 3) & 255) << 24) | a | a2 | ((llu.a(2 + j) & 255) << 16);
        }
        int a3 = a() & 255;
        int a4 = (a() & 255) << 8;
        return a3 | a4 | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    @Override // defpackage.liq
    public final int j() {
        int i;
        long j = this.n;
        if (this.p != j) {
            long j2 = j + 1;
            byte a = llu.a(j);
            if (a >= 0) {
                this.n++;
                return a;
            }
            if (this.p - this.n >= 10) {
                long j3 = 2 + j;
                int a2 = (llu.a(j2) << 7) ^ a;
                if (a2 < 0) {
                    i = a2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int a3 = (llu.a(j3) << 14) ^ a2;
                    if (a3 >= 0) {
                        i = a3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int a4 = a3 ^ (llu.a(j4) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            j4 = 5 + j;
                            byte a5 = llu.a(j5);
                            int i2 = (a4 ^ (a5 << 28)) ^ 266354560;
                            if (a5 < 0) {
                                j5 = 6 + j;
                                if (llu.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (llu.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (llu.a(j4) < 0) {
                                            j4 = 9 + j;
                                            if (llu.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (llu.a(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.n = j3;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.liq
    public final int k() {
        return i();
    }

    @Override // defpackage.liq
    public final int l() {
        return H(j());
    }

    @Override // defpackage.liq
    public final int m() {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int j = j();
        this.l = j;
        if (llz.a(j) != 0) {
            return j;
        }
        throw new ljy("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.liq
    public final int n() {
        return j();
    }

    @Override // defpackage.liq
    public final long o() {
        return q();
    }

    @Override // defpackage.liq
    public final long p() {
        return r();
    }

    public final long q() {
        if (N() >= 8) {
            this.n = 8 + this.n;
            return ((llu.a(r1 + 7) & 255) << 56) | ((llu.a(r1 + 2) & 255) << 16) | (llu.a(r1) & 255) | ((llu.a(1 + r1) & 255) << 8) | ((llu.a(3 + r1) & 255) << 24) | ((llu.a(r1 + 4) & 255) << 32) | ((llu.a(5 + r1) & 255) << 40) | ((llu.a(r1 + 6) & 255) << 48);
        }
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((255 & a()) << 56);
    }

    @Override // defpackage.liq
    public final long r() {
        long j;
        long j2;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte a = llu.a(j3);
            if (a >= 0) {
                this.n++;
                return a;
            }
            if (this.p - this.n >= 10) {
                long j5 = 2 + j3;
                int a2 = (llu.a(j4) << 7) ^ a;
                if (a2 < 0) {
                    j = a2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int a3 = (llu.a(j5) << 14) ^ a2;
                    if (a3 >= 0) {
                        j = a3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int a4 = a3 ^ (llu.a(j6) << 21);
                        if (a4 < 0) {
                            j = (-2080896) ^ a4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long a5 = (llu.a(j7) << 28) ^ a4;
                            if (a5 >= 0) {
                                j = 266354560 ^ a5;
                            } else {
                                long j8 = 6 + j3;
                                long a6 = a5 ^ (llu.a(j6) << 35);
                                if (a6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long a7 = a6 ^ (llu.a(j8) << 42);
                                    if (a7 >= 0) {
                                        j = 4363953127296L ^ a7;
                                    } else {
                                        j8 = 8 + j3;
                                        a6 = a7 ^ (llu.a(j9) << 49);
                                        if (a6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long a8 = (a6 ^ (llu.a(j8) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j10 = j3 + 10;
                                                if (llu.a(j9) >= 0) {
                                                    j = a8;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = a8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ a6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.n = j5;
                return j;
            }
        }
        return s();
    }

    final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new ljy("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.liq
    public final long t() {
        return q();
    }

    @Override // defpackage.liq
    public final long u() {
        return I(r());
    }

    @Override // defpackage.liq
    public final long v() {
        return r();
    }

    @Override // defpackage.liq
    public final lim w() {
        int j = j();
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                llu.k(j3, bArr, 0L, j4);
                this.n += j4;
                return new lik(bArr);
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            R(bArr2, j);
            return new lik(bArr2);
        }
        if (j == 0) {
            return lim.b;
        }
        if (j < 0) {
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final String x() {
        int j = j();
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                llu.k(j3, bArr, 0L, j4);
                String str = new String(bArr, ljw.a);
                this.n += j4;
                return str;
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            R(bArr2, j);
            return new String(bArr2, ljw.a);
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final String y() {
        String q;
        int j = j();
        if (j > 0) {
            long j2 = this.p;
            long j3 = this.n;
            long j4 = j;
            if (j4 <= j2 - j3) {
                long j5 = j3 - this.o;
                ByteBuffer byteBuffer = this.h;
                int i = llw.a;
                int i2 = (int) j5;
                if (byteBuffer.hasArray()) {
                    q = kzy.r(byteBuffer.array(), byteBuffer.arrayOffset() + i2, j);
                } else if (byteBuffer.isDirect()) {
                    q = kzy.q(byteBuffer, i2, j);
                } else {
                    q = kzy.q(byteBuffer, i2, j);
                }
                this.n += j4;
                return q;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr = new byte[j];
            R(bArr, j);
            return kzy.r(bArr, 0, j);
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final void z(int i) {
        if (this.l == i) {
        } else {
            throw new ljy("Protocol message end-group tag did not match expected tag.");
        }
    }
}
