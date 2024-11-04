package defpackage;

import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwz {
    public static final cwz a = new cwz();

    private cwz() {
    }

    public final int[] a(NetworkRequest networkRequest) {
        int[] capabilities;
        networkRequest.getClass();
        capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public final int[] b(NetworkRequest networkRequest) {
        int[] transportTypes;
        networkRequest.getClass();
        transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}
