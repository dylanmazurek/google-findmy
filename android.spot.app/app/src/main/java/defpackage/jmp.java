package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmp extends jju {
    public static final jmp c;
    final transient jis d;

    static {
        int i = jis.d;
        c = new jmp(jmi.a, jmb.a);
    }

    public jmp(jis jisVar, Comparator comparator) {
        super(comparator);
        this.d = jisVar;
    }

    @Override // defpackage.jju, java.util.NavigableSet
    /* renamed from: B */
    public final jmw descendingIterator() {
        return this.d.h().iterator();
    }

    final int C(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((jju) this).a);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    final int D(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((jju) this).a);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    final jmp E(int i, int i2) {
        if (i == 0) {
            if (i2 != size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i < i2) {
            jis jisVar = this.d;
            return new jmp(jisVar.subList(i, i2), this.a);
        }
        return A(this.a);
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.jih
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.jih
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.jju, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int D = D(obj, true);
        if (D == size()) {
            return null;
        }
        return this.d.get(D);
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof jma) {
            collection = ((jma) collection).a();
        }
        if (jql.j(((jju) this).a, collection) && collection.size() > 1) {
            jmw listIterator = listIterator();
            Iterator it = collection.iterator();
            if (!listIterator.hasNext()) {
                return false;
            }
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int h = h(next2, next);
                    if (h < 0) {
                        if (!listIterator.hasNext()) {
                            return false;
                        }
                        next2 = listIterator.next();
                    } else {
                        if (h != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // defpackage.jjr, defpackage.jih
    public final jis d() {
        return this.d;
    }

    @Override // defpackage.jju, defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.jjr, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (jql.j(this.a, set)) {
            Iterator it = set.iterator();
            try {
                jmw listIterator = listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    Object next2 = it.next();
                    if (next2 == null || h(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // defpackage.jih
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.jju, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.jju, java.util.NavigableSet
    public final Object floor(Object obj) {
        int C = C(obj, true) - 1;
        if (C == -1) {
            return null;
        }
        return this.d.get(C);
    }

    @Override // defpackage.jih
    public final Object[] g() {
        return this.d.g();
    }

    @Override // defpackage.jju, java.util.NavigableSet
    public final Object higher(Object obj) {
        int D = D(obj, false);
        if (D == size()) {
            return null;
        }
        return this.d.get(D);
    }

    @Override // defpackage.jju, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.jju, java.util.NavigableSet
    public final Object lower(Object obj) {
        int C = C(obj, false) - 1;
        if (C == -1) {
            return null;
        }
        return this.d.get(C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.jju
    public final jju t() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return A(reverseOrder);
        }
        return new jmp(this.d.h(), reverseOrder);
    }

    @Override // defpackage.jju
    public final jju v(Object obj, boolean z) {
        return E(0, C(obj, z));
    }

    @Override // defpackage.jju, defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.jju
    public final jju x(Object obj, boolean z, Object obj2, boolean z2) {
        return z(obj, z).v(obj2, z2);
    }

    @Override // defpackage.jju
    public final jju z(Object obj, boolean z) {
        return E(D(obj, z), size());
    }
}
