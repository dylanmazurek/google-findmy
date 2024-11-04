package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mll extends mlk implements ListIterator, mpq {
    final /* synthetic */ mln c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mll(mln mlnVar, int i) {
        super(mlnVar);
        this.c = mlnVar;
        a.u(i, mlnVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.d();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.a > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            mln mlnVar = this.c;
            int i = this.a - 1;
            this.a = i;
            return mlnVar.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.d();
    }
}
