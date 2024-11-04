package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class and {
    public int a;
    public int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public and() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final int a(int i) {
        if (this.a > 0) {
            return this.b[0];
        }
        return i;
    }

    public final void b(int i) {
        int[] iArr = this.b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                c(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
