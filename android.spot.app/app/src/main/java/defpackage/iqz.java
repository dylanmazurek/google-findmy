package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iqz extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ ira b;
    private float c;
    private float d;

    public iqz(ira iraVar) {
        this.b = iraVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float t;
        if (!this.a) {
            ivf ivfVar = this.b.m;
            if (ivfVar == null) {
                t = 0.0f;
            } else {
                t = ivfVar.t();
            }
            this.c = t;
            this.d = a();
            this.a = true;
        }
        ira iraVar = this.b;
        float f = this.c;
        iraVar.l((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
