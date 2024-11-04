package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.ar.core.InstallActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcp extends AnimatorListenerAdapter {
    final /* synthetic */ InstallActivity a;

    public jcp(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.showSpinner();
    }
}
