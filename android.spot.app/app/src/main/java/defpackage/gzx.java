package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzx extends AnimatorListenerAdapter {
    final /* synthetic */ gzy a;

    public gzx(gzy gzyVar) {
        this.a = gzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(8);
        this.a.b.f(null);
    }
}
