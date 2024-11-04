package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmr implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    bmn[] j = new bmn[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public bmr(int i) {
        this.n = i;
    }

    public final void a(bmn bmnVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i < i2) {
                if (this.j[i] == bmnVar) {
                    return;
                } else {
                    i++;
                }
            } else {
                bmn[] bmnVarArr = this.j;
                int length = bmnVarArr.length;
                if (i2 >= length) {
                    this.j = (bmn[]) Arrays.copyOf(bmnVarArr, length + length);
                }
                bmn[] bmnVarArr2 = this.j;
                int i3 = this.k;
                bmnVarArr2[i3] = bmnVar;
                this.k = i3 + 1;
                return;
            }
        }
    }

    public final void b(bmn bmnVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == bmnVar) {
                while (i2 < i - 1) {
                    bmn[] bmnVarArr = this.j;
                    int i3 = i2 + 1;
                    bmnVarArr[i2] = bmnVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((bmr) obj).c;
    }

    public final void d(bmo bmoVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(bmoVar, this, false);
        }
        this.k = 0;
    }

    public final void e(bmo bmoVar, bmn bmnVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(bmoVar, bmnVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
