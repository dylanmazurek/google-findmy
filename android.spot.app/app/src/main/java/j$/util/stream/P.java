package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class P extends I {
    @Override // j$.util.stream.H
    public final void f(Object[] objArr, int i) {
        objArr.getClass();
        H h = this.a;
        h.f(objArr, i);
        this.b.f(objArr, i + ((int) h.k()));
    }

    @Override // j$.util.stream.H
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.H
    public final Object[] j(C0074f c0074f) {
        long k = k();
        if (k < 2147483639) {
            Object[] objArr = (Object[]) c0074f.apply((int) k);
            f(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return new AbstractC0069c0(this);
    }

    public final String toString() {
        if (k() < 32) {
            return String.format("ConcNode[%s.%s]", this.a, this.b);
        }
        return String.format("ConcNode[size=%d]", Long.valueOf(k()));
    }
}
