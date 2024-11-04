package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0070d {
    protected int a;
    protected int b;
    protected long[] c;

    public final long k() {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        return this.c[i] + this.a;
    }
}
