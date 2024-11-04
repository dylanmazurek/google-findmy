package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmq extends bmn {
    public int f;
    final bmp g;
    private bmr[] h;
    private bmr[] i;

    public bmq(ksr ksrVar) {
        super(ksrVar);
        this.h = new bmr[128];
        this.i = new bmr[128];
        this.f = 0;
        this.g = new bmp(this);
    }

    @Override // defpackage.bmn
    public final void d(bmo bmoVar, bmn bmnVar, boolean z) {
        bmr bmrVar = bmnVar.a;
        if (bmrVar == null) {
            return;
        }
        bmm bmmVar = bmnVar.e;
        int i = bmmVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            bmr d = bmmVar.d(i2);
            float b = bmmVar.b(i2);
            bmp bmpVar = this.g;
            bmpVar.a = d;
            if (bmpVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = bmpVar.a.i;
                    float f = fArr[i3] + (bmrVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bmpVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    bmpVar.b.n(bmpVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = bmrVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bmpVar.a.i[i4] = f3;
                    } else {
                        bmpVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += bmnVar.b * b;
        }
        n(bmrVar);
    }

    @Override // defpackage.bmn
    public final boolean e() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bmn
    public final bmr k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            bmr[] bmrVarArr = this.h;
            bmr bmrVar = bmrVarArr[i2];
            if (!zArr[bmrVar.c]) {
                bmp bmpVar = this.g;
                bmpVar.a = bmrVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = bmpVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    bmr bmrVar2 = bmrVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = bmrVar2.i[i3];
                            float f3 = bmpVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(bmr bmrVar) {
        int i;
        int i2 = this.f + 1;
        bmr[] bmrVarArr = this.h;
        int length = bmrVarArr.length;
        if (i2 > length) {
            bmr[] bmrVarArr2 = (bmr[]) Arrays.copyOf(bmrVarArr, length + length);
            this.h = bmrVarArr2;
            int length2 = bmrVarArr2.length;
            this.i = (bmr[]) Arrays.copyOf(bmrVarArr2, length2 + length2);
        }
        bmr[] bmrVarArr3 = this.h;
        int i3 = this.f;
        bmrVarArr3[i3] = bmrVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && bmrVarArr3[i3].c > bmrVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new kg(8));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        bmrVar.b = true;
        bmrVar.a(this);
    }

    public final void n(bmr bmrVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == bmrVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i < i2) {
                        bmr[] bmrVarArr = this.h;
                        int i3 = i + 1;
                        bmrVarArr[i] = bmrVarArr[i3];
                        i = i3;
                    } else {
                        this.f = i2;
                        bmrVar.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.bmn
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            str = str + this.g + " ";
        }
        return str;
    }
}
