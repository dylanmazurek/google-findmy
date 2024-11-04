package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmi extends jis {
    public static final jis a = new jmi(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public jmi(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.jis, defpackage.jih
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.jih
    public final int b() {
        return this.c;
    }

    @Override // defpackage.jih
    public final int c() {
        return 0;
    }

    @Override // defpackage.jih
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jih
    public final Object[] g() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hwx.Z(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.jis, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
