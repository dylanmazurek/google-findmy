package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class cmy extends cmw {
    private static boolean a = true;

    @Override // defpackage.cmu
    public void b(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                cmx.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
