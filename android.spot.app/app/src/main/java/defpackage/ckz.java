package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ckz implements Animator.AnimatorListener {
    final /* synthetic */ cla a;
    final /* synthetic */ clb b;

    public ckz(clb clbVar, cla claVar) {
        this.b = clbVar;
        this.a = claVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.e();
        cla claVar = this.a;
        claVar.f();
        claVar.g();
        clb clbVar = this.b;
        if (clbVar.d) {
            clbVar.d = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.a.c(false);
            return;
        }
        clbVar.c += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
