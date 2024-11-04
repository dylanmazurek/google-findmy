package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddx {
    private static final Interpolator c = new LinearInterpolator();
    static final elo a = elo.J("t", "s", "e", "o", "i", "h", "to", "ti");
    static final elo b = elo.J("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dfc a(defpackage.dep r20, defpackage.cyb r21, float r22, defpackage.dem r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddx.a(dep, cyb, float, dem, boolean, boolean):dfc");
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        pointF.x = dew.a(pointF.x, -1.0f, 1.0f);
        pointF.y = dew.a(pointF.y, -100.0f, 100.0f);
        pointF2.x = dew.a(pointF2.x, -1.0f, 1.0f);
        pointF2.y = dew.a(pointF2.y, -100.0f, 100.0f);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        ThreadLocal threadLocal = dfb.a;
        try {
            return bza.c(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return bza.c(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }
}
