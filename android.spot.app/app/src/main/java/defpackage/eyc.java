package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyc extends cfk {
    final /* synthetic */ Context a;
    final /* synthetic */ ConnectivityManager h;
    private ConnectivityManager.NetworkCallback i;

    public eyc(Context context, ConnectivityManager connectivityManager) {
        this.a = context;
        this.h = connectivityManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void b() {
        if (this.i == null) {
            this.i = new eyb(this);
        }
        this.h.registerNetworkCallback(new NetworkRequest.Builder().build(), this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void c() {
        ConnectivityManager.NetworkCallback networkCallback = this.i;
        if (networkCallback != null) {
            this.h.unregisterNetworkCallback(networkCallback);
        }
    }
}
