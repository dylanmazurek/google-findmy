package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flu {
    public static Boolean a = null;
    public static Boolean b = null;
    private static volatile boolean c = false;
    private static Boolean d;
    private static Boolean e;

    public static boolean a(Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        if (d == null) {
            d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        if (!a(context) || a.g()) {
            if (e == null) {
                e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (e.booleanValue()) {
                if (!fma.w() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
