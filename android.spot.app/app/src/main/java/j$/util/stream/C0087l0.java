package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0087l0 extends AbstractC0104u0 implements InterfaceC0102t0, D0 {
    final /* synthetic */ C0074f b;
    final /* synthetic */ C0074f c;
    final /* synthetic */ C0078h d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0087l0(C0074f c0074f, C0074f c0074f2, C0078h c0078h) {
        this.b = c0074f;
        this.c = c0074f2;
        this.d = c0078h;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0102t0
    public final void e(InterfaceC0102t0 interfaceC0102t0) {
        this.a = this.d.apply(this.a, ((C0087l0) interfaceC0102t0).a);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        D.e(this, (Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.lang.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.F0
    public final void accept(double d) {
        this.c.accept((C0074f) this.a, d);
    }
}
