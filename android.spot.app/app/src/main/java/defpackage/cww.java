package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cww {
    public cww() {
        new rz();
        new HashMap();
    }

    public static final Network a(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        connectivityManager.getClass();
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
