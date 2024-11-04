package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.exceptions.FatalException;
import defpackage.b;
import defpackage.c;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ArImage extends c {
    public final Session a;
    long b;
    private final long c;

    public ArImage(Session session, long j) {
        this.a = session;
        this.b = j;
        this.c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j, long j2);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.c, this.b);
        this.b = 0L;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.a.nativeWrapperHandle, this.b);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.a.nativeWrapperHandle, this.b);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.a.nativeWrapperHandle, this.b);
        if (nativeGetNumberOfPlanes != -1) {
            b[] bVarArr = new b[nativeGetNumberOfPlanes];
            for (int i = 0; i < nativeGetNumberOfPlanes; i++) {
                bVarArr[i] = new b(this, this.b, i);
            }
            return bVarArr;
        }
        throw new FatalException("Unknown error in ArImage.getPlanes().");
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.a.nativeWrapperHandle, this.b);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.a.nativeWrapperHandle, this.b);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    public native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    public native int nativeGetPixelStride(long j, long j2, int i);

    public native int nativeGetRowStride(long j, long j2, int i);

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
