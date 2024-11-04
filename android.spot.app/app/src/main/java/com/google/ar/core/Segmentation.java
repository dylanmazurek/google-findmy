package com.google.ar.core;

import android.media.Image;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Segmentation {
    private static final String TAG = "ARCore-Segmentation";
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public Segmentation(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private native long nativeAcquirePersonMask(long j, long j2);

    private native void nativeReleaseSegmentation(long j, long j2);

    public Image acquirePersonMask() {
        return new ArImage(this.session, nativeAcquirePersonMask(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseSegmentation(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }
}
