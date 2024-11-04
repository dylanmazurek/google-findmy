package j$.util.stream;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0083j0 extends AbstractC0085k0 {
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0083j0(H h, Object obj, int i) {
        super(h);
        this.c = i;
        this.d = obj;
    }

    @Override // j$.util.stream.AbstractC0085k0
    final void a() {
        switch (this.c) {
            case 0:
                ((G) this.a).r(this.b, this.d);
                return;
            default:
                this.a.f((Object[]) this.d, this.b);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0085k0
    final AbstractC0085k0 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C0083j0(this, ((G) this.a).a(i), i2);
            default:
                return new C0083j0(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083j0(C0083j0 c0083j0, H h, int i) {
        super(c0083j0, h, i);
        this.c = 1;
        this.d = (Object[]) c0083j0.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083j0(C0083j0 c0083j0, G g, int i) {
        super(c0083j0, g, i);
        this.c = 0;
        this.d = c0083j0.d;
    }
}
