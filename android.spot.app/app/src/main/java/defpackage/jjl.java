package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjl extends jih {
    private static final long serialVersionUID = 0;
    private final transient jjm a;

    public jjl(jjm jjmVar) {
        this.a = jjmVar;
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        jmw listIterator = this.a.map.values().listIterator();
        while (listIterator.hasNext()) {
            i = ((jih) listIterator.next()).a(objArr, i);
        }
        return i;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator it = this.a.q().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return new jji(this.a);
    }

    @Override // defpackage.jih
    public final boolean f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
