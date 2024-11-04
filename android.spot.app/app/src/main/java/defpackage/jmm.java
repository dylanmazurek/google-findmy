package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmm extends jis {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public jmm(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.jih
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hwx.Z(i, this.c);
        Object obj = this.a[i + i + this.b];
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
