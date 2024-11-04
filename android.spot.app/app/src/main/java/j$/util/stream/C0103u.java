package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0103u extends B0 {
    final /* synthetic */ C0105v b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103u(C0105v c0105v, F0 f0) {
        super(f0);
        this.b = c0105v;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final void accept(int i) {
        this.a.accept((F0) ((IntFunction) this.b.l).apply(i));
    }
}
