package j$.util.stream;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0089m0 extends D {
    public final /* synthetic */ int a;
    final /* synthetic */ BinaryOperator b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public /* synthetic */ C0089m0(S0 s0, BinaryOperator binaryOperator, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = binaryOperator;
        this.c = obj;
        this.d = obj2;
    }

    @Override // j$.util.stream.D
    public final InterfaceC0102t0 n() {
        switch (this.a) {
            case 0:
                return new C0087l0((C0074f) this.d, (C0074f) this.c, (C0078h) this.b);
            default:
                return new C0091n0(this.d, (BinaryOperator) this.c, this.b);
        }
    }
}
