package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eob extends env {
    public jer af = jdl.a;
    public ehr ag;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        View inflate = F().getLayoutInflater().inflate(R.layout.dialog_select_device_category, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.categories);
        Resources resources = y().getResources();
        resources.getClass();
        kyj[] values = kyj.values();
        ArrayList arrayList = new ArrayList();
        for (kyj kyjVar : values) {
            eoe e = bsh.e(kyjVar);
            if (e != null) {
                arrayList.add(e);
            }
        }
        recyclerView.U(new eoa(this, hwx.p(mkm.af(arrayList, new ent(resources)))));
        F();
        recyclerView.V(new LinearLayoutManager());
        iqd iqdVar = new iqd(F());
        iqdVar.t(inflate);
        return iqdVar.b();
    }

    @Override // defpackage.ag
    public final void ad() {
        if (this.af.g()) {
            this.af.c();
            this.af = jdl.a;
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        jer g = this.ag.g();
        if (g.g() && (g.c() instanceof ekc)) {
            this.af = jer.i(new njz((ekc) g.c(), null));
        }
    }
}
