package com.google.ar.core;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EarthNetworkCallback implements EarthNetworkCallbackInterface {
    private final long nativeHandle;

    public EarthNetworkCallback(long j) {
        this.nativeHandle = j;
    }

    private native void nativeCallback(long j, EarthNetworkCallResult earthNetworkCallResult);

    @Override // com.google.ar.core.EarthNetworkCallbackInterface
    public void run(EarthNetworkCallResult earthNetworkCallResult) {
        nativeCallback(this.nativeHandle, earthNetworkCallResult);
    }
}
