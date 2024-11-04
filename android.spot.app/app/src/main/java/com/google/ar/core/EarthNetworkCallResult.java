package com.google.ar.core;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EarthNetworkCallResult {
    private final ByteBuffer response;
    private final int responseStatusCode;

    public EarthNetworkCallResult(ByteBuffer byteBuffer, int i) {
        this.response = byteBuffer;
        this.responseStatusCode = i;
    }

    public ByteBuffer getResponse() {
        return this.response;
    }

    public int getResponseStatusCode() {
        return this.responseStatusCode;
    }
}
