package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jhu extends jic implements Collection {
    protected abstract Collection a();

    public boolean add(Object obj) {
        return a().add(obj);
    }

    public boolean addAll(Collection collection) {
        return a().addAll(collection);
    }

    public final boolean c(Object obj) {
        return hzc.R(iterator(), obj);
    }

    @Override // java.util.Collection
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return a().containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] d() {
        return toArray(new Object[size()]);
    }

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return a().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return a().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return a().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return a().toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return a().toArray(objArr);
    }
}
