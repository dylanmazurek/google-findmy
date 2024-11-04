package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aki extends mlt implements Set, Collection, j$.util.Set, mpq {
    private final ajw a;

    public aki(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.a.d();
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.mlt, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new akj(this.a.b);
    }
}
