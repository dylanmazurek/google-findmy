package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.integrations.spot.sharing.DeviceOwnersCard;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eph implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eph(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [lkq, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 5;
        switch (this.b) {
            case 0:
                epj epjVar = (epj) this.a;
                String str = epjVar.c;
                boolean z = epjVar.b;
                Bundle bundle = new Bundle();
                bundle.putString("DEVICE_NAME_KEY", str);
                bundle.putBoolean("IS_LOCATOR_TAG_KEY", z);
                eoq eoqVar = new eoq();
                eoqVar.ak(bundle);
                epjVar.q(eoqVar);
                return;
            case 1:
                eol eolVar = (eol) this.a;
                jer b = eyf.b(eolVar.e.c(), eolVar.b);
                if (!b.g()) {
                    ((jni) ((jni) eol.a.g()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SpotDeviceDetailsRemoveButtonFragment", "onFactoryResetButtonClicked", 84, "SpotDeviceDetailsRemoveButtonFragment.java")).r("Current device is not present when trying to factory reset device.");
                    return;
                }
                eolVar.c.g();
                lqd lqdVar = ((lqc) b.c()).d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                epj d = epj.d(lqdVar);
                ebf ebfVar = eolVar.af;
                ebb a = ebc.a();
                a.b(true);
                ebfVar.k(d, a.a());
                return;
            case 2:
                ((eqf) this.a).ap.f(R.string.mark_as_lost_notification_permission_dialog_body);
                return;
            case 3:
                ((eqf) this.a).b.g(2);
                return;
            case 4:
                ((eqx) this.a).F().onBackPressed();
                return;
            case 5:
                new esq().q(((eqx) this.a).G(), "NEARBY_RINGING_VOLUME_DIALOG_TAG");
                return;
            case 6:
                eqx eqxVar = (eqx) this.a;
                eda edaVar = (eda) eqxVar.an.a().d();
                edaVar.getClass();
                int i2 = edaVar.g;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        ecz eczVar = eqxVar.an;
                        eso esoVar = (eso) eqxVar.am.a().d();
                        esoVar.getClass();
                        eczVar.d(esoVar.c);
                        return;
                    }
                    eqxVar.an.f();
                    return;
                }
                throw null;
            case 7:
                DeviceOwnersCard deviceOwnersCard = (DeviceOwnersCard) this.a;
                deviceOwnersCard.g = !deviceOwnersCard.g;
                deviceOwnersCard.c();
                return;
            case 8:
                ((eth) this.a).d();
                return;
            case 9:
                ((eth) this.a).as(new Intent("android.intent.action.VIEW", Uri.parse(lua.i())));
                return;
            case 10:
                ((eth) this.a).as(new Intent("android.intent.action.VIEW", Uri.parse(lua.a.a().J())));
                return;
            case 11:
                Object obj = this.a;
                etu etuVar = ((eth) obj).e;
                etuVar.b();
                etuVar.d(lnb.SHARING_APPLICATION_USER_DECLINED);
                ((ag) obj).H().ad();
                return;
            case 12:
                eth ethVar = (eth) this.a;
                etu etuVar2 = ethVar.e;
                etuVar2.b();
                etuVar2.d(lnb.SHARING_APPLICATION_REQUIREMENTS_LAUNCHED);
                etu etuVar3 = ethVar.e;
                etuVar3.b();
                lqd lqdVar2 = etuVar3.e;
                etu etuVar4 = ethVar.e;
                etuVar4.b();
                ?? c = etuVar4.f.c();
                etj etjVar = new etj();
                Bundle bundle2 = new Bundle();
                eyf.m(lqdVar2, bundle2);
                kzy.m(bundle2, "event_context", c);
                etjVar.ak(bundle2);
                ethVar.am.j(etjVar);
                return;
            case 13:
                ((etj) this.a).d();
                return;
            case 14:
                Object obj2 = this.a;
                etj etjVar2 = (etj) obj2;
                switch (etjVar2.d.a().a) {
                    case USE_RESPONSIBLY:
                    case TURN_ON_LOCATION:
                    case SET_UP_SCREEN_LOCK:
                    case TURN_ON_FIND_MY_DEVICE:
                    case TURN_ON_LAST_KNOWN_LOCATION:
                        iqd iqdVar = new iqd(etjVar2.y());
                        iqdVar.s(R.string.leave_sharing_dialog_title);
                        iqdVar.n(R.string.leave_sharing_dialog_body);
                        iqdVar.r(R.string.leave_sharing_confirm_button, new eos((ag) obj2, i));
                        iqdVar.p(R.string.leave_sharing_back_button, new elb(4));
                        iqdVar.b().show();
                        return;
                    case JOIN_FIND_MY_DEVICE_NETWORK:
                        etq etqVar = etjVar2.d;
                        etqVar.d(lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_SKIPPED);
                        etqVar.h();
                        return;
                    case TERMINATED:
                        ((jni) ((jni) etj.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "onNegativeButtonClicked", 211, "SharingApplicationRequirementsFragment.java")).u("Unexpected negative button click on state %s", etjVar2.d.a());
                        return;
                    default:
                        return;
                }
            case 15:
                ((etj) this.a).e();
                return;
            case 16:
                ((etx) this.a).af.e();
                return;
            case 17:
                ((etx) this.a).af.f();
                return;
            case 18:
                ((etx) this.a).as(new Intent("android.intent.action.VIEW", Uri.parse(lua.i())));
                return;
            case 19:
                Object obj3 = this.a;
                etx etxVar = (etx) obj3;
                jer a2 = etxVar.af.a();
                if (!a2.g()) {
                    ((jni) ((jni) etx.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalFragment", "onCancelClicked", 142, "SharingApplicationApprovalFragment.java")).r("Device cannot be found before cancelling a sharing application");
                    return;
                }
                iqd iqdVar2 = new iqd(etxVar.y());
                iqdVar2.s(R.string.reject_sharing_application_confirmation_dialog_title);
                iqdVar2.o(etxVar.U(R.string.reject_sharing_application_confirmation_dialog_body, etxVar.b.unicodeWrap(((lqc) a2.c()).g), etxVar.b.unicodeWrap(etxVar.e)));
                iqdVar2.q(new elb(5));
                iqdVar2.r(R.string.cancel_sharing, new eos((ag) obj3, 6));
                iqdVar2.b().show();
                return;
            default:
                ((etx) this.a).af.e();
                return;
        }
    }
}
