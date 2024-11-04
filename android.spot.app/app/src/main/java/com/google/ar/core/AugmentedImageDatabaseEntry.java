package com.google.ar.core;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AugmentedImageDatabaseEntry {
    final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabaseEntry(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native long nativeCreateFromImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private static native long nativeCreateWithAspectRatio(long j, float f);

    private static native long nativeDeserialize(long j, ByteBuffer byteBuffer);

    private native String nativeGetName(long j, long j2);

    private native float nativeGetWidthInMeters(long j, long j2);

    private static native void nativeRelease(long j, long j2);

    private native void nativeSetDetectedRegionAtTime(long j, long j2, long j3, Object obj, int i);

    private native void nativeSetName(long j, long j2, String str);

    private native void nativeSetWidthInMeters(long j, long j2, float f);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeRelease(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public String getName() {
        return nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getWidthInMeters() {
        return nativeGetWidthInMeters(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public AugmentedImageDatabaseEntry setDetectedRegionAtTime(long j, float[] fArr, Coordinates2d coordinates2d) {
        nativeSetDetectedRegionAtTime(this.session.nativeWrapperHandle, this.nativeHandle, j, fArr, coordinates2d.nativeCode);
        return this;
    }

    public AugmentedImageDatabaseEntry setName(String str) {
        nativeSetName(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public AugmentedImageDatabaseEntry setWidthInMeters(float f) {
        nativeSetWidthInMeters(this.session.nativeWrapperHandle, this.nativeHandle, f);
        return this;
    }

    public AugmentedImageDatabaseEntry(Session session, float f) {
        this.session = session;
        this.nativeHandle = nativeCreateWithAspectRatio(session.nativeWrapperHandle, f);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public AugmentedImageDatabaseEntry(Session session, Bitmap bitmap) {
        this.session = session;
        this.nativeHandle = nativeCreateFromImage(session.nativeWrapperHandle, AugmentedImageDatabase.convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public AugmentedImageDatabaseEntry(Session session, ByteBuffer byteBuffer) {
        this.session = session;
        this.nativeHandle = nativeDeserialize(session.nativeWrapperHandle, byteBuffer);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
