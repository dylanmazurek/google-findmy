package com.google.ar.core;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.a);
    private final Quaternion quaternion;
    private final float[] translation;

    private Pose(float[] fArr, Quaternion quaternion) {
        this.translation = fArr;
        this.quaternion = quaternion;
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f) {
        if (f == 0.0f) {
            return pose;
        }
        if (f == 1.0f) {
            return pose2;
        }
        float f2 = 1.0f - f;
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = (pose.translation[i] * f2) + (pose2.translation[i] * f);
        }
        Quaternion quaternion = pose.quaternion;
        Quaternion quaternion2 = pose2.quaternion;
        Quaternion quaternion3 = new Quaternion();
        float f3 = (quaternion.x * quaternion2.x) + (quaternion.y * quaternion2.y) + (quaternion.z * quaternion2.z) + (quaternion.w * quaternion2.w);
        if (f3 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f3 = -f3;
            quaternion4.x = -quaternion4.x;
            quaternion4.y = -quaternion4.y;
            quaternion4.z = -quaternion4.z;
            quaternion4.w = -quaternion4.w;
            quaternion2 = quaternion4;
        }
        float acos = (float) Math.acos(f3);
        float sqrt = (float) Math.sqrt(1.0f - (f3 * f3));
        if (Math.abs(sqrt) > 0.001d) {
            float f4 = 1.0f / sqrt;
            float sin = (float) Math.sin(f2 * acos);
            f = ((float) Math.sin(f * acos)) * f4;
            f2 = sin * f4;
        }
        quaternion3.x = (quaternion.x * f2) + (quaternion2.x * f);
        quaternion3.y = (quaternion.y * f2) + (quaternion2.y * f);
        quaternion3.z = (quaternion.z * f2) + (quaternion2.z * f);
        quaternion3.w = (f2 * quaternion.w) + (f * quaternion2.w);
        float sqrt2 = (float) (1.0d / Math.sqrt((((r0 * r0) + (r1 * r1)) + (r5 * r5)) + (r2 * r2)));
        quaternion3.x *= sqrt2;
        quaternion3.y *= sqrt2;
        quaternion3.z *= sqrt2;
        quaternion3.w *= sqrt2;
        return new Pose(fArr, quaternion3);
    }

    public static Pose makeRotation(float f, float f2, float f3, float f4) {
        return new Pose(IDENTITY.translation, new Quaternion(f, f2, f3, f4));
    }

    public static Pose makeTranslation(float f, float f2, float f3) {
        return new Pose(new float[]{f, f2, f3}, IDENTITY.quaternion);
    }

    public Pose compose(Pose pose) {
        Quaternion.a(this.quaternion, pose.translation, 0, r2, 0);
        float f = r2[0];
        float[] fArr = this.translation;
        float[] fArr2 = {f + fArr[0], fArr2[1] + fArr[1], fArr2[2] + fArr[2]};
        Quaternion quaternion = pose.quaternion;
        Quaternion quaternion2 = new Quaternion();
        Quaternion quaternion3 = this.quaternion;
        float f2 = quaternion3.x;
        float f3 = quaternion.w;
        float f4 = quaternion3.y;
        float f5 = quaternion.z;
        float f6 = quaternion3.z;
        float f7 = quaternion.y;
        float f8 = quaternion3.w;
        quaternion2.x = (((f2 * f3) + (f4 * f5)) - (f6 * f7)) + (quaternion.x * f8);
        float f9 = quaternion3.x;
        float f10 = -f9;
        float f11 = quaternion.x;
        quaternion2.y = (f10 * f5) + (f4 * f3) + (f6 * f11) + (f7 * f8);
        float f12 = quaternion.y;
        float f13 = quaternion3.y;
        quaternion2.z = ((f9 * f12) - (f13 * f11)) + (f6 * f3) + (f5 * f8);
        quaternion2.w = (((f10 * f11) - (f13 * f12)) - (quaternion3.z * quaternion.z)) + (f8 * f3);
        return new Pose(fArr2, quaternion2);
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getTransformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public Pose inverse() {
        Quaternion quaternion = this.quaternion;
        Quaternion quaternion2 = new Quaternion(-quaternion.x, -quaternion.y, -quaternion.z, quaternion.w);
        Quaternion.a(quaternion2, this.translation, 0, r0, 0);
        float[] fArr = {-fArr[0], -fArr[1], -fArr[2]};
        return new Pose(fArr, quaternion2);
    }

    public float qw() {
        return this.quaternion.w;
    }

    public float qx() {
        return this.quaternion.x;
    }

    public float qy() {
        return this.quaternion.y;
    }

    public float qz() {
        return this.quaternion.z;
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i) {
        float f;
        Quaternion quaternion = this.quaternion;
        float f2 = quaternion.x;
        float f3 = quaternion.y;
        float f4 = quaternion.z;
        float f5 = quaternion.w;
        float f6 = (f2 * f2) + (f3 * f3) + (f4 * f4) + (f5 * f5);
        if (f6 > 0.0f) {
            f = 2.0f / f6;
        } else {
            f = 0.0f;
        }
        float f7 = f2 * f;
        float f8 = f3 * f;
        float f9 = f * f4;
        float f10 = f5 * f7;
        float f11 = f5 * f8;
        float f12 = f5 * f9;
        float f13 = f7 * f2;
        float f14 = f2 * f8;
        float f15 = f2 * f9;
        float f16 = f8 * f3;
        float f17 = f3 * f9;
        float f18 = f4 * f9;
        fArr[i] = 1.0f - (f16 + f18);
        fArr[i + 4] = f14 - f12;
        fArr[i + 8] = f15 + f11;
        fArr[i + 1] = f14 + f12;
        fArr[i + 5] = 1.0f - (f18 + f13);
        fArr[i + 9] = f17 - f10;
        fArr[i + 2] = f15 - f11;
        fArr[i + 6] = f17 + f10;
        fArr[i + 10] = 1.0f - (f13 + f16);
        float[] fArr2 = this.translation;
        fArr[i + 12] = fArr2[0];
        fArr[i + 13] = fArr2[1];
        fArr[i + 14] = fArr2[2];
        fArr[i + 3] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.x), Float.valueOf(this.quaternion.y), Float.valueOf(this.quaternion.z), Float.valueOf(this.quaternion.w));
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public float tx() {
        return this.translation[0];
    }

    public float ty() {
        return this.translation[1];
    }

    public float tz() {
        return this.translation[2];
    }

    private Pose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.quaternion = new Quaternion(f4, f5, f6, f7);
        this.translation = new float[]{f, f2, f3};
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public void getRotationQuaternion(float[] fArr, int i) {
        Quaternion quaternion = this.quaternion;
        fArr[i] = quaternion.x;
        fArr[i + 1] = quaternion.y;
        fArr[i + 2] = quaternion.z;
        fArr[i + 3] = quaternion.w;
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        float[] fArr2 = new float[3];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[i] = f;
        Quaternion.a(this.quaternion, fArr2, 0, fArr, i2);
    }

    public void getTranslation(float[] fArr, int i) {
        System.arraycopy(this.translation, 0, fArr, i, 3);
    }

    public void rotateVector(float[] fArr, int i, float[] fArr2, int i2) {
        Quaternion.a(this.quaternion, fArr, i, fArr2, i2);
    }

    public void transformPoint(float[] fArr, int i, float[] fArr2, int i2) {
        rotateVector(fArr, i, fArr2, i2);
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 + i2;
            fArr2[i4] = fArr2[i4] + this.translation[i3];
        }
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }
}
