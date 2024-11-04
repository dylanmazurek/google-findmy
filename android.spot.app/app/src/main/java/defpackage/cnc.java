package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnc extends AnimatorListenerAdapter implements cma {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public cnc(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            cms.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (this.e && this.f != z && (viewGroup = this.d) != null) {
            this.f = z;
            cmp.a(viewGroup, z);
        }
    }

    @Override // defpackage.cma
    public final void b(cmd cmdVar) {
        cmdVar.B(this);
    }

    @Override // defpackage.cma
    public final void c() {
        i(false);
        if (!this.a) {
            cms.d(this.b, this.c);
        }
    }

    @Override // defpackage.cma
    public final void d() {
        i(true);
        if (!this.a) {
            cms.d(this.b, 0);
        }
    }

    @Override // defpackage.cma
    public final /* synthetic */ void e(cmd cmdVar) {
        bzx.e(this, cmdVar);
    }

    @Override // defpackage.cma
    public final /* synthetic */ void f(cmd cmdVar) {
        bzx.f(this, cmdVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            cms.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.cma
    public final void g() {
    }

    @Override // defpackage.cma
    public final void a(cmd cmdVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
