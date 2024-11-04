package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddq implements dem {
    private final /* synthetic */ int g;
    public static final ddq f = new ddq(5);
    public static final ddq e = new ddq(4);
    public static final ddq d = new ddq(3);
    public static final ddq c = new ddq(2);
    public static final ddq b = new ddq(1);
    public static final ddq a = new ddq(0);

    private ddq(int i) {
        this.g = i;
    }

    @Override // defpackage.dem
    public final /* synthetic */ Object a(dep depVar, float f2) {
        double d2;
        int i = this.g;
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (depVar.p() == 1) {
                                z = true;
                            }
                            if (z) {
                                depVar.g();
                            }
                            float a2 = (float) depVar.a();
                            float a3 = (float) depVar.a();
                            while (depVar.n()) {
                                depVar.m();
                            }
                            if (z) {
                                depVar.i();
                            }
                            return new dff((a2 / 100.0f) * f2, (a3 / 100.0f) * f2);
                        }
                        int p = depVar.p();
                        if (p == 1) {
                            return ddw.c(depVar, f2);
                        }
                        if (p == 3) {
                            return ddw.c(depVar, f2);
                        }
                        if (p == 7) {
                            PointF pointF = new PointF(((float) depVar.a()) * f2, ((float) depVar.a()) * f2);
                            while (depVar.n()) {
                                depVar.m();
                            }
                            return pointF;
                        }
                        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(amr.h(p)));
                    }
                    return ddw.c(depVar, f2);
                }
                return Integer.valueOf(Math.round(ddw.a(depVar) * f2));
            }
            if (depVar.p() == 1) {
                z = true;
            }
            if (z) {
                depVar.g();
            }
            double a4 = depVar.a();
            double a5 = depVar.a();
            double a6 = depVar.a();
            if (depVar.p() == 7) {
                d2 = depVar.a();
            } else {
                d2 = 1.0d;
            }
            if (z) {
                depVar.i();
            }
            if (a4 <= 1.0d && a5 <= 1.0d && a6 <= 1.0d) {
                a4 *= 255.0d;
                a5 *= 255.0d;
                a6 *= 255.0d;
                if (d2 <= 1.0d) {
                    d2 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) d2, (int) a4, (int) a5, (int) a6));
        }
        return Float.valueOf(ddw.a(depVar) * f2);
    }
}
