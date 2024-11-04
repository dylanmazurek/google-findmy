package j$.nio.file;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class x implements DirectoryStream, j$.lang.b {
    private final DirectoryStream a;

    public x(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.lang.Iterable, j$.lang.b
    public final void forEach(Consumer consumer) {
        j$.lang.a.c(this.a, new w(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new z(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.j(iterator());
    }
}
