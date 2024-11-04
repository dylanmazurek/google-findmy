package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akw implements Iterator, mpq {
    private Object a;
    private final Map b;
    private int c;

    public akw(Object obj, Map map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.a;
            this.c++;
            Object obj2 = this.b.get(obj);
            if (obj2 != null) {
                this.a = ((aku) obj2).b;
                return obj;
            }
            throw new ConcurrentModificationException(a.af(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
