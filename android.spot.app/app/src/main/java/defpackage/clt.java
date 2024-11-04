package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clt extends AnimatorListenerAdapter implements cma {
    private final View a;
    private boolean b = false;

    public clt(View view) {
        this.a = view;
    }

    @Override // defpackage.cma
    public final void c() {
        float f;
        if (this.a.getVisibility() == 0) {
            f = cms.a(this.a);
        } else {
            f = 0.0f;
        }
        this.a.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // defpackage.cma
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.cma
    public final /* synthetic */ void e(cmd cmdVar) {
        bzx.e(this, cmdVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cms.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        cms.c(this.a, 1.0f);
    }

    @Override // defpackage.cma
    public final void g() {
    }

    @Override // defpackage.cma
    public final void a(cmd cmdVar) {
    }

    @Override // defpackage.cma
    public final void b(cmd cmdVar) {
    }

    @Override // defpackage.cma
    public final void f(cmd cmdVar) {
    }
}
