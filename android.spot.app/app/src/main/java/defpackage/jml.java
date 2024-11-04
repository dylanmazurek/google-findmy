package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jml extends jjr {
    private final transient jiy a;
    private final transient jis b;

    public jml(jiy jiyVar, jis jisVar) {
        this.a = jiyVar;
        this.b = jisVar;
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.a.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jjr, defpackage.jih
    public final jis d() {
        return this.b;
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((jmn) this.a).c;
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
