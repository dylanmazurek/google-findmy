package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jis extends jih implements List, RandomAccess, j$.util.List {
    private static final jmx a = new jio(jmi.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static jin j(int i) {
        hwx.D(i, "expectedSize");
        return new jin(i);
    }

    public static jis k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    public static jis l(Object[] objArr, int i) {
        if (i == 0) {
            return jmi.a;
        }
        return new jmi(objArr, i);
    }

    public static jis m(Object... objArr) {
        hzc.x(objArr);
        return k(objArr);
    }

    public static jis n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return jmi.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        jin jinVar = new jin();
        jinVar.h(next);
        jinVar.k(it);
        return jinVar.g();
    }

    public static jis o(Collection collection) {
        if (collection instanceof jih) {
            jis d2 = ((jih) collection).d();
            if (d2.f()) {
                return k(d2.toArray());
            }
            return d2;
        }
        return m(collection.toArray());
    }

    public static jis p(Object[] objArr) {
        if (objArr.length == 0) {
            return jmi.a;
        }
        return m((Object[]) objArr.clone());
    }

    public static jis q(Object obj) {
        return m(obj);
    }

    public static jis r(Object obj, Object obj2) {
        return m(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static jis s(Object obj, Object obj2, Object obj3) {
        return m(obj, obj2, obj3);
    }

    public static jis t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m(obj, obj2, obj3, obj4, obj5);
    }

    public static jis u(Comparator comparator, Iterable iterable) {
        Object[] ac = hzc.ac(iterable);
        hzc.x(ac);
        Arrays.sort(ac, comparator);
        return k(ac);
    }

    @Override // defpackage.jih
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jih
    /* renamed from: e */
    public final jmw listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return hzc.L(this, obj);
    }

    public jis h() {
        if (size() <= 1) {
            return this;
        }
        return new jip(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    /* renamed from: i */
    public jis subList(int i, int i2) {
        hwx.T(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return jmi.a;
        }
        return new jir(this, i, i3);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jmx listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: w */
    public final jmx listIterator(int i) {
        hwx.aa(i, size());
        if (isEmpty()) {
            return a;
        }
        return new jio(this, i);
    }

    @Override // defpackage.jih
    public Object writeReplace() {
        return new jiq(toArray());
    }

    @Override // defpackage.jih
    @Deprecated
    public final jis d() {
        return this;
    }
}
