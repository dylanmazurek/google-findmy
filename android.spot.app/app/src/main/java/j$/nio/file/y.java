package j$.nio.file;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class y implements Iterable, j$.lang.b {
    private final Iterable a;

    public y(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.b
    public final void forEach(Consumer consumer) {
        j$.lang.a.c(this.a, new w(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.j(iterator());
    }
}
