package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class isn implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ isp b;

    public isn(isp ispVar, float f) {
        this.a = f;
        this.b = ispVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.l(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
