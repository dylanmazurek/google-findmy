package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jgw implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ jha e;

    public jgw(jha jhaVar) {
        this.e = jhaVar;
        this.b = jhaVar.e;
        this.c = jhaVar.c();
    }

    private final void b() {
        if (this.e.e == this.b) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            Object a = a(i);
            this.c = this.e.d(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        b();
        if (this.d >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.C(z);
        this.b += 32;
        int i = this.d;
        jha jhaVar = this.e;
        jhaVar.remove(jhaVar.g(i));
        this.c = this.e.a(this.c, this.d);
        this.d = -1;
    }
}
