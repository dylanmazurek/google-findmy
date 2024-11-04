package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class L0 extends N0 implements j$.util.C {
    final /* synthetic */ T g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(T t, int i, int i2, int i3, int i4) {
        super(t, i, i2, i3, i4);
        this.g = t;
    }

    @Override // j$.util.stream.N0
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.N0
    final j$.util.M b(Object obj, int i, int i2) {
        return Spliterators.g((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.N0
    final j$.util.M c(int i, int i2, int i3, int i4) {
        return new L0(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0118y.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0118y.f(this, consumer);
    }
}
