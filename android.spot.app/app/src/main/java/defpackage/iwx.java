package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwx implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public iwx(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.d = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        this.b = baseBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d != 0) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Object obj = this.b;
            inp inpVar = (inp) obj;
            inpVar.F((CoordinatorLayout) this.a, this.c, intValue);
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Object obj2 = this.b;
        ((iwy) this.c).c(this.a, (View) obj2, animatedFraction);
    }

    public iwx(iwy iwyVar, View view, View view2, int i) {
        this.d = i;
        this.a = view;
        this.b = view2;
        this.c = iwyVar;
    }
}
