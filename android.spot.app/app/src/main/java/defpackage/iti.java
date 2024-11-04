package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iti extends AnimatorListenerAdapter {
    final /* synthetic */ itl a;

    public iti(itl itlVar) {
        this.a = itlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        itl itlVar = this.a;
        cni cniVar = itlVar.i;
        if (cniVar != null) {
            cniVar.b(itlVar.j);
        }
    }
}
