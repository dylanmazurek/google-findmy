package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eil implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ eil(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        switch (this.a) {
            case 0:
                ((jni) ((jni) ((jni) eim.a.g()).i((fho) obj)).j("com/google/android/apps/adm/integrations/spot/FindMyDeviceNetworkPreferenceManager", "lambda$updateFmdnStatus$2", 162, "FindMyDeviceNetworkPreferenceManager.java")).r("API not available.");
                return null;
            case 1:
                return Boolean.valueOf(!((String) obj).isEmpty());
            case 2:
                eit eitVar = eit.c;
                if (((Long) obj).longValue() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((jni) ((jni) ((jni) ejg.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/LocateActionHandler", "lambda$executeAction$1", (char) 165, "LocateActionHandler.java")).r("Failed reading network status");
                return null;
            case 4:
                jnk jnkVar = ejg.a;
                return ((mcn) obj).c;
            case 5:
                jnk jnkVar2 = ejg.a;
                return Boolean.valueOf(!((kzb) obj).d.isEmpty());
            case 6:
                ((jni) ((jni) ((jni) ejj.a.g()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/LocationUploader", "lambda$uploadAggregatedLocation$2", 116, "LocationUploader.java")).r("uploadAggregatedLocation failed");
                return lai.a;
            case 7:
                return null;
            case 8:
                kyf kyfVar = ((kyw) obj).a;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kyq kyqVar = kyfVar.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                if (kyqVar.b == 3) {
                    i = ((Integer) kyqVar.c).intValue();
                }
                return Integer.valueOf(i);
            case 9:
                lqd lqdVar = ((lqc) obj).d;
                if (lqdVar == null) {
                    return lqd.d;
                }
                return lqdVar;
            case 10:
                lqd lqdVar2 = ((lqc) obj).d;
                if (lqdVar2 == null) {
                    return lqd.d;
                }
                return lqdVar2;
            case 11:
                return ((dvm) obj).a;
            case 12:
                kzb kzbVar = (kzb) obj;
                int i2 = kzbVar.a;
                if ((i2 & 1) != 0 && (i2 & 2) != 0) {
                    return jer.i(kzbVar);
                }
                return jdl.a;
            case 13:
                if (((ejn) obj) == ejn.IN_SYNC) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 14:
                lqd lqdVar3 = ((lqc) obj).d;
                if (lqdVar3 == null) {
                    return lqd.d;
                }
                return lqdVar3;
            case 15:
                return ((eix) ((Parcelable) obj)).a();
            case 16:
                return null;
            case 17:
                return jdl.a;
            case 18:
                fhy fhyVar = (fhy) obj;
                if (fhyVar.a() != 6) {
                    ((jni) ((jni) emx.a.g()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothSettingsImpl", "lambda$checkLocationSettings$3", 321, "BluetoothSettingsImpl.java")).s("Location settings not satisfied, but resolution unavailable: %d", fhyVar.a());
                    return jdl.a;
                }
                return jer.i(fhyVar);
            case 19:
                ((jni) ((jni) ((jni) emx.a.g()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothSettingsImpl", "lambda$checkLocationSettings$4", (char) 332, "BluetoothSettingsImpl.java")).r("Unexpected location settings response.");
                return jdl.a;
            default:
                return ((jbw) obj).f();
        }
    }
}
