package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajp extends ajf {
    private final Object c;

    public ajp(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        this.a--;
        return this.c;
    }
}
