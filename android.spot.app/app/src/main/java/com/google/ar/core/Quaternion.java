package com.google.ar.core;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class Quaternion {
    public static final Quaternion a = new Quaternion();
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;
    public float w = 1.0f;

    public Quaternion() {
        b(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static void a(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.x;
        float f5 = quaternion.y;
        float f6 = quaternion.z;
        float f7 = quaternion.w;
        float f8 = f5 * f3;
        float f9 = f6 * f2;
        float f10 = f7 * f2;
        float f11 = f6 * f;
        float f12 = f4 * f3;
        float f13 = f7 * f3;
        float f14 = f4 * f2;
        float f15 = f5 * f;
        float f16 = -f4;
        float f17 = f2 * f5;
        float f18 = f3 * f6;
        float f19 = ((f7 * f) + f8) - f9;
        float f20 = -f6;
        float f21 = -f5;
        float f22 = (f13 + f14) - f15;
        float f23 = (f10 + f11) - f12;
        float f24 = ((f * f16) - f17) - f18;
        fArr2[i2] = (((f19 * f7) + (f24 * f16)) + (f23 * f20)) - (f22 * f21);
        fArr2[i2 + 1] = (((f23 * f7) + (f24 * f21)) + (f22 * f16)) - (f19 * f20);
        fArr2[i2 + 2] = (((f22 * f7) + (f24 * f20)) + (f19 * f21)) - (f23 * f16);
    }

    public final void b(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.w));
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        b(f, f2, f3, f4);
    }

    public Quaternion(Quaternion quaternion) {
        b(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }
}
