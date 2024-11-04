package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class air implements List, mpr {
    private final aiu a;

    public air(aiu aiuVar) {
        this.a = aiuVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.e(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.j(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.f();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.k(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aiv.a(this, i);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ait(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        aiu aiuVar = this.a;
        int i = aiuVar.b;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = aiuVar.a;
        while (!amr.i(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ait(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        aiv.a(this, i);
        return this.a.b(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (!collection.isEmpty()) {
            aiu aiuVar = this.a;
            int i = aiuVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                aiuVar.n(it.next());
            }
            if (i != aiuVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        aiu aiuVar = this.a;
        int i = aiuVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(aiuVar.a[i2])) {
                aiuVar.b(i2);
            }
        }
        if (i != aiuVar.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        aiv.a(this, i);
        return this.a.c(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        aiv.b(this, i, i2);
        return new ais(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return moy.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.o(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        aiu aiuVar = this.a;
        return aiuVar.j(aiuVar.b, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ait(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return moy.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.n(obj);
    }
}
