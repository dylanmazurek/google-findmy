package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqy implements Iterator, mpq {
    final /* synthetic */ mrg a;
    private Object b;
    private int c = -2;

    public mqy(mrg mrgVar) {
        this.a = mrgVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [mnw, java.lang.Object] */
    private final void a() {
        Object a;
        int i;
        if (this.c == -2) {
            a = this.a.b.a();
        } else {
            mrg mrgVar = this.a;
            Object obj = this.b;
            obj.getClass();
            a = mrgVar.a.a(obj);
        }
        this.b = a;
        if (a == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.b;
            obj.getClass();
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
