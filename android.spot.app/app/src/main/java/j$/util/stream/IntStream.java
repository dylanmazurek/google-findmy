package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterators;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public interface IntStream extends AutoCloseable {

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Type inference failed for: r2v1, types: [j$.util.stream.IntStream, j$.util.stream.a] */
        /* JADX WARN: Type inference failed for: r3v2, types: [j$.util.stream.IntStream, j$.util.stream.a] */
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.F b = Spliterators.b();
                return new AbstractC0064a(b, R0.q(b), false);
            }
            T0 t0 = new T0(i, i2, 0);
            return new AbstractC0064a(t0, R0.q(t0), false);
        }
    }

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt max();

    int sum();
}
