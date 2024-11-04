package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itm extends AnimatorListenerAdapter {
    final /* synthetic */ itq a;

    public itm(itq itqVar) {
        this.a = itqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        itq itqVar = this.a;
        int i = itqVar.e;
        int length = itq.a.length;
        itqVar.e = (i + 4) % itqVar.d.c.length;
    }
}
