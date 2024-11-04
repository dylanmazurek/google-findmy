package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hah extends AnimatorListenerAdapter {
    final /* synthetic */ jer a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ hai c;

    public hah(hai haiVar, jer jerVar, Drawable drawable) {
        this.a = jerVar;
        this.b = drawable;
        this.c = haiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        miv mivVar;
        hai haiVar = this.c;
        haiVar.e = this.a;
        if (haiVar.e.g() && (mivVar = ((hae) this.c.e.c()).c) != null) {
            mivVar.b = true;
            Object obj = mivVar.c;
            if (obj != null) {
                ((AnimatorSet) obj).start();
            }
        }
        this.c.a.h(this.b);
    }
}
