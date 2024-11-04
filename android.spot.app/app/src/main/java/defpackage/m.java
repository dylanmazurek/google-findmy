package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ca d;
    final /* synthetic */ n e;

    public m(ViewGroup viewGroup, View view, boolean z, ca caVar, n nVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = caVar;
        this.e = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(this.b);
        if (this.c) {
            ca caVar = this.d;
            View view = this.b;
            int i = caVar.h;
            view.getClass();
            a.X(i, view, this.a);
        }
        n nVar = this.e;
        nVar.a.a.g(nVar);
        if (be.Z(2)) {
            Objects.toString(this.d);
        }
    }
}
