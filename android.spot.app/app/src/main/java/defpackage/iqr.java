package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqr extends AnimatorListenerAdapter {
    final /* synthetic */ ira a;

    public iqr(ira iraVar) {
        this.a = iraVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ira iraVar = this.a;
        iraVar.A = 0;
        iraVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.f(0, false);
        ira iraVar = this.a;
        iraVar.A = 2;
        iraVar.v = animator;
    }
}
