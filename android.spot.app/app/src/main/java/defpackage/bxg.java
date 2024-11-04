package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxg implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bya a;
    final /* synthetic */ bya b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ lrs e;

    public bxg(lrs lrsVar, bya byaVar, bya byaVar2, int i, View view) {
        this.e = lrsVar;
        this.a = byaVar;
        this.b = byaVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bxs bxpVar;
        this.e.g(valueAnimator.getAnimatedFraction());
        float f = this.e.f();
        Interpolator interpolator = bxk.a;
        int i = Build.VERSION.SDK_INT;
        bya byaVar = this.a;
        if (i >= 30) {
            bxpVar = new bxr(byaVar);
        } else if (Build.VERSION.SDK_INT >= 29) {
            bxpVar = new bxq(byaVar);
        } else {
            bxpVar = new bxp(byaVar);
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((this.c & i2) == 0) {
                bxpVar.g(i2, byaVar.f(i2));
            } else {
                bya byaVar2 = this.b;
                brq f2 = byaVar.f(i2);
                brq f3 = byaVar2.f(i2);
                float f4 = 1.0f - f;
                bxpVar.g(i2, bya.h(f2, (int) (((f2.b - f3.b) * f4) + 0.5d), (int) (((f2.c - f3.c) * f4) + 0.5d), (int) (((f2.d - f3.d) * f4) + 0.5d), (int) (((f2.e - f3.e) * f4) + 0.5d)));
            }
        }
        bxk.c(this.d, bxpVar.a(), Collections.singletonList(this.e));
    }
}
