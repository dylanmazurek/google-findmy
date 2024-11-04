package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itn extends AnimatorListenerAdapter {
    final /* synthetic */ itq a;

    public itn(itq itqVar) {
        this.a = itqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        itq itqVar = this.a;
        cni cniVar = itqVar.h;
        if (cniVar != null) {
            cniVar.b(itqVar.j);
        }
    }
}
