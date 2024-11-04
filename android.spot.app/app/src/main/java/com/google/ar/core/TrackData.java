package com.google.ar.core;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TrackData {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public TrackData(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private native ByteBuffer nativeGetData(long j, long j2);

    private native long nativeGetFrameTimestamp(long j, long j2);

    private static native void nativeReleaseTrackData(long j, long j2);

    private void release() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseTrackData(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
    }

    public void close() {
        release();
    }

    protected void finalize() {
        release();
        super.finalize();
    }

    public ByteBuffer getData() {
        return nativeGetData(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public long getFrameTimestamp() {
        return nativeGetFrameTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
