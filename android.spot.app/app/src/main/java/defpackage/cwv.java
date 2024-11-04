package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwv {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        connectivityManager.getClass();
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final void b(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public static final boolean c(NetworkCapabilities networkCapabilities, int i) {
        networkCapabilities.getClass();
        return networkCapabilities.hasCapability(i);
    }

    public static final int d(WorkDatabase workDatabase, String str) {
        int i;
        Long a = workDatabase.x().a(str);
        int i2 = 0;
        if (a != null) {
            i = (int) a.longValue();
        } else {
            i = 0;
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i + 1;
        }
        e(workDatabase, str, i2);
        return i;
    }

    public static final void e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.x().b(new cuz(str, Long.valueOf(i)));
    }
}
