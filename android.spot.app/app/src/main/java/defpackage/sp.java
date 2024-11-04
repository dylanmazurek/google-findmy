package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sp implements Iterator, mpq {
    public int a = -1;
    final /* synthetic */ sy b;
    private final Iterator c;

    public sp(sy syVar) {
        this.b = syVar;
        this.c = moz.Q(new so(syVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.b.h(i);
            this.a = -1;
        }
    }
}
