package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class jfz implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ jga c;

    public jfz(jga jgaVar, Iterator it) {
        this.c = jgaVar;
        this.b = jgaVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.b == this.b) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        jga jgaVar = this.c;
        jge jgeVar = jgaVar.e;
        jgeVar.b--;
        jgaVar.c();
    }

    public jfz(jga jgaVar) {
        Iterator it;
        this.c = jgaVar;
        this.b = jgaVar.b;
        Collection collection = jgaVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }
}
