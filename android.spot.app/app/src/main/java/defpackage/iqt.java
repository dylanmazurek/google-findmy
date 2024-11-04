package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ Matrix h;
    final /* synthetic */ ira i;

    public iqt(ira iraVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
        this.i = iraVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.i.B.setAlpha(inc.a(this.a, this.b, 0.0f, 0.2f, floatValue));
        float f = this.d;
        float f2 = this.c;
        this.i.B.setScaleX(f2 + ((f - f2) * floatValue));
        float f3 = this.d;
        float f4 = this.e;
        this.i.B.setScaleY(f4 + ((f3 - f4) * floatValue));
        float f5 = this.g;
        float f6 = this.f;
        float f7 = floatValue * (f5 - f6);
        ira iraVar = this.i;
        float f8 = f6 + f7;
        iraVar.y = f8;
        iraVar.e(f8, this.h);
        this.i.B.setImageMatrix(this.h);
    }
}
