package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gq implements PopupWindow.OnDismissListener {
    final /* synthetic */ gr a;

    public gq(gr grVar) {
        this.a = grVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
