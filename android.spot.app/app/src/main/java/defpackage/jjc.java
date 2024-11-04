package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjc extends jjw {
    private final jiy a;

    public jjc(jiy jiyVar) {
        this.a = jiyVar;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.jjw, defpackage.jjr, defpackage.jih
    /* renamed from: e */
    public final jmw listIterator() {
        return this.a.b();
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // defpackage.jjw
    public final Object h(int i) {
        return ((Map.Entry) this.a.entrySet().d().get(i)).getKey();
    }

    @Override // defpackage.jjw, defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.jjw, defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return new jjb(this.a);
    }
}
