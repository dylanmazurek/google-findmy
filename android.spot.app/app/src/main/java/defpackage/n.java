package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class n extends by {
    public final l a;
    private AnimatorSet d;

    public n(l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    @Override // defpackage.by
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            this.a.a.g(this);
            return;
        }
        ca caVar = this.a.a;
        if (caVar.d) {
            if (Build.VERSION.SDK_INT >= 26) {
                p.a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (be.Z(2)) {
            Objects.toString(caVar);
            boolean z = caVar.d;
        }
    }

    @Override // defpackage.by
    public final void b(ViewGroup viewGroup) {
        ca caVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            caVar.g(this);
            return;
        }
        animatorSet.start();
        if (be.Z(2)) {
            Objects.toString(caVar);
        }
    }

    @Override // defpackage.by
    public final void c(ViewGroup viewGroup) {
        Object obj;
        boolean z;
        if (!this.a.b()) {
            Context context = viewGroup.getContext();
            l lVar = this.a;
            context.getClass();
            bfi a = lVar.a(context);
            if (a != null) {
                obj = a.b;
            } else {
                obj = null;
            }
            this.d = (AnimatorSet) obj;
            ca caVar = this.a.a;
            if (caVar.h == 3) {
                z = true;
            } else {
                z = false;
            }
            View view = caVar.a.P;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.addListener(new m(viewGroup, view, z, caVar, this));
            }
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    @Override // defpackage.by
    public final boolean d() {
        return true;
    }

    @Override // defpackage.by
    public final void e(nu nuVar) {
        ca caVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            caVar.g(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && caVar.a.t) {
            if (be.Z(2)) {
                Objects.toString(caVar);
            }
            long a = o.a.a(animatorSet);
            long j = nuVar.a * ((float) a);
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = (-1) + a;
            }
            if (be.Z(2)) {
                Objects.toString(animatorSet);
                Objects.toString(caVar);
            }
            p.a.b(animatorSet, j);
        }
    }
}
