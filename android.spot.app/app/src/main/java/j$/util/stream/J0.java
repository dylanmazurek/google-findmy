package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class J0 extends G0 {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public final void h() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        F0 f0 = this.a;
        f0.i(j);
        if (!this.c) {
            while (i < this.e) {
                f0.accept((F0) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !f0.n()) {
                f0.accept((F0) this.d[i]);
                i++;
            }
        }
        f0.h();
        this.d = null;
    }

    @Override // j$.util.stream.C0, j$.util.stream.F0
    public final void i(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
