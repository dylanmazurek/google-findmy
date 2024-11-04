package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public interface Stream<T> extends AutoCloseable {

    /* renamed from: j$.util.stream.Stream$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static <T> Stream<T> empty() {
            return D.o(Spliterators.c(), false);
        }
    }

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    T reduce(T t, BinaryOperator<T> binaryOperator);

    Stream<T> sorted(Comparator<? super T> comparator);
}
