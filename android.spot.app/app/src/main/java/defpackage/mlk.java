package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mlk implements Iterator, mpq {
    public int a;
    final /* synthetic */ mln b;

    public mlk(mln mlnVar) {
        this.b = mlnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.a()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            mln mlnVar = this.b;
            int i = this.a;
            this.a = i + 1;
            return mlnVar.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
