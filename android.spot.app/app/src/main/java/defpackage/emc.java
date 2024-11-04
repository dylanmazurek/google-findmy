package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.adm.R;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class emc implements jei {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ emc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [buc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.c) {
            case 0:
                TokenData tokenData = (TokenData) obj;
                ktx ktxVar = new ktx(tokenData.b, fma.i().toEpochMilli(), tokenData.c);
                Object obj2 = this.a;
                Object obj3 = ((eme) obj2).b;
                Object obj4 = this.b;
                synchronized (obj3) {
                    ((eme) obj2).c.put(obj4, ktxVar);
                }
                return ktxVar;
            case 1:
                jer jerVar = (jer) obj;
                boolean g = jerVar.g();
                Object obj5 = this.b;
                if (!g) {
                    Map map = ((lor) this.a).b;
                    if (map.containsKey("deviceIdentifier") && "accountKey".equals(map.get("deviceIdentifierType"))) {
                        dyo dyoVar = (dyo) obj5;
                        jis jisVar = dyoVar.c.c;
                        String str = (String) map.get("deviceIdentifier");
                        str.getClass();
                        jer c = eyf.c(jisVar, str);
                        if (c.g()) {
                            dyoVar.g.h((lqc) c.c());
                            return null;
                        }
                    }
                }
                if (jerVar.g()) {
                    ((dyo) obj5).g.h((lqc) jerVar.c());
                } else {
                    ((jni) ((jni) dyo.b.g()).j("com/google/android/apps/adm/controllers/DeviceListController", "lambda$onDeepLinkReady$1", 320, "DeviceListController.java")).r("Ignoring a deep link as no device type handler can handle it");
                }
                return null;
            case 2:
                enk enkVar = (enk) this.b;
                enkVar.e.c(lnb.SHARING_FINALIZATION_SUCCESS, jdl.a, (lqd) this.a);
                Account b = enkVar.b.b();
                if (b != null && enkVar.a.name.equals(b.name)) {
                    enkVar.c.p();
                }
                return null;
            case 3:
                ((jni) ((jni) ((jni) eod.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "lambda$revokeSharedOwner$3", (char) 218, "SharingManagementViewModel.java")).r("Failed to revoke shared owner");
                eod eodVar = (eod) this.b;
                eodVar.e(lnb.REVOKE_SHARED_OWNER_FAILURE);
                eodVar.i(false);
                Bundle bundle = new Bundle();
                bundle.putString("key_sharing_management_extra", "failed_to_revoke_shared_owner");
                Object obj6 = this.a;
                String str2 = (String) obj6;
                bundle.putString("shared_owner_email", str2);
                eoo eooVar = (eoo) eodVar.e.d();
                int i = R.string.spot_share_device_failed_to_revoke;
                if (eooVar != null && Collection.EL.stream(eooVar.e).anyMatch(new ehc(obj6, 3))) {
                    i = R.string.sharing_application_decline_failure;
                }
                dhx dhxVar = eodVar.i;
                exu a = evj.a();
                a.b = evc.a;
                dhxVar.l(i, bundle, a.e());
                eodVar.k(str2, false);
                return null;
            case 4:
                ((eqk) this.b).h.c(lnb.UPDATE_CONTACT_INFO, jdl.a, (lqd) this.a);
                return null;
            case 5:
                ((jni) ((jni) ((jni) eqk.a.g()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostHandlerImpl", "lambda$updateContactInfo$10", (char) 247, "MarkAsLostHandlerImpl.java")).r("Error updating the contact info.");
                eqk eqkVar = (eqk) this.b;
                eqkVar.d(R.string.snackbar_contact_info_update_error);
                eqkVar.h.c(lnb.UPDATE_CONTACT_INFO_FAILED, jdl.a, (lqd) this.a);
                return null;
            case 6:
                jer jerVar2 = (jer) this.a;
                lqc lqcVar = (lqc) jerVar2.c();
                eqk eqkVar2 = (eqk) this.b;
                lpz a2 = eqkVar2.c.a(lqcVar);
                ljh ljhVar = (ljh) a2.z(5);
                ljhVar.w(a2);
                kyf kyfVar = (kyf) ((jer) obj).c();
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                lpz lpzVar = (lpz) ljhVar.b;
                lpz lpzVar2 = lpz.e;
                lpzVar.b = kyfVar;
                lpzVar.a |= 1;
                ele eleVar = eqkVar2.c;
                lqc lqcVar2 = (lqc) jerVar2.c();
                ljh ljhVar2 = (ljh) lqcVar2.z(5);
                ljhVar2.w(lqcVar2);
                lqc lqcVar3 = (lqc) eleVar.c(ljhVar2, ljhVar).q();
                eqkVar2.b.w((lqc) jerVar2.c(), lqcVar3);
                return lqcVar3;
            case 7:
                jer jerVar3 = (jer) obj;
                Object obj7 = this.a;
                Object obj8 = ((esa) obj7).c;
                Object obj9 = ((gok) this.b).a;
                synchronized (obj8) {
                    jerVar3.getClass();
                    ((esa) obj7).e = jerVar3;
                    ((esa) obj7).d = jer.i(obj9);
                }
                return jerVar3;
            case 8:
                ((jni) ((jni) etb.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/PendingDevicesSharingValidationCodeStateImpl", "lambda$finalizeApprovedSharingApplication$5", 237, "PendingDevicesSharingValidationCodeStateImpl.java")).r("Successfully finalized sharing application");
                etb etbVar = (etb) this.b;
                etbVar.g.c(lnb.SHARING_FINALIZATION_SUCCESS, jdl.a, (lqd) this.a);
                etbVar.b.p();
                return null;
            case 9:
                ((jni) ((jni) ((jni) etb.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/PendingDevicesSharingValidationCodeStateImpl", "lambda$finalizeApprovedSharingApplication$6", (char) 249, "PendingDevicesSharingValidationCodeStateImpl.java")).r("Failed finalizing sharing application");
                Object obj10 = this.b;
                lnb lnbVar = lnb.SHARING_FINALIZATION_FAILURE;
                jdl jdlVar = jdl.a;
                etb etbVar2 = (etb) obj10;
                dxf dxfVar = etbVar2.g;
                Object obj11 = this.a;
                dxfVar.c(lnbVar, jdlVar, (lqd) obj11);
                synchronized (etbVar2.e) {
                    ((etb) obj10).f.put(obj11, etd.a());
                }
                return null;
            case 10:
                Object obj12 = this.b;
                Object obj13 = ((etb) obj12).e;
                String str3 = (String) obj;
                Object obj14 = this.a;
                synchronized (obj13) {
                    ((etb) obj12).g.c(lnb.SHARING_PENDING_CALCULATING_VALIDATION_CODE_SUCCESS, jdl.a, (lqd) obj14);
                    ((etb) obj12).f.put(obj14, etd.b(str3));
                }
                return null;
            case 11:
                ((jni) ((jni) etb.a.f()).j("com/google/android/apps/adm/integrations/spot/sharing/PendingDevicesSharingValidationCodeStateImpl", "lambda$calculateSharingCodeForDevice$3", 202, "PendingDevicesSharingValidationCodeStateImpl.java")).r("Failed calculating a sharing validation code");
                Object obj15 = this.b;
                lnb lnbVar2 = lnb.SHARING_PENDING_CALCULATING_VALIDATION_CODE_FAILURE;
                jdl jdlVar2 = jdl.a;
                etb etbVar3 = (etb) obj15;
                dxf dxfVar2 = etbVar3.g;
                Object obj16 = this.a;
                dxfVar2.c(lnbVar2, jdlVar2, (lqd) obj16);
                synchronized (etbVar3.e) {
                    ((etb) obj15).f.put(obj16, etd.a());
                }
                return null;
            case 12:
                GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) obj;
                Object obj17 = this.a;
                synchronized (((etq) obj17).i) {
                    ((etq) obj17).l = jer.i(getFindMyDeviceSettingsResponse);
                }
                this.b.a(getFindMyDeviceSettingsResponse);
                return null;
            case 13:
                hue hueVar = (hue) obj;
                ljh ljhVar3 = (ljh) hueVar.z(5);
                ljhVar3.w(hueVar);
                ljj ljjVar = (ljj) ljhVar3;
                if (!ljjVar.b.y()) {
                    ljjVar.t();
                }
                Object obj18 = this.a;
                Object obj19 = this.b;
                hue hueVar2 = (hue) ljjVar.b;
                hue hueVar3 = hue.c;
                obj18.getClass();
                hueVar2.b = (nfe) obj18;
                hueVar2.a |= 1;
                hue hueVar4 = (hue) ljjVar.q();
                bqm bqmVar = (bqm) obj19;
                String[] strArr = {bqmVar.b.getClass().getName()};
                Intent intent = new Intent();
                Context context = (Context) bqmVar.d;
                intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                intent.setPackage(context.getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", hueVar4.g());
                context.sendBroadcast(intent);
                return null;
            case 14:
                hwv hwvVar = (hwv) obj;
                ConcurrentMap concurrentMap = hxg.a;
                hwt hwtVar = hwt.d;
                lkl lklVar = hwvVar.a;
                Object obj20 = this.b;
                if (lklVar.containsKey(obj20)) {
                    hwtVar = (hwt) lklVar.get(obj20);
                }
                Object obj21 = this.a;
                ljh ljhVar4 = (ljh) hwtVar.z(5);
                ljhVar4.w(hwtVar);
                if (!Collections.unmodifiableList(((hwt) ljhVar4.b).b).contains(obj21)) {
                    ljhVar4.A((String) obj21);
                }
                ljh ljhVar5 = (ljh) hwvVar.z(5);
                ljhVar5.w(hwvVar);
                if (!ljhVar4.b.y()) {
                    ljhVar4.t();
                }
                hwt hwtVar2 = (hwt) ljhVar4.b;
                hwtVar2.a = 1 | hwtVar2.a;
                hwtVar2.c = (String) obj21;
                ljhVar5.B((String) obj20, (hwt) ljhVar4.q());
                return (hwv) ljhVar5.q();
            case 15:
                ibv ibvVar = (ibv) obj;
                ((ici) this.b).b(ihz.a((String) ((ift) this.a).c.c(), ibvVar.a), ibvVar.b);
                return ibvVar;
            case 16:
                iey ieyVar = (iey) this.b;
                jiy jiyVar = (jiy) obj;
                ieyVar.d.add(this.a);
                ((jni) ((jni) iey.a.e()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess", "handleReadComponentsStateResponse", 251, "MulticomponentEddystoneBleTrackerProcess.java")).u("Component state map: %s", jiyVar);
                iey.b(jiyVar, new iaf(12), new eew(9));
                ieyVar.e |= iey.b(jiyVar, new iaf(13), new ah(ieyVar.l, 19));
                ies iesVar = (ies) jiyVar.get(kyh.DEVICE_COMPONENT_LEFT);
                ies iesVar2 = (ies) jiyVar.get(kyh.DEVICE_COMPONENT_RIGHT);
                if (iesVar == null || iesVar2 == null || !((Boolean) iesVar.a.e(false)).booleanValue() || !((Boolean) iesVar2.a.e(false)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                Uri uri = (Uri) obj;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                intentFilter.addDataScheme(uri.getScheme());
                intentFilter.addDataPath(uri.getPath(), 0);
                intentFilter.addDataPath(ilk.a(uri).getPath(), 0);
                intentFilter.addDataAuthority("*", null);
                ?? r0 = this.a;
                ili iliVar = new ili(r0);
                Object obj22 = this.b;
                if (Build.VERSION.SDK_INT >= 33) {
                    ilk ilkVar = (ilk) obj22;
                    ilkVar.b.registerReceiver(iliVar, intentFilter, ilkVar.d, ilkVar.e, 2);
                } else {
                    ilk ilkVar2 = (ilk) obj22;
                    ilkVar2.b.registerReceiver(iliVar, intentFilter, ilkVar2.d, ilkVar2.e);
                }
                synchronized (((ilk) obj22).j) {
                    ((ilk) obj22).i.o(uri, r0);
                }
                return null;
            default:
                return ((lyt) obj).a((mbg) this.a, (lys) this.b);
        }
    }

    public /* synthetic */ emc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ emc(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }
}
