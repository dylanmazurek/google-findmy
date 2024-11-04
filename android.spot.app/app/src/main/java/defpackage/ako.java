package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ako implements Iterator, mpq {
    public Object[] a = akn.a.b;
    public int b;
    private int c;

    public final Object a() {
        return this.a[this.b];
    }

    public final void b() {
        f();
        this.b++;
    }

    public final void c(Object[] objArr, int i) {
        d(objArr, i, 0);
    }

    public final void d(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.c = i;
        this.b = i2;
    }

    public final boolean e() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.b < this.a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return e();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
