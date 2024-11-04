package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class T extends O0 implements E, C, D0, DoubleConsumer {
    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final Object b(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final Object c() {
        long k = k();
        if (k < 2147483639) {
            Object b = b((int) k);
            r(0, b);
            return (double[]) b;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final void d(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            s(obj2, 0, u(obj2), doubleConsumer);
        }
        s(this.d, 0, this.a, doubleConsumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void f(Object[] objArr, int i) {
        D.j(this, (Double[]) objArr, i);
    }

    @Override // java.lang.Iterable, j$.lang.b
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d((DoubleConsumer) consumer);
        } else if (!X0.a) {
            AbstractC0118y.a(new L0(this, 0, this.b, 0, this.a), consumer);
        } else {
            X0.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // j$.util.stream.C
    public final H g() {
        return this;
    }

    @Override // j$.util.stream.F0
    public final void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        Object[] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
        v(j);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.d(new L0(this, 0, this.b, 0, this.a));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] j(C0074f c0074f) {
        return D.i(this, c0074f);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final void r(int i, Object obj) {
        super.r(i, (double[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.O0
    public final void s(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final j$.util.M spliterator() {
        return new L0(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        double[] dArr = (double[]) c();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.O0
    public final int u(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.O0
    protected final Object[] w() {
        return new double[8];
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        D.e(this, (Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.lang.a.a(this, doubleConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final Spliterator spliterator() {
        return new L0(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.F0
    public void accept(double d) {
        x();
        double[] dArr = (double[]) this.d;
        int i = this.a;
        this.a = i + 1;
        dArr[i] = d;
    }
}
