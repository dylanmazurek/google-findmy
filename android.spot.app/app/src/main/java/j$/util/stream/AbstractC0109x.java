package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0109x extends AbstractC0064a implements IntStream {
    @Override // j$.util.stream.AbstractC0064a
    final H d(AbstractC0064a abstractC0064a, Spliterator spliterator, C0074f c0074f) {
        long e = abstractC0064a.e(spliterator);
        if (e >= 0 && spliterator.hasCharacteristics(16384)) {
            if (e < 2147483639) {
                int[] iArr = new int[(int) e];
                new C0073e0(spliterator, abstractC0064a, iArr).invoke();
                return new V(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        F f = (F) new L(abstractC0064a, spliterator, new C0074f(10), new C0074f(11)).invoke();
        if (f.q() > 0) {
            long k = f.k();
            if (k < 2147483639) {
                int[] iArr2 = new int[(int) k];
                new C0083j0(f, iArr2, 0).invoke();
                return new V(iArr2);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return f;
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean f(Spliterator spliterator, final F0 f0) {
        IntConsumer intConsumer;
        boolean n;
        if (spliterator instanceof j$.util.F) {
            j$.util.F f = (j$.util.F) spliterator;
            if (f0 instanceof IntConsumer) {
                intConsumer = (IntConsumer) f0;
            } else if (!X0.a) {
                f0.getClass();
                intConsumer = new IntConsumer() { // from class: j$.util.stream.t
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i) {
                        F0.this.accept(i);
                    }

                    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                        return j$.lang.a.b(this, intConsumer2);
                    }
                };
            } else {
                X0.a(AbstractC0064a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            do {
                n = f0.n();
                if (n) {
                    break;
                }
            } while (f.tryAdvance(intConsumer));
            return n;
        }
        if (X0.a) {
            X0.a(AbstractC0064a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [j$.util.stream.O0, j$.util.stream.C] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.util.stream.V, j$.util.stream.C] */
    @Override // j$.util.stream.AbstractC0064a
    final C j(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new V(j);
        }
        return new O0();
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0105v(this, R0.n | R0.m, intFunction, 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return (OptionalInt) c(new C0098r0(S0.INT_VALUE, new C0074f(20), 1));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return ((Integer) c(new C0098r0(S0.INT_VALUE, new C0074f(19), 0))).intValue();
    }
}
