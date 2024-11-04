package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfo extends jlk {
    final /* synthetic */ jfq a;

    public jfo(jfq jfqVar) {
        this.a = jfqVar;
    }

    @Override // defpackage.jlk
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.jlk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.a.a.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jfp(this.a);
    }

    @Override // defpackage.jlk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        jfq jfqVar = this.a;
        Object key = entry.getKey();
        jge jgeVar = jfqVar.b;
        Map map = jgeVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            jgeVar.b -= size;
            return true;
        }
        return true;
    }
}
