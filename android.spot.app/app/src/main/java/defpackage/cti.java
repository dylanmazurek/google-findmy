package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cti extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ muf a;
    final /* synthetic */ mwi b;

    public cti(muf mufVar, mwi mwiVar) {
        this.a = mufVar;
        this.b = mwiVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.a.s(null);
        cqc.b();
        long j = ctr.a;
        this.b.j((Object) ctg.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.s(null);
        cqc.b();
        long j = ctr.a;
        this.b.j((Object) new cth(7));
    }
}
