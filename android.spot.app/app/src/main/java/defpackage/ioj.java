package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioj implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ioj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ivf ivfVar = ((BottomSheetBehavior) this.a).d;
                if (ivfVar != null) {
                    ivfVar.M(floatValue);
                    return;
                }
                return;
            case 1:
                ((CollapsingToolbarLayout) this.a).d(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((TextView) this.a).setScaleX(floatValue2);
                ((TextView) this.a).setScaleY(floatValue2);
                return;
            case 3:
                ((iwh) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((iwh) this.a).j.setScaleX(floatValue3);
                ((iwh) this.a).j.setScaleY(floatValue3);
                return;
            case 5:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                String str = iwh.b;
                ((iwh) this.a).j.setTranslationY(intValue);
                return;
            case 6:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                String str2 = iwh.b;
                ((iwh) this.a).j.setTranslationY(intValue2);
                return;
            case 7:
                ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ((TextInputLayout) this.a).q.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
