package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akg extends mlt implements Set, Collection, j$.util.Set, mpq {
    private final ajw a;

    public akg(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.a.d();
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object obj2 = this.a.get(entry.getKey());
        if (obj2 != null) {
            return amr.i(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !this.a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mlt, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new akh(this.a.b);
    }
}
