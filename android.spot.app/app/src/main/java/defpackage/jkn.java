package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkn implements Iterator {
    final Set a;
    jkp b;
    jkp c;
    int d;
    final /* synthetic */ jks e;

    public jkn(jks jksVar) {
        this.e = jksVar;
        this.a = jql.m(jksVar.r().size());
        this.b = jksVar.a;
        this.d = jksVar.f;
    }

    private final void a() {
        if (this.e.f == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        jkp jkpVar;
        a();
        jkp jkpVar2 = this.b;
        if (jkpVar2 != null) {
            this.c = jkpVar2;
            this.a.add(jkpVar2.a);
            do {
                jkpVar = this.b.c;
                this.b = jkpVar;
                if (jkpVar == null) {
                    break;
                }
            } while (!this.a.add(jkpVar.a));
            return this.c.a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        a();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "no calls to next() since the last call to remove()");
        this.e.m(this.c.a);
        this.c = null;
        this.d = this.e.f;
    }
}
