package j$.util;

/* loaded from: classes2.dex */
public interface M extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    M trySplit();
}
