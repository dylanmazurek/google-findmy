package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akn {
    public static final akn a = new akn(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final akz e;

    public akn(int i, int i2, Object[] objArr, akz akzVar) {
        this.c = i;
        this.d = i2;
        this.e = akzVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int bitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = bitCount + bitCount; i < length; i++) {
            bitCount += i(i).n();
        }
        return bitCount;
    }

    private final akn o(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, akz akzVar) {
        if (i3 > 30) {
            return new akn(0, 0, new Object[]{obj, obj2, obj3, obj4}, akzVar);
        }
        int a2 = akr.a(i, i3);
        int a3 = akr.a(i2, i3);
        if (a2 != a3) {
            Object[] objArr = new Object[4];
            if (a2 < a3) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new akn((1 << a2) | (1 << a3), 0, objArr, akzVar);
        }
        return new akn(0, 1 << a2, new Object[]{o(i, obj, obj2, i2, obj3, obj4, i3 + 5, akzVar)}, akzVar);
    }

    private final akn p(int i, ajy ajyVar) {
        ajyVar.f(ajyVar.a() - 1);
        ajyVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e == ajyVar.a) {
            this.b = akr.c(objArr, i);
            return this;
        }
        return new akn(0, 0, akr.c(objArr, i), ajyVar.a);
    }

    private final akn q(int i, int i2, ajy ajyVar) {
        ajyVar.f(ajyVar.a() - 1);
        ajyVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e == ajyVar.a) {
            this.b = akr.c(objArr, i);
            this.c ^= i2;
            return this;
        }
        return new akn(i2 ^ this.c, this.d, akr.c(objArr, i), ajyVar.a);
    }

    private final akn r(akn aknVar, akn aknVar2, int i, int i2, akz akzVar) {
        if (aknVar2 == null) {
            Object[] objArr = this.b;
            if (objArr.length == 1) {
                return null;
            }
            if (this.e == akzVar) {
                this.b = akr.d(objArr, i);
                this.d ^= i2;
            } else {
                return new akn(this.c, i2 ^ this.d, akr.d(objArr, i), akzVar);
            }
        } else if (this.e == akzVar || aknVar != aknVar2) {
            return s(i, aknVar2, akzVar);
        }
        return this;
    }

    private final akn s(int i, akn aknVar, akz akzVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (aknVar.b.length == 2 && aknVar.d == 0) {
                aknVar.c = this.d;
                return aknVar;
            }
            length = 1;
        }
        if (this.e == akzVar) {
            objArr[i] = aknVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        copyOf.getClass();
        copyOf[i] = aknVar;
        return new akn(this.c, this.d, copyOf, akzVar);
    }

    private final akn t(int i, int i2, akn aknVar) {
        Object[] objArr = aknVar.b;
        if (objArr.length == 2 && aknVar.d == 0) {
            if (this.b.length == 1) {
                aknVar.c = this.d;
                return aknVar;
            }
            int b = b(i2);
            Object[] objArr2 = this.b;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            int length = objArr2.length;
            Object[] copyOf = Arrays.copyOf(objArr2, length + 1);
            copyOf.getClass();
            mkm.q(copyOf, copyOf, i + 2, i + 1, length);
            mkm.q(copyOf, copyOf, b + 2, b, i);
            copyOf[b] = obj;
            copyOf[b + 1] = obj2;
            return new akn(this.c ^ i2, i2 ^ this.d, copyOf);
        }
        Object[] objArr3 = this.b;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2.getClass();
        copyOf2[i] = aknVar;
        return new akn(this.c, this.d, copyOf2);
    }

    private final Object u(int i) {
        return this.b[i];
    }

    private final Object v(int i) {
        return this.b[i + 1];
    }

    private final boolean w(Object obj) {
        mqf aj = moz.aj(moz.ak(0, this.b.length), 2);
        int i = aj.a;
        int i2 = aj.b;
        int i3 = aj.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!amr.i(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean x(akn aknVar) {
        if (this == aknVar) {
            return true;
        }
        if (this.d != aknVar.d || this.c != aknVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != aknVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean y(int i) {
        if ((i & this.d) != 0) {
            return true;
        }
        return false;
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, akz akzVar) {
        int i5;
        Object u = u(i);
        if (u != null) {
            i5 = u.hashCode();
        } else {
            i5 = 0;
        }
        akn o = o(i5, u, v(i), i3, obj, obj2, i4 + 5, akzVar);
        int c = c(i2);
        int i6 = c + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        mkm.y(objArr, objArr2, 0, i, 6);
        mkm.q(objArr, objArr2, i, i + 2, i6);
        objArr2[c - 1] = o;
        mkm.q(objArr, objArr2, c, i6, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int bitCount = Integer.bitCount((i - 1) & this.c);
        return bitCount + bitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount((i - 1) & this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:            if (r11 == null) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:            r11.a = t(r2, r0, r11.a);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:            return r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:            if (r11 == null) goto L80;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akm d(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akn.d(int, java.lang.Object, java.lang.Object, int):akm");
    }

    public final akn e(int i, Object obj, Object obj2, int i2, ajy ajyVar) {
        akn e;
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (amr.i(obj, u(b))) {
                ajyVar.c = v(b);
                if (v(b) != obj2) {
                    int i3 = b + 1;
                    if (this.e == ajyVar.a) {
                        this.b[i3] = obj2;
                    } else {
                        ajyVar.d++;
                        Object[] objArr = this.b;
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        copyOf.getClass();
                        copyOf[i3] = obj2;
                        return new akn(this.c, this.d, copyOf, ajyVar.a);
                    }
                }
            } else {
                ajyVar.f(ajyVar.a() + 1);
                akz akzVar = ajyVar.a;
                if (this.e == akzVar) {
                    this.b = z(b, a2, i, obj, obj2, i2, akzVar);
                    this.c ^= a2;
                    this.d |= a2;
                } else {
                    return new akn(this.c ^ a2, this.d | a2, z(b, a2, i, obj, obj2, i2, akzVar), akzVar);
                }
            }
        } else if (y(a2)) {
            int c = c(a2);
            akn i4 = i(c);
            if (i2 == 30) {
                mqf aj = moz.aj(moz.ak(0, i4.b.length), 2);
                int i5 = aj.a;
                int i6 = aj.b;
                int i7 = aj.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!amr.i(obj, i4.u(i5))) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    int i8 = i5 + 1;
                    ajyVar.c = i4.v(i5);
                    if (i4.e == ajyVar.a) {
                        i4.b[i8] = obj2;
                        e = i4;
                    } else {
                        ajyVar.d++;
                        Object[] objArr2 = i4.b;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2.getClass();
                        copyOf2[i8] = obj2;
                        e = new akn(0, 0, copyOf2, ajyVar.a);
                    }
                }
                ajyVar.f(ajyVar.a() + 1);
                e = new akn(0, 0, akr.b(i4.b, 0, obj, obj2), ajyVar.a);
                break;
            }
            e = i4.e(i, obj, obj2, i2 + 5, ajyVar);
            if (i4 != e) {
                return s(c, e, ajyVar.a);
            }
        } else {
            ajyVar.f(ajyVar.a() + 1);
            akz akzVar2 = ajyVar.a;
            int b2 = b(a2);
            if (this.e == akzVar2) {
                this.b = akr.b(this.b, b2, obj, obj2);
                this.c |= a2;
            } else {
                return new akn(this.c | a2, this.d, akr.b(this.b, b2, obj, obj2), akzVar2);
            }
        }
        return this;
    }

    public final akn f(akn aknVar, int i, akx akxVar, ajy ajyVar) {
        akn aknVar2;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        akn aknVar3;
        akn o;
        int i5;
        int i6;
        int i7;
        if (this == aknVar) {
            akxVar.a += n();
            return this;
        }
        if (i > 30) {
            akz akzVar = ajyVar.a;
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + aknVar.b.length);
            copyOf.getClass();
            int length = this.b.length;
            mqf aj = moz.aj(moz.ak(0, aknVar.b.length), 2);
            int i8 = aj.a;
            int i9 = aj.b;
            int i10 = aj.c;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (true) {
                    if (!w(aknVar.b[i8])) {
                        Object[] objArr3 = aknVar.b;
                        copyOf[length] = objArr3[i8];
                        copyOf[length + 1] = objArr3[i8 + 1];
                        length += 2;
                    } else {
                        akxVar.a++;
                    }
                    if (i8 == i9) {
                        break;
                    }
                    i8 += i10;
                }
            }
            if (length != this.b.length) {
                if (length != aknVar.b.length) {
                    if (length == copyOf.length) {
                        return new akn(0, 0, copyOf, akzVar);
                    }
                    Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                    copyOf2.getClass();
                    return new akn(0, 0, copyOf2, akzVar);
                }
                return aknVar;
            }
            return this;
        }
        int i11 = this.d | aknVar.d;
        int i12 = this.c;
        int i13 = aknVar.c;
        int i14 = i12 ^ i13;
        int i15 = i12 & i13;
        int i16 = (~i11) & i14;
        while (i15 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i15);
            if (amr.i(u(b(lowestOneBit)), aknVar.u(aknVar.b(lowestOneBit)))) {
                i16 |= lowestOneBit;
            } else {
                i11 |= lowestOneBit;
            }
            i15 ^= lowestOneBit;
        }
        if ((i11 & i16) != 0) {
            ael.b("Check failed.");
        }
        if (amr.i(this.e, ajyVar.a) && this.c == i16 && this.d == i11) {
            aknVar2 = this;
        } else {
            int bitCount = Integer.bitCount(i16);
            aknVar2 = new akn(i16, i11, new Object[bitCount + bitCount + Integer.bitCount(i11)]);
        }
        int i17 = i11;
        int i18 = 0;
        while (i17 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i17);
            Object[] objArr4 = aknVar2.b;
            int length2 = (objArr4.length - 1) - i18;
            if (y(lowestOneBit2)) {
                o = i(c(lowestOneBit2));
                if (aknVar.y(lowestOneBit2)) {
                    o = o.f(aknVar.i(aknVar.c(lowestOneBit2)), i + 5, akxVar, ajyVar);
                } else if (aknVar.m(lowestOneBit2)) {
                    int i19 = i + 5;
                    int b = aknVar.b(lowestOneBit2);
                    Object u = aknVar.u(b);
                    Object v = aknVar.v(b);
                    int a2 = ajyVar.a();
                    if (u != null) {
                        i7 = u.hashCode();
                    } else {
                        i7 = 0;
                    }
                    o = o.e(i7, u, v, i19, ajyVar);
                    if (ajyVar.a() == a2) {
                        akxVar.a++;
                    }
                }
            } else if (aknVar.y(lowestOneBit2)) {
                o = aknVar.i(aknVar.c(lowestOneBit2));
                if (m(lowestOneBit2)) {
                    int i20 = i + 5;
                    int b2 = b(lowestOneBit2);
                    Object u2 = u(b2);
                    if (u2 != null) {
                        i5 = u2.hashCode();
                    } else {
                        i5 = 0;
                    }
                    if (o.l(i5, u2, i20)) {
                        akxVar.a++;
                    } else {
                        Object v2 = v(b2);
                        if (u2 != null) {
                            i6 = u2.hashCode();
                        } else {
                            i6 = 0;
                        }
                        o = o.e(i6, u2, v2, i20, ajyVar);
                    }
                }
            } else {
                int i21 = i + 5;
                int b3 = b(lowestOneBit2);
                Object u3 = u(b3);
                Object v3 = v(b3);
                int b4 = aknVar.b(lowestOneBit2);
                Object u4 = aknVar.u(b4);
                Object v4 = aknVar.v(b4);
                if (u3 != null) {
                    i2 = u3.hashCode();
                } else {
                    i2 = 0;
                }
                if (u4 != null) {
                    i3 = u4.hashCode();
                } else {
                    i3 = 0;
                }
                objArr = objArr4;
                i4 = lowestOneBit2;
                aknVar3 = aknVar2;
                o = o(i2, u3, v3, i3, u4, v4, i21, ajyVar.a);
                objArr[length2] = o;
                i17 ^= i4;
                i18++;
                aknVar2 = aknVar3;
            }
            objArr = objArr4;
            i4 = lowestOneBit2;
            aknVar3 = aknVar2;
            objArr[length2] = o;
            i17 ^= i4;
            i18++;
            aknVar2 = aknVar3;
        }
        akn aknVar4 = aknVar2;
        int i22 = 0;
        while (i16 != 0) {
            int i23 = i22 + i22;
            int i24 = i23 + 1;
            int lowestOneBit3 = Integer.lowestOneBit(i16);
            if (!aknVar.m(lowestOneBit3)) {
                int b5 = b(lowestOneBit3);
                aknVar4.b[i23] = u(b5);
                aknVar4.b[i24] = v(b5);
            } else {
                int b6 = aknVar.b(lowestOneBit3);
                aknVar4.b[i23] = aknVar.u(b6);
                aknVar4.b[i24] = aknVar.v(b6);
                if (m(lowestOneBit3)) {
                    akxVar.a++;
                }
            }
            i16 ^= lowestOneBit3;
            i22++;
        }
        if (!x(aknVar4)) {
            if (!aknVar.x(aknVar4)) {
                return aknVar4;
            }
            return aknVar;
        }
        return this;
    }

    public final akn g(int i, Object obj, int i2, ajy ajyVar) {
        akn g;
        akn aknVar;
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (amr.i(obj, u(b))) {
                return q(b, a2, ajyVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            akn i3 = i(c);
            if (i2 == 30) {
                mqf aj = moz.aj(moz.ak(0, i3.b.length), 2);
                int i4 = aj.a;
                int i5 = aj.b;
                int i6 = aj.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!amr.i(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    g = i3.p(i4, ajyVar);
                }
                aknVar = i3;
                return r(i3, aknVar, c, a2, ajyVar.a);
            }
            g = i3.g(i, obj, i2 + 5, ajyVar);
            aknVar = g;
            return r(i3, aknVar, c, a2, ajyVar.a);
        }
        return this;
    }

    public final akn h(int i, Object obj, Object obj2, int i2, ajy ajyVar) {
        akn h;
        akn aknVar;
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (amr.i(obj, u(b)) && amr.i(obj2, v(b))) {
                return q(b, a2, ajyVar);
            }
        } else if (y(a2)) {
            int c = c(a2);
            akn i3 = i(c);
            if (i2 == 30) {
                mqf aj = moz.aj(moz.ak(0, i3.b.length), 2);
                int i4 = aj.a;
                int i5 = aj.b;
                int i6 = aj.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (amr.i(obj, i3.u(i4)) && amr.i(obj2, i3.v(i4))) {
                            h = i3.p(i4, ajyVar);
                            break;
                        }
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    }
                }
                aknVar = i3;
                return r(i3, aknVar, c, a2, ajyVar.a);
            }
            h = i3.h(i, obj, obj2, i2 + 5, ajyVar);
            aknVar = h;
            return r(i3, aknVar, c, a2, ajyVar.a);
        }
        return this;
    }

    public final akn i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (akn) obj;
    }

    public final akn j(int i, Object obj, int i2) {
        akn j;
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (amr.i(obj, u(b))) {
                Object[] objArr = this.b;
                if (objArr.length == 2) {
                    return null;
                }
                return new akn(this.c ^ a2, this.d, akr.c(objArr, b));
            }
            return this;
        }
        if (y(a2)) {
            int c = c(a2);
            akn i3 = i(c);
            if (i2 == 30) {
                mqf aj = moz.aj(moz.ak(0, i3.b.length), 2);
                int i4 = aj.a;
                int i5 = aj.b;
                int i6 = aj.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!amr.i(obj, i3.u(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Object[] objArr2 = i3.b;
                    if (objArr2.length == 2) {
                        j = null;
                    } else {
                        j = new akn(0, 0, akr.c(objArr2, i4));
                    }
                }
                j = i3;
                break;
            }
            j = i3.j(i, obj, i2 + 5);
            if (j == null) {
                Object[] objArr3 = this.b;
                if (objArr3.length == 1) {
                    return null;
                }
                return new akn(this.c, this.d ^ a2, akr.d(objArr3, c));
            }
            if (i3 != j) {
                return t(c, a2, j);
            }
            return this;
        }
        return this;
    }

    public final Object k(int i, Object obj, int i2) {
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            int b = b(a2);
            if (!amr.i(obj, u(b))) {
                return null;
            }
            return v(b);
        }
        if (!y(a2)) {
            return null;
        }
        akn i3 = i(c(a2));
        if (i2 == 30) {
            mqf aj = moz.aj(moz.ak(0, i3.b.length), 2);
            int i4 = aj.a;
            int i5 = aj.b;
            int i6 = aj.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return null;
            }
            while (!amr.i(obj, i3.u(i4))) {
                if (i4 == i5) {
                    return null;
                }
                i4 += i6;
            }
            return i3.v(i4);
        }
        return i3.k(i, obj, i2 + 5);
    }

    public final boolean l(int i, Object obj, int i2) {
        int a2 = 1 << akr.a(i, i2);
        if (m(a2)) {
            return amr.i(obj, u(b(a2)));
        }
        if (y(a2)) {
            akn i3 = i(c(a2));
            if (i2 == 30) {
                return i3.w(obj);
            }
            return i3.l(i, obj, i2 + 5);
        }
        return false;
    }

    public final boolean m(int i) {
        if ((i & this.c) != 0) {
            return true;
        }
        return false;
    }

    public akn(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
