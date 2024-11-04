package j$.util.stream;

import j$.util.AbstractC0118y;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class Z extends AbstractC0065a0 implements j$.util.F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0118y.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0118y.g(this, consumer);
    }
}
