package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnd extends AnimatorListenerAdapter implements cma {
    final /* synthetic */ cnf a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public cnd(cnf cnfVar, ViewGroup viewGroup, View view, View view2) {
        this.a = cnfVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.cma
    public final void a(cmd cmdVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.cma
    public final void b(cmd cmdVar) {
        cmdVar.B(this);
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
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.c.getParent() == null) {
            this.b.getOverlay().add(this.c);
            return;
        }
        cmd cmdVar = this.a;
        ArrayList arrayList = cmdVar.l;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(cmdVar.m);
        cmdVar.m = cmd.a;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator2 = animatorArr[size];
                animatorArr[size] = null;
                animator2.cancel();
            } else {
                cmdVar.m = animatorArr;
                cmdVar.r(cmdVar, cmc.c, false);
                return;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            this.d.setTag(R.id.save_overlay_view, this.c);
            ViewGroup viewGroup = this.b;
            viewGroup.getOverlay().add(this.c);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.cma
    public final void c() {
    }

    @Override // defpackage.cma
    public final void d() {
    }

    @Override // defpackage.cma
    public final void g() {
    }
}
