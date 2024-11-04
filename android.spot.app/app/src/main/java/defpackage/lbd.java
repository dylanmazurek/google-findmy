package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbd extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    final /* synthetic */ lbi b;
    public lbk c;
    private final lbf d;
    private final fsa e;
    private final LatLng f;
    private final LatLng g;

    public lbd(lbi lbiVar, lbf lbfVar, LatLng latLng, LatLng latLng2) {
        this.b = lbiVar;
        this.d = lbfVar;
        this.e = lbfVar.a;
        this.f = latLng;
        this.g = latLng2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            lbi lbiVar = this.b;
            lbiVar.k.j(this.e);
            lbi lbiVar2 = this.b;
            lbiVar2.l.j(this.e);
            this.c.d(this.e);
        }
        this.d.b = this.g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.g != null && this.f != null && this.e != null) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.g;
            LatLng latLng2 = this.f;
            double d = latLng.a;
            double d2 = latLng2.a;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.b - latLng2.b;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.e.b(new LatLng(d4, (d5 * d3) + this.f.b));
        }
    }
}
