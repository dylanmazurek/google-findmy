package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqo implements Iterator {
    final /* synthetic */ Object a;
    private int b;
    private final /* synthetic */ int c;

    public jqo(Iterator it, int i) {
        this.c = i;
        this.a = it;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != 0) {
            if (this.b < 131072 && this.a.hasNext()) {
                return true;
            }
            return false;
        }
        if (this.b < ((jqp) this.a).size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.c != 0) {
            if (hasNext()) {
                this.b++;
                return this.a.next();
            }
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        int i = this.b;
        if (i < ((jqp) obj).size()) {
            jqp jqpVar = (jqp) this.a;
            Object obj2 = jqpVar.b.b[jqpVar.b() + i];
            this.b = i + 1;
            return obj2;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Iterator, java.lang.Object] */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.c != 0) {
            this.a.remove();
            return;
        }
        throw new UnsupportedOperationException();
    }

    public jqo(jqp jqpVar, int i) {
        this.c = i;
        this.a = jqpVar;
        this.b = 0;
    }
}
