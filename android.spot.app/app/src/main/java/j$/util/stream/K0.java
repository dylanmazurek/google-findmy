package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class K0 implements Spliterator {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ C0079h0 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(C0079h0 c0079h0, int i, int i2, int i3, int i4) {
        Object[] objArr;
        this.f = c0079h0;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr2 = c0079h0.e;
        if (objArr2 == null) {
            objArr = c0079h0.d;
        } else {
            objArr = objArr2[i];
        }
        this.e = objArr;
    }

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

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C0079h0 c0079h0;
        Object[] objArr;
        consumer.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                c0079h0 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr2 = c0079h0.e[i];
                while (i4 < objArr2.length) {
                    consumer.accept(objArr2[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            if (this.a == i3) {
                objArr = this.e;
            } else {
                objArr = c0079h0.e[i3];
            }
            while (i4 < i2) {
                consumer.accept(objArr[i4]);
                i4++;
            }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.e;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            C0079h0 c0079h0 = this.f;
            K0 k0 = new K0(c0079h0, i, i3, i4, c0079h0.e[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = c0079h0.e[i2];
            return k0;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        Spliterator i7 = Spliterators.i(this.e, i5, i5 + i6, 1040);
        this.c += i6;
        return i7;
    }
}
