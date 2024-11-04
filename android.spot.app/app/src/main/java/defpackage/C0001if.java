package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: if */
/* loaded from: classes.dex */
public final class C0001if extends PopupWindow {
    public C0001if(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        ksr F = ksr.F(context, attributeSet, eb.s, i, 0);
        if (F.A(2)) {
            brg.c(this, F.z(2, false));
        }
        setBackgroundDrawable(F.u(0));
        F.y();
    }
}
