package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kva extends ag {
    public static final joo a = joo.m("xRPC");
    public kuw b;
    private kuk c;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.service_override_fragment, viewGroup, false);
        ArrayList parcelableArrayList = this.m.getParcelableArrayList("configs_to_display");
        this.b = new kuw(this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.service_list);
        recyclerView.U(this.b);
        recyclerView.V(new LinearLayoutManager());
        kuk kukVar = (kuk) dsd.b(this, new kul(x())).q(kuk.class);
        this.c = kukVar;
        kukVar.a(parcelableArrayList).g(this, new hdm(this, 15));
        return inflate;
    }

    @Override // defpackage.ag
    public final void Y(int i, int i2, Intent intent) {
        if (i2 == -1) {
            kus kusVar = (kus) intent.getParcelableExtra("rpc_config_key");
            String stringExtra = intent.getStringExtra("result_extra");
            if (stringExtra == null) {
                kuk kukVar = this.c;
                kukVar.b().execute(jbn.f(new koq(kukVar, kusVar, 8)));
            } else {
                kuk kukVar2 = this.c;
                kukVar2.b().execute(jbn.f(new hlt(kukVar2, kusVar, stringExtra, 14)));
            }
            this.b.g();
        }
    }
}
