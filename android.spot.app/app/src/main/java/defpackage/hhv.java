package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhv extends AnimatorListenerAdapter {
    final /* synthetic */ hia a;

    public hhv(hia hiaVar) {
        this.a = hiaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m.setVisibility(4);
        this.a.l.setVisibility(4);
        this.a.t = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.n.setVisibility(0);
    }
}
