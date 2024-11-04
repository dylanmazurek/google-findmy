package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aof implements ListIterator, mpq {
    final /* synthetic */ mpl a;
    final /* synthetic */ aog b;

    public aof(mpl mplVar, aog aogVar) {
        this.a = mplVar;
        this.b = aogVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        ans.b();
        throw new mks();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.a.a < this.b.a - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.a.a >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a.a + 1;
        ans.a(i, this.b.a);
        this.a.a = i;
        return this.b.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a.a;
        ans.a(i, this.b.a);
        this.a.a = i - 1;
        return this.b.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        ans.b();
        throw new mks();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        ans.b();
        throw new mks();
    }
}
