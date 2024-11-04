package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jgh implements jls {
    private transient Collection a;
    private transient Set b;
    public transient Collection c;
    private transient Map d;

    @Override // defpackage.jls
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jls)) {
            return false;
        }
        return q().equals(((jls) obj).q());
    }

    public abstract Collection f();

    public abstract Collection g();

    public abstract Iterator h();

    @Override // defpackage.jls
    public final int hashCode() {
        return q().hashCode();
    }

    public abstract Map j();

    public abstract Set k();

    @Override // defpackage.jls
    public boolean o(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.jls
    public Collection p() {
        Collection collection = this.a;
        if (collection == null) {
            Collection f = f();
            this.a = f;
            return f;
        }
        return collection;
    }

    @Override // defpackage.jls
    public Map q() {
        Map map = this.d;
        if (map == null) {
            Map j = j();
            this.d = j;
            return j;
        }
        return map;
    }

    @Override // defpackage.jls
    public Set r() {
        Set set = this.b;
        if (set == null) {
            Set k = k();
            this.b = k;
            return k;
        }
        return set;
    }

    @Override // defpackage.jls
    public boolean s(Object obj, Object obj2) {
        Collection collection = (Collection) q().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return q().toString();
    }

    @Override // defpackage.jls
    public boolean u(Object obj, Object obj2) {
        Collection collection = (Collection) q().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }
}
