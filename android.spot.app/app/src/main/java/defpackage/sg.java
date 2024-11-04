package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sg {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    private int e;

    public sg() {
        this.a = sv.a;
        this.b = sh.a;
    }

    private final int e(int i) {
        int i2 = this.c;
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

    private final void f() {
        this.e = sv.a(this.c) - this.d;
    }

    private final void g(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, sv.c(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
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
        f();
        this.b = new int[i2];
    }

    private final void h(int i) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.a;
        int[] iArr2 = this.b;
        int i2 = this.c;
        g(i);
        int[] iArr3 = this.b;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr2[i3];
                int i5 = (-862048943) * i4;
                int i6 = i5 ^ (i5 << 16);
                int e = e(i6 >>> 7);
                long[] jArr3 = this.a;
                int i7 = e >> 3;
                int i8 = (e & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                long j = i6 & 127;
                jArr3[i7] = ((~(255 << i8)) & jArr3[i7]) | (j << i8);
                int i9 = this.c;
                int i10 = ((e - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr3[i11] = ((~(255 << i12)) & jArr3[i11]) | (j << i12);
                iArr3[e] = i4;
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i3++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    public final boolean a(int i) {
        int i2 = (-862048943) * i;
        int i3 = this.c;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i5;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = ((r2 & 127) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == i) {
                    if (numberOfTrailingZeros >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) == 0) {
                i5 = i8 + 8;
                i4 = (i4 + i5) & i3;
            } else {
                return false;
            }
        }
    }

    public final void b() {
        this.d = 0;
        if (this.a != sv.a) {
            mkm.v(this.a);
            long[] jArr = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        f();
    }

    public final void c(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:            if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:            r2 = e(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:            if (r21.e != 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:            if (((r21.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:            r2 = r21.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:            if (r2 <= 8) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:            if (java.lang.Long.compare((r21.d * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:            h(defpackage.sv.b(r21.c));     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:            r2 = e(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:            h(defpackage.sv.b(r21.c));     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:            r11 = r2;        r21.d++;        r2 = r21.e;        r4 = r21.a;        r5 = r11 >> 3;        r12 = r4[r5];        r6 = (r11 & 7) << 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:            if (((r12 >> r6) & 255) != 128) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:            r14 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:            r21.e = r2 - r14;        r4[r5] = (r12 & (~(255 << r6))) | (r7 << r6);        r2 = r21.c;        r5 = ((r11 - 7) & r2) + (r2 & 7);        r2 = r5 >> 3;        r5 = (r5 & 7) << 3;        r4[r2] = (r7 << r5) | ((~(255 << r5)) & r4[r2]);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:            r14 = 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.d(int):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        if (sgVar.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
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
                            if ((255 & j) < 128 && !sgVar.a(iArr[(i << 3) + i3])) {
                                return false;
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
                        i3 += iArr[(i2 << 3) + i5];
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
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 < i5) {
                            if ((255 & j) < 128) {
                                int i6 = iArr[(i << 3) + i4];
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                if (i2 != 0) {
                                    sb.append((CharSequence) ", ");
                                }
                                sb.append(i6);
                                i2++;
                            }
                            j >>= 8;
                            i4++;
                        } else if (i5 != 8) {
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
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public sg(int i) {
        this.a = sv.a;
        this.b = sh.a;
        g(sv.d(i));
    }

    public /* synthetic */ sg(byte[] bArr) {
        this(6);
    }
}
