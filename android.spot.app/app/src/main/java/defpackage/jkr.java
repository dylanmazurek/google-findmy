package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkr implements ListIterator {
    final Object a;
    int b;
    jkp c;
    jkp d;
    jkp e;
    final /* synthetic */ jks f;

    public jkr(jks jksVar, Object obj) {
        this.f = jksVar;
        this.a = obj;
        jko jkoVar = (jko) jksVar.d.get(obj);
        this.c = (jkp) (jkoVar == null ? null : jkoVar.b);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        jkp jkpVar = this.c;
        if (jkpVar != null) {
            this.d = jkpVar;
            this.e = jkpVar;
            this.c = jkpVar.e;
            this.b++;
            return this.d.b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        jkp jkpVar = this.e;
        if (jkpVar != null) {
            this.d = jkpVar;
            this.c = jkpVar;
            this.e = jkpVar.f;
            this.b--;
            return this.d.b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "no calls to next() since the last call to remove()");
        jkp jkpVar = this.d;
        if (jkpVar != this.c) {
            this.e = jkpVar.f;
            this.b--;
        } else {
            this.c = jkpVar.e;
        }
        this.f.v(jkpVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        this.d.b = obj;
    }

    public jkr(jks jksVar, Object obj, int i) {
        this.f = jksVar;
        jko jkoVar = (jko) jksVar.d.get(obj);
        int i2 = jkoVar == null ? 0 : jkoVar.a;
        hwx.aa(i, i2);
        if (i >= i2 / 2) {
            this.e = (jkp) (jkoVar == null ? null : jkoVar.c);
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = (jkp) (jkoVar == null ? null : jkoVar.b);
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
