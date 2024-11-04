package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qd implements Iterable {
    public pz b;
    public pz c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected pz a(Object obj) {
        pz pzVar = this.b;
        while (pzVar != null && !pzVar.a.equals(obj)) {
            pzVar = pzVar.c;
        }
        return pzVar;
    }

    public Object b(Object obj) {
        pz a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((qc) it.next()).bN(a);
            }
        }
        pz pzVar = a.d;
        pz pzVar2 = a.c;
        if (pzVar != null) {
            pzVar.c = pzVar2;
        } else {
            this.b = pzVar2;
        }
        pz pzVar3 = a.c;
        if (pzVar3 != null) {
            pzVar3.d = pzVar;
        } else {
            this.c = pzVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final pz d(Object obj, Object obj2) {
        pz pzVar = new pz(obj, obj2);
        this.e++;
        pz pzVar2 = this.c;
        if (pzVar2 == null) {
            this.b = pzVar;
        } else {
            pzVar2.c = pzVar;
            pzVar.d = pzVar2;
        }
        this.c = pzVar;
        return pzVar;
    }

    public final qa e() {
        qa qaVar = new qa(this);
        this.d.put(qaVar, false);
        return qaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        if (this.e != qdVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = qdVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((qb) it).next();
            Map.Entry next2 = ((qb) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object f(Object obj, Object obj2) {
        pz a = a(obj);
        if (a != null) {
            return a.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((qb) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        px pxVar = new px(this.b, this.c);
        this.d.put(pxVar, false);
        return pxVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((qb) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
