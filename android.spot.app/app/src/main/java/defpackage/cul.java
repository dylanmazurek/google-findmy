package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cul extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cum a;

    public cul(cum cumVar) {
        this.a = cumVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        ctk a;
        network.getClass();
        networkCapabilities.getClass();
        cqc.b();
        String str = cun.a;
        Objects.toString(networkCapabilities);
        networkCapabilities.toString();
        if (Build.VERSION.SDK_INT >= 28) {
            a = new ctk(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
        } else {
            a = cun.a(this.a.e);
        }
        this.a.f(a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        cqc.b();
        String str = cun.a;
        cum cumVar = this.a;
        cumVar.f(cun.a(cumVar.e));
    }
}
