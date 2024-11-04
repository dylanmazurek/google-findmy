package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayd implements ListIterator, mpq {
    final /* synthetic */ ayf a;
    private int b;
    private final int c;
    private final int d;

    public ayd(ayf ayfVar, int i, int i2, int i3) {
        this.a = ayfVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a.d();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.d) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b > this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Object[] objArr = this.a.a;
        int i = this.b;
        this.b = i + 1;
        Object obj = objArr[i];
        obj.getClass();
        return (aow) obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        Object[] objArr = this.a.a;
        int i = this.b - 1;
        this.b = i;
        Object obj = objArr[i];
        obj.getClass();
        return (aow) obj;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.a();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        a.d();
    }

    public /* synthetic */ ayd(ayf ayfVar, int i, int i2) {
        this(ayfVar, 1 == (i2 & 1) ? 0 : i, 0, ayfVar.d);
    }
}
