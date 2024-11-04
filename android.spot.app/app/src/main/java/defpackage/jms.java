package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jms extends jjr {
    final transient Object a;

    public jms(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.jjr, defpackage.jih
    public final jis d() {
        return jis.q(this.a);
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final jmw listIterator() {
        return new jkj(this.a);
    }

    @Override // defpackage.jih
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jjr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
