package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0091n0 extends AbstractC0104u0 implements InterfaceC0102t0 {
    final /* synthetic */ Object b;
    final /* synthetic */ BinaryOperator c;
    final /* synthetic */ BinaryOperator d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0091n0(Object obj, BinaryOperator binaryOperator, BinaryOperator binaryOperator2) {
        this.b = obj;
        this.c = binaryOperator;
        this.d = binaryOperator2;
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
        this.a = this.d.apply(this.a, ((C0091n0) interfaceC0102t0).a);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }
}
