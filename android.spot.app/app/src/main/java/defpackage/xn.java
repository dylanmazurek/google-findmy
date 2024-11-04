package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xn implements xo {
    private final /* synthetic */ int a;

    public xn(int i) {
        this.a = i;
    }

    @Override // defpackage.xo
    public final void a(int i, int[] iArr, int[] iArr2) {
        int length;
        int i2 = 0;
        if (this.a != 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                i4 += iArr[i3];
                i3++;
            }
            float f = (i - i4) / (length + 1);
            float f2 = f;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + f;
                i2++;
                i5++;
            }
            return;
        }
        int i7 = 0;
        int i8 = 0;
        while (i2 < iArr.length) {
            int i9 = iArr[i2];
            iArr2[i8] = i7;
            i7 += i9;
            i2++;
            i8++;
        }
    }

    public final String toString() {
        if (this.a != 0) {
            return "Arrangement#SpaceEvenly";
        }
        return "Arrangement#Top";
    }
}
