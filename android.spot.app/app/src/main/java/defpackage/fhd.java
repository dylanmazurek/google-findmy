package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhd {
    static boolean a = false;
    public static final /* synthetic */ int c = 0;
    private static boolean d = false;

    @Deprecated
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhd.b(android.content.Context, int):int");
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) {
        int g = fgq.d.g(context, i);
        if (g != 0) {
            Intent h = fgq.d.h(context, g, "e");
            Log.e("GooglePlayServicesUtil", a.ae(g, "GooglePlayServices not available due to error "));
            if (h == null) {
                throw new fhb();
            }
            throw new fhc("Google Play Services not available", h);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!a) {
                PackageInfo y = fme.b(context).y("com.google.android.gms", 64);
                fhe.a(context);
                if (y != null && !fhe.c(y, false) && fhe.c(y, true)) {
                    d = true;
                } else {
                    d = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            a = true;
        }
        if (!d && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean f(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return h(context);
        }
        return false;
    }

    @Deprecated
    public static boolean g(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 9) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public static void i(int i, Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        if (true == f(activity, i)) {
            i = 18;
        }
        fgp.a.e(activity, i, 0, onCancelListener);
    }
}
