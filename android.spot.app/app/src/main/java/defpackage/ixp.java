package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixp extends AnimatorListenerAdapter {
    final /* synthetic */ ixq a;

    public ixp(ixq ixqVar) {
        this.a = ixqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.x();
        this.a.d.start();
    }
}
