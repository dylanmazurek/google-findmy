package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.adm.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eub implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eub(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 7;
        switch (this.b) {
            case 0:
                ((eud) this.a).ai.f(R.string.sharing_invitation_explanation_notification_permission_dialog_body);
                return;
            case 1:
                ((eud) this.a).d.d();
                return;
            case 2:
                ((euh) this.a).d.b();
                return;
            case 3:
                ((euh) this.a).as(new Intent("android.intent.action.VIEW", Uri.parse(lua.i())));
                return;
            case 4:
                Object obj = this.a;
                euh euhVar = (euh) obj;
                jer a = euhVar.d.a();
                if (!a.g()) {
                    ((jni) ((jni) euh.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationFragment", "onCancelClicked", 145, "PendingSharingApplicationInformationFragment.java")).r("Device could not be found");
                    return;
                }
                iqd iqdVar = new iqd(euhVar.y());
                iqdVar.s(R.string.reject_sharing_application_confirmation_dialog_title);
                iqdVar.o(euhVar.U(R.string.cancel_sharing_application_confirmation_dialog_body, ((lqc) a.c()).g));
                iqdVar.q(new elb(6));
                iqdVar.r(R.string.cancel_sharing, new eos((ag) obj, i));
                iqdVar.b().show();
                return;
            case 5:
                ((evr) this.a).a.F().onBackPressed();
                return;
            case 6:
                ((evu) this.a).a.F().onBackPressed();
                return;
            case 7:
                ((ewv) this.a).f();
                return;
            case 8:
                emx emxVar = ((ewv) this.a).j;
                hwx.U(emxVar.e.g());
                emxVar.f((pf) emxVar.e.c());
                return;
            case 9:
                String L = lua.a.a().L();
                ewv ewvVar = (ewv) this.a;
                ewvVar.c(L);
                ewvVar.l.a(false);
                return;
            case 10:
                emx emxVar2 = ((ewv) this.a).j;
                hwx.U(emxVar2.d.g());
                emxVar2.e((pf) emxVar2.d.c());
                return;
            case 11:
                ((ewv) this.a).d();
                return;
            case 12:
                ejo ejoVar = ((ewv) this.a).f;
                jer b = ejoVar.b();
                if (!b.g()) {
                    ((jni) ((jni) ejo.a.f()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "importOwnerKeyFromKeychain", 250, "OwnerKeyHandler.java")).r("No current device selected, skipping import.");
                    return;
                }
                gok C = ejoVar.j.C();
                kyf kyfVar = (kyf) b.c();
                hnu hnuVar = ejoVar.i;
                kxv kxvVar = kyfVar.b;
                if (kxvVar == null) {
                    kxvVar = kxv.b;
                }
                Object obj2 = hnuVar.a;
                ljh k = kyv.c.k();
                if (!k.b.y()) {
                    k.t();
                }
                kyv kyvVar = (kyv) k.b;
                kxvVar.getClass();
                kyvVar.b = kxvVar;
                kyvVar.a |= 1;
                kyv kyvVar2 = (kyv) k.q();
                mkf mkfVar = (mkf) obj2;
                lyt lytVar = mkfVar.a;
                mbg mbgVar = kzy.d;
                if (mbgVar == null) {
                    synchronized (kzy.class) {
                        mbgVar = kzy.d;
                        if (mbgVar == null) {
                            mbd a2 = mbg.a();
                            a2.d = mbf.UNARY;
                            a2.e = mbg.c("google.internal.spot.v1.SpotService", "GetBleDevice");
                            a2.b();
                            kyv kyvVar3 = kyv.c;
                            lja ljaVar = mkc.a;
                            a2.b = new mkb(kyvVar3);
                            a2.c = new mkb(kyw.b);
                            mbgVar = a2.a();
                            kzy.d = mbgVar;
                        }
                    }
                }
                jyz a3 = mkj.a(lytVar.a(mbgVar, mkfVar.b), kyvVar2);
                ijp.b(a3, "GetBleDevice");
                ijp.a(jbx.d(C.A(jbx.d(a3).e(new eil(8), (Executor) ejoVar.f.a()))).f(new ejc(ejoVar, C, 2), (Executor) ejoVar.f.a()).e(new dyv(ejoVar, i), (Executor) ejoVar.f.a()).b(fhy.class, new eji(ejoVar, 2), (Executor) ejoVar.f.a()).b(Throwable.class, new eji(ejoVar, 3), (Executor) ejoVar.f.a()), "importOwnerKeyFromKeychain Failed.", new Object[0]);
                return;
            case 13:
                ewv ewvVar2 = (ewv) this.a;
                ewvVar2.c(lud.c());
                jer jerVar = ewvVar2.g;
                if (jerVar.g()) {
                    ewvVar2.d.i((lqd) jerVar.c(), new egj(5), 1);
                    return;
                }
                return;
            case 14:
                ((ewv) this.a).e();
                return;
            case 15:
                ewv ewvVar3 = (ewv) this.a;
                ewvVar3.c(lud.c());
                jer jerVar2 = ewvVar3.g;
                if (jerVar2.g()) {
                    ewvVar3.d.i((lqd) jerVar2.c(), new egj(7), 1);
                    return;
                }
                return;
            case 16:
                ewv ewvVar4 = (ewv) this.a;
                eqf d = eqf.d((lqd) ewvVar4.g.c());
                ebb a4 = ebc.a();
                a4.a = "MarkAsLostFragment_transaction_tag";
                a4.b(true);
                ewvVar4.i.k(d, a4.a());
                return;
            case 17:
                ewv ewvVar5 = (ewv) this.a;
                jer a5 = ewvVar5.a();
                if (!a5.g()) {
                    ((jni) ((jni) ewv.a.f()).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "launchSupervisedAndroidDeviceInfo", 518, "SuggestedActionCardValuesSupplier.java")).r("Supervised device info requested but no device found");
                } else {
                    ewvVar5.k.a((lqc) a5.c());
                }
                jer jerVar3 = ewvVar5.g;
                if (jerVar3.g()) {
                    ewvVar5.d.i((lqd) jerVar3.c(), new egj(6), 1);
                    return;
                }
                return;
            case 18:
                ((ewv) this.a).d();
                return;
            case 19:
                ewv ewvVar6 = (ewv) this.a;
                ewvVar6.n.m(null);
                ewvVar6.i.g();
                ewvVar6.i.r();
                return;
            default:
                ((ewv) this.a).g();
                return;
        }
    }
}
