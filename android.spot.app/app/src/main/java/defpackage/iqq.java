package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqq extends AnimatorListenerAdapter {
    final /* synthetic */ ira a;
    private boolean b;

    public iqq(ira iraVar) {
        this.a = iraVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ira iraVar = this.a;
        iraVar.A = 0;
        iraVar.v = null;
        if (!this.b) {
            iraVar.B.f(4, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.f(0, false);
        ira iraVar = this.a;
        iraVar.A = 1;
        iraVar.v = animator;
        this.b = false;
    }
}
