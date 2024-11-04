package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irc extends ira {
    private StateListAnimator E;

    public irc(FloatingActionButton floatingActionButton, njz njzVar) {
        super(floatingActionButton, njzVar);
    }

    private final Animator p(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.ira
    public final float a() {
        return this.B.getElevation();
    }

    @Override // defpackage.ira
    public final void f(Rect rect) {
        if (this.D.k()) {
            super.f(rect);
        } else if (!o()) {
            int b = (this.u - this.B.b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.ira
    public final void g(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.B.refreshDrawableState();
        } else if (this.B.getStateListAnimator() == this.E) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, p(f, f3));
            stateListAnimator.addState(g, p(f, f2));
            stateListAnimator.addState(h, p(f, f2));
            stateListAnimator.addState(i, p(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, this.B.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, p(0.0f, 0.0f));
            this.E = stateListAnimator;
            this.B.setStateListAnimator(this.E);
        }
        if (m()) {
            k();
        }
    }

    @Override // defpackage.ira
    public final boolean m() {
        if (!this.D.k() && o()) {
            return false;
        }
        return true;
    }
}
