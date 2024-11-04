package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbt extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ hbv c;

    public hbt(hbv hbvVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = runnable;
        this.b = animatorListenerAdapter;
        this.c = hbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        hbv hbvVar = this.c;
        AccountParticleDisc accountParticleDisc = hbvVar.b.b;
        jis s = jis.s(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(s);
        animatorSet.addListener(this.b);
        animatorSet.addListener(new hbu(hbvVar, accountParticleDisc));
        animatorSet.start();
    }
}
