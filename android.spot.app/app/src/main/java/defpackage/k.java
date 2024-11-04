package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class k extends by {
    public final l a;

    public k(l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    @Override // defpackage.by
    public final void a(ViewGroup viewGroup) {
        ca caVar = this.a.a;
        View view = caVar.a.P;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.a.a.g(this);
        if (be.Z(2)) {
            Objects.toString(caVar);
        }
    }

    @Override // defpackage.by
    public final void b(ViewGroup viewGroup) {
        Object obj;
        if (this.a.b()) {
            this.a.a.g(this);
            return;
        }
        Context context = viewGroup.getContext();
        l lVar = this.a;
        ca caVar = lVar.a;
        View view = caVar.a.P;
        context.getClass();
        bfi a = lVar.a(context);
        if (a != null && (obj = a.a) != null) {
            if (caVar.h != 1) {
                view.startAnimation((Animation) obj);
                this.a.a.g(this);
                return;
            }
            viewGroup.startViewTransition(view);
            ak akVar = new ak((Animation) obj, viewGroup, view);
            akVar.setAnimationListener(new j(caVar, viewGroup, view, this));
            view.startAnimation(akVar);
            if (be.Z(2)) {
                Objects.toString(caVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
