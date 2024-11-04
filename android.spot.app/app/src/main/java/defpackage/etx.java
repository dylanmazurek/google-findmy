package defpackage;

import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.integrations.spot.sharing.DeviceOwnersCard;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etx extends etv {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalFragment");
    public etz af;
    public DeviceOwnersCard ag;
    public MaterialButton ah;
    public MaterialButton ai;
    public dhx aj;
    private lqd ak;
    public BidiFormatter b;
    public evo c;
    public ele d;
    public String e;

    public static etx d(lqd lqdVar, String str) {
        etx etxVar = new etx();
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        bundle.putString("invitee_email_address", str);
        etxVar.ak(bundle);
        return etxVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sharing_application_approval, (ViewGroup) null);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.sharing_application_approval_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.t();
        g.g(true);
        g.s();
        inflate.findViewById(R.id.learn_more_text).setOnClickListener(new eph(this, 18));
        this.ag = (DeviceOwnersCard) inflate.findViewById(R.id.device_and_invitee_card);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.cancel_button);
        this.ai = materialButton;
        materialButton.setOnClickListener(new eph(this, 19));
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.confirm_button);
        this.ah = materialButton2;
        materialButton2.setOnClickListener(new eph(this, 20));
        jer a2 = this.af.a();
        if (a2.g()) {
            lpz a3 = this.d.a((lqc) a2.c());
            DeviceOwnersCard deviceOwnersCard = this.ag;
            kyf kyfVar = a3.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            deviceOwnersCard.d(kyfVar);
            jer U = hzc.U(a3.c, new etw(this, 0));
            if (U.g()) {
                this.ag.e((kzq) U.c());
            } else {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalFragment", "populateDeviceDetails", 134, "SharingApplicationApprovalFragment.java")).r("Invitee cannot be found");
            }
        }
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        etz etzVar = this.af;
        etzVar.b();
        etzVar.b.g(O(), new epy(this, 18));
        etz etzVar2 = this.af;
        etzVar2.b();
        etzVar2.c.g(O(), new epy(this, 19));
        ((cfk) this.aj.a).g(O(), new epy(this, 20));
    }

    public final void e() {
        this.ah.setEnabled(false);
        this.ai.setEnabled(false);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        boolean z;
        lqu lquVar;
        super.g(bundle);
        this.ak = eyf.g(A());
        String string = A().getString("invitee_email_address");
        string.getClass();
        this.e = string;
        lqd lqdVar = this.ak;
        etz etzVar = (etz) new ddh((cgq) this).q(etz.class);
        lqd lqdVar2 = etzVar.d;
        if (lqdVar2 == null || etzVar.e == null) {
            if (lqdVar2 == null && etzVar.e == null && etzVar.f == null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "ViewModel is already initialized");
            etzVar.d = lqdVar;
            etzVar.e = string;
        }
        hwx.S(etzVar.d.equals(lqdVar), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", lqdVar, etzVar.d);
        hwx.K(etzVar.e.equals(string), "The provided invitee email is different than the one the ViewModel was first initialized with");
        etzVar.b();
        if (etzVar.f == null) {
            ((jni) ((jni) etz.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "ensureCalculationFutureInProgress", 244, "SharingApplicationApprovalViewModel.java")).r("Calculating sharing validation code as inviter...");
            etzVar.d(lnb.SHARING_APPLICATION_APPROVAL_CALCILATING_VALIDATION_CODE_STARTED);
            ihk ihkVar = etzVar.h;
            lqd lqdVar3 = etzVar.d;
            if (lqdVar3.a == 3) {
                lquVar = (lqu) lqdVar3.b;
            } else {
                lquVar = lqu.c;
            }
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            String str = etzVar.e;
            hnu hnuVar = ihkVar.f;
            jyz u = ihkVar.g.u();
            jyz f = hnuVar.f(kxvVar);
            jck F = iuu.F(u, f);
            etzVar.f = jbx.d(jbx.d(((jck) F.a).f(new ihh(ihkVar, u, f, str, 0), ihkVar.d))).e(new ett(etzVar, 8), jxv.a).a(Throwable.class, new ett(etzVar, 9), jxv.a);
        }
        this.af = etzVar;
    }
}
