package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvk extends jhu {
    final Collection a;
    final Set b;

    public jvk(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.jhu
    protected final Collection a() {
        return this.a;
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean contains(Object obj) {
        return c(obj);
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jhu, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jhu, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new jvj(this.b.iterator());
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean remove(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (amr.g(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return hzc.S(iterator(), collection);
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.jhu, java.util.Collection
    public final Object[] toArray() {
        return d();
    }

    @Override // defpackage.jhu, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hzc.v(this, objArr);
    }
}
