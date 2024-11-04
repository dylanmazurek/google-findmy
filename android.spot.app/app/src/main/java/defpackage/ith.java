package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ith extends AnimatorListenerAdapter {
    final /* synthetic */ itl a;

    public ith(itl itlVar) {
        this.a = itlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        itl itlVar = this.a;
        itlVar.f = (itlVar.f + 4) % itlVar.e.c.length;
    }
}
