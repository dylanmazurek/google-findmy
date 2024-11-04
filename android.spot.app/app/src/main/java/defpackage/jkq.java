package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkq implements ListIterator {
    int a;
    jkp b;
    jkp c;
    jkp d;
    int e;
    final /* synthetic */ jks f;

    public jkq(jks jksVar, int i) {
        this.f = jksVar;
        this.e = jksVar.f;
        int i2 = jksVar.e;
        hwx.aa(i, i2);
        if (i >= i2 / 2) {
            this.d = jksVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = jksVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.f == this.e) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jkp next() {
        c();
        jkp jkpVar = this.b;
        if (jkpVar != null) {
            this.c = jkpVar;
            this.d = jkpVar;
            this.b = jkpVar.c;
            this.a++;
            return this.c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jkp previous() {
        c();
        jkp jkpVar = this.d;
        if (jkpVar != null) {
            this.c = jkpVar;
            this.b = jkpVar;
            this.d = jkpVar.d;
            this.a--;
            return this.c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        boolean z;
        c();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "no calls to next() since the last call to remove()");
        jkp jkpVar = this.c;
        if (jkpVar != this.b) {
            this.d = jkpVar.d;
            this.a--;
        } else {
            this.b = jkpVar.c;
        }
        this.f.v(jkpVar);
        this.c = null;
        this.e = this.f.f;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
