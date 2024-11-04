package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jge extends jgh implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jge(Map map) {
        hwx.J(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.jls
    public Collection b(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return c(obj, collection);
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.jls
    public final int e() {
        return this.b;
    }

    @Override // defpackage.jgh
    public final Collection f() {
        if (this instanceof jgj) {
            return new jgg(this);
        }
        return new jlx(this);
    }

    @Override // defpackage.jgh
    public final Collection g() {
        throw null;
    }

    @Override // defpackage.jgh
    public final Iterator h() {
        return new jfr(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List i(Object obj, List list, jga jgaVar) {
        if (list instanceof RandomAccess) {
            return new jfw(this, obj, list, jgaVar);
        }
        return new jgc(this, obj, list, jgaVar);
    }

    @Override // defpackage.jgh
    public Map j() {
        return new jfq(this, this.a);
    }

    @Override // defpackage.jgh
    public Set k() {
        return new jft(this, this.a);
    }

    @Override // defpackage.jls
    public final void l() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            hwx.J(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.jls
    public final boolean n(Object obj) {
        throw null;
    }

    @Override // defpackage.jgh, defpackage.jls
    public final boolean o(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a = a();
            if (a.add(obj2)) {
                this.b++;
                this.a.put(obj, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.b++;
            return true;
        }
        return false;
    }
}
