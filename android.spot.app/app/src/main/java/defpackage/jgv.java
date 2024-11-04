package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgv extends AbstractSet {
    final /* synthetic */ jha a;

    public jgv(jha jhaVar) {
        this.a = jhaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = this.a.f(entry.getKey());
            if (f != -1 && amr.g(this.a.j(f), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            jha jhaVar = this.a;
            if (!jhaVar.u()) {
                int e = jhaVar.e();
                Object key = entry.getKey();
                Object value = entry.getValue();
                jha jhaVar2 = this.a;
                int v = hwx.v(key, value, e, jhaVar2.i(), jhaVar2.v(), jhaVar2.w(), jhaVar2.x());
                if (v != -1) {
                    this.a.r(v, e);
                    r10.f--;
                    this.a.o();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
