package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sr {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public sr(int i) {
        this.a = sv.a;
        this.b = td.c;
        this.c = sh.a;
        g(sv.d(i));
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

    private final int f(Object obj) {
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
                int e = e(i4);
                if (this.f == 0 && ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) != 254) {
                    int i12 = this.d;
                    if (i12 > 8 && Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i12 * 25) ^ Long.MIN_VALUE) <= 0) {
                        h(sv.b(this.d));
                    } else {
                        h(sv.b(this.d));
                    }
                    e = e(i4);
                }
                this.e++;
                int i13 = this.f;
                long[] jArr2 = this.a;
                int i14 = e >> 3;
                long j5 = jArr2[i14];
                int i15 = (e & 7) << 3;
                if (((j5 >> i15) & 255) != 128) {
                    i10 = 0;
                }
                this.f = i13 - i10;
                jArr2[i14] = (j5 & (~(255 << i15))) | (j << i15);
                int i16 = this.d;
                int i17 = ((e - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = (j << i19) | ((~(255 << i19)) & jArr2[i18]);
                return ~e;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i11;
        }
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
        this.f = sv.a(this.d) - this.e;
        this.b = new Object[i2];
        this.c = new int[i2];
    }

    private final void h(int i) {
        long[] jArr;
        int i2;
        int i3;
        sr srVar = this;
        long[] jArr2 = srVar.a;
        Object[] objArr = srVar.b;
        int[] iArr = srVar.c;
        int i4 = srVar.d;
        g(i);
        Object[] objArr2 = srVar.b;
        int[] iArr2 = srVar.c;
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
                int e = srVar.e(i7 >>> 7);
                long[] jArr3 = srVar.a;
                int i8 = e >> 3;
                int i9 = (e & 7) << 3;
                i2 = i5;
                long j = i7 & 127;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j << i9);
                int i10 = srVar.d;
                int i11 = ((e - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr = jArr2;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j << i13);
                objArr2[e] = obj;
                iArr2[e] = iArr[i2];
            } else {
                jArr = jArr2;
                i2 = i5;
            }
            i5 = i2 + 1;
            srVar = this;
            jArr2 = jArr;
        }
    }

    public final int a(Object obj) {
        int i;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.d;
        int i4 = i * (-862048943);
        int i5 = (i4 ^ (i4 << 16)) >>> 7;
        while (true) {
            int i6 = i5 & i3;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ ((r1 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i3;
                if (amr.i(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i5 = i6 + i2;
        }
    }

    public final void b(int i) {
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
    }

    public final void c(Object obj, int i) {
        int f = f(obj);
        if (f < 0) {
            f = ~f;
        }
        this.b[f] = obj;
        this.c[f] = i;
    }

    public final int d(Object obj, int i) {
        int i2;
        int f = f(obj);
        if (f < 0) {
            f = ~f;
            i2 = -1;
        } else {
            i2 = this.c[f];
        }
        this.b[f] = obj;
        this.c[f] = i;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        if (srVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                                Object obj2 = objArr[i5];
                                int i6 = iArr[i5];
                                int a = srVar.a(obj2);
                                if (a >= 0) {
                                    if (i6 != srVar.c[a]) {
                                        return false;
                                    }
                                } else {
                                    throw new NoSuchElementException(a.af(obj2, "There is no key ", " in the map"));
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
        int i2;
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        Object obj = objArr[i7];
                        int i8 = iArr[i7];
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        i4 += i8 ^ i2;
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
            Object[] objArr = this.b;
            int[] iArr = this.c;
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
                                int i7 = iArr[i6];
                                if (obj == this) {
                                    obj = "(this)";
                                }
                                sb.append(obj);
                                sb.append("=");
                                sb.append(i7);
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

    public /* synthetic */ sr(byte[] bArr) {
        this(6);
    }

    public sr() {
        this.a = sv.a;
        this.b = td.c;
        this.c = sh.a;
    }
}
