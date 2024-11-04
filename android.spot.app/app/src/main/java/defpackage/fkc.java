package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkc implements Iterator {
    protected int a = -1;
    protected final fkb b;

    public fkc(fkb fkbVar) {
        this.b = fkbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.a.h - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            fkb fkbVar = this.b;
            int i = this.a + 1;
            this.a = i;
            return new fkd(fkbVar.a, i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
