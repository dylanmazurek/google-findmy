package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
class Q implements E {
    final double[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(long j) {
        if (j < 2147483639) {
            this.a = new double[(int) j];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G
    public final Object c() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        if (length != i) {
            return Arrays.copyOf(dArr, i);
        }
        return dArr;
    }

    @Override // j$.util.stream.G
    public final void d(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void f(Object[] objArr, int i) {
        D.j(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        D.l(this, consumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] j(C0074f c0074f) {
        return D.i(this, c0074f);
    }

    @Override // j$.util.stream.H
    public final long k() {
        return this.b;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.G
    public final void r(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final j$.util.M spliterator() {
        return Spliterators.g(this.a, 0, this.b);
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return Spliterators.g(this.a, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }
}
