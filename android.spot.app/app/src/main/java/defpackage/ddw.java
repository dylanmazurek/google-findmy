package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddw {
    private static final elo a = elo.J("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(dep depVar) {
        int p = depVar.p();
        int i = p - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) depVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(amr.h(p)));
        }
        depVar.g();
        float a2 = (float) depVar.a();
        while (depVar.n()) {
            depVar.m();
        }
        depVar.i();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(dep depVar) {
        depVar.g();
        double a2 = depVar.a() * 255.0d;
        double a3 = depVar.a() * 255.0d;
        double a4 = depVar.a() * 255.0d;
        while (depVar.n()) {
            depVar.m();
        }
        int i = (int) a3;
        int i2 = (int) a2;
        depVar.i();
        return Color.argb(255, i2, i, (int) a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(dep depVar, float f) {
        int p = depVar.p() - 1;
        if (p != 0) {
            if (p != 2) {
                if (p == 6) {
                    float a2 = (float) depVar.a();
                    float a3 = (float) depVar.a();
                    while (depVar.n()) {
                        depVar.m();
                    }
                    return new PointF(a2 * f, a3 * f);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(amr.h(depVar.p())));
            }
            depVar.h();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (depVar.n()) {
                int q = depVar.q(a);
                if (q != 0) {
                    if (q != 1) {
                        depVar.l();
                        depVar.m();
                    } else {
                        f3 = a(depVar);
                    }
                } else {
                    f2 = a(depVar);
                }
            }
            depVar.j();
            return new PointF(f2 * f, f3 * f);
        }
        depVar.g();
        float a4 = (float) depVar.a();
        float a5 = (float) depVar.a();
        while (depVar.p() != 2) {
            depVar.m();
        }
        depVar.i();
        return new PointF(a4 * f, a5 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List d(dep depVar, float f) {
        ArrayList arrayList = new ArrayList();
        depVar.g();
        while (depVar.p() == 1) {
            depVar.g();
            arrayList.add(c(depVar, f));
            depVar.i();
        }
        depVar.i();
        return arrayList;
    }
}
