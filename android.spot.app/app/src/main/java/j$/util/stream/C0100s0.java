package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0100s0 implements InterfaceC0102t0, E0 {
    private boolean a;
    private int b;
    final /* synthetic */ C0074f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0100s0(C0074f c0074f) {
        this.c = c0074f;
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
        C0100s0 c0100s0 = (C0100s0) interfaceC0102t0;
        if (!c0100s0.a) {
            accept(c0100s0.b);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.a();
        }
        return OptionalInt.b(this.b);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        this.a = true;
        this.b = 0;
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
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }
}
