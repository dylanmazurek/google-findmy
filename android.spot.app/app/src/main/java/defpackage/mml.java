package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mml implements Map, Serializable, mps {
    public static final mml a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private mmn l;
    private mmo m;
    private mmm n;

    static {
        mml mmlVar = new mml(0);
        mmlVar.h = true;
        a = mmlVar;
    }

    public mml() {
        this(8);
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.k;
    }

    private final void n(int i) {
        Object[] objArr;
        int d = d();
        int i2 = this.e;
        int i3 = d - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            p(l());
            return;
        }
        int i5 = this.e + i;
        if (i5 >= 0) {
            if (i5 > d()) {
                int z = mkm.z(d(), i5);
                this.b = mkm.C(this.b, z);
                Object[] objArr2 = this.c;
                if (objArr2 != null) {
                    objArr = mkm.C(objArr2, z);
                } else {
                    objArr = null;
                }
                this.c = objArr;
                int[] copyOf = Arrays.copyOf(this.d, z);
                copyOf.getClass();
                this.d = copyOf;
                int D = mjo.D(z);
                if (D > l()) {
                    p(D);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void o() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:            r3[r0] = r7;        r6.d[r2] = r0;        r2 = r7;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(int r7) {
        /*
            r6 = this;
            r6.o()
            int r0 = r6.e
            int r1 = r6.g
            r2 = 0
            if (r0 <= r1) goto L37
            java.lang.Object[] r0 = r6.c
            r1 = 0
            r3 = 0
        Le:
            int r4 = r6.e
            if (r1 >= r4) goto L29
            int[] r4 = r6.d
            r4 = r4[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r4 = r6.b
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L24
            r4 = r0[r1]
            r0[r3] = r4
        L24:
            int r3 = r3 + 1
        L26:
            int r1 = r1 + 1
            goto Le
        L29:
            java.lang.Object[] r1 = r6.b
            defpackage.mkm.B(r1, r3, r4)
            if (r0 == 0) goto L35
            int r1 = r6.e
            defpackage.mkm.B(r0, r3, r1)
        L35:
            r6.e = r3
        L37:
            int r0 = r6.l()
            if (r7 == r0) goto L48
            int[] r0 = new int[r7]
            r6.i = r0
            int r7 = defpackage.mjo.E(r7)
            r6.k = r7
            goto L51
        L48:
            int[] r7 = r6.i
            int r0 = r6.l()
            defpackage.mkm.u(r7, r2, r0)
        L51:
            int r7 = r6.e
            if (r2 >= r7) goto L88
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.b
            r0 = r0[r2]
            int r0 = r6.m(r0)
            int r1 = r6.j
        L61:
            int[] r3 = r6.i
            r4 = r3[r0]
            if (r4 != 0) goto L6f
            r3[r0] = r7
            int[] r1 = r6.d
            r1[r2] = r0
            r2 = r7
            goto L51
        L6f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L80
            int r3 = r0 + (-1)
            if (r0 != 0) goto L7e
            int r0 = r6.l()
            int r0 = r0 + (-1)
            goto L61
        L7e:
            r0 = r3
            goto L61
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mml.p(int):void");
    }

    private final Object writeReplace() {
        if (this.h) {
            return new mmq(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        g();
        while (true) {
            int m = m(obj);
            int i = this.j;
            int i2 = i + i;
            int l = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[m];
                if (i4 <= 0) {
                    if (this.e >= d()) {
                        n(1);
                    } else {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = m;
                        this.i[m] = i6;
                        this.g++;
                        o();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                } else {
                    if (amr.i(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > moz.ad(i2, l)) {
                        int l2 = l();
                        p(l2 + l2);
                        break;
                    }
                    int i7 = m - 1;
                    if (m == 0) {
                        m = l() - 1;
                    } else {
                        m = i7;
                    }
                }
            }
        }
    }

    public final int b(Object obj) {
        int m = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[m];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (amr.i(this.b[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = m - 1;
            if (m == 0) {
                m = l() - 1;
            } else {
                m = i4;
            }
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (amr.i(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        g();
        mmb it = new mqg(0, this.e - 1).iterator();
        while (it.a) {
            int a2 = it.a();
            int[] iArr = this.d;
            int i = iArr[a2];
            if (i >= 0) {
                this.i[i] = 0;
                iArr[a2] = -1;
            }
        }
        mkm.B(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            mkm.B(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        o();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.b.length;
    }

    public final int e(Object obj) {
        g();
        int b = b(obj);
        if (b < 0) {
            return -1;
        }
        h(b);
        return b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        mmm mmmVar = this.n;
        if (mmmVar == null) {
            mmm mmmVar2 = new mmm(this);
            this.n = mmmVar2;
            return mmmVar2;
        }
        return mmmVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && i(map.entrySet())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Map f() {
        g();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        mml mmlVar = a;
        mmlVar.getClass();
        return mmlVar;
    }

    public final void g() {
        if (!this.h) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int b = b(obj);
        if (b < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[b];
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:2:0x001a->B:19:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            defpackage.mkm.A(r0, r11)
            int[] r0 = r10.d
            r0 = r0[r11]
            int r1 = r10.j
            int r1 = r1 + r1
            int r2 = r10.l()
            int r2 = r2 >> 1
            int r1 = defpackage.moz.ad(r1, r2)
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L1a:
            r5 = -1
            if (r0 != 0) goto L23
            int r0 = r10.l()
            int r0 = r0 + r5
            goto L25
        L23:
            int r0 = r0 + (-1)
        L25:
            int r4 = r4 + 1
            int r6 = r10.j
            if (r4 <= r6) goto L30
            int[] r0 = r10.i
            r0[r1] = r2
            goto L63
        L30:
            int[] r6 = r10.i
            r7 = r6[r0]
            if (r7 != 0) goto L39
            r6[r1] = r2
            goto L63
        L39:
            if (r7 >= 0) goto L40
            r6[r1] = r5
        L3d:
            r1 = r0
            r4 = 0
            goto L5c
        L40:
            java.lang.Object[] r6 = r10.b
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r10.m(r6)
            int r6 = r6 - r0
            int r9 = r10.l()
            int r9 = r9 + r5
            r6 = r6 & r9
            if (r6 < r4) goto L5c
            int[] r4 = r10.i
            r4[r1] = r7
            int[] r4 = r10.d
            r4[r8] = r1
            goto L3d
        L5c:
            int r3 = r3 + r5
            if (r3 >= 0) goto L1a
            int[] r0 = r10.i
            r0[r1] = r5
        L63:
            int[] r0 = r10.d
            r0[r11] = r5
            int r11 = r10.g
            int r11 = r11 + r5
            r10.g = r11
            r10.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mml.h(int):void");
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        mmh mmhVar = new mmh(this);
        int i3 = 0;
        while (mmhVar.hasNext()) {
            int i4 = mmhVar.b;
            mml mmlVar = mmhVar.a;
            if (i4 < mmlVar.e) {
                mmhVar.b = i4 + 1;
                mmhVar.c = i4;
                Object obj = mmlVar.b[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = mmhVar.a.c;
                objArr.getClass();
                Object obj2 = objArr[mmhVar.c];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                mmhVar.b();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!j((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.g == 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Map.Entry entry) {
        int b = b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return amr.i(objArr[b], entry.getValue());
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[d()];
        this.c = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        mmn mmnVar = this.l;
        if (mmnVar == null) {
            mmn mmnVar2 = new mmn(this);
            this.l = mmnVar2;
            return mmnVar2;
        }
        return mmnVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        int a2 = a(obj);
        Object[] k = k();
        if (a2 < 0) {
            int i = (-a2) - 1;
            Object obj3 = k[i];
            k[i] = obj2;
            return obj3;
        }
        k[a2] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        g();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            n(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a2 = a(entry.getKey());
                Object[] k = k();
                if (a2 >= 0) {
                    k[a2] = entry.getValue();
                } else {
                    int i = (-a2) - 1;
                    if (!amr.i(entry.getValue(), k[i])) {
                        k[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int e = e(obj);
        if (e < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[e];
        mkm.A(objArr, e);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        mmh mmhVar = new mmh(this);
        int i = 0;
        while (mmhVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = mmhVar.b;
            mml mmlVar = mmhVar.a;
            if (i2 < mmlVar.e) {
                mmhVar.b = i2 + 1;
                mmhVar.c = i2;
                Object obj = mmlVar.b[i2];
                if (obj == mmlVar) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                mml mmlVar2 = mmhVar.a;
                Object[] objArr = mmlVar2.c;
                objArr.getClass();
                Object obj2 = objArr[mmhVar.c];
                if (obj2 == mmlVar2) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mmhVar.b();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        mmo mmoVar = this.m;
        if (mmoVar == null) {
            mmo mmoVar2 = new mmo(this);
            this.m = mmoVar2;
            return mmoVar2;
        }
        return mmoVar;
    }

    public mml(int i) {
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[mjo.D(i)];
        this.b = objArr;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = mjo.E(l());
    }
}
