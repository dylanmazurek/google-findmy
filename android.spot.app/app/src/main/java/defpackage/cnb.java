package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnb extends cna {
    @Override // defpackage.cmu
    public final float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.cmy, defpackage.cmu
    public final void b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.cmu
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.cna, defpackage.cmu
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.cmw, defpackage.cmu
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.cmw, defpackage.cmu
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
