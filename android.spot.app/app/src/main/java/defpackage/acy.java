package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy {
    public int[] a = new int[10];
    public int b;

    public final int a() {
        return this.a[this.b - 1];
    }

    public final int b(int i) {
        if (this.b > 0) {
            return a();
        }
        return i;
    }

    public final int c() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int[] copyOf = Arrays.copyOf(iArr, length + length);
            copyOf.getClass();
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr2[i3] = i;
    }

    public final boolean f() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }
}
