package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class si {
    public long[] a = sv.a;
    public long[] b = sk.a;
    public Object[] c = td.c;
    public int d;
    public int e;
    private int f;

    public si() {
    }

    private final int e(int i) {
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

    private final void f(int i) {
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
        c();
        this.b = new long[i2];
        this.c = new Object[i2];
    }

    private final void g(int i) {
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i2;
        long[] jArr3 = this.a;
        long[] jArr4 = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.d;
        f(i);
        long[] jArr5 = this.b;
        Object[] objArr3 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr3[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                long j = jArr4[i4];
                int l = a.l(j) * (-862048943);
                int i5 = l ^ (l << 16);
                int e = e(i5 >>> 7);
                long[] jArr6 = this.a;
                int i6 = e >> 3;
                int i7 = (e & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                long j2 = i5 & 127;
                jArr6[i6] = (jArr6[i6] & (~(255 << i7))) | (j2 << i7);
                int i8 = this.d;
                int i9 = ((e - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                objArr = objArr2;
                i2 = i3;
                jArr6[i10] = ((~(255 << i11)) & jArr6[i10]) | (j2 << i11);
                jArr5[e] = j;
                objArr3[e] = objArr[i4];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
                objArr = objArr2;
                i2 = i3;
            }
            i4++;
            objArr2 = objArr;
            jArr3 = jArr;
            jArr4 = jArr2;
            i3 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:            if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:            r11 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = defpackage.a.l(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
            r2 = r2 & r3
            r4 = 0
        L13:
            r5 = r1 & 127(0x7f, float:1.78E-43)
            long[] r6 = r0.a
            r7 = r2 & 7
            int r8 = r2 >> 3
            r9 = r6[r8]
            int r7 = r7 << 3
            long r9 = r9 >>> r7
            int r8 = r8 + 1
            r11 = r6[r8]
            int r6 = 64 - r7
            long r11 = r11 << r6
            long r6 = (long) r7
            long r6 = -r6
            long r13 = (long) r5
            r5 = 63
            long r5 = r6 >> r5
            long r5 = r5 & r11
            long r5 = r5 | r9
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r7
            long r7 = r5 ^ r13
            r9 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r9 = r9 + r7
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L47:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L63
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L5e
            goto L6d
        L5e:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L47
        L63:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L76
            r11 = -1
        L6d:
            if (r11 < 0) goto L74
            java.lang.Object[] r1 = r0.c
            r1 = r1[r11]
            return r1
        L74:
            r1 = 0
            return r1
        L76:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.a(long):java.lang.Object");
    }

    public final boolean b(long j) {
        int l = a.l(j) * (-862048943);
        int i = this.d;
        int i2 = ((l ^ (l << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            int i6 = i3;
            long j2 = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
            long j3 = ((r1 & 127) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i2) & i;
                if (this.b[numberOfTrailingZeros] == j) {
                    if (numberOfTrailingZeros >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) == 0) {
                i3 = i6 + 8;
                i2 = (i2 + i3) & i;
            } else {
                return false;
            }
        }
    }

    public final void c() {
        this.f = sv.a(this.d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:            if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:            r1 = e(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:            if (r19.f != 0) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:            if (((r19.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:            r1 = r19.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:            if (r1 <= 8) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:            if (java.lang.Long.compare((r19.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:            g(defpackage.sv.b(r19.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:            r1 = e(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:            g(defpackage.sv.b(r19.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:            r9 = r1;        r19.e++;        r1 = r19.f;        r2 = r19.a;        r3 = r9 >> 3;        r10 = r2[r3];        r4 = (r9 & 7) << 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:            if (((r10 >> r4) & 255) != 128) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:            r13 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:            r19.f = r1 - r13;        r2[r3] = (r10 & (~(255 << r4))) | (r5 << r4);        r1 = r19.d;        r3 = ((r9 - 7) & r1) + (r1 & 7);        r1 = r3 >> 3;        r3 = (r3 & 7) << 3;        r2[r1] = (r5 << r3) | ((~(255 << r3)) & r2[r1]);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r20, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.d(long, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        if (siVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        char c = '\b';
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                long j2 = jArr[i5];
                                Object obj2 = objArr[i5];
                                if (obj2 == null) {
                                    if (siVar.a(j2) != null || !siVar.b(j2)) {
                                        break loop0;
                                    }
                                } else if (!amr.i(obj2, siVar.a(j2))) {
                                    return false;
                                }
                                c = '\b';
                            }
                            j >>= c;
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j = jArr2[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i3 - length;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        long j2 = jArr[i7];
                        Object obj = objArr[i7];
                        int l = a.l(j2);
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i2 ^ l;
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    break;
                }
            }
            if (i3 == length) {
                break;
            }
            i3++;
        }
        return i4;
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            long[] jArr = this.b;
            Object[] objArr = this.c;
            long[] jArr2 = this.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    long j = jArr2[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = (~(i4 - length)) >>> 31;
                        int i7 = 0;
                        while (true) {
                            i2 = 8 - i6;
                            if (i7 >= i2) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i8 = (i4 << 3) + i7;
                                i3 = i4;
                                long j2 = jArr[i8];
                                Object obj = objArr[i8];
                                sb.append(j2);
                                sb.append("=");
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
                                i5++;
                                if (i5 < this.e) {
                                    sb.append(", ");
                                }
                            } else {
                                i3 = i4;
                            }
                            j >>= 8;
                            i7++;
                            i4 = i3;
                        }
                        int i9 = i4;
                        if (i2 != 8) {
                            break;
                        }
                        i = i9;
                    } else {
                        i = i4;
                    }
                    if (i == length) {
                        break;
                    }
                    i4 = i + 1;
                }
            }
            sb.append('}');
            return sb.toString();
        }
        return "{}";
    }

    public si(byte[] bArr) {
        f(sv.d(10));
    }
}
