package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkp implements Cloneable, ByteChannel, nkr, nkq {
    public nlg a;
    public long b;

    public final void A(nks nksVar) {
        nksVar.j(this, nksVar.b());
    }

    public final void B(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        mkm.aM(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            nlg p = p(1);
            int i3 = 8192 - p.c;
            byte[] bArr2 = p.a;
            int min = Math.min(i - i2, i3);
            int i4 = i2 + min;
            mkm.o(bArr, bArr2, p.c, i2, i4);
            p.c += min;
            i2 = i4;
        }
        this.b += j;
    }

    public final void C(nll nllVar) {
        do {
        } while (nllVar.a(this, 8192L) != -1);
    }

    public final void D(int i) {
        nlg p = p(1);
        byte[] bArr = p.a;
        int i2 = p.c;
        p.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.nkq
    public final /* bridge */ /* synthetic */ void E(int i) {
        throw null;
    }

    public final void F(int i) {
        nlg p = p(4);
        byte[] bArr = p.a;
        int i2 = p.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        p.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.nkq
    public final /* bridge */ /* synthetic */ void G(int i) {
        throw null;
    }

    public final void H(String str, int i, int i2) {
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        int i3 = i + 1;
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            nlg p = p(1);
                            byte[] bArr = p.a;
                            int i4 = p.c - i;
                            int min = Math.min(i2, 8192 - i4);
                            bArr[i + i4] = (byte) charAt;
                            i = i3;
                            while (i < min) {
                                char charAt2 = str.charAt(i);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i + i4] = (byte) charAt2;
                                i++;
                            }
                            int i5 = p.c;
                            int i6 = (i4 + i) - i5;
                            p.c = i5 + i6;
                            this.b += i6;
                        } else {
                            if (charAt < 2048) {
                                nlg p2 = p(2);
                                byte[] bArr2 = p2.a;
                                int i7 = p2.c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                p2.c = i7 + 2;
                                this.b += 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                if (i3 < i2) {
                                    c = str.charAt(i3);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && c >= 56320 && c < 57344) {
                                    nlg p3 = p(4);
                                    byte[] bArr3 = p3.a;
                                    int i8 = p3.c;
                                    int i9 = (((charAt & 1023) << 10) | (c & 1023)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                    bArr3[i8] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i8 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i8 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i8 + 3] = (byte) ((i9 & 63) | 128);
                                    p3.c = i8 + 4;
                                    this.b += 4;
                                    i += 2;
                                } else {
                                    D(63);
                                }
                            } else {
                                nlg p4 = p(3);
                                byte[] bArr4 = p4.a;
                                int i10 = p4.c;
                                bArr4[i10] = (byte) ((charAt >> '\f') | 224);
                                bArr4[i10 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr4[i10 + 2] = (byte) ((charAt & '?') | 128);
                                p4.c = i10 + 3;
                                this.b += 3;
                            }
                            i = i3;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            throw new IllegalArgumentException(a.ad(i, i2, "endIndex < beginIndex: ", " < "));
        }
        throw new IllegalArgumentException(a.ae(i, "beginIndex < 0: "));
    }

    public final void I(int i) {
        if (i < 128) {
            D(i);
            return;
        }
        if (i < 2048) {
            nlg p = p(2);
            byte[] bArr = p.a;
            int i2 = p.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            p.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            D(63);
            return;
        }
        if (i < 65536) {
            nlg p2 = p(3);
            byte[] bArr2 = p2.a;
            int i3 = p2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            p2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            nlg p3 = p(4);
            byte[] bArr3 = p3.a;
            int i4 = p3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            p3.c = i4 + 4;
            this.b += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(mkm.aL(i)));
    }

    public final void J(long j) {
        if (j == 0) {
            D(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        nlg p = p(i);
        byte[] bArr = p.a;
        int i2 = p.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 >= i2) {
                bArr[i3] = nlo.a[(int) (15 & j)];
                j >>>= 4;
            } else {
                p.c += i;
                this.b += i;
                return;
            }
        }
    }

    public final void K(String str) {
        str.getClass();
        H(str, 0, str.length());
    }

    @Override // defpackage.nkq
    public final /* bridge */ /* synthetic */ void L(String str) {
        throw null;
    }

    @Override // defpackage.nll
    public final long a(nkp nkpVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 != 0) {
                if (j > j2) {
                    j = j2;
                }
                nkpVar.dw(this, j);
                return j;
            }
            return -1L;
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount < 0: "));
    }

    public final byte c(long j) {
        mkm.aM(this.b, j, 1L);
        nlg nlgVar = this.a;
        nlgVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                nlgVar = nlgVar.g;
                nlgVar.getClass();
                j2 -= nlgVar.c - nlgVar.b;
            }
            nlgVar.getClass();
            return nlgVar.a[(int) ((nlgVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = nlgVar.c;
            int i2 = nlgVar.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                nlgVar = nlgVar.f;
                nlgVar.getClass();
                j3 = j4;
            } else {
                nlgVar.getClass();
                return nlgVar.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    public final /* synthetic */ Object clone() {
        nkp nkpVar = new nkp();
        if (this.b != 0) {
            nlg nlgVar = this.a;
            nlgVar.getClass();
            nlg b = nlgVar.b();
            nkpVar.a = b;
            b.g = b;
            b.f = b.g;
            for (nlg nlgVar2 = nlgVar.f; nlgVar2 != nlgVar; nlgVar2 = nlgVar2.f) {
                nlg nlgVar3 = b.g;
                nlgVar3.getClass();
                nlgVar2.getClass();
                nlgVar3.d(nlgVar2.b());
            }
            nkpVar.b = this.b;
        }
        return nkpVar;
    }

    @Override // defpackage.nkr
    public final byte d() {
        long j = this.b;
        if (j != 0) {
            nlg nlgVar = this.a;
            nlgVar.getClass();
            int i = nlgVar.b;
            int i2 = i + 1;
            byte[] bArr = nlgVar.a;
            int i3 = nlgVar.c;
            byte b = bArr[i];
            this.b = j - 1;
            if (i2 == i3) {
                this.a = nlgVar.a();
                nlh.b(nlgVar);
            } else {
                nlgVar.b = i2;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // defpackage.nll
    public final nln dv() {
        return nln.j;
    }

    @Override // defpackage.nlj
    public final void dw(nkp nkpVar, long j) {
        nlg nlgVar;
        nlg nlgVar2;
        int i;
        if (nkpVar != this) {
            mkm.aM(nkpVar.b, 0L, j);
            while (j > 0) {
                nlg nlgVar3 = nkpVar.a;
                nlgVar3.getClass();
                int i2 = nlgVar3.c;
                nlgVar3.getClass();
                int i3 = i2 - nlgVar3.b;
                int i4 = 0;
                if (j < i3) {
                    nlg nlgVar4 = this.a;
                    if (nlgVar4 != null) {
                        nlgVar = nlgVar4.g;
                    } else {
                        nlgVar = null;
                    }
                    int i5 = (int) j;
                    if (nlgVar != null && nlgVar.e) {
                        long j2 = nlgVar.c + j;
                        if (nlgVar.d) {
                            i = 0;
                        } else {
                            i = nlgVar.b;
                        }
                        if (j2 - i <= 8192) {
                            nlgVar3.getClass();
                            nlgVar3.c(nlgVar, i5);
                            nkpVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    nlgVar3.getClass();
                    if (i5 <= i3) {
                        if (i5 >= 1024) {
                            nlgVar2 = nlgVar3.b();
                        } else {
                            byte[] bArr = nlgVar3.a;
                            nlg a = nlh.a();
                            byte[] bArr2 = a.a;
                            int i6 = nlgVar3.b;
                            mkm.o(bArr, bArr2, 0, i6, i6 + i5);
                            nlgVar2 = a;
                        }
                        nlgVar2.c = nlgVar2.b + i5;
                        nlgVar3.b += i5;
                        nlg nlgVar5 = nlgVar3.g;
                        nlgVar5.getClass();
                        nlgVar5.d(nlgVar2);
                        nkpVar.a = nlgVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                nlg nlgVar6 = nkpVar.a;
                nlgVar6.getClass();
                int i7 = nlgVar6.c - nlgVar6.b;
                nkpVar.a = nlgVar6.a();
                nlg nlgVar7 = this.a;
                if (nlgVar7 == null) {
                    this.a = nlgVar6;
                    nlgVar6.g = nlgVar6;
                    nlgVar6.f = nlgVar6.g;
                } else {
                    nlg nlgVar8 = nlgVar7.g;
                    nlgVar8.getClass();
                    nlgVar8.d(nlgVar6);
                    nlg nlgVar9 = nlgVar6.g;
                    if (nlgVar9 != nlgVar6) {
                        nlgVar9.getClass();
                        if (nlgVar9.e) {
                            int i8 = nlgVar6.c - nlgVar6.b;
                            nlgVar9.getClass();
                            int i9 = 8192 - nlgVar9.c;
                            nlgVar9.getClass();
                            if (!nlgVar9.d) {
                                nlgVar9.getClass();
                                i4 = nlgVar9.b;
                            }
                            if (i8 <= i9 + i4) {
                                nlgVar9.getClass();
                                nlgVar6.c(nlgVar9, i8);
                                nlgVar6.a();
                                nlh.b(nlgVar6);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                long j3 = i7;
                nkpVar.b -= j3;
                this.b += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final int e(byte[] bArr, int i, int i2) {
        mkm.aM(bArr.length, i, i2);
        nlg nlgVar = this.a;
        if (nlgVar == null) {
            return -1;
        }
        int min = Math.min(i2, nlgVar.c - nlgVar.b);
        int i3 = nlgVar.b;
        mkm.o(nlgVar.a, bArr, i, i3, i3 + min);
        int i4 = nlgVar.b + min;
        nlgVar.b = i4;
        this.b -= min;
        if (i4 != nlgVar.c) {
            return min;
        }
        this.a = nlgVar.a();
        nlh.b(nlgVar);
        return min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nkp) {
            long j = this.b;
            nkp nkpVar = (nkp) obj;
            if (j == nkpVar.b) {
                if (j == 0) {
                    return true;
                }
                nlg nlgVar = this.a;
                nlgVar.getClass();
                nlg nlgVar2 = nkpVar.a;
                nlgVar2.getClass();
                int i = nlgVar.b;
                int i2 = nlgVar2.b;
                long j2 = 0;
                while (j2 < this.b) {
                    long min = Math.min(nlgVar.c - i, nlgVar2.c - i2);
                    long j3 = 0;
                    while (j3 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (nlgVar.a[i] == nlgVar2.a[i2]) {
                            j3++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == nlgVar.c) {
                        nlgVar = nlgVar.f;
                        nlgVar.getClass();
                        i = nlgVar.b;
                    }
                    if (i2 == nlgVar2.c) {
                        nlgVar2 = nlgVar2.f;
                        nlgVar2.getClass();
                        i2 = nlgVar2.b;
                    }
                    j2 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nkr
    public final int f() {
        long j = this.b;
        if (j >= 4) {
            nlg nlgVar = this.a;
            nlgVar.getClass();
            int i = nlgVar.b;
            int i2 = nlgVar.c;
            if (i2 - i < 4) {
                return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
            }
            byte[] bArr = nlgVar.a;
            int i3 = (bArr[i] & 255) << 24;
            int i4 = (bArr[i + 1] & 255) << 16;
            int i5 = (bArr[i + 2] & 255) << 8;
            int i6 = bArr[i + 3] & 255;
            this.b = j - 4;
            int i7 = i3 | i4 | i5 | i6;
            int i8 = i + 4;
            if (i8 == i2) {
                this.a = nlgVar.a();
                nlh.b(nlgVar);
                return i7;
            }
            nlgVar.b = i8;
            return i7;
        }
        throw new EOFException();
    }

    @Override // defpackage.nkr
    public final long g(nks nksVar) {
        throw null;
    }

    public final String h(long j, Charset charset) {
        charset.getClass();
        if (j >= 0 && j <= 2147483647L) {
            long j2 = this.b;
            if (j2 >= j) {
                if (j == 0) {
                    return "";
                }
                nlg nlgVar = this.a;
                nlgVar.getClass();
                int i = nlgVar.b;
                int i2 = nlgVar.c;
                if (i + j > i2) {
                    return new String(y(j), charset);
                }
                int i3 = (int) j;
                String str = new String(nlgVar.a, i, i3, charset);
                int i4 = i + i3;
                nlgVar.b = i4;
                this.b = j2 - j;
                if (i4 == i2) {
                    this.a = nlgVar.a();
                    nlh.b(nlgVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount: "));
    }

    public final int hashCode() {
        nlg nlgVar = this.a;
        if (nlgVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = nlgVar.c;
            for (int i3 = nlgVar.b; i3 < i2; i3++) {
                i = (i * 31) + nlgVar.a[i3];
            }
            nlgVar = nlgVar.f;
            nlgVar.getClass();
        } while (nlgVar != this.a);
        return i;
    }

    public final String i() {
        return h(this.b, mrh.a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final String j(long j) {
        return h(j, mrh.a);
    }

    @Override // defpackage.nkr
    public final String k() {
        throw null;
    }

    @Override // defpackage.nkr
    public final String l(long j) {
        throw null;
    }

    public final nks m() {
        return n(this.b);
    }

    @Override // defpackage.nkr
    public final nks n(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (j >= 4096) {
                    nks o = o((int) j);
                    u(j);
                    return o;
                }
                return new nks(y(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount: "));
    }

    public final nks o(int i) {
        if (i == 0) {
            return nks.a;
        }
        mkm.aM(this.b, 0L, i);
        nlg nlgVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            nlgVar.getClass();
            int i5 = nlgVar.c;
            int i6 = nlgVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                nlgVar = nlgVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 + i4];
        nlg nlgVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            nlgVar2.getClass();
            bArr[i7] = nlgVar2.a;
            i2 += nlgVar2.c - nlgVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = nlgVar2.b;
            nlgVar2.d = true;
            i7++;
            nlgVar2 = nlgVar2.f;
        }
        return new nli(bArr, iArr);
    }

    public final nlg p(int i) {
        if (i > 0) {
            nlg nlgVar = this.a;
            if (nlgVar == null) {
                nlg a = nlh.a();
                this.a = a;
                a.g = a;
                a.f = a;
                return a;
            }
            nlg nlgVar2 = nlgVar.g;
            nlgVar2.getClass();
            if (nlgVar2.c + i <= 8192 && nlgVar2.e) {
                return nlgVar2;
            }
            nlg a2 = nlh.a();
            nlgVar2.d(a2);
            return a2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // defpackage.nkr
    public final short q() {
        int i;
        long j = this.b;
        if (j >= 2) {
            nlg nlgVar = this.a;
            nlgVar.getClass();
            int i2 = nlgVar.b;
            int i3 = nlgVar.c;
            if (i3 - i2 < 2) {
                i = ((d() & 255) << 8) | (d() & 255);
            } else {
                byte[] bArr = nlgVar.a;
                int i4 = (bArr[i2] & 255) << 8;
                int i5 = bArr[i2 + 1] & 255;
                this.b = j - 2;
                int i6 = i2 + 2;
                if (i6 == i3) {
                    this.a = nlgVar.a();
                    nlh.b(nlgVar);
                } else {
                    nlgVar.b = i6;
                }
                i = i4 | i5;
            }
            return (short) i;
        }
        throw new EOFException();
    }

    public final short r() {
        short q = q();
        int i = q >>> 8;
        return (short) (((q & 255) << 8) | (i & 255));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        nlg nlgVar = this.a;
        if (nlgVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), nlgVar.c - nlgVar.b);
        byteBuffer.put(nlgVar.a, nlgVar.b, min);
        int i = nlgVar.b + min;
        nlgVar.b = i;
        this.b -= min;
        if (i == nlgVar.c) {
            this.a = nlgVar.a();
            nlh.b(nlgVar);
        }
        return min;
    }

    public final void s() {
        u(this.b);
    }

    @Override // defpackage.nkr
    public final void t(long j) {
        throw null;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return o((int) j).toString();
        }
        throw new IllegalStateException(a.ap(j, "size > Int.MAX_VALUE: "));
    }

    @Override // defpackage.nkr
    public final void u(long j) {
        while (j > 0) {
            nlg nlgVar = this.a;
            if (nlgVar != null) {
                int min = (int) Math.min(j, nlgVar.c - nlgVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                int i = nlgVar.b + min;
                nlgVar.b = i;
                if (i == nlgVar.c) {
                    this.a = nlgVar.a();
                    nlh.b(nlgVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.nkr
    public final boolean v() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nkr
    public final boolean w(long j) {
        throw null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            nlg p = p(1);
            int i2 = 8192 - p.c;
            byte[] bArr = p.a;
            int min = Math.min(i, i2);
            byteBuffer.get(bArr, p.c, min);
            i -= min;
            p.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.nkr
    public final byte[] x() {
        return y(this.b);
    }

    @Override // defpackage.nkr
    public final byte[] y(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int e = e(bArr, i2, i - i2);
                    if (e != -1) {
                        i2 += e;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a.ap(j, "byteCount: "));
    }

    public final void z(nkp nkpVar, long j, long j2) {
        mkm.aM(this.b, j, j2);
        if (j2 != 0) {
            nkpVar.b += j2;
            nlg nlgVar = this.a;
            while (true) {
                nlgVar.getClass();
                long j3 = nlgVar.c - nlgVar.b;
                if (j < j3) {
                    break;
                }
                nlgVar = nlgVar.f;
                j -= j3;
            }
            while (j2 > 0) {
                nlgVar.getClass();
                nlg b = nlgVar.b();
                int i = b.b + ((int) j);
                b.b = i;
                b.c = Math.min(i + ((int) j2), b.c);
                nlg nlgVar2 = nkpVar.a;
                if (nlgVar2 == null) {
                    b.g = b;
                    b.f = b.g;
                    nkpVar.a = b.f;
                } else {
                    nlg nlgVar3 = nlgVar2.g;
                    nlgVar3.getClass();
                    nlgVar3.d(b);
                }
                j2 -= b.c - b.b;
                nlgVar = nlgVar.f;
                j = 0;
            }
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.nll
    public final void close() {
    }

    @Override // defpackage.nkq, defpackage.nlj, java.io.Flushable
    public final void flush() {
    }
}
