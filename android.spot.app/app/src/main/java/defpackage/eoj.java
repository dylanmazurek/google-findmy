package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.view.DeviceDetailsFieldView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoj extends enw {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/devicedetails/SpotDeviceDetailsFragment");
    public eod af;
    public jer ag = jdl.a;
    public View ah;
    public RecyclerView ai;
    public eoi aj;
    public eoi ak;
    public CircularProgressIndicator al;
    public TextView am;
    public DeviceDetailsFieldView an;
    public DeviceDetailsFieldView ao;
    public Group ap;
    public Group aq;
    public ehr ar;
    public ebf as;
    public dhx at;
    private esr au;
    private RecyclerView av;
    public BidiFormatter b;
    public evo c;
    public Executor d;
    public lqd e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_spot_device_details, viewGroup, false);
        this.au = esr.f(this, true);
        DeviceDetailsFieldView deviceDetailsFieldView = (DeviceDetailsFieldView) inflate.findViewById(R.id.device_category_field);
        this.an = deviceDetailsFieldView;
        deviceDetailsFieldView.setOnClickListener(new efe(this, 15));
        DeviceDetailsFieldView deviceDetailsFieldView2 = (DeviceDetailsFieldView) inflate.findViewById(R.id.ring_volume_field);
        this.ao = deviceDetailsFieldView2;
        deviceDetailsFieldView2.setOnClickListener(new efe(this, 17));
        View findViewById = inflate.findViewById(R.id.refresh_shared_owners);
        this.ah = findViewById;
        findViewById.setOnClickListener(new efe(this, 18));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.shared_owners);
        this.ai = recyclerView;
        F();
        recyclerView.V(new LinearLayoutManager());
        int i = 6;
        eoi eoiVar = new eoi(new ebd(this, i), false, this.b, this.d);
        this.aj = eoiVar;
        this.ai.U(eoiVar);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.pending_owners);
        this.av = recyclerView2;
        F();
        recyclerView2.V(new LinearLayoutManager());
        eoi eoiVar2 = new eoi(new ebd(this, i), true, this.b, this.d);
        this.ak = eoiVar2;
        this.av.U(eoiVar2);
        this.al = (CircularProgressIndicator) inflate.findViewById(R.id.sharing_progress_indicator);
        TextView textView = (TextView) inflate.findViewById(R.id.share_device);
        this.am = textView;
        textView.setOnClickListener(new efe(this, 19));
        this.ap = (Group) inflate.findViewById(R.id.pending_views);
        this.aq = (Group) inflate.findViewById(R.id.sharing_views);
        return inflate;
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        if (this.ag.g()) {
            njz njzVar = (njz) this.ag.c();
            boolean z2 = true;
            if (((ekc) njzVar.a).g != null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "UI not attached");
            if (((ekc) njzVar.a).g != this) {
                z2 = false;
            }
            hwx.K(z2, "detaching wrong UI");
            this.ag = jdl.a;
            ((ekc) njzVar.a).g = null;
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        jer g = this.ar.g();
        if (g.g() && (g.c() instanceof ekc)) {
            ekc ekcVar = (ekc) g.c();
            ekcVar.g = this;
            ekcVar.l();
            this.ag = jer.i(new njz(ekcVar, null));
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        ((cfk) this.at.a).g(O(), new egv(this, 15));
        this.au.a().g(O(), new egv(this, 16));
        this.af.a().g(O(), new egv(this, 17));
    }

    public final void d(String str, boolean z) {
        be G = G();
        enz enzVar = new enz();
        Bundle bundle = new Bundle();
        bundle.putString("owner_email", str);
        bundle.putBoolean("approved_pending_owner", z);
        enzVar.ak(bundle);
        enzVar.q(G, "OWNER_DETAILS_BOTTOM_SHEET_DIALOG_TAG");
        G.ag();
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.e = eyf.g(A());
        eod b = eod.b(D(), this.e);
        this.af = b;
        b.a().g(this, new egv(this, 17));
        G().Q("OWNER_DETAILS_BOTTOM_SHEET_DIALOG_FRAGMENT_RESULT", this, new ehe(this, 3));
    }
}
