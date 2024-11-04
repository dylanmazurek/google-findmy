package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0071d0 extends AbstractC0077g0 implements D0 {
    private final double[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0071d0(Spliterator spliterator, AbstractC0064a abstractC0064a, double[] dArr) {
        super(spliterator, abstractC0064a, dArr.length);
        this.h = dArr;
    }

    @Override // j$.util.stream.AbstractC0077g0
    final AbstractC0077g0 a(Spliterator spliterator, long j, long j2) {
        return new C0071d0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        D.e(this, (Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.lang.a.a(this, doubleConsumer);
    }

    C0071d0(C0071d0 c0071d0, Spliterator spliterator, long j, long j2) {
        super(c0071d0, spliterator, j, j2, c0071d0.h.length);
        this.h = c0071d0.h;
    }

    @Override // j$.util.stream.AbstractC0077g0, j$.util.stream.F0
    public final void accept(double d) {
        int i = this.f;
        if (i < this.g) {
            double[] dArr = this.h;
            this.f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }
}
