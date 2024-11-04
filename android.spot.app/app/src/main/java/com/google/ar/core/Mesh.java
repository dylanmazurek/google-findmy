package com.google.ar.core;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Mesh {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public Mesh(long j, Session session) {
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.nativeHandle = j;
    }

    private native ByteBuffer nativeGetIndexList(long j, long j2);

    private native int nativeGetIndexListSize(long j, long j2);

    private native ByteBuffer nativeGetVertexList(long j, long j2);

    private native int nativeGetVertexListSize(long j, long j2);

    public IntBuffer getIndexList() {
        return Session.directByteBufferOrDefault(nativeGetIndexList(this.session.nativeWrapperHandle, this.nativeHandle)).asIntBuffer();
    }

    public int getIndexListSize() {
        return nativeGetIndexListSize(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public FloatBuffer getVertexList() {
        return Session.directByteBufferOrDefault(nativeGetVertexList(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
    }

    public int getVertexListSize() {
        return nativeGetVertexListSize(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
