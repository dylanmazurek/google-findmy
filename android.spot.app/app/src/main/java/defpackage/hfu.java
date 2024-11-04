package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hfu implements hmg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hmg
    public final void a(View view) {
        int i;
        if (this.b != 0) {
            String str = hci.a;
            hgp hgpVar = (hgp) view.findViewById(R.id.og_has_selected_content);
            if (hgpVar != null) {
                ijs.c();
                hwx.V(true, "View can be expanded only if account switching is enabled");
                if (hgpVar.l.e()) {
                    hgpVar.a(false);
                }
            }
            ((hmh) this.a).aI(null);
            return;
        }
        hgd hgdVar = (hgd) this.a;
        hcc hccVar = hgdVar.a;
        if (true != hccVar.d.f.e()) {
            i = 90575;
        } else {
            i = 90576;
        }
        hccVar.l.a(view, i);
        hgdVar.d(37);
        jer jerVar = hgdVar.a.d.m;
    }
}
