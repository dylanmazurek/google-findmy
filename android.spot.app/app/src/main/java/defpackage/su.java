package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class su {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public su(int i) {
        this.a = sv.a;
        Object[] objArr = td.c;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            j(sv.d(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    private final int h(int i) {
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

    private final void i() {
        this.f = sv.a(this.d) - this.e;
    }

    private final void j(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        int i3 = 0;
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
            int i4 = i2 >> 3;
            long j = 255 << ((i2 & 7) << 3);
            jArr[i4] = (jArr[i4] & (~j)) | j;
        }
        this.a = jArr;
        i();
        if (i2 == 0) {
            objArr = td.c;
        } else {
            i3 = i2;
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i3 == 0) {
            objArr2 = td.c;
        } else {
            objArr2 = new Object[i3];
        }
        this.c = objArr2;
    }

    private final void k(int i) {
        long[] jArr;
        int i2;
        int i3;
        su suVar = this;
        long[] jArr2 = suVar.a;
        Object[] objArr = suVar.b;
        Object[] objArr2 = suVar.c;
        int i4 = suVar.d;
        j(i);
        Object[] objArr3 = suVar.b;
        Object[] objArr4 = suVar.c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                int i6 = i3 * (-862048943);
                int i7 = i6 ^ (i6 << 16);
                int h = suVar.h(i7 >>> 7);
                long[] jArr3 = suVar.a;
                int i8 = h >> 3;
                int i9 = (h & 7) << 3;
                i2 = i5;
                long j = i7 & 127;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j << i9);
                int i10 = suVar.d;
                int i11 = ((h - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr = jArr2;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j << i13);
                objArr3[h] = obj;
                objArr4[h] = objArr2[i2];
            } else {
                jArr = jArr2;
                i2 = i5;
            }
            i5 = i2 + 1;
            suVar = this;
            jArr2 = jArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:            if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            int r2 = r14.d
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L15:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
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
        L4a:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L68
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.amr.i(r11, r15)
            if (r11 == 0) goto L63
            goto L72
        L63:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L4a
        L68:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L7b
            r10 = -1
        L72:
            if (r10 < 0) goto L79
            java.lang.Object[] r15 = r14.c
            r15 = r15[r10]
            return r15
        L79:
            r15 = 0
            return r15
        L7b:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.a(java.lang.Object):java.lang.Object");
    }

    public final boolean b(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = this.d;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = (i4 >>> 7) & i2;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i4;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = ((i4 & 127) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i2;
                if (amr.i(this.b[numberOfTrailingZeros], obj)) {
                    if (numberOfTrailingZeros >= 0) {
                        return true;
                    }
                    return false;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) == 0) {
                i6 += 8;
                i5 = (i5 + i6) & i2;
                i4 = i9;
            } else {
                return false;
            }
        }
    }

    public final int c(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 >>> 7;
        int i5 = this.d;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            int i10 = 1;
            int i11 = i3;
            long j = i3 & 127;
            long j2 = (((-i9) >> 63) & (jArr[i8 + 1] << (64 - i9))) | (jArr[i8] >>> i9);
            long j3 = (72340172838076673L * j) ^ j2;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (amr.i(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                int h = h(i4);
                if (this.f == 0 && ((this.a[h >> 3] >> ((h & 7) << 3)) & 255) != 254) {
                    int i12 = this.d;
                    if (i12 > 8 && Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i12 * 25) ^ Long.MIN_VALUE) <= 0) {
                        k(sv.b(this.d));
                    } else {
                        k(sv.b(this.d));
                    }
                    h = h(i4);
                }
                this.e++;
                int i13 = this.f;
                long[] jArr2 = this.a;
                int i14 = h >> 3;
                long j5 = jArr2[i14];
                int i15 = (h & 7) << 3;
                if (((j5 >> i15) & 255) != 128) {
                    i10 = 0;
                }
                this.f = i13 - i10;
                jArr2[i14] = (j5 & (~(255 << i15))) | (j << i15);
                int i16 = this.d;
                int i17 = ((h - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = (j << i19) | ((~(255 << i19)) & jArr2[i18]);
                return ~h;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i11;
        }
    }

    public final void d() {
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
        mkm.e(this.b, null, 0, this.d);
        i();
    }

    public final void e(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0) {
            c = ~c;
        }
        this.b[c] = obj;
        this.c[c] = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        if (suVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                                Object obj2 = objArr[i5];
                                Object obj3 = objArr2[i5];
                                if (obj3 == null) {
                                    if (suVar.a(obj2) != null || !suVar.b(obj2)) {
                                        break loop0;
                                    }
                                } else if (!amr.i(obj3, suVar.a(obj2))) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:            if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:            r10 = -1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            int r2 = r14.d
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L15:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
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
        L4a:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L68
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.amr.i(r11, r15)
            if (r11 == 0) goto L63
            goto L72
        L63:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L4a
        L68:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L78
            r10 = -1
        L72:
            if (r10 < 0) goto L77
            r14.g(r10)
        L77:
            return
        L78:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.f(java.lang.Object):void");
    }

    public final void g(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = i4 - length;
                int i7 = 0;
                while (true) {
                    i = 8 - ((~i6) >>> 31);
                    if (i7 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr[i8];
                        Object obj2 = objArr2[i8];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj2 != null) {
                            i3 = obj2.hashCode();
                        } else {
                            i3 = 0;
                        }
                        i5 += i3 ^ i2;
                    }
                    j >>= 8;
                    i7++;
                }
                if (i != 8) {
                    break;
                }
            }
            if (i4 == length) {
                break;
            }
            i4++;
        }
        return i5;
    }

    public final String toString() {
        int i;
        if (this.e != 0) {
            StringBuilder sb = new StringBuilder("{");
            Object[] objArr = this.b;
            Object[] objArr2 = this.c;
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
                                Object obj = objArr[i6];
                                Object obj2 = objArr2[i6];
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
                                sb.append("=");
                                if (obj2 == this) {
                                    obj2 = "(this)";
                                }
                                sb.append(obj2);
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

    public /* synthetic */ su(byte[] bArr) {
        this(6);
    }

    public su() {
        this.a = sv.a;
        Object[] objArr = td.c;
        this.b = objArr;
        this.c = objArr;
    }
}
