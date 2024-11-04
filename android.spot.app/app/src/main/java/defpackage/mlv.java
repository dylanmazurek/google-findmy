package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlv extends mlq {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d = b;

    private final int b(int i) {
        if (i == 0) {
            return mkm.h(this.d);
        }
        return i - 1;
    }

    private final int e(int i) {
        if (i == mkm.h(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int f(int i) {
        if (i < 0) {
            return i + this.d.length;
        }
        return i;
    }

    private final int g(int i) {
        int length = this.d.length;
        if (i >= length) {
            return i - length;
        }
        return i;
    }

    private final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void i(int i) {
        if (i >= 0) {
            Object[] objArr = this.d;
            int length = objArr.length;
            if (i <= length) {
                return;
            }
            if (objArr == b) {
                this.d = new Object[moz.ac(i, 10)];
                return;
            }
            Object[] objArr2 = new Object[mkm.z(length, i)];
            mkm.q(objArr, objArr2, 0, this.c, length);
            Object[] objArr3 = this.d;
            int length2 = objArr3.length;
            int i2 = this.c;
            mkm.q(objArr3, objArr2, length2 - i2, 0, i2);
            this.c = 0;
            this.d = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final Object a() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a.u(i, this.a);
        int i2 = this.a;
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i != 0) {
            i(i2 + 1);
            int g = g(this.c + i);
            int i3 = this.a;
            if (i < ((i3 + 1) >> 1)) {
                int b2 = b(g);
                int b3 = b(this.c);
                int i4 = this.c;
                if (b2 >= i4) {
                    Object[] objArr = this.d;
                    objArr[b3] = objArr[i4];
                    mkm.q(objArr, objArr, i4, i4 + 1, b2 + 1);
                } else {
                    Object[] objArr2 = this.d;
                    mkm.q(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.d;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    mkm.q(objArr3, objArr3, 0, 1, b2 + 1);
                }
                this.d[b2] = obj;
                this.c = b3;
            } else {
                int g2 = g(this.c + i3);
                if (g < g2) {
                    Object[] objArr4 = this.d;
                    mkm.q(objArr4, objArr4, g + 1, g, g2);
                } else {
                    Object[] objArr5 = this.d;
                    mkm.q(objArr5, objArr5, 1, 0, g2);
                    Object[] objArr6 = this.d;
                    int length = objArr6.length - 1;
                    objArr6[0] = objArr6[length];
                    mkm.q(objArr6, objArr6, g + 1, g, length);
                }
                this.d[g] = obj;
            }
            this.a++;
            return;
        }
        addFirst(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        a.u(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.a;
        if (i != i2) {
            i(i2 + collection.size());
            int g = g(this.c + this.a);
            int g2 = g(this.c + i);
            int size = collection.size();
            if (i < ((this.a + 1) >> 1)) {
                int i3 = this.c;
                int i4 = i3 - size;
                if (g2 < i3) {
                    Object[] objArr = this.d;
                    mkm.q(objArr, objArr, i4, i3, objArr.length);
                    if (size >= g2) {
                        Object[] objArr2 = this.d;
                        mkm.q(objArr2, objArr2, objArr2.length - size, 0, g2);
                    } else {
                        Object[] objArr3 = this.d;
                        mkm.q(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.d;
                        mkm.q(objArr4, objArr4, 0, size, g2);
                    }
                } else if (i4 >= 0) {
                    Object[] objArr5 = this.d;
                    mkm.q(objArr5, objArr5, i4, i3, g2);
                } else {
                    Object[] objArr6 = this.d;
                    int length = objArr6.length;
                    i4 += length;
                    int i5 = length - i4;
                    if (i5 >= g2 - i3) {
                        mkm.q(objArr6, objArr6, i4, i3, g2);
                    } else {
                        mkm.q(objArr6, objArr6, i4, i3, i3 + i5);
                        Object[] objArr7 = this.d;
                        mkm.q(objArr7, objArr7, 0, this.c + i5, g2);
                    }
                }
                this.c = i4;
                h(f(g2 - size), collection);
            } else {
                int i6 = g2 + size;
                if (g2 < g) {
                    int i7 = size + g;
                    Object[] objArr8 = this.d;
                    int length2 = objArr8.length;
                    if (i7 <= length2) {
                        mkm.q(objArr8, objArr8, i6, g2, g);
                    } else if (i6 >= length2) {
                        mkm.q(objArr8, objArr8, i6 - length2, g2, g);
                    } else {
                        int i8 = g - (i7 - length2);
                        mkm.q(objArr8, objArr8, 0, i8, g);
                        Object[] objArr9 = this.d;
                        mkm.q(objArr9, objArr9, i6, g2, i8);
                    }
                } else {
                    Object[] objArr10 = this.d;
                    mkm.q(objArr10, objArr10, size, 0, g);
                    Object[] objArr11 = this.d;
                    int length3 = objArr11.length;
                    if (i6 >= length3) {
                        mkm.q(objArr11, objArr11, i6 - length3, g2, length3);
                    } else {
                        mkm.q(objArr11, objArr11, 0, length3 - size, length3);
                        Object[] objArr12 = this.d;
                        mkm.q(objArr12, objArr12, i6, g2, objArr12.length - size);
                    }
                }
                h(g2, collection);
            }
            return true;
        }
        return addAll(collection);
    }

    public final void addFirst(Object obj) {
        i(this.a + 1);
        int b2 = b(this.c);
        this.c = b2;
        this.d[b2] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        i(this.a + 1);
        this.d[g(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.mlq
    public final int c() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int g = g(this.c + this.a);
        int i = this.c;
        if (i < g) {
            mkm.e(this.d, null, i, g);
        } else if (!isEmpty()) {
            Object[] objArr = this.d;
            mkm.e(objArr, null, i, objArr.length);
            mkm.e(this.d, null, 0, g);
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mlq
    public final Object d(int i) {
        a.t(i, this.a);
        if (i == mkm.O(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int g = g(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[g];
        if (i < (this.a >> 1)) {
            int i2 = this.c;
            if (g >= i2) {
                mkm.q(objArr, objArr, i2 + 1, i2, g);
            } else {
                mkm.q(objArr, objArr, 1, 0, g);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.c;
                mkm.q(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.d;
            int i4 = this.c;
            objArr3[i4] = null;
            this.c = e(i4);
        } else {
            int g2 = g(this.c + mkm.O(this));
            if (g <= g2) {
                Object[] objArr4 = this.d;
                mkm.q(objArr4, objArr4, g, g + 1, g2 + 1);
            } else {
                Object[] objArr5 = this.d;
                mkm.q(objArr5, objArr5, g, g + 1, objArr5.length);
                Object[] objArr6 = this.d;
                objArr6[objArr6.length - 1] = objArr6[0];
                mkm.q(objArr6, objArr6, 0, 1, g2 + 1);
            }
            this.d[g2] = null;
        }
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.t(i, this.a);
        return this.d[g(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int g = g(this.c + this.a);
        int i2 = this.c;
        if (i2 < g) {
            while (i2 < g) {
                if (!amr.i(obj, this.d[i2])) {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 >= g) {
            int length = this.d.length;
            while (i2 < length) {
                if (!amr.i(obj, this.d[i2])) {
                    i2++;
                }
            }
            for (int i3 = 0; i3 < g; i3++) {
                if (amr.i(obj, this.d[i3])) {
                    i2 = i3 + this.d.length;
                    i = this.c;
                    return i2 - i;
                }
            }
            return -1;
        }
        return -1;
        i = this.c;
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int h;
        int i;
        int g = g(this.c + this.a);
        int i2 = this.c;
        if (i2 < g) {
            h = g - 1;
            if (i2 <= h) {
                while (!amr.i(obj, this.d[h])) {
                    if (h != i2) {
                        h--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (i2 > g) {
            for (int i3 = g - 1; i3 >= 0; i3--) {
                if (amr.i(obj, this.d[i3])) {
                    h = i3 + this.d.length;
                    i = this.c;
                    break;
                }
            }
            h = mkm.h(this.d);
            int i4 = this.c;
            if (i4 <= h) {
                while (!amr.i(obj, this.d[h])) {
                    if (h != i4) {
                        h--;
                    }
                }
                i = this.c;
            }
        }
        return -1;
        return h - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int g;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int g2 = g(this.c + this.a);
            int i = this.c;
            if (i < g2) {
                g = i;
                while (i < g2) {
                    Object obj = this.d[i];
                    if (!collection.contains(obj)) {
                        this.d[g] = obj;
                        g++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                mkm.e(this.d, null, g, g2);
            } else {
                int length = this.d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.d;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g = g(i2);
                for (int i3 = 0; i3 < g2; i3++) {
                    Object[] objArr2 = this.d;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.d[g] = obj3;
                        g = e(g);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.a = f(g - this.c);
                return true;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.d;
            int i = this.c;
            Object obj = objArr[i];
            objArr[i] = null;
            this.c = e(i);
            this.a--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int g = g(this.c + mkm.O(this));
            Object[] objArr = this.d;
            Object obj = objArr[g];
            objArr[g] = null;
            this.a--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int g;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int g2 = g(this.c + this.a);
            int i = this.c;
            if (i < g2) {
                g = i;
                while (i < g2) {
                    Object obj = this.d[i];
                    if (collection.contains(obj)) {
                        this.d[g] = obj;
                        g++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                mkm.e(this.d, null, g, g2);
            } else {
                int length = this.d.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.d;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g = g(i2);
                for (int i3 = 0; i3 < g2; i3++) {
                    Object[] objArr2 = this.d;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.d[g] = obj3;
                        g = e(g);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.a = f(g - this.c);
                return true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a.t(i, this.a);
        int g = g(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int g = g(this.c + this.a);
        int i2 = this.c;
        if (i2 < g) {
            mkm.y(this.d, objArr, i2, g, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            mkm.q(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.d;
            mkm.q(objArr3, objArr, objArr3.length - this.c, 0, g);
        }
        mkm.as(this.a, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        i(this.a + collection.size());
        h(g(this.c + this.a), collection);
        return true;
    }
}
