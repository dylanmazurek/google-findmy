package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aka extends ajt {
    private final ajy a;

    public aka(ajy ajyVar) {
        this.a = ajyVar;
    }

    @Override // defpackage.ajt
    public final boolean a(Map.Entry entry) {
        Object obj = this.a.get(entry.getKey());
        if (obj != null) {
            return amr.i(obj, entry.getValue());
        }
        if (entry.getValue() == null && this.a.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ajt
    public final boolean b(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.mls
    public final int c() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new akb(this.a);
    }
}
