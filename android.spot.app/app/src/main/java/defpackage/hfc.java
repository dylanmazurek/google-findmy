package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfc extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ miv b;

    public hfc(miv mivVar) {
        this.b = mivVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b && !this.a) {
            animator.setStartDelay(416L);
            animator.start();
        }
    }
}
