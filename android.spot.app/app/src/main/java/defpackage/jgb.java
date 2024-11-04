package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgb extends jfz implements ListIterator {
    final /* synthetic */ jgc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgb(jgc jgcVar) {
        super(jgcVar);
        this.d = jgcVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        jgc jgcVar = this.d;
        jgcVar.f.b++;
        if (isEmpty) {
            jgcVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgb(jgc jgcVar, int i) {
        super(jgcVar, jgcVar.d().listIterator(i));
        this.d = jgcVar;
    }
}
