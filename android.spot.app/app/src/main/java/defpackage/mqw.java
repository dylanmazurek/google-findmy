package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqw implements Iterator, mpq {
    final /* synthetic */ mqx a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public mqw(mqx mqxVar) {
        this.a = mqxVar;
        this.b = mqxVar.a.a();
    }

    private final void a() {
        int i;
        while (true) {
            if (this.b.hasNext()) {
                Iterator it = this.b;
                moh mohVar = this.a.c;
                Object next = it.next();
                if (((Boolean) mohVar.a(next)).booleanValue() == this.a.b) {
                    this.d = next;
                    i = 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.d;
            this.d = null;
            this.c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
