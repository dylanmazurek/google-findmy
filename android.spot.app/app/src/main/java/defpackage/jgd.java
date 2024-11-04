package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgd extends jga implements Set {
    final /* synthetic */ jge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgd(jge jgeVar, Object obj, Set set) {
        super(jgeVar, obj, set, null);
        this.f = jgeVar;
    }

    @Override // defpackage.jga, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean p = jql.p((Set) this.b, collection);
        if (p) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return p;
    }
}
