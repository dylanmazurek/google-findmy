package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class cna extends cmy {
    private static boolean a = true;

    @Override // defpackage.cmu
    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(view, i);
        } else if (a) {
            try {
                cmz.a(view, i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
