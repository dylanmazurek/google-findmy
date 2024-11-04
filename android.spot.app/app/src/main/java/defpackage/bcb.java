package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcb implements bca {
    private final float[] a;
    private final int[] b = new int[2];

    public bcb(float[] fArr) {
        this.a = fArr;
    }

    private final void b(float[] fArr, float f, float f2) {
        float[] fArr2 = this.a;
        arb.c(fArr2);
        arb.f(fArr2, f, f2);
        bbp.a(fArr, fArr2);
    }

    private final void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.b);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            ja.f(this.a, matrix);
            bbp.a(fArr, this.a);
        }
    }

    @Override // defpackage.bca
    public final void a(View view, float[] fArr) {
        arb.c(fArr);
        c(view, fArr);
    }
}
