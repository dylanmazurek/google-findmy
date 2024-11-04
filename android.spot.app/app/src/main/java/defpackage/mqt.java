package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqt implements Iterator, mpq {
    private int a;
    private final /* synthetic */ int b;
    private final Object c;

    public mqt(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Iterator, java.lang.Object] */
    private final void a() {
        while (this.a > 0 && this.c.hasNext()) {
            this.c.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != 0) {
            if (this.a < ((Object[]) this.c).length) {
                return true;
            }
            return false;
        }
        a();
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.b != 0) {
            try {
                Object obj = this.c;
                int i = this.a;
                this.a = i + 1;
                return ((Object[]) obj)[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                this.a--;
                throw new NoSuchElementException(e.getMessage());
            }
        }
        a();
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b != 0) {
            a.a();
        } else {
            a.a();
        }
    }

    public mqt(mqu mquVar, int i) {
        this.b = i;
        this.c = mquVar.a.a();
        this.a = mquVar.b;
    }
}
