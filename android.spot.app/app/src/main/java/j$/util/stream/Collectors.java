package j$.util.stream;

import j$.util.Map;
import j$.util.stream.Collector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class Collectors {
    static final Set a;
    static final Set b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Function function, Function function2, Map map, Object obj) {
        Object apply = function.apply(obj);
        Object apply2 = function2.apply(obj);
        apply2.getClass();
        Object putIfAbsent = Map.EL.putIfAbsent(map, apply, apply2);
        if (putIfAbsent == null) {
        } else {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, putIfAbsent, apply2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static Collector c() {
        return new C0082j(new C0074f(14), new C0074f(15), new C0074f(1), new C0074f(2), b);
    }

    public static <T> Collector<T, ?, java.util.Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate) {
        C0082j c0082j = new C0082j(new C0074f(14), new C0074f(15), new C0074f(3));
        C0076g c0076g = new C0076g(1, c0082j.a(), predicate);
        C0078h c0078h = new C0078h(0, c0082j.b());
        C0080i c0080i = new C0080i(c0082j);
        if (c0082j.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return new C0082j(c0080i, c0076g, c0078h);
        }
        return new C0082j(c0080i, c0076g, c0078h, new C0080i(c0082j), b);
    }

    public static <T, K, U> Collector<T, ?, java.util.Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C0082j(new C0074f(16), new C0076g(0, function, function2), new C0074f(0));
    }
}
