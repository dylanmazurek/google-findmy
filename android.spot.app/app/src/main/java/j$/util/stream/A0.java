package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
abstract class A0 extends AbstractC0064a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        EnumC0112z enumC0112z = EnumC0112z.ALL;
        predicate.getClass();
        enumC0112z.getClass();
        return ((Boolean) c(new A(S0.REFERENCE, enumC0112z, new C0076g(2, enumC0112z, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        EnumC0112z enumC0112z = EnumC0112z.ANY;
        predicate.getClass();
        enumC0112z.getClass();
        return ((Boolean) c(new A(S0.REFERENCE, enumC0112z, new C0076g(2, enumC0112z, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object c;
        if (i() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!h() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            c = collector.c().get();
            r(new C0076g(3, collector.a(), c));
        } else {
            collector.getClass();
            Supplier c2 = collector.c();
            BiConsumer a = collector.a();
            c = c(new C0093o0(S0.REFERENCE, collector.b(), a, c2, collector));
        }
        if (!collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return collector.d().apply(c);
        }
        return c;
    }

    @Override // j$.util.stream.AbstractC0064a
    final H d(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f) {
        long e = abstractC0064a.e(spliterator);
        if (e >= 0 && spliterator.hasCharacteristics(16384)) {
            if (e < 2147483639) {
                Object[] objArr = (Object[]) c0074f.apply((int) e);
                new C0075f0(spliterator, abstractC0064a, objArr).invoke();
                return new J(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        H h = (H) new L(abstractC0064a, spliterator, new C0078h(1, c0074f), new C0074f(12)).invoke();
        if (h.q() > 0) {
            long k = h.k();
            if (k < 2147483639) {
                Object[] objArr2 = (Object[]) c0074f.apply((int) k);
                new C0083j0(h, objArr2, 1).invoke();
                return new J(objArr2);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return h;
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean f(Spliterator spliterator, F0 f0) {
        boolean n;
        do {
            n = f0.n();
            if (n) {
                break;
            }
        } while (spliterator.tryAdvance(f0));
        return n;
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0105v(this, R0.r, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) c(C0092o.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) c(C0092o.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.h0, java.lang.Object, j$.util.stream.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.J, j$.util.stream.C] */
    @Override // j$.util.stream.AbstractC0064a
    final C j(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new J(j, intFunction);
        }
        ?? obj = new Object();
        obj.d = new Object[16];
        return obj;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0105v(this, R0.n | R0.m, function, 2);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new y0(this, R0.n | R0.m, toDoubleFunction);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C0110x0(this, R0.n | R0.m, toIntFunction);
    }

    public void r(C0076g c0076g) {
        c(new r(c0076g));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return c(new C0089m0(S0.REFERENCE, binaryOperator, binaryOperator, obj, 1));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new H0(this, comparator);
    }
}
