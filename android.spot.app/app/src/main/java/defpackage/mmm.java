package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmm extends mme {
    private final mml a;

    public mmm(mml mmlVar) {
        this.a = mmlVar;
    }

    @Override // defpackage.mme
    public final boolean a(Map.Entry entry) {
        return this.a.j(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mme
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        mml mmlVar = this.a;
        mmlVar.g();
        int b = mmlVar.b(entry.getKey());
        if (b >= 0) {
            Object[] objArr = mmlVar.c;
            objArr.getClass();
            if (amr.i(objArr[b], entry.getValue())) {
                mmlVar.h(b);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.mls
    public final int c() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.i(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mmh(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.g();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.g();
        return super.retainAll(collection);
    }
}
