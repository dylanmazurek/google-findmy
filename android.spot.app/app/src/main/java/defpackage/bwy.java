package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bwy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((View) ((ea) ((njz) this.a).a).c.getParent()).invalidate();
                return;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ((ke) this.a).b.setAlpha(floatValue);
                ((ke) this.a).c.setAlpha(floatValue);
                ((ke) this.a).g();
                return;
            case 2:
                cym cymVar = (cym) this.a;
                dcv dcvVar = cymVar.i;
                if (dcvVar != null) {
                    dcvVar.m(cymVar.b.c());
                    return;
                }
                return;
            case 3:
                Object obj = this.a;
                int i = dzd.w;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                bsd.g((View) obj, ((Integer) animatedValue).intValue());
                return;
            case 4:
                int i2 = dzd.w;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                float floatValue2 = ((Float) animatedValue2).floatValue();
                MaterialCardView materialCardView = (MaterialCardView) this.a;
                ivj ivjVar = new ivj(materialCardView.i.n);
                ivjVar.d(floatValue2);
                ivjVar.c(floatValue2);
                materialCardView.cy(new ivl(ivjVar));
                return;
            case 5:
                String str = hia.a;
                ((MaterialCardView) this.a).k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ipi ipiVar = (ipi) this.a;
                ipiVar.k.setAlpha((int) (255.0f * floatValue3));
                ipiVar.u = floatValue3;
                return;
            case 7:
                itt ittVar = (itt) this.a;
                ittVar.b.e = ittVar.e.getInterpolation(ittVar.d.getAnimatedFraction());
                return;
            case 8:
                ((ixi) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ixi ixiVar = (ixi) this.a;
                ixiVar.h.setScaleX(floatValue4);
                ixiVar.h.setScaleY(floatValue4);
                return;
            default:
                ((ixq) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ bwy(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
