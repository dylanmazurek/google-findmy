package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
final class y0 extends AbstractC0064a implements DoubleStream {
    final /* synthetic */ ToDoubleFunction k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(A0 a0, int i, ToDoubleFunction toDoubleFunction) {
        super(a0, i);
        this.k = toDoubleFunction;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble average() {
        C0074f c0074f = new C0074f(17);
        C0074f c0074f2 = new C0074f(5);
        double[] dArr = (double[]) c(new C0089m0(S0.DOUBLE_VALUE, new C0078h(3, new C0074f(6)), c0074f2, c0074f, 0));
        if (dArr[2] > 0.0d) {
            Set set = Collectors.a;
            double d = dArr[0] + dArr[1];
            double d2 = dArr[dArr.length - 1];
            if (Double.isNaN(d) && Double.isInfinite(d2)) {
                d = d2;
            }
            return OptionalDouble.b(d / dArr[2]);
        }
        return OptionalDouble.a();
    }

    @Override // j$.util.stream.AbstractC0064a
    final H d(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f) {
        long e = abstractC0064a.e(spliterator);
        if (e >= 0 && spliterator.hasCharacteristics(16384)) {
            if (e < 2147483639) {
                double[] dArr = new double[(int) e];
                new C0071d0(spliterator, abstractC0064a, dArr).invoke();
                return new Q(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        E e2 = (E) new L(abstractC0064a, spliterator, new C0074f(8), new C0074f(9)).invoke();
        if (e2.q() > 0) {
            long k = e2.k();
            if (k < 2147483639) {
                double[] dArr2 = new double[(int) k];
                new C0083j0(e2, dArr2, 0).invoke();
                return new Q(dArr2);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return e2;
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean f(Spliterator spliterator, final F0 f0) {
        DoubleConsumer doubleConsumer;
        boolean n;
        if (spliterator instanceof j$.util.C) {
            j$.util.C c = (j$.util.C) spliterator;
            if (f0 instanceof DoubleConsumer) {
                doubleConsumer = (DoubleConsumer) f0;
            } else if (!X0.a) {
                f0.getClass();
                doubleConsumer = new DoubleConsumer() { // from class: j$.util.stream.m
                    @Override // java.util.function.DoubleConsumer
                    public final void accept(double d) {
                        F0.this.accept(d);
                    }

                    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                        return j$.lang.a.a(this, doubleConsumer2);
                    }
                };
            } else {
                X0.a(AbstractC0064a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            do {
                n = f0.n();
                if (n) {
                    break;
                }
            } while (c.tryAdvance(doubleConsumer));
            return n;
        }
        if (X0.a) {
            X0.a(AbstractC0064a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [j$.util.stream.O0, j$.util.stream.C] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.util.stream.Q, j$.util.stream.C] */
    @Override // j$.util.stream.AbstractC0064a
    final C j(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new Q(j);
        }
        return new O0();
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean l() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0064a
    final F0 m(int i, F0 f0) {
        return new C0108w0(this, f0, 3);
    }
}
