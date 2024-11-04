package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clu extends cnf {
    public clu() {
    }

    private static float K(cmn cmnVar, float f) {
        Float f2;
        if (cmnVar != null && (f2 = (Float) cmnVar.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    private final Animator L(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        cms.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) cms.b, f2);
        clt cltVar = new clt(view);
        ofFloat.addListener(cltVar);
        i().y(cltVar);
        return ofFloat;
    }

    @Override // defpackage.cnf, defpackage.cmd
    public final void c(cmn cmnVar) {
        cnf.J(cmnVar);
        Float f = (Float) cmnVar.b.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (cmnVar.b.getVisibility() == 0) {
                f = Float.valueOf(cms.a(cmnVar.b));
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        cmnVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.cnf
    public final Animator e(View view, cmn cmnVar) {
        cmu cmuVar = cms.a;
        return L(view, K(cmnVar, 0.0f), 1.0f);
    }

    @Override // defpackage.cnf
    public final Animator f(View view, cmn cmnVar, cmn cmnVar2) {
        cmu cmuVar = cms.a;
        Animator L = L(view, K(cmnVar, 1.0f), 0.0f);
        if (L == null) {
            cms.c(view, K(cmnVar2, 1.0f));
        }
        return L;
    }

    public clu(int i) {
        this.w = i;
    }
}
