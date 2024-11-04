package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ivz extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ iwh b;

    public ivz(iwh iwhVar, int i) {
        this.a = i;
        this.b = iwhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.m();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        iwh iwhVar = this.b;
        SnackbarContentLayout snackbarContentLayout = iwhVar.t;
        snackbarContentLayout.a.setAlpha(1.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(0.0f);
        long j = iwhVar.d;
        alpha.setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(0L).start();
        }
    }
}
