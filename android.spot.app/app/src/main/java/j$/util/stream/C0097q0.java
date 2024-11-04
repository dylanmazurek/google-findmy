package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0097q0 implements InterfaceC0102t0, E0 {
    private int a;
    final /* synthetic */ C0074f b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0097q0(C0074f c0074f) {
        this.b = c0074f;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0102t0
    public final void e(InterfaceC0102t0 interfaceC0102t0) {
        accept(((C0097q0) interfaceC0102t0).a);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        this.a = 0;
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void l(Integer num) {
        D.f(this, num);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.lang.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.F0
    public final void accept(int i) {
        this.a = this.b.applyAsInt(this.a, i);
    }
}
