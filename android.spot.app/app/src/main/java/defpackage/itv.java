package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class itv extends AnimatorListenerAdapter {
    final /* synthetic */ itx a;

    public itv(itx itxVar) {
        this.a = itxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        itx itxVar = this.a;
        List list = itxVar.j;
        if (list != null && !itxVar.k) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((cni) it.next()).b(itxVar);
            }
        }
    }
}
