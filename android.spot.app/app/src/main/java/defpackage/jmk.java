package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmk extends jjr {
    public final transient Object[] a;
    public final transient int b;
    private final transient jiy c;

    public jmk(jiy jiyVar, Object[] objArr, int i) {
        this.c = jiyVar;
        this.a = objArr;
        this.b = i;
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return d().iterator();
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // defpackage.jjr
    public final jis k() {
        return new jmj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
