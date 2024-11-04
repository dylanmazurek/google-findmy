package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hag extends AnimatorListenerAdapter {
    final /* synthetic */ hai a;

    public hag(hai haiVar) {
        this.a = haiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        miv mivVar;
        if (this.a.e.g() && (mivVar = ((hae) this.a.e.c()).c) != null) {
            mivVar.b = false;
            Object obj = mivVar.c;
            if (obj != null) {
                ((AnimatorSet) obj).end();
            }
        }
        this.a.a.h(null);
    }
}
