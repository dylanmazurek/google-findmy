package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface C extends M {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.M, j$.util.Spliterator
    C trySplit();
}
