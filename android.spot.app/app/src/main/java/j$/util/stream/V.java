package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
class V implements F {
    final int[] a;
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(long j) {
        if (j < 2147483639) {
            this.a = new int[(int) j];
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
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        if (length != i) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    @Override // j$.util.stream.G
    public final void d(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void f(Object[] objArr, int i) {
        D.k(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        D.m(this, consumer);
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
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final j$.util.M spliterator() {
        return Spliterators.h(this.a, 0, this.b);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return Spliterators.h(this.a, 0, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
