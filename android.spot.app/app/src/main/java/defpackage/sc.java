package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sc {
    public int[] a;
    public int b;

    public sc() {
        this((byte[]) null);
    }

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int b(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            if (i != i2 - 1) {
                mkm.p(iArr, iArr, i, i + 1, i2);
            }
            this.b--;
            return i3;
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            copyOf.getClass();
            this.a = copyOf;
        }
    }

    public final void d(int i) {
        c(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void e(int i, int i2) {
        if (i >= 0 && i < this.b) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            iArr[i] = i2;
        } else {
            StringBuilder sb = new StringBuilder("set index ");
            sb.append(i);
            sb.append(" must be between 0 .. ");
            sb.append(this.b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc) {
            sc scVar = (sc) obj;
            int i = scVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = scVar.a;
                mqg ak = moz.ak(0, i2);
                int i3 = ak.a;
                int i4 = ak.b;
                if (i3 <= i4) {
                    while (iArr[i3] == iArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public sc(int i) {
        this.a = i == 0 ? sh.a : new int[i];
    }

    public /* synthetic */ sc(byte[] bArr) {
        this(16);
    }
}
