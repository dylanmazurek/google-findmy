package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvp extends jhz {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ jvq d;

    public jvp(jvq jvqVar, Map map) {
        this.c = map;
        this.d = jvqVar;
    }

    @Override // defpackage.jhz
    protected final Map a() {
        return this.c;
    }

    @Override // defpackage.jhz, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((jhu) values()).c(obj);
    }

    @Override // defpackage.jhz, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set == null) {
            jvi jviVar = new jvi(this.c.entrySet());
            this.a = jviVar;
            return jviVar;
        }
        return set;
    }

    @Override // defpackage.jhz, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.c;
    }

    @Override // defpackage.jhz, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List b = this.d.b(obj);
        if (b.isEmpty()) {
            return null;
        }
        return b;
    }

    @Override // defpackage.jhz, java.util.Map
    public final Collection values() {
        Collection collection = this.b;
        if (collection == null) {
            jvk jvkVar = new jvk(this.c.values(), entrySet());
            this.b = jvkVar;
            return jvkVar;
        }
        return collection;
    }
}
