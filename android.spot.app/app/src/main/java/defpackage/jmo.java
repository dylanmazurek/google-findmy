package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmo extends jjr {
    public static final jmo a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new jmo(objArr, 0, objArr, 0, 0);
    }

    public jmo(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.jih
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.jih
    public final int b() {
        return this.e;
    }

    @Override // defpackage.jih
    public final int c() {
        return 0;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int r = hwx.r(obj);
                while (true) {
                    int i = r & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    r = i + 1;
                }
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
        return false;
    }

    @Override // defpackage.jih
    public final Object[] g() {
        return this.b;
    }

    @Override // defpackage.jjr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.jjr
    public final boolean i() {
        return true;
    }

    @Override // defpackage.jjr
    public final jis k() {
        return jis.l(this.b, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return super.writeReplace();
    }
}
