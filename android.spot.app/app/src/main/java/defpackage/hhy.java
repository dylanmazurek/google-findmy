package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhy extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ hia b;

    public hhy(hia hiaVar, boolean z) {
        this.a = z;
        this.b = hiaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.o(true);
            this.b.p(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!this.a) {
            this.b.o(false);
            this.b.p(false);
        }
    }
}
