package j$.util.stream;

/* loaded from: classes2.dex */
abstract class I implements H {
    protected final H a;
    protected final H b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(H h, H h2) {
        this.a = h;
        this.b = h2;
        this.c = h.k() + h2.k();
    }

    @Override // j$.util.stream.H
    public final H a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final long k() {
        return this.c;
    }

    @Override // j$.util.stream.H
    public final int q() {
        return 2;
    }

    @Override // j$.util.stream.H
    public /* bridge */ /* synthetic */ G a(int i) {
        return (G) a(i);
    }
}
