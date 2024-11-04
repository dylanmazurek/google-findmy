package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhb implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ jhc d;

    public jhb(jhc jhcVar) {
        this.d = jhcVar;
        this.a = jhcVar.b;
        this.b = jhcVar.a();
    }

    private final void a() {
        if (this.d.b == this.a) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object c = this.d.c(i);
            this.b = this.d.b(this.b);
            return c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        a();
        if (this.c >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.C(z);
        this.a += 32;
        int i = this.c;
        jhc jhcVar = this.d;
        jhcVar.remove(jhcVar.c(i));
        this.b--;
        this.c = -1;
    }
}
