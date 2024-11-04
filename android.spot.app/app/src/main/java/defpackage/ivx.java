package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivx extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ iwh b;

    public ivx(iwh iwhVar, int i) {
        this.a = i;
        this.b = iwhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.m();
    }
}
