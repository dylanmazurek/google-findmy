package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.integrations.spot.sharing.DeviceOwnersCard;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euh extends eug {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationFragment");
    public MaterialButton af;
    public ewf ag;
    public ebf ah;
    public dhx ai;
    private lqd aj;
    public evo b;
    public ele c;
    public eui d;
    public DeviceOwnersCard e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pending_sharing_application_information, (ViewGroup) null);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.pending_sharing_application_information_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.t();
        g.g(true);
        g.s();
        inflate.findViewById(R.id.learn_more_text).setOnClickListener(new eub(this, 3));
        this.e = (DeviceOwnersCard) inflate.findViewById(R.id.device_and_inviter_card);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.cancel_button);
        this.af = materialButton;
        materialButton.setOnClickListener(new eub(this, 4));
        jer a2 = this.d.a();
        if (!a2.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationFragment", "populateDeviceDetails", 121, "PendingSharingApplicationInformationFragment.java")).r("Device could not be found");
        } else {
            lpz a3 = this.c.a((lqc) a2.c());
            DeviceOwnersCard deviceOwnersCard = this.e;
            kyf kyfVar = a3.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            deviceOwnersCard.d(kyfVar);
            jer e = eku.e(a3.c);
            if (e.g()) {
                this.e.e((kzq) e.c());
            } else {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationFragment", "populateDeviceDetails", 132, "PendingSharingApplicationInformationFragment.java")).r("Primary owner could not be found");
            }
            Stream filter = Collection.EL.stream(a3.c).filter(new eju(11));
            int i = jis.d;
            this.e.f((jis) filter.collect(jgr.a));
        }
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        eui euiVar = this.d;
        euiVar.d();
        euiVar.e.g(O(), new euc(this, 2));
        eui euiVar2 = this.d;
        euiVar2.d();
        euiVar2.f.g(O(), new euc(this, 3));
        eui euiVar3 = this.d;
        euiVar3.d();
        euiVar3.g.g(O(), new euc(this, 4));
        ((cfk) this.ai.a).g(O(), new euc(this, 5));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        lqd g = eyf.g(A());
        this.aj = g;
        eui euiVar = (eui) new ddh((cgq) this).q(eui.class);
        if (euiVar.h == null) {
            hwx.V(true, "ViewModel is already initialized");
            euiVar.h = g;
            euiVar.b.g(euiVar.d);
            euiVar.k.b(euiVar.d);
            euiVar.d.cx();
        }
        hwx.S(euiVar.h.equals(g), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", g, euiVar.h);
        this.d = euiVar;
    }
}
