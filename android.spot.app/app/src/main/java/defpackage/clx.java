package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clx extends AnimatorListenerAdapter {
    final /* synthetic */ cmd a;

    public clx(cmd cmdVar) {
        this.a = cmdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p();
        animator.removeListener(this);
    }
}
