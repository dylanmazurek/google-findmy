package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class se {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public se() {
        this.a = sv.a;
        this.b = sh.a;
        this.c = td.c;
    }

    public static /* synthetic */ boolean b(se seVar, int i) {
        int i2 = (-862048943) * i;
        int i3 = seVar.d;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = seVar.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i5;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = ((r2 & 127) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (seVar.b[numberOfTrailingZeros] == i) {
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

    private final void f() {
        this.f = sv.a(this.d) - this.e;
    }

    private final void g(int i) {
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
        f();
        this.b = new int[i2];
        this.c = new Object[i2];
    }

    private final void h(int i) {
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i2;
        long[] jArr2 = this.a;
        int[] iArr2 = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.d;
        g(i);
        int[] iArr3 = this.b;
        Object[] objArr3 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                int i5 = iArr2[i4];
                int i6 = (-862048943) * i5;
                int i7 = i6 ^ (i6 << 16);
                int e = e(i7 >>> 7);
                long[] jArr3 = this.a;
                int i8 = e >> 3;
                int i9 = (e & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                long j = i7 & 127;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j << i9);
                int i10 = this.d;
                int i11 = ((e - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                objArr = objArr2;
                i2 = i3;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j << i13);
                iArr3[e] = i5;
                objArr3[e] = objArr[i4];
            } else {
                jArr = jArr2;
                iArr = iArr2;
                objArr = objArr2;
                i2 = i3;
            }
            i4++;
            objArr2 = objArr;
            jArr2 = jArr;
            iArr2 = iArr;
            i3 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:            if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Le:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L57
            goto L66
        L57:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L42
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r15 = r14.c
            r15 = r15[r10]
            return r15
        L6d:
            r15 = 0
            return r15
        L6f:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.a(int):java.lang.Object");
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
        mkm.e(this.c, null, 0, this.d);
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:            if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:            r2 = e(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:            if (r20.f != 0) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:            if (((r20.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:            r2 = r20.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:            if (r2 <= 8) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:            if (java.lang.Long.compare((r20.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:            h(defpackage.sv.b(r20.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:            r2 = e(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:            h(defpackage.sv.b(r20.d));     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:            r10 = r2;        r20.e++;        r2 = r20.f;        r3 = r20.a;        r4 = r10 >> 3;        r11 = r3[r4];        r5 = (r10 & 7) << 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:            if (((r11 >> r5) & 255) != 128) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:            r14 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:            r20.f = r2 - r14;        r3[r4] = (r11 & (~(255 << r5))) | (r6 << r5);        r2 = r20.d;        r4 = ((r10 - 7) & r2) + (r2 & 7);        r2 = r4 >> 3;        r4 = (r4 & 7) << 3;        r3[r2] = (r6 << r4) | ((~(255 << r4)) & r3[r2]);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.d(int, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        if (seVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                int i6 = iArr[i5];
                                Object obj2 = objArr[i5];
                                if (obj2 == null) {
                                    if (seVar.a(i6) != null || !b(seVar, i6)) {
                                        break loop0;
                                    }
                                } else if (!amr.i(obj2, seVar.a(i6))) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long j = jArr[i3];
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
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i2 ^ i8;
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
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            int[] iArr = this.b;
            Object[] objArr = this.c;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = (~(i2 - length)) >>> 31;
                        int i5 = 0;
                        while (true) {
                            i = 8 - i4;
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                Object obj = objArr[i6];
                                sb.append(i7);
                                sb.append("=");
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
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

    public se(int i) {
        this.a = sv.a;
        this.b = sh.a;
        this.c = td.c;
        if (i >= 0) {
            g(sv.d(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public /* synthetic */ se(byte[] bArr) {
        this(6);
    }
}
