package defpackage;

import android.app.Activity;
import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public class boz {
    public static boolean a(Activity activity, String str) {
        boolean shouldShowRequestPermissionRationale;
        shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
        return shouldShowRequestPermissionRationale;
    }

    public static boolean b(Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "TEMPORARILY_UNMETERED";
                        }
                        return "METERED";
                    }
                    return "NOT_ROAMING";
                }
                return "UNMETERED";
            }
            return "CONNECTED";
        }
        return "NOT_REQUIRED";
    }
}
