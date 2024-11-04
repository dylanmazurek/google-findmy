package j$.util.stream;

/* loaded from: classes2.dex */
abstract class O extends I implements G {
    @Override // j$.util.stream.G
    public final Object c() {
        long k = k();
        if (k < 2147483639) {
            Object b = b((int) k);
            r(0, b);
            return b;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.G
    public final void d(Object obj) {
        ((G) this.a).d(obj);
        ((G) this.b).d(obj);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] j(C0074f c0074f) {
        return D.i(this, c0074f);
    }

    @Override // j$.util.stream.G
    public final void r(int i, Object obj) {
        H h = this.a;
        ((G) h).r(i, obj);
        ((G) this.b).r(i + ((int) ((G) h).k()), obj);
    }

    public final String toString() {
        if (k() < 32) {
            return String.format("%s[%s.%s]", getClass().getName(), this.a, this.b);
        }
        return String.format("%s[size=%d]", getClass().getName(), Long.valueOf(k()));
    }
}
