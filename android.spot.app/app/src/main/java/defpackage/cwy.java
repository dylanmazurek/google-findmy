package defpackage;

import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwy {
    public static final cwy a = new cwy();

    private cwy() {
    }

    public static final NetworkRequest a(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            builder.addCapability(i);
        }
        for (int i2 : iArr2) {
            builder.addTransportType(i2);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return build;
    }

    public final cxa b(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        return new cxa(a(iArr, iArr2));
    }

    public final boolean c(NetworkRequest networkRequest, int i) {
        boolean hasCapability;
        networkRequest.getClass();
        hasCapability = networkRequest.hasCapability(i);
        return hasCapability;
    }

    public final boolean d(NetworkRequest networkRequest, int i) {
        boolean hasTransport;
        networkRequest.getClass();
        hasTransport = networkRequest.hasTransport(i);
        return hasTransport;
    }
}
