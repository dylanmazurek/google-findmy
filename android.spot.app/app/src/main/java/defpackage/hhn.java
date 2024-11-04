package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hhn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Drawable b;
    private final /* synthetic */ int c;

    public hhn(clb clbVar, cla claVar, int i) {
        this.c = i;
        this.b = clbVar;
        this.a = claVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    itf itfVar = (itf) this.a;
                    if (itfVar.b() && itfVar.j != 0) {
                        itt ittVar = (itt) this.b;
                        if (ittVar.isVisible()) {
                            ittVar.invalidateSelf();
                            return;
                        }
                        return;
                    }
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ivf) this.b).K(floatValue);
                AppBarLayout appBarLayout = (AppBarLayout) this.a;
                Drawable drawable = appBarLayout.h;
                if (drawable instanceof ivf) {
                    ((ivf) drawable).K(floatValue);
                }
                Iterator it = appBarLayout.g.iterator();
                while (it.hasNext()) {
                    ((inm) it.next()).a();
                }
                return;
            }
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            clb.e(floatValue2, (cla) this.a);
            ((clb) this.b).a(floatValue2, (cla) this.a, false);
            ((clb) this.b).invalidateSelf();
            return;
        }
        String str = hia.a;
        float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((ivf) this.a).M(floatValue3);
        ((ivf) this.b).M(floatValue3);
    }

    public /* synthetic */ hhn(itt ittVar, itf itfVar, int i) {
        this.c = i;
        this.b = ittVar;
        this.a = itfVar;
    }

    public /* synthetic */ hhn(Object obj, ivf ivfVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = ivfVar;
    }
}
