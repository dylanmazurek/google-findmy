package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqu implements TypeEvaluator {
    final Object a;
    private final /* synthetic */ int b;

    public iqu(RectF rectF, int i) {
        this.b = i;
        this.a = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        if (this.b != 0) {
            RectF rectF = (RectF) obj;
            RectF rectF2 = (RectF) obj2;
            ((RectF) this.a).top = rectF.top + ((rectF2.top - rectF.top) * f);
            ((RectF) this.a).left = rectF.left + ((rectF2.left - rectF.left) * f);
            ((RectF) this.a).right = rectF.right + ((rectF2.right - rectF.right) * f);
            ((RectF) this.a).bottom = rectF.bottom + (f * (rectF2.bottom - rectF.bottom));
            return this.a;
        }
        float floatValue = ((FloatEvaluator) this.a).evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }

    public iqu(int i) {
        this.b = i;
        this.a = new FloatEvaluator();
    }
}
