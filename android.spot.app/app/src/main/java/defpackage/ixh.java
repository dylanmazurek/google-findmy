package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixh extends AnimatorListenerAdapter {
    final /* synthetic */ ixi a;

    public ixh(ixi ixiVar) {
        this.a = ixiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.l(false);
    }
}
