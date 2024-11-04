package defpackage;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezl {
    public static final jnk a = jnk.l("com/google/android/apps/adm/util/UserUtilImpl");
    public final Context b;

    public ezl(Context context) {
        this.b = context;
    }

    public static jer a(CrossProfileApps crossProfileApps) {
        List targetUserProfiles;
        if (crossProfileApps != null) {
            targetUserProfiles = crossProfileApps.getTargetUserProfiles();
            if (!targetUserProfiles.isEmpty()) {
                return jer.i((UserHandle) targetUserProfiles.get(0));
            }
        }
        return jdl.a;
    }

    public final boolean b() {
        UserManager userManager;
        boolean isManagedProfile;
        if (Build.VERSION.SDK_INT >= 30 && (userManager = (UserManager) this.b.getSystemService("user")) != null) {
            isManagedProfile = userManager.isManagedProfile();
            if (isManagedProfile) {
                return true;
            }
        }
        return false;
    }
}
