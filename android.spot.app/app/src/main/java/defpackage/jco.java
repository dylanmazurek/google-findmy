package defpackage;

import android.animation.ValueAnimator;
import com.google.ar.core.InstallActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jco implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ InstallActivity d;

    public jco(InstallActivity installActivity, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = installActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = this.b * valueAnimator.getAnimatedFraction();
        this.d.getWindow().setLayout((int) ((this.a * animatedFraction) + animatedFraction2), (int) ((this.c * animatedFraction) + animatedFraction2));
        this.d.getWindow().getDecorView().refreshDrawableState();
    }
}
