package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0073e0 extends AbstractC0077g0 implements E0 {
    private final int[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0073e0(Spliterator spliterator, AbstractC0064a abstractC0064a, int[] iArr) {
        super(spliterator, abstractC0064a, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.AbstractC0077g0
    final AbstractC0077g0 a(Spliterator spliterator, long j, long j2) {
        return new C0073e0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.lang.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void l(Integer num) {
        D.f(this, num);
    }

    @Override // j$.util.stream.AbstractC0077g0, j$.util.stream.F0
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 < this.g) {
            int[] iArr = this.h;
            this.f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    C0073e0(C0073e0 c0073e0, Spliterator spliterator, long j, long j2) {
        super(c0073e0, spliterator, j, j2, c0073e0.h.length);
        this.h = c0073e0.h;
    }
}
