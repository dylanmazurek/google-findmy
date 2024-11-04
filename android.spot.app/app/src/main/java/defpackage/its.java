package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class its extends ccw {
    @Override // defpackage.ccw
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        return ((itt) obj).b() * 10000.0f;
    }

    @Override // defpackage.ccw
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        itt ittVar = (itt) obj;
        ittVar.c(f / 10000.0f);
        if (ittVar.i.b()) {
            float a = ittVar.a((int) f);
            if (a != ittVar.c) {
                if (ittVar.d == null) {
                    ittVar.f = hwx.h(ittVar.h, R.attr.motionEasingStandardInterpolator, inc.a);
                    ittVar.g = hwx.h(ittVar.h, R.attr.motionEasingEmphasizedAccelerateInterpolator, inc.a);
                    ittVar.d = new ValueAnimator();
                    ittVar.d.setDuration(500L);
                    ittVar.d.setFloatValues(0.0f, 1.0f);
                    ittVar.d.setInterpolator(null);
                    ittVar.d.addUpdateListener(new bwy(obj, 7, null));
                }
                if (ittVar.d.isRunning()) {
                    ittVar.d.cancel();
                }
                ittVar.c = a;
                if (a == 1.0f) {
                    ittVar.e = ittVar.f;
                    ittVar.d.start();
                } else {
                    ittVar.e = ittVar.g;
                    ittVar.d.reverse();
                }
            }
        }
    }
}
