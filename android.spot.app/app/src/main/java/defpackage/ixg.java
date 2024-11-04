package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixg extends AnimatorListenerAdapter {
    final /* synthetic */ ixi a;

    public ixg(ixi ixiVar) {
        this.a = ixiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.l(true);
    }
}
