package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehm {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/superviseddevices/SupervisedAndroidDeviceInfoHandlerImpl");
    private final Context b;
    private final ewg c;

    public ehm(Context context, ewg ewgVar) {
        ewgVar.getClass();
        this.b = context;
        this.c = ewgVar;
    }

    public final void a(lqc lqcVar) {
        lpt lptVar;
        String str;
        lqcVar.getClass();
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (bsg.i(lqdVar)) {
            if (lqcVar.b == 3) {
                lptVar = (lpt) lqcVar.c;
            } else {
                lptVar = lpt.C;
            }
            lptVar.getClass();
            lqa ak = hzc.ak(lptVar);
            if (ak != null) {
                str = ak.a;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                try {
                    Context context = this.b;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(intent.getFlags() + 268435456);
                    context.startActivity(intent);
                    this.c.u(true);
                    return;
                } catch (ActivityNotFoundException e) {
                    ((jni) ((jni) a.f()).i(e).j("com/google/android/apps/adm/integrations/android/superviseddevices/SupervisedAndroidDeviceInfoHandlerImpl", "launchDeviceInfo", 46, "SupervisedAndroidDeviceInfoHandler.kt")).r("Failed to launch supervised device info page.");
                    return;
                }
            }
            ((jni) a.f().j("com/google/android/apps/adm/integrations/android/superviseddevices/SupervisedAndroidDeviceInfoHandlerImpl", "launchDeviceInfo", 35, "SupervisedAndroidDeviceInfoHandler.kt")).r("Received a supervised device without a device info URL.");
            return;
        }
        throw new IllegalArgumentException("Can't launch device info for non-supervised Android device.");
    }
}
