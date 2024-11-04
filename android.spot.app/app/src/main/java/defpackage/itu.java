package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itu extends AnimatorListenerAdapter {
    final /* synthetic */ itx a;

    public itu(itx itxVar) {
        this.a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        itx itxVar = this.a;
        List list = itxVar.j;
        if (list != null && !itxVar.k) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((cni) it.next()).c(itxVar);
            }
        }
    }
}
