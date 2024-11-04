package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z implements Iterator {
    private final Iterator a;

    public z(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC0029l.c(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
