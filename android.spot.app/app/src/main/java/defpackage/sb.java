package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sb {
    public long[] a = sv.a;
    public int[] b = sh.a;
    public int[] c = sh.a;
    public int d;
    public int e;
    private int f;

    public sb() {
    }

    private final int f(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void g() {
        this.f = sv.a(this.d) - this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, sv.c(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = sv.a;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            mkm.v(jArr);
        }
        this.a = jArr;
        int i3 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        g();
        this.b = new int[i2];
        this.c = new int[i2];
    }

    private final void i(int i) {
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i2;
        long[] jArr2 = this.a;
        int[] iArr3 = this.b;
        int[] iArr4 = this.c;
        int i3 = this.d;
        h(i);
        int[] iArr5 = this.b;
        int[] iArr6 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                int i5 = iArr3[i4];
                int i6 = (-862048943) * i5;
                int i7 = i6 ^ (i6 << 16);
                int f = f(i7 >>> 7);
                long[] jArr3 = this.a;
                int i8 = f >> 3;
                int i9 = (f & 7) << 3;
                jArr = jArr2;
                iArr = iArr3;
                long j = i7 & 127;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j << i9);
                int i10 = this.d;
                int i11 = ((f - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                iArr2 = iArr4;
                i2 = i3;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j << i13);
                iArr5[f] = i5;
                iArr6[f] = iArr2[i4];
            } else {
                jArr = jArr2;
                iArr = iArr3;
                iArr2 = iArr4;
                i2 = i3;
            }
            i4++;
            iArr4 = iArr2;
            jArr2 = jArr;
            iArr3 = iArr;
            i3 = i2;
        }
    }

    public final int a(int i) {
        int i2 = (-862048943) * i;
        int i3 = this.d;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r0 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int b(int i) {
        int a = a(i);
        if (a >= 0) {
            return this.c[a];
        }
        throw new NoSuchElementException(a.ae(i, "Cannot find value for key "));
    }

    public final void c() {
        this.e = 0;
        if (this.a != sv.a) {
            mkm.v(this.a);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:            if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:            r2 = f(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:            if (r20.f != 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:            if (((r20.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:            r2 = r20.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:            if (r2 <= 8) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:            if (java.lang.Long.compare((r20.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:            i(defpackage.sv.b(r20.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:            r2 = f(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:            i(defpackage.sv.b(r20.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:            r20.e++;        r3 = r20.f;        r4 = r20.a;        r5 = r2 >> 3;        r10 = r4[r5];        r12 = (r2 & 7) << 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:            if (((r10 >> r12) & 255) != 128) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:            r14 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:            r20.f = r3 - r14;        r4[r5] = (r10 & (~(255 << r12))) | (r6 << r12);        r3 = r20.d;        r5 = ((r2 - 7) & r3) + (r3 & 7);        r3 = r5 >> 3;        r5 = (r5 & 7) << 3;        r4[r3] = (r6 << r5) | ((~(255 << r5)) & r4[r3]);        r10 = ~r2;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb.d(int, int):void");
    }

    public final int e(int i) {
        int a = a(i);
        if (a >= 0) {
            return this.c[a];
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        if (sbVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                if (iArr2[i5] != sbVar.b(iArr[i5])) {
                                    return false;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            break;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr2[i6] ^ iArr[i6];
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    break;
                }
            }
            if (i2 == length) {
                break;
            }
            i2++;
        }
        return i3;
    }

    public final String toString() {
        int i;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            int[] iArr = this.b;
            int[] iArr2 = this.c;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i2 - length;
                        int i5 = 0;
                        while (true) {
                            i = 8 - ((~i4) >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                int i8 = iArr2[i6];
                                sb.append(i7);
                                sb.append("=");
                                sb.append(i8);
                                i3++;
                                if (i3 < this.e) {
                                    sb.append(", ");
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append('}');
            return sb.toString();
        }
        return "{}";
    }

    public /* synthetic */ sb(byte[] bArr) {
        h(sv.d(6));
    }
}
