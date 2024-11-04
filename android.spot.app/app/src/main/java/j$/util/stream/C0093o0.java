package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0093o0 extends D {
    final /* synthetic */ BinaryOperator a;
    final /* synthetic */ BiConsumer b;
    final /* synthetic */ Supplier c;
    final /* synthetic */ Collector d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0093o0(S0 s0, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.util.stream.D, j$.util.stream.U0
    public final int c() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return R0.p;
        }
        return 0;
    }

    @Override // j$.util.stream.D
    public final InterfaceC0102t0 n() {
        return new C0095p0(this.c, this.b, this.a);
    }
}
