package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lin extends liq {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public lin(byte[] bArr, int i, int i2) {
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    private final void N() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
            return;
        }
        this.h = 0;
    }

    @Override // defpackage.liq
    public final void A(int i) {
        this.l = i;
        N();
    }

    public final void B(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
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
        if (this.i == this.g) {
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
        int i2 = 0;
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
        if (this.g - this.i >= 10) {
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new ljy("CodedInputStream encountered a malformed varint.");
        }
        while (i2 < 10) {
            if (a() < 0) {
                i2++;
            }
        }
        throw new ljy("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // defpackage.liq
    public final byte[] F() {
        return G(j());
    }

    public final byte[] G(int i) {
        if (i > 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.i = i4;
                return Arrays.copyOfRange(this.f, i3, i4);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                return ljw.b;
            }
            throw new ljy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final byte a() {
        int i = this.i;
        if (i != this.g) {
            byte[] bArr = this.f;
            this.i = i + 1;
            return bArr[i];
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        return this.i - this.j;
    }

    @Override // defpackage.liq
    public final int e(int i) {
        if (i >= 0) {
            int d = i + d();
            if (d >= 0) {
                int i2 = this.l;
                if (d <= i2) {
                    this.l = d;
                    N();
                    return i2;
                }
                throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new ljy("Failed to parse the message.");
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
        int i = this.i;
        if (this.g - i >= 4) {
            byte[] bArr = this.f;
            this.i = i + 4;
            int i2 = bArr[i] & 255;
            int i3 = bArr[i + 1] & 255;
            int i4 = bArr[i + 2] & 255;
            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final int j() {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.i = i5;
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
            this.k = 0;
            return 0;
        }
        int j = j();
        this.k = j;
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
        int i = this.i;
        if (this.g - i >= 8) {
            byte[] bArr = this.f;
            this.i = i + 8;
            long j = bArr[i];
            long j2 = bArr[i + 2];
            long j3 = bArr[i + 3];
            return ((bArr[i + 7] & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.liq
    public final long r() {
        long j;
        long j2;
        int i = this.i;
        int i2 = this.g;
        if (i2 != i) {
            byte[] bArr = this.f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (bArr[i8] << 28) ^ i9;
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (bArr[i6] << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (bArr[i4] << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.i = i4;
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
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                lim u = lim.u(this.f, i2, j);
                this.i += j;
                return u;
            }
        }
        if (j == 0) {
            return lim.b;
        }
        return new lik(G(j));
    }

    @Override // defpackage.liq
    public final String x() {
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String str = new String(this.f, i2, j, ljw.a);
                this.i += j;
                return str;
            }
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
        int j = j();
        if (j > 0) {
            int i = this.g;
            int i2 = this.i;
            if (j <= i - i2) {
                String r = kzy.r(this.f, i2, j);
                this.i += j;
                return r;
            }
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
        if (this.k == i) {
        } else {
            throw new ljy("Protocol message end-group tag did not match expected tag.");
        }
    }
}
