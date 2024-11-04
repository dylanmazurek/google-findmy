package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fal {
    public int a;
    public Object b;

    public fal() {
    }

    private final void n(int i, int i2) {
        int[] iArr = (int[]) this.b;
        qm.k(iArr, i, i2);
        qm.k(iArr, i + 1, i2 + 1);
        qm.k(iArr, i + 2, i2 + 2);
    }

    public final void a() {
        this.b = null;
        this.a = 0;
    }

    public final ezc b() {
        int i;
        Object obj = this.b;
        if (obj != null && (i = this.a) != 0) {
            return new ezc((String) obj, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" errorDescription");
        }
        if (this.a == 0) {
            sb.append(" errorSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null errorDescription");
    }

    public final int d(int i) {
        return ((int[]) this.b)[i];
    }

    public final int e() {
        Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void f(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        if (i5 >= length) {
            int[] copyOf = Arrays.copyOf(iArr, length + length);
            copyOf.getClass();
            this.b = copyOf;
        }
        int[] iArr2 = (int[]) this.b;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        if (i6 >= length) {
            int[] copyOf = Arrays.copyOf(iArr, length + length);
            copyOf.getClass();
            this.b = copyOf;
        }
        int[] iArr2 = (int[]) this.b;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void h(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    n(i3, i4);
                }
            }
            n(i3 + 3, i2);
            h(i, i3);
            h(i3 + 6, i2);
        }
    }

    public final long i(int i) {
        return ((long[]) this.b)[i];
    }

    public final boolean j(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j) {
        if (!j(j)) {
            int i = this.a;
            long[] jArr = (long[]) this.b;
            int length = jArr.length;
            if (i >= length) {
                long[] copyOf = Arrays.copyOf(jArr, Math.max(i + 1, length + length));
                copyOf.getClass();
                this.b = copyOf;
            }
            ((long[]) this.b)[i] = j;
            if (i >= this.a) {
                this.a = i + 1;
            }
        }
    }

    public final void l(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == i(i2)) {
                m(i2);
                return;
            }
        }
    }

    public final void m(int i) {
        int i2 = this.a;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                int i4 = i + 1;
                long[] jArr = (long[]) this.b;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.a--;
        }
    }

    public fal(char[] cArr) {
        this.b = new long[2];
    }

    public fal(int i) {
        this.b = new int[i];
    }
}
