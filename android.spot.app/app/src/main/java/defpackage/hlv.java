package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hlv extends AnimatorListenerAdapter {
    final /* synthetic */ hmh a;

    public hlv(hmh hmhVar) {
        this.a = hmhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aG();
    }
}
