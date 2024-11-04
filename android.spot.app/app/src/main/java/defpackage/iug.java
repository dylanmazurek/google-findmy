package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iug extends AnimatorListenerAdapter {
    final /* synthetic */ iuj a;

    public iug(iuj iujVar) {
        this.a = iujVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        iuj iujVar = this.a;
        iujVar.e = (iujVar.e + 1) % iujVar.d.c.length;
        iujVar.f = true;
    }
}
