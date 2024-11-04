package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class O0 extends AbstractC0070d implements Iterable, j$.lang.b {
    Object d = b(16);
    Object[] e;

    public abstract Object b(int i);

    public abstract Object c();

    public abstract void d(Object obj);

    public void r(int i, Object obj) {
        long j = i;
        long k = k() + j;
        if (k <= u(obj) && k >= j) {
            if (this.b == 0) {
                System.arraycopy(this.d, 0, obj, i, this.a);
                return;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                Object obj2 = this.e[i2];
                System.arraycopy(obj2, 0, obj, i, u(obj2));
                i += u(this.e[i2]);
            }
            int i3 = this.a;
            if (i3 > 0) {
                System.arraycopy(this.d, 0, obj, i, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void s(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int u(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(long j) {
        long u;
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            u = u(this.d);
        } else {
            u = u(this.e[i2]) + this.c[i2];
        }
        if (j > u) {
            if (this.e == null) {
                Object[] w = w();
                this.e = w;
                this.c = new long[8];
                w[0] = this.d;
            }
            int i3 = this.b + 1;
            while (j > u) {
                Object[] objArr = this.e;
                if (i3 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.e = Arrays.copyOf(objArr, length);
                    this.c = Arrays.copyOf(this.c, length);
                }
                if (i3 != 0 && i3 != 1) {
                    i = Math.min(i3 + 3, 30);
                } else {
                    i = 4;
                }
                int i4 = 1 << i;
                this.e[i3] = b(i4);
                long[] jArr = this.c;
                jArr[i3] = jArr[i3 - 1] + u(this.e[r6]);
                u += i4;
                i3++;
            }
        }
    }

    protected abstract Object[] w();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        long u;
        if (this.a == u(this.d)) {
            if (this.e == null) {
                Object[] w = w();
                this.e = w;
                this.c = new long[8];
                w[0] = this.d;
            }
            int i = this.b;
            int i2 = i + 1;
            Object[] objArr = this.e;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    u = u(this.d);
                } else {
                    u = u(objArr[i]) + this.c[i];
                }
                v(u + 1);
            }
            this.a = 0;
            int i3 = this.b + 1;
            this.b = i3;
            this.d = this.e[i3];
        }
    }
}
