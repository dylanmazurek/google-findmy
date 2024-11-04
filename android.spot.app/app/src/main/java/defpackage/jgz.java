package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgz extends AbstractCollection {
    final /* synthetic */ jha a;

    public jgz(jha jhaVar) {
        this.a = jhaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        jha jhaVar = this.a;
        Map n = jhaVar.n();
        if (n != null) {
            return n.values().iterator();
        }
        return new jgu(jhaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
