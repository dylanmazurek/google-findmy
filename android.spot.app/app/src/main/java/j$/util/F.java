package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface F extends M {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.M, j$.util.Spliterator
    F trySplit();
}
