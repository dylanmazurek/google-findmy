package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbu extends AnimatorListenerAdapter {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ hbv b;

    public hbu(hbv hbvVar, AccountParticleDisc accountParticleDisc) {
        this.a = accountParticleDisc;
        this.b = hbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setTranslationY(0.0f);
        this.a.setTranslationX(0.0f);
        this.a.setPivotX(this.b.b.getHeight() >> 1);
        this.a.setPivotY(this.b.b.getHeight() >> 1);
    }
}
