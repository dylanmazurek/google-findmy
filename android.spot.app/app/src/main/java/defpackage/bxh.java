package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxh extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ lrs b;

    public bxh(lrs lrsVar, View view) {
        this.b = lrsVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.g(1.0f);
        bxk.d(this.a, this.b);
    }
}
