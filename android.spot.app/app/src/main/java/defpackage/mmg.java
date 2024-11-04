package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmg extends mlq implements List, RandomAccess, Serializable, mpr {
    public static final mmg a;
    public Object[] b;
    public int c;
    public int d;
    public boolean e;
    public final mmg f;
    private final mmg g;

    static {
        mmg mmgVar = new mmg(0);
        mmgVar.e = true;
        a = mmgVar;
    }

    public mmg() {
        this(10);
    }

    private final int e(int i, int i2, Collection collection, boolean z) {
        int i3;
        mmg mmgVar = this.f;
        if (mmgVar != null) {
            i3 = mmgVar.e(i, i2, collection, z);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = i4 + 1;
                int i7 = i4 + i;
                if (collection.contains(this.b[i7]) == z) {
                    Object[] objArr = this.b;
                    objArr[i + i5] = objArr[i7];
                    i5++;
                }
                i4 = i6;
            }
            int i8 = i2 - i5;
            Object[] objArr2 = this.b;
            mkm.q(objArr2, objArr2, i + i5, i + i2, this.d);
            Object[] objArr3 = this.b;
            int i9 = this.d;
            mkm.B(objArr3, i9 - i8, i9);
            i3 = i8;
        }
        if (i3 > 0) {
            k();
        }
        this.d -= i3;
        return i3;
    }

    private final Object f(int i) {
        k();
        mmg mmgVar = this.f;
        if (mmgVar != null) {
            this.d--;
            return mmgVar.f(i);
        }
        Object[] objArr = this.b;
        Object obj = objArr[i];
        mkm.q(objArr, objArr, i, i + 1, this.c + this.d);
        mkm.A(this.b, (this.c + this.d) - 1);
        this.d--;
        return obj;
    }

    private final void g(int i, Collection collection, int i2) {
        k();
        mmg mmgVar = this.f;
        if (mmgVar != null) {
            mmgVar.g(i, collection, i2);
            this.b = this.f.b;
            this.d += i2;
        } else {
            j(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.b[i + i3] = it.next();
            }
        }
    }

    private final void h(int i, Object obj) {
        k();
        mmg mmgVar = this.f;
        if (mmgVar != null) {
            mmgVar.h(i, obj);
            this.b = this.f.b;
            this.d++;
        } else {
            j(i, 1);
            this.b[i] = obj;
        }
    }

    private final void i() {
        mmg mmgVar = this.g;
        if (mmgVar != null && mmgVar.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j(int i, int i2) {
        int i3 = this.d + i2;
        if (i3 >= 0) {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i3 > length) {
                this.b = mkm.C(objArr, mkm.z(length, i3));
            }
            Object[] objArr2 = this.b;
            mkm.q(objArr2, objArr2, i + i2, i, this.c + this.d);
            this.d += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void k() {
        this.modCount++;
    }

    private final void l(int i, int i2) {
        if (i2 > 0) {
            k();
        }
        mmg mmgVar = this.f;
        if (mmgVar != null) {
            mmgVar.l(i, i2);
        } else {
            Object[] objArr = this.b;
            mkm.q(objArr, objArr, i, i + i2, this.d);
            Object[] objArr2 = this.b;
            int i3 = this.d;
            mkm.B(objArr2, i3 - i2, i3);
        }
        this.d -= i2;
    }

    private final boolean m() {
        if (this.e) {
            return true;
        }
        mmg mmgVar = this.g;
        if (mmgVar != null && mmgVar.e) {
            return true;
        }
        return false;
    }

    private final Object writeReplace() {
        if (m()) {
            return new mmp(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        i();
        a.u(i, this.d);
        h(this.c + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        b();
        i();
        a.u(i, this.d);
        int size = collection.size();
        g(this.c + i, collection, size);
        return size > 0;
    }

    public final void b() {
        if (!m()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.mlq
    public final int c() {
        i();
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        i();
        l(this.c, this.d);
    }

    @Override // defpackage.mlq
    public final Object d(int i) {
        b();
        i();
        a.t(i, this.d);
        return f(this.c + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.b;
            int i = this.c;
            int i2 = this.d;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (amr.i(objArr[i + i3], list.get(i3))) {
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i();
        a.t(i, this.d);
        return this.b[this.c + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        i();
        Object[] objArr = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i2 + i5];
            int i6 = i4 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i4 = i6 + i;
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i = 0; i < this.d; i++) {
            if (amr.i(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i = this.d - 1; i >= 0; i--) {
            if (amr.i(this.b[this.c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        i();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        b();
        i();
        if (e(this.c, this.d, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        b();
        i();
        if (e(this.c, this.d, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        i();
        a.t(i, this.d);
        Object[] objArr = this.b;
        int i2 = this.c + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        mmg mmgVar;
        a.v(i, i2, this.d);
        Object[] objArr = this.b;
        int i3 = this.c + i;
        mmg mmgVar2 = this.g;
        if (mmgVar2 == null) {
            mmgVar = this;
        } else {
            mmgVar = mmgVar2;
        }
        return new mmg(objArr, i3, i2 - i, this.e, this, mmgVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.b;
        int i = this.c;
        return mkm.g(objArr, i, this.d + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public mmg(int i) {
        this(new Object[i], 0, 0, false, null, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        i();
        a.u(i, this.d);
        return new mmf(this, i);
    }

    private mmg(Object[] objArr, int i, int i2, boolean z, mmg mmgVar, mmg mmgVar2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = mmgVar;
        this.g = mmgVar2;
        if (mmgVar != null) {
            this.modCount = mmgVar.modCount;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        i();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            Object[] objArr2 = this.b;
            int i2 = this.c;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        Object[] objArr3 = this.b;
        int i3 = this.c;
        mkm.q(objArr3, objArr, 0, i3, i + i3);
        mkm.as(this.d, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        i();
        h(this.c + this.d, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        b();
        i();
        int size = collection.size();
        g(this.c + this.d, collection, size);
        return size > 0;
    }
}
