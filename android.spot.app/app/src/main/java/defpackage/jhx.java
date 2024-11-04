package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jhx extends jhv implements ListIterator {
    @Override // defpackage.jhv
    protected /* bridge */ /* synthetic */ Iterator a() {
        throw null;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        b().add(obj);
    }

    protected abstract ListIterator b();

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
    public void set(Object obj) {
        b().set(obj);
    }
}
