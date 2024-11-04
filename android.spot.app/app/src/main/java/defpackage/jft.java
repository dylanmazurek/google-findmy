package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class jft extends jln {
    final /* synthetic */ jge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jft(jge jgeVar, Map map) {
        super(map);
        this.a = jgeVar;
    }

    @Override // defpackage.jln, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        hzc.P(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.d.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.jln, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jfs(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.jln, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
