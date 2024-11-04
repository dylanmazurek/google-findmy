package com.google.ar.core;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EisTransforms {
    private static final int TRANSFORM_SIZE = 9;
    private final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    private EisTransforms(Session session, long j, long j2) {
        this.session = session;
        this.nativeSymbolTableHandle = j;
        this.nativeHandle = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EisTransforms create(Session session) {
        return new EisTransforms(session, session.nativeSymbolTableHandle, nativeCreateEisTransforms(session.nativeWrapperHandle));
    }

    private static native long nativeCreateEisTransforms(long j);

    private static native void nativeDestroyEisTransforms(long j, long j2);

    private native void nativeGetCompensationTransform(long j, long j2, float[] fArr);

    private native void nativeGetHomographyTransform(long j, long j2, float[] fArr);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyEisTransforms(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public float[] getCompensationTransform() {
        float[] fArr = new float[9];
        nativeGetCompensationTransform(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getHomographyTransform() {
        float[] fArr = new float[9];
        nativeGetHomographyTransform(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }
}
