package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iuh extends AnimatorListenerAdapter {
    final /* synthetic */ iuj a;

    public iuh(iuj iujVar) {
        this.a = iujVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        iuj iujVar = this.a;
        cni cniVar = iujVar.h;
        if (cniVar != null) {
            cniVar.b(iujVar.j);
        }
    }
}
