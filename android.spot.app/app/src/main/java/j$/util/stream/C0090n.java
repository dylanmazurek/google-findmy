package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0090n implements U0 {
    final int a;
    final Optional b;
    final C0074f c;
    final C0074f d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0090n(boolean z, S0 s0, Optional optional, C0074f c0074f, C0074f c0074f2) {
        int i;
        int i2 = R0.s;
        if (z) {
            i = 0;
        } else {
            i = R0.p;
        }
        this.a = i | i2;
        this.b = optional;
        this.c = c0074f;
        this.d = c0074f2;
    }

    @Override // j$.util.stream.U0
    public final Object a(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        V0 v0 = (V0) this.d.get();
        abstractC0064a.p(spliterator, v0);
        Object obj = v0.get();
        if (obj == null) {
            return this.b;
        }
        return obj;
    }

    @Override // j$.util.stream.U0
    public final Object b(AbstractC0064a abstractC0064a, Spliterator spliterator) {
        return new C0096q(this, R0.ORDERED.r(abstractC0064a.g()), abstractC0064a, spliterator).invoke();
    }

    @Override // j$.util.stream.U0
    public final int c() {
        return this.a;
    }
}
