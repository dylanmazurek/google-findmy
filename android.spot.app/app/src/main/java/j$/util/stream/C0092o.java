package j$.util.stream;

import j$.util.Optional;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0092o extends AbstractC0094p {
    static final C0090n c;
    static final C0090n d;

    static {
        S0 s0 = S0.REFERENCE;
        c = new C0090n(true, s0, Optional.empty(), new C0074f(18), new C0074f(7));
        d = new C0090n(false, s0, Optional.empty(), new C0074f(18), new C0074f(7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
