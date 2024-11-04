package defpackage;

import android.accounts.Account;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dvh implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ dvh(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        lpt lptVar;
        boolean z = false;
        switch (this.a) {
            case 0:
                ((jni) ((jni) ((jni) dvi.a.g()).i((TimeoutException) obj)).j("com/google/android/apps/adm/activities/SettingsLoaderViewModel", "lambda$getSettingsLoadedLiveData$0", 94, "SettingsLoaderViewModel.java")).r("Timed out while waiting for flags initialization");
                return null;
            case 1:
                return ((hjw) obj).a;
            case 2:
                return Long.valueOf(((dvm) obj).c);
            case 3:
                ((jni) ((jni) ((jni) dxf.a.f().h(jop.a, "FmdClearcutLogger")).i((Exception) obj)).j("com/google/android/apps/adm/clearcut/FmdClearcutLoggerImpl", "lambda$logIfOptedInOrPseudonymously$2", 255, "FmdClearcutLoggerImpl.java")).r("Failed checking sWAA status");
                return false;
            case 4:
                int intValue = ((Integer) obj).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    return kyt.FMDN_CONTRIBUTOR_ALL_LOCATIONS;
                                }
                                throw new IllegalStateException(a.ae(intValue, "Unhandled FindMyDeviceNetworkState: "));
                            }
                            return kyt.FMDN_CONTRIBUTOR_HIGH_TRAFFIC;
                        }
                        return kyt.FMDN_ALL_LOCATIONS;
                    }
                    return kyt.FMDN_HIGH_TRAFFIC;
                }
                return kyt.FMDN_DISABLED_DEFAULT;
            case 5:
                ((jni) ((jni) ((jni) dyw.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl", "lambda$maybeCallCallbackOnUiThread$2", (char) 196, "DeepLinkHandlerImpl.java")).r("Failed executing a deep link callback");
                return null;
            case 6:
                return Boolean.valueOf(((dzt) obj).a);
            case 7:
                return ((etb) obj).a();
            case 8:
                return ((eum) obj).a();
            case 9:
                return ((dzb) obj).a;
            case 10:
                return ((Account) obj).name;
            case 11:
                return Boolean.valueOf(bsf.f((lqc) obj));
            case 12:
                return ((dvm) obj).a;
            case 13:
                return ((efa) obj).i();
            case 14:
                return ((dvm) obj).a;
            case 15:
                return hzc.au((lln) obj);
            case 16:
                lqc lqcVar = (lqc) obj;
                if (lqcVar.b == 3) {
                    lptVar = (lpt) lqcVar.c;
                } else {
                    lptVar = lpt.C;
                }
                if ((lptVar.a & 67108864) != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return Boolean.valueOf(!((String) obj).isEmpty());
            case 18:
                return Boolean.valueOf(((String) obj).isEmpty());
            case 19:
                return ((kxz) obj).b;
            default:
                return ((kxz) obj).a;
        }
    }
}
