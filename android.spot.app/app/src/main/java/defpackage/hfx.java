package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hfx implements hmd {
    public final /* synthetic */ hmh a;
    public final /* synthetic */ hcc b;
    public final /* synthetic */ hgw c;
    public final /* synthetic */ lnh d;
    private final /* synthetic */ int e;

    public /* synthetic */ hfx(hcc hccVar, hgw hgwVar, lnh lnhVar, hmh hmhVar, int i) {
        this.e = i;
        this.b = hccVar;
        this.c = hgwVar;
        this.d = lnhVar;
        this.a = hmhVar;
    }

    @Override // defpackage.hmd
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.e;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                hgr hgrVar = new hgr(layoutInflater.getContext());
                hcc hccVar = this.b;
                jer jerVar = hccVar.d.b;
                cfc O = this.a.O();
                hwx.J(false);
                MaterialButton materialButton = (MaterialButton) hgrVar.findViewById(R.id.turn_off_incognito_button);
                hel helVar = (hel) hccVar.d.b.c();
                materialButton.setText(helVar.b());
                hgrVar.getContext();
                materialButton.d(helVar.c());
                hha hhaVar = new hha(new hgq(hccVar, this.d, 0));
                hgw hgwVar = this.c;
                hhaVar.c = hgwVar.b();
                hhaVar.d = hgwVar.a();
                materialButton.setOnClickListener(new hgz(hhaVar));
                hgf hgfVar = new hgf(hccVar, hgrVar.getContext(), O);
                hcg hcgVar = new hcg(hccVar);
                hcgVar.b();
                hgfVar.e = hcgVar.a();
                cfk cfkVar = hgfVar.a().b;
                Context context = hgrVar.getContext();
                if (cfkVar == null) {
                    cfkVar = new cfn();
                }
                cfk cfkVar2 = cfkVar;
                hcd hcdVar = hccVar.b;
                hjp hjpVar = hccVar.l;
                heb hebVar = hccVar.d;
                int Z = frx.Z(hgrVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + frx.Z(hgrVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                hej hejVar = hebVar.j;
                hfe hfeVar = hebVar.n;
                hog.J(hgrVar.a, new hcy(context, hcdVar, cfkVar2, hgwVar, hjpVar, Z));
                hgrVar.a.setNestedScrollingEnabled(false);
                RecyclerView recyclerView = hgrVar.a;
                hgrVar.getContext();
                recyclerView.V(new LinearLayoutManager());
                return hgrVar;
            }
            hmh hmhVar = this.a;
            if (hmhVar.P == null) {
                return hgd.c(layoutInflater);
            }
            lnh lnhVar = this.d;
            hgw hgwVar2 = this.c;
            hcc hccVar2 = this.b;
            hgs hgsVar = new hgs(layoutInflater.getContext());
            cfc O2 = hmhVar.O();
            View findViewById = hgsVar.findViewById(R.id.sign_in_button);
            hha hhaVar2 = new hha(new hgq(hccVar2, lnhVar, 3));
            hhaVar2.c = hgwVar2.b();
            hhaVar2.d = hgwVar2.a();
            findViewById.setOnClickListener(new hgz(hhaVar2));
            hgf hgfVar2 = new hgf(hccVar2, hgsVar.getContext(), O2);
            hgfVar2.b();
            hgfVar2.c();
            hgfVar2.d = true;
            hcg hcgVar2 = new hcg(hccVar2);
            hcgVar2.b();
            hgfVar2.e = hcgVar2.a();
            hge a = hgfVar2.a();
            int Z2 = frx.Z(hgsVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + frx.Z(hgsVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
            cfk cfkVar3 = a.a;
            hfe hfeVar2 = hccVar2.d.n;
            frx.ah((RecyclerView) hgsVar.findViewById(R.id.cards_and_actions), hgsVar.a(cfkVar3, hccVar2, hgwVar2, Z2));
            frx.ah((RecyclerView) hgsVar.findViewById(R.id.common_actions), hgsVar.a(a.b, hccVar2, hgwVar2, Z2));
            return hgsVar;
        }
        hmh hmhVar2 = this.a;
        if (hmhVar2.P == null) {
            return hgd.c(layoutInflater);
        }
        lnh lnhVar2 = this.d;
        hgw hgwVar3 = this.c;
        hcc hccVar3 = this.b;
        cfc O3 = hmhVar2.O();
        hgs hgsVar2 = new hgs(layoutInflater.getContext(), null);
        ham b = hgd.b(hccVar3, O3);
        int Z3 = frx.Z(hgsVar2.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing);
        hgsVar2.getContext();
        frx.ah((RecyclerView) hgsVar2.findViewById(R.id.accounts), new hbk(frx.af(hccVar3), new hgg(hgwVar3, hccVar3, i2), hgwVar3, lnhVar2, hccVar3.l, Z3, b, true));
        hgf hgfVar3 = new hgf(hccVar3, hgsVar2.getContext(), O3);
        hgfVar3.f = frx.ag(hgsVar2.getContext(), hccVar3, lnhVar2);
        hgfVar3.b();
        hgfVar3.c();
        hgfVar3.d = true;
        hcg hcgVar3 = new hcg(hccVar3);
        hcgVar3.b();
        hgfVar3.e = hcgVar3.a();
        hge a2 = hgfVar3.a();
        cfk cfkVar4 = a2.a;
        hfe hfeVar3 = hccVar3.d.n;
        frx.ah((RecyclerView) hgsVar2.findViewById(R.id.cards_and_actions), hgsVar2.b(cfkVar4, hccVar3, hgwVar3, Z3));
        frx.ah((RecyclerView) hgsVar2.findViewById(R.id.common_actions), hgsVar2.b(a2.b, hccVar3, hgwVar3, Z3 + frx.Z(hgsVar2.getContext(), R.attr.ogContainerExternalHorizontalSpacing)));
        return hgsVar2;
    }

    public /* synthetic */ hfx(hmh hmhVar, hcc hccVar, hgw hgwVar, lnh lnhVar, int i) {
        this.e = i;
        this.a = hmhVar;
        this.b = hccVar;
        this.c = hgwVar;
        this.d = lnhVar;
    }
}
