package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class M0 extends N0 implements j$.util.F {
    final /* synthetic */ X g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(X x, int i, int i2, int i3, int i4) {
        super(x, i, i2, i3, i4);
        this.g = x;
    }

    @Override // j$.util.stream.N0
    final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.N0
    final j$.util.M b(Object obj, int i, int i2) {
        return Spliterators.h((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.N0
    final j$.util.M c(int i, int i2, int i3, int i4) {
        return new M0(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0118y.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0118y.g(this, consumer);
    }
}
