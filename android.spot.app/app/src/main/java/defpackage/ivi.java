package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivi extends iuu {
    final float a = -1.0f;

    @Override // defpackage.iuu
    public final void d(ivv ivvVar, float f, float f2) {
        e(ivvVar, f, 0.0f, f2);
    }

    @Override // defpackage.iuu
    public final void e(ivv ivvVar, float f, float f2, float f3) {
        float i = hwx.i(f2, f3, f);
        ivvVar.f(i, 180.0f, 90.0f);
        float f4 = i + i;
        ivr ivrVar = new ivr(0.0f, 0.0f, f4, f4);
        ivrVar.e = 180.0f;
        ivrVar.f = 90.0f;
        ivvVar.f.add(ivrVar);
        ivvVar.b(new ivp(ivrVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        ivvVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        ivvVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
