package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mra extends mrb implements Iterator, mmx, mpq {
    public mmx a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException(a.ae(i, "Unexpected state of the iterator: "));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // defpackage.mrb
    public final Object a(Object obj, mmx mmxVar) {
        this.c = obj;
        this.b = 3;
        this.a = mmxVar;
        return mne.a;
    }

    @Override // defpackage.mrb
    public final Object b(Iterator it, mmx mmxVar) {
        if (!it.hasNext()) {
            return mlh.a;
        }
        this.d = it;
        this.b = 2;
        this.a = mmxVar;
        return mne.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            mmx mmxVar = this.a;
            mmxVar.getClass();
            this.a = null;
            mmxVar.p(mlh.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.b = 0;
                    Object obj = this.c;
                    this.c = null;
                    return obj;
                }
                throw c();
            }
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return mnc.a;
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        mjo.o(obj);
        this.b = 4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
