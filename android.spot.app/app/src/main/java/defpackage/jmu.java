package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class jmu implements Iterator {
    final Iterator b;

    public jmu(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
