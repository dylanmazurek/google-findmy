package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajm extends mlq implements ajb {
    public int a;
    public Object[] b;
    public Object[] c;
    public int d;
    private ajc e;
    private Object[] f;
    private Object[] g;
    private akz h = new akz();

    public ajm(ajc ajcVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = ajcVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final Object[] A(Object[] objArr, int i, Object[][] objArr2) {
        Object[] t;
        mqt mqtVar = new mqt(objArr2, 1);
        int i2 = this.a;
        if ((i >> 5) < (1 << i2)) {
            t = z(objArr, i, i2, mqtVar);
        } else {
            t = t(objArr);
        }
        while (mqtVar.hasNext()) {
            this.a += 5;
            t = w(t);
            int i3 = this.a;
            z(t, 1 << i3, i3, mqtVar);
        }
        return t;
    }

    private final Object[] B(Object[] objArr, Object[] objArr2, int i) {
        int i2 = this.d - 1;
        Object[] t = t(objArr);
        int a = ajs.a(i2, i);
        if (i == 5) {
            t[a] = objArr2;
        } else {
            t[a] = B((Object[]) t[a], objArr2, i - 5);
        }
        return t;
    }

    private final Object[] C(Object[] objArr, int i, int i2, ajj ajjVar) {
        int a = ajs.a(i2, i);
        int i3 = a + 1;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[a];
            Object[] t = t(objArr);
            mkm.q(objArr, t, a, i3, 32);
            t[31] = ajjVar.a;
            ajjVar.a = obj;
            return t;
        }
        if (objArr[31] == null) {
            i4 = ajs.a(i() - 1, i);
        }
        Object[] t2 = t(objArr);
        int i5 = i - 5;
        if (i3 <= i4) {
            while (true) {
                Object obj2 = t2[i4];
                obj2.getClass();
                t2[i4] = C((Object[]) obj2, i5, 0, ajjVar);
                if (i4 == i3) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = t2[a];
        obj3.getClass();
        t2[a] = C((Object[]) obj3, i5, i2, ajjVar);
        return t2;
    }

    private final Object[] D(Object[] objArr, int i, int i2, Object obj, ajj ajjVar) {
        Object[] t = t(objArr);
        int a = ajs.a(i2, i);
        if (i == 0) {
            if (t != objArr) {
                this.modCount++;
            }
            ajjVar.a = t[a];
            t[a] = obj;
            return t;
        }
        Object obj2 = t[a];
        obj2.getClass();
        t[a] = D((Object[]) obj2, i - 5, i2, obj, ajjVar);
        return t;
    }

    private static final void E(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int F(int i) {
        if (i <= 32) {
            return i;
        }
        return i - ajs.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int f(moh mohVar, Object[] objArr, int i, int i2, ajj ajjVar, List list, List list2) {
        Object[] v;
        if (r(objArr)) {
            list.add(objArr);
        }
        Object obj = ajjVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) mohVar.a(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        v = (Object[]) list.remove(list.size() - 1);
                    } else {
                        v = v();
                    }
                    objArr3 = v;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        ajjVar.a = objArr3;
        if (objArr2 != ajjVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int g(moh mohVar, Object[] objArr, int i, ajj ajjVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) mohVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = t(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        ajjVar.a = objArr2;
        return i2;
    }

    private final int h(moh mohVar, int i, ajj ajjVar) {
        int g = g(mohVar, this.c, i, ajjVar);
        if (g == i) {
            return i;
        }
        Object obj = ajjVar.a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        mkm.e(objArr, null, g, i);
        this.c = objArr;
        this.d -= i - g;
        return g;
    }

    private final int i() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return ajs.b(i);
    }

    private final int j() {
        return F(this.d);
    }

    private final Object k(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 == 1) {
            Object obj = this.c[0];
            o(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[i3];
        Object[] t = t(objArr2);
        mkm.q(objArr2, t, i3, i3 + 1, i4);
        t[i4 - 1] = null;
        this.b = objArr;
        this.c = t;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final ListIterator l(int i) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int i2 = i() >> 5;
            a.u(i, i2);
            int i3 = this.a;
            if (i3 == 0) {
                return new ajp(objArr, i);
            }
            return new ajr(objArr, i, i2, i3 / 5);
        }
        throw new IllegalStateException("Invalid root");
    }

    private final void m(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.b != null) {
            int i4 = i >> 5;
            ListIterator l = l(i() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (l.previousIndex() != i4) {
                Object[] objArr4 = (Object[]) l.previous();
                mkm.q(objArr4, objArr3, 0, 32 - i2, 32);
                objArr3 = u(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) l.previous();
            int i6 = i3 - (((i() >> 5) - 1) - i4);
            if (i6 < i3) {
                objArr2 = objArr[i6];
                objArr2.getClass();
            }
            q(collection, i, objArr5, 32, objArr, i6, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    private final void n(Object[] objArr, int i, Object obj) {
        int j = j();
        Object[] t = t(this.c);
        int i2 = i + 1;
        if (j < 32) {
            mkm.q(this.c, t, i2, i, j);
            t[i] = obj;
            this.b = objArr;
            this.c = t;
            this.d++;
            return;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[31];
        mkm.q(objArr2, t, i2, i, 31);
        t[i] = obj;
        p(objArr, t, w(obj2));
    }

    private final void o(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        ajj ajjVar = new ajj(null);
        objArr.getClass();
        Object[] y = y(objArr, i2, i, ajjVar);
        y.getClass();
        Object obj = ajjVar.a;
        obj.getClass();
        this.c = (Object[]) obj;
        this.d = i;
        if (y[1] == null) {
            this.b = (Object[]) y[0];
            this.a = i2 - 5;
        } else {
            this.b = y;
            this.a = i2;
        }
    }

    private final void p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = B(w(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = B(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void q(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] v;
        if (i3 <= 0) {
            ael.a("requires at least one nullBuffer");
        }
        Object[] t = t(objArr);
        objArr2[0] = t;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            mkm.q(t, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                v = t;
            } else {
                v = v();
                i3--;
                objArr2[i3] = v;
            }
            int i8 = i2 - i7;
            mkm.q(t, objArr3, 0, i8, i2);
            mkm.q(t, v, i6, i4, i8);
            objArr3 = v;
        }
        Iterator it = collection.iterator();
        E(t, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] v2 = v();
            E(v2, 0, it);
            objArr2[i9] = v2;
        }
        E(objArr3, 0, it);
    }

    private final boolean r(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.h) {
            return true;
        }
        return false;
    }

    private final Object[] s(Object[] objArr, int i, int i2, Object obj, ajj ajjVar) {
        Object obj2;
        int a = ajs.a(i2, i);
        int i3 = a + 1;
        if (i == 0) {
            ajjVar.a = objArr[31];
            Object[] t = t(objArr);
            mkm.q(objArr, t, i3, a, 31);
            t[a] = obj;
            return t;
        }
        Object[] t2 = t(objArr);
        int i4 = i - 5;
        Object obj3 = t2[a];
        obj3.getClass();
        t2[a] = s((Object[]) obj3, i4, i2, obj, ajjVar);
        while (i3 < 32 && (obj2 = t2[i3]) != null) {
            t2[i3] = s((Object[]) obj2, i4, 0, ajjVar.a, ajjVar);
            i3++;
        }
        return t2;
    }

    private final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] v = v();
        mkm.y(objArr, v, 0, moz.ad(objArr.length, 32), 6);
        return v;
    }

    private final Object[] u(Object[] objArr, int i) {
        int i2 = 32 - i;
        if (r(objArr)) {
            mkm.q(objArr, objArr, i, 0, i2);
            return objArr;
        }
        Object[] v = v();
        mkm.q(objArr, v, i, 0, i2);
        return v;
    }

    private final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] x(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            ael.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int a = ajs.a(i, i2);
        Object obj = objArr[a];
        obj.getClass();
        Object x = x((Object[]) obj, i, i2 - 5);
        if (a < 31) {
            int i3 = a + 1;
            if (objArr[i3] != null) {
                if (r(objArr)) {
                    mkm.e(objArr, null, i3, 32);
                }
                Object[] v = v();
                mkm.q(objArr, v, 0, 0, i3);
                objArr = v;
            }
        }
        if (x != objArr[a]) {
            Object[] t = t(objArr);
            t[a] = x;
            return t;
        }
        return objArr;
    }

    private final Object[] y(Object[] objArr, int i, int i2, ajj ajjVar) {
        Object[] y;
        int a = ajs.a(i2 - 1, i);
        if (i == 5) {
            ajjVar.a = objArr[a];
            y = null;
        } else {
            Object obj = objArr[a];
            obj.getClass();
            y = y((Object[]) obj, i - 5, i2, ajjVar);
        }
        if (y == null && a == 0) {
            return null;
        }
        Object[] t = t(objArr);
        t[a] = y;
        return t;
    }

    private final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            ael.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            ael.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] t = t(objArr);
        int a = ajs.a(i, i2);
        int i3 = i2 - 5;
        t[a] = z((Object[]) t[a], i, i3, it);
        while (true) {
            a++;
            if (a >= 32 || !it.hasNext()) {
                break;
            }
            t[a] = z((Object[]) t[a], 0, i3, it);
        }
        return t;
    }

    @Override // defpackage.ajb
    public final ajc a() {
        ajc ajkVar;
        Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            ajkVar = this.e;
        } else {
            this.h = new akz();
            this.f = objArr;
            Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    ajkVar = ajq.a;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.c, this.d);
                    copyOf.getClass();
                    ajkVar = new ajq(copyOf);
                }
            } else {
                ajkVar = new ajk(objArr, objArr2, this.d, this.a);
            }
        }
        this.e = ajkVar;
        return ajkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a.u(i, this.d);
        if (i == this.d) {
            add(obj);
            return;
        }
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            n(this.b, i - i2, obj);
            return;
        }
        ajj ajjVar = new ajj(null);
        Object[] objArr = this.b;
        objArr.getClass();
        n(s(objArr, this.a, i, obj, ajjVar), 0, ajjVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        a.u(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            Object[] objArr2 = this.c;
            Object[] t = t(objArr2);
            mkm.q(objArr2, t, (size2 & 31) + 1, i3, j());
            E(t, i3, collection.iterator());
            this.c = t;
            this.d += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size];
        int j = j();
        int size3 = this.d + collection.size();
        if (i >= i()) {
            objArr = v();
            q(collection, i, this.c, j, objArr3, size, objArr);
        } else {
            int F = F(size3);
            if (F > j) {
                int i4 = F - j;
                objArr = u(this.c, i4);
                m(collection, i, i4, objArr3, size, objArr);
            } else {
                Object[] objArr4 = this.c;
                Object[] v = v();
                int i5 = j - F;
                mkm.q(objArr4, v, 0, i5, j);
                int i6 = 32 - i5;
                Object[] u = u(this.c, i6);
                int i7 = size - 1;
                objArr3[i7] = u;
                m(collection, i, i6, objArr3, i7, u);
                objArr = v;
            }
        }
        this.b = A(this.b, i2, objArr3);
        this.c = objArr;
        this.d += collection.size();
        return true;
    }

    public final int b() {
        return this.modCount;
    }

    @Override // defpackage.mlq
    public final int c() {
        return this.d;
    }

    @Override // defpackage.mlq
    public final Object d(int i) {
        a.t(i, this.d);
        this.modCount++;
        int i2 = i();
        if (i >= i2) {
            return k(this.b, i2, this.a, i - i2);
        }
        ajj ajjVar = new ajj(this.c[0]);
        Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, ajjVar), i2, this.a, 0);
        return ajjVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:            if (r0 != r10) goto L6;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:            if (h(r19, r10, r11) != r10) goto L6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.moh r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajm.e(moh):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        a.t(i, this.d);
        if (i() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            objArr.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object obj = objArr[ajs.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return e(new ajl(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a.t(i, this.d);
        if (i() <= i) {
            Object[] t = t(this.c);
            if (t != this.c) {
                this.modCount++;
            }
            int i2 = i & 31;
            Object obj2 = t[i2];
            t[i2] = obj;
            this.c = t;
            return obj2;
        }
        ajj ajjVar = new ajj(null);
        Object[] objArr = this.b;
        objArr.getClass();
        this.b = D(objArr, this.a, i, obj, ajjVar);
        return ajjVar.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a.u(i, this.d);
        return new ajo(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.modCount++;
        int j = j();
        if (j < 32) {
            Object[] t = t(this.c);
            t[j] = obj;
            this.c = t;
            this.d++;
        } else {
            p(this.b, this.c, w(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int j = j();
        Iterator it = collection.iterator();
        if (32 - j >= collection.size()) {
            Object[] t = t(this.c);
            E(t, j, it);
            this.c = t;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + j) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] t2 = t(this.c);
            E(t2, j, it);
            objArr[0] = t2;
            for (int i = 1; i < size; i++) {
                Object[] v = v();
                E(v, 0, it);
                objArr[i] = v;
            }
            this.b = A(this.b, i(), objArr);
            Object[] v2 = v();
            E(v2, 0, it);
            this.c = v2;
            this.d += collection.size();
        }
        return true;
    }
}
