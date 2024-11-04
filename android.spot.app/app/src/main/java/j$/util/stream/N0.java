package j$.util.stream;

import j$.util.AbstractC0118y;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
abstract class N0 implements j$.util.M {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final /* synthetic */ O0 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(O0 o0, int i, int i2, int i3, int i4) {
        Object obj;
        this.f = o0;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = o0.e;
        if (objArr == null) {
            obj = o0.d;
        } else {
            obj = objArr[i];
        }
        this.e = obj;
    }

    abstract void a(int i, Object obj, Object obj2);

    abstract j$.util.M b(Object obj, int i, int i2);

    abstract j$.util.M c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.c;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.M
    public final void forEachRemaining(Object obj) {
        O0 o0;
        obj.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                o0 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = o0.e[i];
                o0.s(obj2, i4, o0.u(obj2), obj);
                i++;
                i4 = 0;
            }
            o0.s(this.a == i3 ? this.e : o0.e[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0118y.c(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0118y.d(this, i);
    }

    @Override // j$.util.M
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        O0 o0 = this.f;
        if (i4 == o0.u(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = o0.e;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.M trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            O0 o0 = this.f;
            j$.util.M c = c(i, i3, i4, o0.u(o0.e[i3]));
            this.a = i2;
            this.c = 0;
            this.e = o0.e[i2];
            return c;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        j$.util.M b = b(this.e, i5, i6);
        this.c += i6;
        return b;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    @Override // j$.util.M, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.M, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }
}
