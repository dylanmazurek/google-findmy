package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kd extends AnimatorListenerAdapter {
    final /* synthetic */ ke a;
    private boolean b = false;

    public kd(ke keVar) {
        this.a = keVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            ke keVar = this.a;
            keVar.q = 0;
            keVar.h(0);
        } else {
            ke keVar2 = this.a;
            keVar2.q = 2;
            keVar2.g();
        }
    }
}
