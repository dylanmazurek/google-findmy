package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akk extends mlj implements Collection, j$.util.Collection, mpq {
    private final ajw a;

    public akk(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.a.d();
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new akl(this.a.b);
    }
}
