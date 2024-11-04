package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajh extends mln implements List, ajc {
    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ajc
    public ajc e(Collection collection) {
        ajb b = b();
        b.addAll(collection);
        return b.a();
    }

    @Override // defpackage.ajc
    public final ajc f(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf != -1) {
            return i(indexOf);
        }
        return this;
    }

    @Override // defpackage.ajc
    public final ajc g(Collection collection) {
        return h(new ajg(collection));
    }

    @Override // defpackage.mln, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.mln, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.mln, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new aiz(this, i, i2);
    }
}
