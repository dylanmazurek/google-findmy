package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class D implements U0 {
    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(D0 d0, Double d) {
        if (!X0.a) {
            d0.accept(d.doubleValue());
        } else {
            X0.a(d0.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static void f(E0 e0, Integer num) {
        if (!X0.a) {
            e0.accept(num.intValue());
        } else {
            X0.a(e0.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static void h() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] i(G g, C0074f c0074f) {
        if (!X0.a) {
            if (g.k() < 2147483639) {
                Object[] objArr = (Object[]) c0074f.apply((int) g.k());
                g.f(objArr, 0);
                return objArr;
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        X0.a(g.getClass(), "{0} calling Node.OfPrimitive.asArray");
        throw null;
    }

    public static void j(E e, Double[] dArr, int i) {
        if (!X0.a) {
            double[] dArr2 = (double[]) e.c();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        X0.a(e.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    public static void k(F f, Integer[] numArr, int i) {
        if (!X0.a) {
            int[] iArr = (int[]) f.c();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        X0.a(f.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void l(E e, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e.d((DoubleConsumer) consumer);
        } else if (!X0.a) {
            ((j$.util.C) e.spliterator()).forEachRemaining(consumer);
        } else {
            X0.a(e.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void m(F f, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f.d((IntConsumer) consumer);
        } else if (!X0.a) {
            ((j$.util.F) f.spliterator()).forEachRemaining(consumer);
        } else {
            X0.a(f.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.a] */
    public static Stream o(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new AbstractC0064a(spliterator, R0.q(spliterator), z);
    }

    @Override // j$.util.stream.U0
    public Object a(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        InterfaceC0102t0 n = n();
        abstractC0064a.p(spliterator, n);
        return n.get();
    }

    @Override // j$.util.stream.U0
    public Object b(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        return ((InterfaceC0102t0) new C0106v0(this, abstractC0064a, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.U0
    public /* synthetic */ int c() {
        return 0;
    }

    public abstract InterfaceC0102t0 n();
}
