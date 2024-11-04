package j$.util.stream;

import java.util.function.ToIntFunction;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0110x0 extends AbstractC0109x {
    final /* synthetic */ ToIntFunction k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0110x0(A0 a0, int i, ToIntFunction toIntFunction) {
        super(a0, i);
        this.k = toIntFunction;
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean l() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0064a
    final F0 m(int i, F0 f0) {
        return new C0108w0(this, f0, 2);
    }
}
