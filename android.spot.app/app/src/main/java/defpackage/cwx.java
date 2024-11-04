package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwx {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static final float b(cyb cybVar, day dayVar, float f) {
        if (f < 0.0f && cybVar == null) {
            return 1.0f;
        }
        if (cybVar != null) {
            if (f < 0.0f) {
                if (dayVar == null) {
                    return 1.0f;
                }
                return dayVar.a(cybVar);
            }
            if (dayVar != null) {
                return dayVar.b(cybVar);
            }
        }
        return 0.0f;
    }
}
