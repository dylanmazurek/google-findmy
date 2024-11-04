package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivb extends iuu {
    final float a = -1.0f;

    @Override // defpackage.iuu
    public final void d(ivv ivvVar, float f, float f2) {
        e(ivvVar, f, 0.0f, f2);
    }

    @Override // defpackage.iuu
    public final void e(ivv ivvVar, float f, float f2, float f3) {
        float i = hwx.i(f2, f3, f);
        ivvVar.f(i, 180.0f, 90.0f);
        double d = i;
        ivvVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
