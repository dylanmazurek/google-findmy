package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayf implements List, j$.util.List, mpq {
    public Object[] a = new Object[16];
    public long[] b = new long[16];
    public int c = -1;
    public int d;

    public final long a() {
        long d = qh.d(Float.POSITIVE_INFINITY, false);
        int i = this.c + 1;
        int O = mkm.O(this);
        if (i <= O) {
            while (true) {
                long j = this.b[i];
                if (axz.b(j, d) < 0) {
                    d = j;
                }
                if (axz.a(d) < 0.0f && axz.c(d)) {
                    return d;
                }
                if (i == O) {
                    break;
                }
                i++;
            }
        }
        return d;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(aow aowVar, float f, boolean z, mnw mnwVar) {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, i3);
            copyOf.getClass();
            this.a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.b, i3);
            copyOf2.getClass();
            this.b = copyOf2;
        }
        Object[] objArr2 = this.a;
        int i4 = this.c;
        objArr2[i4] = aowVar;
        this.b[i4] = qh.d(f, z);
        c();
        mnwVar.a();
        this.c = i;
    }

    public final void c() {
        int i = this.c + 1;
        int O = mkm.O(this);
        if (i <= O) {
            while (true) {
                this.a[i] = null;
                if (i == O) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.d = this.c + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        c();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof aow) || indexOf((aow) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((aow) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(float f, boolean z) {
        if (this.c == mkm.O(this)) {
            return true;
        }
        if (axz.b(a(), qh.d(f, z)) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.b
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.a[i];
        obj.getClass();
        return (aow) obj;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof aow)) {
            return -1;
        }
        aow aowVar = (aow) obj;
        int O = mkm.O(this);
        if (O < 0) {
            return -1;
        }
        int i = 0;
        while (!amr.i(this.a[i], aowVar)) {
            if (i == O) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ayd(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof aow)) {
            return -1;
        }
        aow aowVar = (aow) obj;
        for (int O = mkm.O(this); O >= 0; O--) {
            if (amr.i(this.a[O], aowVar)) {
                return O;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ayd(this, 0, 7);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return a.c();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return a.c();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.b
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new aye(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return moy.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a.b();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return a.c();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ayd(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return a.b();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return moy.b(this, objArr);
    }
}
