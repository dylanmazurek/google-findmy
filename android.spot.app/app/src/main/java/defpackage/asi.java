package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asi extends ars {
    public asi() {
        super("Generic XYZ", 12884901889L, 14);
    }

    @Override // defpackage.ars
    public final float a(int i) {
        return 2.0f;
    }

    @Override // defpackage.ars
    public final float b(int i) {
        return -2.0f;
    }

    @Override // defpackage.ars
    public final float c(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.ars
    public final long d(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        float f4 = 2.0f;
        if (f > 2.0f) {
            f = 2.0f;
        }
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 <= 2.0f) {
            f4 = f2;
        }
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (floatToRawIntBits << 32);
    }

    @Override // defpackage.ars
    public final long e(float f, float f2, float f3, float f4, ars arsVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        float f5 = 2.0f;
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 <= 2.0f) {
            f5 = f3;
        }
        return jw.g(f, f2, f5, f4, arsVar);
    }
}
