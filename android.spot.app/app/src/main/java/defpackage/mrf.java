package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrf implements Iterator, mpq {
    final /* synthetic */ mrg a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [mqz, java.lang.Object] */
    public mrf(mrg mrgVar) {
        this.a = mrgVar;
        this.b = mrgVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [moh, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
