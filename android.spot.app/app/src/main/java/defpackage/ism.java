package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ism extends AnimatorListenerAdapter {
    final /* synthetic */ ish a;

    public ism(ish ishVar) {
        this.a = ishVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.setTranslationY(0.0f);
        this.a.b(0.0f);
    }
}
