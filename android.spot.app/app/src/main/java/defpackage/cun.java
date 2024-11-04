package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cun {
    public static final String a = cqc.a("NetworkStateTracker");

    public static final ctk a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities a2;
        boolean c;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a2 = cwv.a(connectivityManager, cww.a(connectivityManager));
            } catch (SecurityException e) {
                cqc.b();
                Log.e(a, "Unable to validate active network", e);
            }
            if (a2 != null) {
                c = cwv.c(a2, 16);
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new ctk(z, c, isActiveNetworkMetered, z2);
            }
        }
        c = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z2 = false;
        return new ctk(z, c, isActiveNetworkMetered2, z2);
    }
}
