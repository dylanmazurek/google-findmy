package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0098r0 extends D {
    public final /* synthetic */ int a;
    final /* synthetic */ IntBinaryOperator b;

    public /* synthetic */ C0098r0(S0 s0, IntBinaryOperator intBinaryOperator, int i) {
        this.a = i;
        this.b = intBinaryOperator;
    }

    @Override // j$.util.stream.D
    public final InterfaceC0102t0 n() {
        switch (this.a) {
            case 0:
                return new C0097q0((C0074f) this.b);
            default:
                return new C0100s0((C0074f) this.b);
        }
    }
}
