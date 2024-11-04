package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class X extends O0 implements F, C, E0, IntConsumer {
    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final Object b(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final Object c() {
        long k = k();
        if (k < 2147483639) {
            Object b = b((int) k);
            r(0, b);
            return (int[]) b;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.O0, j$.util.stream.G
    public final void d(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            s(obj2, 0, u(obj2), intConsumer);
        }
        s(this.d, 0, this.a, intConsumer);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void f(Object[] objArr, int i) {
        D.k(this, (Integer[]) objArr, i);
    }

    @Override // java.lang.Iterable, j$.lang.b
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d((IntConsumer) consumer);
        } else if (!X0.a) {
            AbstractC0118y.b(new M0(this, 0, this.b, 0, this.a), consumer);
        } else {
            X0.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
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
        return Spliterators.e(new M0(this, 0, this.b, 0, this.a));
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] j(C0074f c0074f) {
        return D.i(this, c0074f);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void l(Integer num) {
        D.f(this, num);
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
        super.r(i, (int[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.O0
    public final void s(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final j$.util.M spliterator() {
        return new M0(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        int[] iArr = (int[]) c();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.O0
    public final int u(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.O0
    protected final Object[] w() {
        return new int[8];
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.lang.a.b(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.b, j$.util.Collection
    public final Spliterator spliterator() {
        return new M0(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.stream.F0
    public void accept(int i) {
        x();
        int[] iArr = (int[]) this.d;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }
}
