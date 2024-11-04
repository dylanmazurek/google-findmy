package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class A implements U0 {
    final EnumC0112z a;
    final C0076g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(S0 s0, EnumC0112z enumC0112z, C0076g c0076g) {
        this.a = enumC0112z;
        this.b = c0076g;
    }

    @Override // j$.util.stream.U0
    public final Object a(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        C0111y c0111y = (C0111y) this.b.get();
        abstractC0064a.p(spliterator, c0111y);
        return Boolean.valueOf(c0111y.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.U0
    public final Object b(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        return (Boolean) new B(this, abstractC0064a, spliterator).invoke();
    }

    @Override // j$.util.stream.U0
    public final int c() {
        return R0.s | R0.p;
    }
}
