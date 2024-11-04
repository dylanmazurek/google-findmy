package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dru extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ drv a;

    public dru(drv drvVar) {
        this.a = drvVar;
    }

    private final void a(boolean z) {
        dtq.h(new drx(this, z, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
