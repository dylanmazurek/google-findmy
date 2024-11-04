package j$.util.stream;

import j$.util.AbstractC0118y;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0069c0 implements Spliterator {
    H a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0069c0(H h) {
        this.a = h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static H a(ArrayDeque arrayDeque) {
        while (true) {
            H h = (H) arrayDeque.pollFirst();
            if (h != null) {
                if (h.q() == 0) {
                    if (h.k() > 0) {
                        return h;
                    }
                } else {
                    for (int q = h.q() - 1; q >= 0; q--) {
                        arrayDeque.addFirst(h.a(q));
                    }
                }
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q = this.a.q();
        while (true) {
            q--;
            if (q >= this.b) {
                arrayDeque.addFirst(this.a.a(q));
            } else {
                return arrayDeque;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque b = b();
                this.e = b;
                H a = a(b);
                if (a != null) {
                    this.d = a.spliterator();
                    return true;
                }
                this.a = null;
                return false;
            }
            this.d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.q(); i++) {
            j += this.a.a(i).k();
        }
        return j;
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
    public final Spliterator trySplit() {
        H h = this.a;
        if (h == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < h.q() - 1) {
            H h2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return h2.a(i).spliterator();
        }
        H a = this.a.a(this.b);
        this.a = a;
        if (a.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        H h3 = this.a;
        this.b = 1;
        return h3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.M trySplit() {
        return (j$.util.M) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }
}
