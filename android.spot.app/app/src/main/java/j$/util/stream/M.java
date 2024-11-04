package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class M extends O implements E {
    @Override // j$.util.stream.G
    public final Object b(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void f(Object[] objArr, int i) {
        D.j(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        D.l(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.M, j$.util.stream.c0] */
    @Override // j$.util.stream.H
    public final j$.util.M spliterator() {
        return new AbstractC0069c0(this);
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return new AbstractC0069c0(this);
    }
}
