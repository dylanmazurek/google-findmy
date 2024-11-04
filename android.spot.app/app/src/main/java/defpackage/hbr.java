package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbr extends AnimatorListenerAdapter {
    final /* synthetic */ hbs a;

    public hbr(hbs hbsVar) {
        this.a = hbsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.b.setEnabled(true);
    }
}
