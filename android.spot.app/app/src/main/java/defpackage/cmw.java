package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class cmw extends cmu {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.cmu
    public void e(View view, Matrix matrix) {
        if (a) {
            try {
                cmv.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.cmu
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                cmv.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
