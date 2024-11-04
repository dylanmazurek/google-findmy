package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.integrations.spot.sharing.DeviceOwnersCard;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eth extends ete {
    public pk a;
    public ConstraintLayout af;
    public TextView ag;
    public TextView ah;
    public TextView ai;
    public TextView aj;
    public Button ak;
    public MaterialButton al;
    public ebf am;
    public maf an;
    public dhx ao;
    private ihd ap;
    private TextView aq;
    private DeviceOwnersCard ar;
    public evo b;
    public pf c;
    public final boh d = new boh();
    public etu e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sharing_application, (ViewGroup) null);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.sharing_application_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.t();
        g.g(true);
        g.s();
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.sharing_application_constraint_layout);
        this.af = constraintLayout;
        this.d.c(constraintLayout);
        this.ag = (TextView) inflate.findViewById(R.id.header_text);
        this.ah = (TextView) inflate.findViewById(R.id.explanation_text);
        TextView textView = (TextView) inflate.findViewById(R.id.learn_more_text);
        this.aq = textView;
        textView.setOnClickListener(new eph(this, 9));
        this.ar = (DeviceOwnersCard) inflate.findViewById(R.id.device_and_inviter_card);
        this.ai = (TextView) inflate.findViewById(R.id.failure_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.failure_text_learn_more);
        this.aj = textView2;
        textView2.setOnClickListener(new eph(this, 10));
        Button button = (Button) inflate.findViewById(R.id.decline_button);
        this.ak = button;
        button.setOnClickListener(new eph(this, 11));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.accept_button);
        this.al = materialButton;
        materialButton.setOnClickListener(new eph(this, 12));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        etu etuVar = this.e;
        etuVar.b();
        etuVar.c.g(O(), new epy(this, 14));
        ((cfk) this.ao.a).g(O(), new epy(this, 15));
    }

    public final void d() {
        etu etuVar = this.e;
        etuVar.b();
        ets etsVar = (ets) etuVar.c.d();
        etsVar.getClass();
        jer jerVar = etsVar.a;
        if (!jerVar.g()) {
            ((jni) ((jni) etu.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "onUserApplied", 129, "SharingApplicationViewModel.java")).r("Unexpectedly user applied without device details");
        } else {
            etuVar.c.l(ets.a((etr) jerVar.c()));
            etuVar.a((etr) jerVar.c());
        }
    }

    public final void e(boh bohVar, etr etrVar) {
        o(etrVar);
        bohVar.l(R.id.application_screen_explanation, 0);
        this.al.d(fma.bL(F()));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        jyz b;
        super.g(bundle);
        byte[] byteArray = A().getByteArray("invitation_token");
        byteArray.getClass();
        ihd ihdVar = new ihd(lim.t(byteArray));
        this.ap = ihdVar;
        etu etuVar = (etu) new ddh((cgq) this).q(etu.class);
        int i = 1;
        if (etuVar.d == null) {
            hwx.V(true, "ViewModel is already initialized");
            etuVar.d = ihdVar;
            try {
                kxv d = etuVar.i.d(ihdVar);
                ljh k = lqd.d.k();
                ljh k2 = lqu.c.k();
                if (!k2.b.y()) {
                    k2.t();
                }
                lqu lquVar = (lqu) k2.b;
                d.getClass();
                lquVar.b = d;
                lquVar.a |= 1;
                if (!k.b.y()) {
                    k.t();
                }
                lqd lqdVar = (lqd) k.b;
                lqu lquVar2 = (lqu) k2.q();
                lquVar2.getClass();
                lqdVar.b = lquVar2;
                lqdVar.a = 3;
                lqf lqfVar = lqf.SPOT_DEVICE;
                if (!k.b.y()) {
                    k.t();
                }
                ((lqd) k.b).c = lqfVar.a();
                etuVar.e = (lqd) k.q();
            } catch (ihe e) {
                ((jni) ((jni) ((jni) etu.a.g()).i(e)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "initialize", (char) 272, "SharingApplicationViewModel.java")).r("Failed extracting device ID from sharing invitation");
                etuVar.e = lqd.d;
            }
            ljh k3 = lmu.i.k();
            lmy f = etuVar.i.f(ihdVar);
            if (!k3.b.y()) {
                k3.t();
            }
            lmu lmuVar = (lmu) k3.b;
            f.getClass();
            lmuVar.f = f;
            lmuVar.a |= 16;
            etuVar.f = jer.i((lmu) k3.q());
        }
        hwx.K(etuVar.d.equals(ihdVar), "The provided invitation token is different than the one the ViewModel was first initialized with");
        etuVar.b();
        int i2 = 0;
        if (!etuVar.g.g()) {
            ((jni) ((jni) etu.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "ensureFetchingDetails", 289, "SharingApplicationViewModel.java")).r("Fetching device details from sharing invitation...");
            etuVar.d(lnb.SHARING_APPLICATION_FETCH_INVITATION_REQUESTED);
            ihk ihkVar = etuVar.i;
            ihd ihdVar2 = etuVar.d;
            jer jerVar = (jer) ihkVar.b.a();
            if (!jerVar.g()) {
                b = ivc.D(new IllegalStateException("Unknown account"));
            } else {
                GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest = new GetKeychainLockScreenKnowledgeFactorSupportRequest();
                getKeychainLockScreenKnowledgeFactorSupportRequest.a = (Account) jerVar.c();
                b = fzo.b(ihkVar.e.q(getKeychainLockScreenKnowledgeFactorSupportRequest));
            }
            etuVar.g = jer.i(jbx.d(jbx.d(b).f(new ifl(ihkVar, 7), ihkVar.d).f(new ibz(ihkVar, ihdVar2, 8, null), ihkVar.d).e(new ihq(1), ihkVar.d)).e(new ett(etuVar, i), jxv.a).a(igz.class, new ett(etuVar, i2), jxv.a).a(Throwable.class, new ett(etuVar, 2), jxv.a));
        }
        this.e = etuVar;
        this.c = M(new pr(), this.a, new dyd(this, 9));
        H().Q("SharingApplicationRequirementsFragmentResult", this, new ehe(this, 11));
        this.an.e(new etg(this, 0));
    }

    public final void o(etr etrVar) {
        this.ar.d(etrVar.a);
        jer e = eku.e(etrVar.b);
        if (e.g()) {
            this.ar.e((kzq) e.c());
        }
        jht b = jht.b(etrVar.b);
        this.ar.f(jht.b(hzc.V(b.e(), new eja(4))).d());
    }
}
