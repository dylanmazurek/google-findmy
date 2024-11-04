package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlo extends jlm {
    final Map a;
    final njz b;

    public jlo(Map map, njz njzVar) {
        this.a = map;
        this.b = njzVar;
    }

    @Override // defpackage.jlm
    public final Iterator a() {
        Iterator it = this.a.entrySet().iterator();
        njz njzVar = this.b;
        njzVar.getClass();
        return new jke(it, new jld(njzVar));
    }

    @Override // defpackage.jlm, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null && !this.a.containsKey(obj)) {
            return null;
        }
        return this.b.g(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.containsKey(obj)) {
            return this.b.g(this.a.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new jlq(this);
    }
}
