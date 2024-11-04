package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drv implements drt {
    boolean a;
    final drc b;
    private final dtk c;
    private final ConnectivityManager.NetworkCallback d = new dru(this);

    public drv(dtk dtkVar, drc drcVar) {
        this.c = dtkVar;
        this.b = drcVar;
    }

    @Override // defpackage.drt
    public final void a() {
        ((ConnectivityManager) this.c.a()).unregisterNetworkCallback(this.d);
    }

    @Override // defpackage.drt
    public final boolean b() {
        Network activeNetwork;
        boolean z;
        activeNetwork = ((ConnectivityManager) this.c.a()).getActiveNetwork();
        if (activeNetwork != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        try {
            ((ConnectivityManager) this.c.a()).registerDefaultNetworkCallback(this.d);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }
}
