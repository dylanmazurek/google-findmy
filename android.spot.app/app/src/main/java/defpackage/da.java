package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class da extends bxb {
    final /* synthetic */ db a;

    public da(db dbVar) {
        this.a = dbVar;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void a() {
        this.a.a.r.setVisibility(8);
        dn dnVar = this.a.a;
        PopupWindow popupWindow = dnVar.s;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (dnVar.r.getParent() instanceof View) {
            bvz.c((View) this.a.a.r.getParent());
        }
        this.a.a.r.i();
        this.a.a.M.i(null);
        dn dnVar2 = this.a.a;
        dnVar2.M = null;
        bvz.c(dnVar2.w);
    }
}
