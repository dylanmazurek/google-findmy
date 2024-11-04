package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0105v extends A0 {
    public final /* synthetic */ int k;
    final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0105v(AbstractC0064a abstractC0064a, int i, Object obj, int i2) {
        super(abstractC0064a, i);
        this.k = i2;
        this.l = obj;
    }

    @Override // j$.util.stream.AbstractC0064a
    final boolean l() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0064a
    final F0 m(int i, F0 f0) {
        switch (this.k) {
            case 0:
                return new C0103u(this, f0);
            case 1:
                return new C0108w0(this, f0, 0);
            default:
                return new C0108w0(this, f0, 1);
        }
    }
}
