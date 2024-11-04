package com.google.ar.core;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AugmentedRegion {
    private static final String TAG = "ARCore-AugmentedRegion";
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final int numberOfVertices;
    private final Session session;

    public AugmentedRegion(long j, Session session) {
        this.nativeHandle = j;
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.numberOfVertices = nativeGetNumberOfVertices(session.nativeWrapperHandle, j);
    }

    private native int nativeGetNumberOfVertices(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native void nativeGetVertices(long j, long j2, Object obj);

    private native void nativeReleaseAugmentedRegion(long j, long j2);

    private native void nativeStop(long j, long j2);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAugmentedRegion(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public int getNumberOfVertices() {
        return this.numberOfVertices;
    }

    public TrackingState getState() {
        return TrackingState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float[] getVertices() {
        Session session = this.session;
        int i = this.numberOfVertices;
        float[] fArr = new float[i + i];
        nativeGetVertices(session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public void stop() {
        nativeStop(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getVertices(FloatBuffer floatBuffer) {
        nativeGetVertices(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer);
    }
}
