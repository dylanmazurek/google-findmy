package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alo {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public alo(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                long j2 = this.b[i3] - j;
                if (j2 < 0) {
                    i2 = i3 + 1;
                } else if (j2 > 0) {
                    i = i3 - 1;
                } else {
                    return i3;
                }
            }
            return -(i2 + 1);
        }
        long j3 = this.b[0];
        if (j3 == j) {
            return 0;
        }
        if (j3 <= j) {
            return -1;
        }
        return -2;
    }
}
