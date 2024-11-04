package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ eyc a;

    public eyb(eyc eycVar) {
        this.a = eycVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        eyc eycVar = this.a;
        eycVar.i(Boolean.valueOf(fma.bP(eycVar.a)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        eyc eycVar = this.a;
        eycVar.i(Boolean.valueOf(fma.bP(eycVar.a)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        eyc eycVar = this.a;
        eycVar.i(Boolean.valueOf(fma.bP(eycVar.a)));
    }
}
