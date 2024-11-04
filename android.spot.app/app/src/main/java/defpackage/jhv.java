package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jhv extends jic implements Iterator {
    protected abstract Iterator a();

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a().remove();
    }
}
