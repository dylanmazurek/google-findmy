package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import com.google.android.apps.adm.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dyd implements pd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dyd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v35, types: [pd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v83, types: [java.lang.Object, exr] */
    @Override // defpackage.pd
    public final void a(Object obj) {
        int i;
        Object obj2;
        boolean z = true;
        switch (this.b) {
            case 0:
                dyh dyhVar = (dyh) this.a;
                if (!dyhVar.c.c()) {
                    ((ebf) dyhVar.d.a()).a.finish();
                    return;
                }
                return;
            case 1:
                ((DevicePolicyManager) ((Activity) ((bym) this.a).a).getSystemService("device_policy")).isAdminActive(new ComponentName("com.google.android.gms", "com.google.android.gms.mdm.receivers.MdmDeviceAdminReceiver"));
                return;
            case 2:
                if (((pc) obj).a == -1) {
                    ((dyo) this.a).g();
                    return;
                }
                return;
            case 3:
                int i2 = ((pc) obj).a;
                Object obj3 = this.a;
                if (i2 != -1) {
                    ((ejo) obj3).e();
                    return;
                }
                ejo ejoVar = (ejo) obj3;
                ddg ddgVar = ejoVar.j;
                Object obj4 = ejoVar.d;
                gok C = ddgVar.C();
                synchronized (obj4) {
                    if (((ejo) obj3).c.g()) {
                        i = ((Integer) ((ejo) obj3).c.c()).intValue();
                    } else {
                        ((jni) ((jni) ejo.a.g()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "onKeychainActivityResult", 329, "OwnerKeyHandler.java")).r("Missing owner key to retrieve after returning from Keychain UI.");
                        jer b = ((ejo) obj3).b();
                        if (!b.g()) {
                            ((jni) ((jni) ejo.a.f()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "onKeychainActivityResult", 332, "OwnerKeyHandler.java")).r("No current device selected, skipping import.");
                            return;
                        }
                        kyq kyqVar = ((kyf) b.c()).f;
                        if (kyqVar == null) {
                            kyqVar = kyq.g;
                        }
                        if (kyqVar.b == 3) {
                            i = ((Integer) kyqVar.c).intValue();
                        } else {
                            i = 0;
                        }
                    }
                    ((ejo) obj3).b = jdl.a;
                    ijp.a(jbx.d(C.A(ejoVar.k.v(i))).e(new dyv(obj3, 9), (Executor) ejoVar.f.a()).b(Throwable.class, new eji(obj3, 4), (Executor) ejoVar.f.a()), "Owner key import failed after Keychain succeeded.", new Object[0]);
                    return;
                }
            case 4:
                if (((pc) obj).a != -1) {
                    z = false;
                }
                this.a.a(Boolean.valueOf(z));
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                Object obj5 = this.a;
                if (bool != null && bool.booleanValue()) {
                    emx emxVar = (emx) obj5;
                    if (emxVar.k == 2) {
                        emxVar.n.m(R.string.spot_bluetooth_turned_on);
                        return;
                    }
                    return;
                }
                emx emxVar2 = (emx) obj5;
                emxVar2.k = 3;
                emxVar2.n.m(R.string.spot_bluetooth_failed_to_turn_on);
                emxVar2.m.j();
                return;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.a;
                if (booleanValue) {
                    emx emxVar3 = (emx) obj6;
                    emxVar3.h = jdl.a;
                    emxVar3.m.j();
                    emxVar3.n.m(R.string.spot_location_turned_on);
                    return;
                }
                ((emx) obj6).n.m(R.string.spot_location_not_turned_on);
                return;
            case 7:
                ((epj) this.a).o(((Boolean) obj).booleanValue());
                return;
            case 8:
                ((epj) this.a).p(((Boolean) obj).booleanValue());
                return;
            case 9:
                pc pcVar = (pc) obj;
                etu etuVar = ((eth) this.a).e;
                etuVar.b();
                ets etsVar = (ets) etuVar.c.d();
                etsVar.getClass();
                jer jerVar = etsVar.a;
                if (!jerVar.g()) {
                    ((jni) ((jni) etu.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "onOwnerKeySynced", 164, "SharingApplicationViewModel.java")).r("Unexpectedly owner key synced without device details");
                    return;
                }
                if (pcVar.a == -1) {
                    etuVar.d(lnb.SHARING_APPLICATION_OWNER_KEY_RESOLUTION_SUCCESS);
                    etuVar.c.l(ets.a((etr) jerVar.c()));
                    etuVar.a((etr) jerVar.c());
                    return;
                } else {
                    etuVar.d(lnb.SHARING_APPLICATION_OWNER_KEY_RESOLUTION_FAILURE);
                    etuVar.e();
                    return;
                }
            case 10:
                pc pcVar2 = (pc) obj;
                etj etjVar = (etj) this.a;
                etq etqVar = etjVar.d;
                eto etoVar = etjVar.af;
                etp a = etqVar.a();
                if (pcVar2.a != -1) {
                    ((jni) ((jni) etq.a.f()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "onResolutionResult", 656, "SharingApplicationRequirementsViewModel.java")).w("Resolution returned result %d for state %s", pcVar2.a, a.a);
                    lnb lnbVar = (lnb) etq.c.get(a.a);
                    if (lnbVar != null) {
                        etqVar.d(lnbVar);
                    }
                    cfn cfnVar = etqVar.f;
                    gji gjiVar = new gji(etqVar.a());
                    gjiVar.f(false);
                    cfnVar.i(gjiVar.e());
                    return;
                }
                switch (a.a) {
                    case USE_RESPONSIBLY:
                    case SET_UP_SCREEN_LOCK:
                    case TURN_ON_FIND_MY_DEVICE:
                    case TERMINATED:
                        ((jni) ((jni) etq.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "onResolutionResult", 681, "SharingApplicationRequirementsViewModel.java")).u("Unexpected successful resolution result for state %s", a.a);
                        return;
                    case TURN_ON_LOCATION:
                        etqVar.d(lnb.SHARING_APPLICATION_TURN_ON_LOCATION_SUCCESS);
                        etqVar.k();
                        return;
                    case TURN_ON_LAST_KNOWN_LOCATION:
                        etqVar.n(etoVar);
                        return;
                    case JOIN_FIND_MY_DEVICE_NETWORK:
                        etqVar.b(etoVar);
                        return;
                    default:
                        return;
                }
            case 11:
                etq etqVar2 = ((etj) this.a).d;
                etqVar2.d(lnb.SHARING_APPLICATION_SCREEN_LOCK_SET);
                etqVar2.k();
                return;
            case 12:
                ((Boolean) obj).booleanValue();
                this.a.a();
                return;
            default:
                Iterator it = ((Map) obj).values().iterator();
                do {
                    obj2 = this.a;
                    if (!it.hasNext()) {
                        exw exwVar = ((exx) obj2).d;
                        exwVar.getClass();
                        exwVar.a(true);
                        return;
                    }
                } while (((Boolean) it.next()).booleanValue());
                exw exwVar2 = ((exx) obj2).d;
                exwVar2.getClass();
                exwVar2.a(false);
                return;
        }
    }
}
