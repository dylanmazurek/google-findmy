package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivy extends AnimatorListenerAdapter {
    final /* synthetic */ iwh a;

    public ivy(iwh iwhVar) {
        this.a = iwhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        iwh iwhVar = this.a;
        SnackbarContentLayout snackbarContentLayout = iwhVar.t;
        snackbarContentLayout.a.setAlpha(0.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = iwhVar.c;
        long j = i;
        ViewPropertyAnimator interpolator = alpha.setDuration(j).setInterpolator(snackbarContentLayout.c);
        long j2 = iwhVar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(j2).start();
        }
    }
}
