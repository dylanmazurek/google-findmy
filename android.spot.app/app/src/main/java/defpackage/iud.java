package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iud extends AnimatorListenerAdapter {
    final /* synthetic */ iuf a;

    public iud(iuf iufVar) {
        this.a = iufVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        iuf iufVar = this.a;
        iufVar.c = (iufVar.c + 1) % iufVar.b.c.length;
        iufVar.d = true;
    }
}
