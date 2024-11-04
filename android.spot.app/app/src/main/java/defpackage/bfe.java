package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfe implements Iterable, mpq {
    public final Map a = new LinkedHashMap();
    public boolean b;
    public boolean c;

    public final Object a(bfn bfnVar) {
        Object obj = this.a.get(bfnVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(a.af(bfnVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object b(bfn bfnVar, mnw mnwVar) {
        Object obj = this.a.get(bfnVar);
        if (obj == null) {
            return mnwVar.a();
        }
        return obj;
    }

    public final void c(bfn bfnVar, Object obj) {
        if ((obj instanceof bev) && d(bfnVar)) {
            Object obj2 = this.a.get(bfnVar);
            obj2.getClass();
            this.a.put(bfnVar, new bev(((bev) obj).a));
            return;
        }
        this.a.put(bfnVar, obj);
    }

    public final boolean d(bfn bfnVar) {
        return this.a.containsKey(bfnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfe)) {
            return false;
        }
        bfe bfeVar = (bfe) obj;
        if (amr.i(this.a, bfeVar.a) && this.b == bfeVar.b && this.c == bfeVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.i(this.b)) * 31) + a.i(this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.a.entrySet()) {
            bfn bfnVar = (bfn) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(bfnVar.a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return rb.d(this) + "{ " + ((Object) sb) + " }";
    }
}
