package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vc {
    public static float[] a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private float k;
    private float l;
    private float m;
    private final float[] n;
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private final boolean s;

    public vc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        float f8;
        this.b = f;
        this.c = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = f6;
        float f9 = f6 - f4;
        boolean z2 = false;
        if (i != 1 && (i == 4 ? f9 <= 0.0f : i != 5 || f9 >= 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        float f10 = f5 - f3;
        this.s = z;
        float f11 = 1.0f / (f2 - f);
        this.o = f11;
        if (i != 3 && Math.abs(f10) >= 0.001f && Math.abs(f9) >= 0.001f) {
            this.n = new float[101];
            if (true != z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.p = f10 * i2;
            this.q = f9 * (true != z ? -1 : 1);
            if (z) {
                f7 = f5;
            } else {
                f7 = f3;
            }
            this.d = f7;
            if (z) {
                f8 = f4;
            } else {
                f8 = f6;
            }
            this.e = f8;
            float f12 = f5 - f3;
            float f13 = f4 - f6;
            qm.i();
            int i3 = 0;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i3 < 91) {
                qm.i();
                double radians = (float) Math.toRadians((i3 * 90.0d) / 90.0d);
                float sin = ((float) Math.sin(radians)) * f12;
                float cos = ((float) Math.cos(radians)) * f13;
                if (i3 > 0) {
                    f14 += (float) Math.hypot(sin - f15, cos - f16);
                    qm.i()[i3] = f14;
                }
                i3++;
                f15 = sin;
                f16 = cos;
            }
            this.k = f14;
            qm.i();
            for (int i4 = 0; i4 < 91; i4++) {
                float[] i5 = qm.i();
                i5[i4] = i5[i4] / f14;
            }
            for (int i6 = 0; i6 < 101; i6++) {
                float f17 = i6 / 100.0f;
                int binarySearch = Arrays.binarySearch(qm.i(), 0, 91, f17);
                if (binarySearch >= 0) {
                    float[] fArr = this.n;
                    qm.i();
                    fArr[i6] = binarySearch / 90.0f;
                } else if (binarySearch == -1) {
                    this.n[i6] = 0.0f;
                } else {
                    int i7 = -binarySearch;
                    int i8 = i7 - 1;
                    int i9 = i7 - 2;
                    float f18 = f17 - qm.i()[i9];
                    float f19 = qm.i()[i8] - qm.i()[i9];
                    qm.i();
                    this.n[i6] = (i9 + (f18 / f19)) / 90.0f;
                }
            }
            this.r = this.k * this.o;
        } else {
            float hypot = (float) Math.hypot(f9, f10);
            this.k = hypot;
            this.r = hypot * f11;
            float f20 = f2 - f;
            this.d = f10 / f20;
            this.e = f9 / f20;
            this.n = new float[101];
            this.p = Float.NaN;
            this.q = Float.NaN;
            z2 = true;
        }
        this.f = z2;
    }

    public final float a() {
        float f = this.p * this.m;
        float hypot = (float) Math.hypot(f, (-this.q) * this.l);
        boolean z = this.s;
        float f2 = this.r / hypot;
        if (z) {
            f = -f;
        }
        return f * f2;
    }

    public final float b() {
        float f = this.p * this.m;
        float f2 = (-this.q) * this.l;
        float hypot = (float) Math.hypot(f, f2);
        boolean z = this.s;
        float f3 = this.r / hypot;
        if (z) {
            return (-f2) * f3;
        }
        return f2 * f3;
    }

    public final float c() {
        return this.d + (this.p * this.l);
    }

    public final float d() {
        return this.e + (this.q * this.m);
    }

    public final float e(float f) {
        float f2 = this.i;
        float f3 = this.g;
        return f3 + ((f - this.b) * this.o * (f2 - f3));
    }

    public final float f(float f) {
        float f2 = this.j;
        float f3 = this.h;
        return f3 + ((f - this.b) * this.o * (f2 - f3));
    }

    public final void g(float f) {
        float f2;
        if (this.s) {
            f2 = this.c - f;
        } else {
            f2 = f - this.b;
        }
        float f3 = f2 * this.o;
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                float f5 = f3 * 100.0f;
                float[] fArr = this.n;
                int i = (int) f5;
                float f6 = fArr[i];
                f4 = f6 + ((f5 - i) * (fArr[i + 1] - f6));
            }
        }
        double d = f4 * 1.5707964f;
        this.l = (float) Math.sin(d);
        this.m = (float) Math.cos(d);
    }
}
