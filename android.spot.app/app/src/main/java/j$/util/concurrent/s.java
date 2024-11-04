package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class s extends AbstractC0048b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.AbstractC0048b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.b
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.a.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a = pVar.a();
                if (a != null) {
                    consumer.accept(a.c);
                } else {
                    return;
                }
            }
        }
    }

    @Override // j$.util.concurrent.AbstractC0048b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int length;
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lVarArr = concurrentHashMap.a;
        if (lVarArr == null) {
            length = 0;
        } else {
            length = lVarArr.length;
        }
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // j$.util.concurrent.AbstractC0048b, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC0047a abstractC0047a;
        if (obj != null) {
            Object it = iterator();
            do {
                abstractC0047a = (AbstractC0047a) it;
                if (!abstractC0047a.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((h) it).next()));
            abstractC0047a.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.AbstractC0048b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC0047a abstractC0047a = (AbstractC0047a) it;
            if (abstractC0047a.hasNext()) {
                if (collection.contains(((h) it).next())) {
                    abstractC0047a.remove();
                    z = true;
                }
            } else {
                return z;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.a;
        boolean z = false;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a = pVar.a();
                if (a == null) {
                    break;
                }
                Object obj = a.b;
                Object obj2 = a.c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.b
    public final Spliterator spliterator() {
        int length;
        long j;
        ConcurrentHashMap concurrentHashMap = this.a;
        long j2 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.a;
        if (lVarArr == null) {
            length = 0;
        } else {
            length = lVarArr.length;
        }
        if (j2 < 0) {
            j = 0;
        } else {
            j = j2;
        }
        return new j(lVarArr, length, 0, length, j, 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
