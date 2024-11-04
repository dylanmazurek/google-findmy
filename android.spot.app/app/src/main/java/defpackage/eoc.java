package defpackage;

import android.os.Bundle;
import com.google.android.apps.adm.R;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eoc implements jei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eoc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                ((jni) ((jni) eod.a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$relinquishOwnership$5", 262, "SharingManagementViewModel.java")).r("Successfully relinquished device ownership");
                eod eodVar = (eod) this.a;
                eodVar.e(lnb.RELINQUISH_SHARED_OWNERSHIP_SUCCESS);
                eodVar.b.k(eodVar.f);
                return null;
            case 1:
                kyf kyfVar = ((eod) this.a).c.a((lqc) obj).b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kye b = kye.b(kyfVar.k);
                if (b == null) {
                    return kye.UNRECOGNIZED;
                }
                return b;
            case 2:
                ((jni) ((jni) ((jni) eod.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$relinquishOwnership$6", (char) 272, "SharingManagementViewModel.java")).r("Failed to relinquish device ownership");
                eod eodVar2 = (eod) this.a;
                eodVar2.e(lnb.RELINQUISH_SHARED_OWNERSHIP_FAILURE);
                eodVar2.j(false);
                Bundle bundle = new Bundle();
                bundle.putString("key_sharing_management_extra", "failed_to_relinquish");
                exu a = evj.a();
                a.b = evc.a;
                eodVar2.i.l(R.string.spot_share_device_failed_to_relinquish, bundle, a.e());
                return null;
            case 3:
                lae laeVar = (lae) obj;
                ((jni) ((jni) eod.a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$refreshSharedOwners$0", 164, "SharingManagementViewModel.java")).r("Successfully read shared owners");
                eod eodVar3 = (eod) this.a;
                eodVar3.e(lnb.REFRESH_SHARED_OWNERS_LIST_SUCCESS);
                eodVar3.i(false);
                lqd lqdVar = eodVar3.f;
                kyf kyfVar2 = laeVar.b;
                if (kyfVar2 == null) {
                    kyfVar2 = kyf.r;
                }
                eodVar3.h.b(lqdVar, kyfVar2, laeVar.a);
                return null;
            case 4:
                ((jni) ((jni) ((jni) eod.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$refreshSharedOwners$1", (char) 175, "SharingManagementViewModel.java")).r("Failed to read shared owners");
                eod eodVar4 = (eod) this.a;
                eodVar4.e(lnb.REFRESH_SHARED_OWNERS_LIST_FAILURE);
                eodVar4.i(false);
                Bundle bundle2 = new Bundle();
                bundle2.putString("key_sharing_management_extra", "failed_to_refresh_shared_owners");
                exu a2 = evj.a();
                a2.b = evc.a;
                eodVar4.i.l(R.string.spot_share_device_failed_to_refresh, bundle2, a2.e());
                return null;
            case 5:
                lae laeVar2 = (lae) obj;
                ((jni) ((jni) eod.a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$revokeSharedOwner$2", 207, "SharingManagementViewModel.java")).r("Successfully revoked shared owner");
                eod eodVar5 = (eod) this.a;
                eodVar5.e(lnb.REVOKE_SHARED_OWNER_SUCCESS);
                lqd lqdVar2 = eodVar5.f;
                kyf kyfVar3 = laeVar2.b;
                if (kyfVar3 == null) {
                    kyfVar3 = kyf.r;
                }
                eodVar5.h.b(lqdVar2, kyfVar3, laeVar2.a);
                return null;
            case 6:
                ((eqk) this.a).d(R.string.snackbar_contact_info_updated);
                return null;
            case 7:
                ((cfn) this.a).l(new eqg(jdl.a));
                return null;
            case 8:
                eqo eqoVar = (eqo) this.a;
                if (eqoVar.c.g()) {
                    eqoVar.e((kxz) eqoVar.c.c());
                }
                return null;
            case 9:
                ((jni) ((jni) ((jni) etq.a.f()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$turnOnLastKnownLocation$13", 541, "SharingApplicationRequirementsViewModel.java")).r("Failed to turn on last known location");
                etq etqVar = (etq) this.a;
                etqVar.d(lnb.SHARING_APPLICATION_TURN_LAST_KNOWN_LOCATION_ON_FAILURE);
                etqVar.f();
                return null;
            case 10:
                etq etqVar2 = (etq) this.a;
                etqVar2.d(lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_SUCCESS);
                etqVar2.h();
                return null;
            case 11:
                ((jni) ((jni) ((jni) etq.a.f()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$joinFindMyDeviceNetwork$16", 614, "SharingApplicationRequirementsViewModel.java")).r("Failed to join the Find My Device network");
                etq etqVar3 = (etq) this.a;
                etqVar3.e();
                etqVar3.d(lnb.SHARING_APPLICATION_JOIN_FIND_MY_DEVICE_NETWORK_FAILURE);
                etqVar3.f();
                return null;
            case 12:
                ((jni) ((jni) ((jni) etq.a.f()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$readFindMyDeviceSettings$18", 741, "SharingApplicationRequirementsViewModel.java")).r("Failed reading Find My Device settings");
                etq etqVar4 = (etq) this.a;
                etqVar4.d(lnb.SHARING_APPLICATION_READ_FIND_MY_DEVICE_SETTINGS_FAILURE);
                etqVar4.f();
                return null;
            case 13:
                etq etqVar5 = (etq) this.a;
                etqVar5.d(lnb.SHARING_APPLICATION_TURN_ON_LOCATION_SUCCESS);
                etqVar5.k();
                return null;
            case 14:
                ((jni) ((jni) ((jni) etq.a.f()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$turnOnLocation$7", 379, "SharingApplicationRequirementsViewModel.java")).r("Failed to turn on location");
                etq etqVar6 = (etq) this.a;
                etqVar6.d(lnb.SHARING_APPLICATION_TURN_ON_LOCATION_FAILURE);
                etqVar6.f();
                return null;
            case 15:
                boolean z = ((GetKeychainLockScreenKnowledgeFactorSupportResponse) obj).b;
                Object obj2 = this.a;
                if (z) {
                    etq etqVar7 = (etq) obj2;
                    etqVar7.d(lnb.SHARING_APPLICATION_SCREEN_LOCK_NEEDED);
                    etqVar7.f.i(etp.a(etn.SET_UP_SCREEN_LOCK));
                } else {
                    etq etqVar8 = (etq) obj2;
                    etqVar8.d(lnb.SHARING_APPLICATION_SCREEN_LOCK_ALREADY_SET);
                    etqVar8.l(false);
                }
                return null;
            case 16:
                ((jni) ((jni) ((jni) etq.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "lambda$preSetScreenLock$10", (char) 427, "SharingApplicationRequirementsViewModel.java")).r("Failed to get keychain lock screen knowledge factor support");
                etq etqVar9 = (etq) this.a;
                etqVar9.d(lnb.SHARING_APPLICATION_SCREEN_LOCK_CHECK_FAILURE);
                etqVar9.f();
                return null;
            case 17:
                Object obj3 = this.a;
                ((etq) obj3).m(new ah(obj3, 14));
                return null;
            case 18:
                ((etq) this.a).f();
                return null;
            case 19:
                etq etqVar10 = (etq) this.a;
                etqVar10.d(lnb.SHARING_APPLICATION_TURN_LAST_KNOWN_LOCATION_ON_SUCCESS);
                etqVar10.j();
                return null;
            default:
                fhy fhyVar = (fhy) obj;
                etq etqVar11 = (etq) this.a;
                etp a3 = etqVar11.a();
                lnb lnbVar = (lnb) etq.b.get(a3.a);
                if (lnbVar != null) {
                    etqVar11.d(lnbVar);
                }
                cfn cfnVar = etqVar11.f;
                gji gjiVar = new gji(a3);
                gjiVar.d = jer.i(fhyVar.b());
                cfnVar.i(gjiVar.e());
                return null;
        }
    }
}
