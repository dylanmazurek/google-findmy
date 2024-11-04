package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface J extends M {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.M, j$.util.Spliterator
    J trySplit();
}
