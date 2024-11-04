package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.adm.R;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ehe implements bj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, eez] */
    /* JADX WARN: Type inference failed for: r9v79, types: [java.lang.Object, exr] */
    @Override // defpackage.bj
    public final void a(String str, Bundle bundle) {
        int i;
        Serializable serializable;
        etk etkVar;
        lnb lnbVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                try {
                    ehk ehkVar = ((ehg) obj).e;
                    kxz kxzVar = (kxz) kzy.j(bundle, "CONTACT_INFO_FRAGMENT_RESULT", kxz.d, lja.a());
                    if (ehkVar.b == null) {
                        z = false;
                    }
                    hwx.U(z);
                    ehkVar.c = jer.i(kxzVar);
                    ((ehg) obj).d(((ehg) obj).am);
                    return;
                } catch (ljy unused) {
                    ((jni) ((jni) ehg.a.f()).j("com/google/android/apps/adm/integrations/android/securedevice/SecureDeviceFragment", "lambda$registerListeners$2", 252, "SecureDeviceFragment.java")).r("Unable to parse ContactInfo");
                    return;
                }
            case 1:
                if (str.equals("wipe_confirmation_result")) {
                    Object obj2 = this.a;
                    if (bundle.getBoolean("wipe_confirmation_result")) {
                        ebm ebmVar = (ebm) obj2;
                        eey eeyVar = ebmVar.ag;
                        if (eeyVar != null) {
                            ((bym) eeyVar.a.a()).l(dxq.WIPE_CONFIRMATION_ACCEPTED);
                            Object obj3 = eeyVar.b;
                            ehp ehpVar = (ehp) obj3;
                            efa efaVar = (efa) obj3;
                            efaVar.k.a(ehpVar.q, lpk.ANDROID_WIPE);
                            if (efaVar.d.g()) {
                                ?? c = efaVar.d.c();
                                if (true != eyf.w(ehpVar.i())) {
                                    i = 13;
                                } else {
                                    i = 10;
                                }
                                c.b(i);
                            }
                            ebmVar.d();
                            return;
                        }
                        return;
                    }
                    ebm ebmVar2 = (ebm) obj2;
                    eey eeyVar2 = ebmVar2.ag;
                    if (eeyVar2 != null) {
                        ((bym) eeyVar2.a.a()).l(dxq.WIPE_CONFIRMATION_CANCELLED);
                        ebmVar2.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String string = bundle.getString("SET_PASSWORD_FRAGMENT_RESULT");
                ehg ehgVar = (ehg) this.a;
                ehk ehkVar2 = ehgVar.e;
                int e = ehgVar.e();
                if (string != null) {
                    ehkVar2.e(jer.i(string), e);
                    return;
                } else {
                    ehkVar2.f.l(new ehj(jdl.a, false, false));
                    return;
                }
            case 3:
                if (!str.equals("OWNER_DETAILS_BOTTOM_SHEET_DIALOG_FRAGMENT_RESULT")) {
                    return;
                }
                String string2 = bundle.getString("owner_email", "");
                if (TextUtils.isEmpty(string2)) {
                    ((jni) ((jni) eoj.a.g()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SpotDeviceDetailsFragment", "lambda$registerOwnerDetailsBottomSheetDialogFragmentResultListener$4", 304, "SpotDeviceDetailsFragment.java")).r("Got an empty owner to revoke");
                    return;
                } else {
                    ((eoj) this.a).af.h(string2);
                    return;
                }
            case 4:
                epj epjVar = (epj) this.a;
                emm emmVar = epjVar.al;
                exu exuVar = new exu((byte[]) null);
                exuVar.b(R.drawable.gs_bluetooth_vd_theme_24);
                exuVar.d(R.string.spot_remove_device_permission_dialog_bluetooth_permission_title);
                exuVar.c(epjVar.U(R.string.spot_remove_device_dialog_bluetooth_text, epjVar.ak.unicodeWrap(epjVar.c)));
                jer i2 = jer.i(exuVar.a());
                exu exuVar2 = new exu((byte[]) null);
                exuVar2.b(R.drawable.gs_location_on_vd_theme_24);
                exuVar2.d(R.string.spot_remove_device_permission_dialog_location_permission_title);
                exuVar2.c(epjVar.U(R.string.spot_remove_device_dialog_location_text, epjVar.ak.unicodeWrap(epjVar.c)));
                emmVar.c(i2, jer.i(exuVar2.a()));
                return;
            case 5:
                boolean z2 = bundle.getBoolean("FAILED_TO_UNPROVISION_DIALOG_RESULT_KEY");
                Object obj4 = this.a;
                if (z2) {
                    epj epjVar2 = (epj) obj4;
                    epjVar2.e(lnb.ERASE_DEVICE_ABORTED_FORCE_REQUESTED, true);
                    epjVar2.a.g();
                    eoz eozVar = epjVar2.a;
                    eozVar.e();
                    eozVar.c = true;
                    eozVar.a.c(eozVar.b, true);
                    return;
                }
                ((epj) obj4).a.g();
                return;
            case 6:
                boolean z3 = bundle.getBoolean("ENABLE_BLUETOOTH_DIALOG_RESULT_KEY");
                Object obj5 = this.a;
                if (z3) {
                    epj epjVar3 = (epj) obj5;
                    if (!epjVar3.ao.e(epjVar3.ai)) {
                        epjVar3.o(true);
                        return;
                    }
                    return;
                }
                epj epjVar4 = (epj) obj5;
                epjVar4.e(lnb.ERASE_DEVICE_ABORTED_BLUETOOTH_DISABLED, false);
                epjVar4.aF(false);
                return;
            case 7:
                boolean z4 = bundle.getBoolean("ENABLE_LOCATION_DIALOG_RESULT_KEY");
                Object obj6 = this.a;
                if (z4) {
                    epj epjVar5 = (epj) obj6;
                    if (!epjVar5.ao.f(epjVar5.aj)) {
                        epjVar5.p(true);
                        return;
                    }
                    return;
                }
                epj epjVar6 = (epj) obj6;
                epjVar6.e(lnb.ERASE_DEVICE_ABORTED_LOCATION_DISABLED, false);
                epjVar6.aF(false);
                return;
            case 8:
                String string3 = bundle.getString("fragmentResultKey", "");
                cfn cfnVar = ((eqa) this.a).b.d;
                kxz kxzVar2 = (kxz) cfnVar.d();
                kxzVar2.getClass();
                ljh ljhVar = (ljh) kxzVar2.z(5);
                ljhVar.w(kxzVar2);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                kxz kxzVar3 = (kxz) ljhVar.b;
                string3.getClass();
                kxzVar3.a = string3;
                cfnVar.l((kxz) ljhVar.q());
                return;
            case 9:
                String string4 = bundle.getString("fragmentResultKey", "");
                cfn cfnVar2 = ((eqa) this.a).b.d;
                kxz kxzVar4 = (kxz) cfnVar2.d();
                kxzVar4.getClass();
                ljh ljhVar2 = (ljh) kxzVar4.z(5);
                ljhVar2.w(kxzVar4);
                if (!ljhVar2.b.y()) {
                    ljhVar2.t();
                }
                kxz kxzVar5 = (kxz) ljhVar2.b;
                string4.getClass();
                kxzVar5.b = string4;
                cfnVar2.l((kxz) ljhVar2.q());
                return;
            case 10:
                try {
                    kxz kxzVar6 = (kxz) kzy.j(bundle, "CONTACT_INFO_FRAGMENT_RESULT", kxz.d, lja.a());
                    eqo eqoVar = ((eqf) this.a).b;
                    if (eqoVar.a == null) {
                        z = false;
                    }
                    hwx.U(z);
                    kzc b = eqoVar.b();
                    if (eku.k(b)) {
                        eqoVar.e(kxzVar6);
                        return;
                    } else {
                        eqoVar.c = jer.i(kxzVar6);
                        ((cfn) eqoVar.b.c()).l(eqm.a(b, (kxz) eqoVar.c.c(), false));
                        return;
                    }
                } catch (ljy unused2) {
                    ((jni) ((jni) eqf.a.f()).j("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostFragment", "lambda$registerResultListeners$5", 359, "MarkAsLostFragment.java")).r("Unable to parse ContactInfo");
                    return;
                }
            case 11:
                if (str.equals("SharingApplicationRequirementsFragmentResult")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle.getSerializable("SharingApplicationRequirementsFragmentResult", etk.class);
                        etkVar = (etk) serializable;
                    } else {
                        etkVar = (etk) bundle.getSerializable("SharingApplicationRequirementsFragmentResult");
                    }
                    eth ethVar = (eth) this.a;
                    etu etuVar = ethVar.e;
                    etk etkVar2 = etk.SUCCESS;
                    etuVar.b();
                    if (etkVar == etkVar2) {
                        lnbVar = lnb.SHARING_APPLICATION_REQUIREMENTS_MET;
                    } else {
                        lnbVar = lnb.SHARING_APPLICATION_REQUIREMENTS_NOT_MET;
                    }
                    etuVar.d(lnbVar);
                    if (etkVar == null) {
                        etkVar = etk.FAILURE;
                    }
                    int ordinal = etkVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 2) {
                            return;
                        }
                        ethVar.H().L();
                        return;
                    }
                    ethVar.an.f(R.string.sharing_application_notification_permission_dialog_body);
                    return;
                }
                return;
            case 12:
                maf mafVar = (maf) this.a;
                if (mafVar.c != null && mafVar.a != null) {
                    if (bundle.getBoolean("NOTIFICATION_PERMISSION_RESULT_FRAGMENT_RESULT_KEY", false)) {
                        Object obj7 = mafVar.a;
                        obj7.getClass();
                        ((pf) obj7).b("android.permission.POST_NOTIFICATIONS");
                        return;
                    } else {
                        ?? r9 = mafVar.c;
                        r9.getClass();
                        r9.a();
                        return;
                    }
                }
                return;
            default:
                exx exxVar = (exx) this.a;
                if (exxVar.d != null && exxVar.c != null) {
                    if (bundle.getBoolean("PERMISSION_RESULT_FRAGMENT_RESULT_KEY", false)) {
                        String[] stringArray = bundle.getStringArray("PERMISSIONS_ARRAY_KEY");
                        stringArray.getClass();
                        exxVar.a(stringArray);
                        return;
                    } else {
                        exw exwVar = exxVar.d;
                        exwVar.getClass();
                        exwVar.a(false);
                        return;
                    }
                }
                return;
        }
    }
}
