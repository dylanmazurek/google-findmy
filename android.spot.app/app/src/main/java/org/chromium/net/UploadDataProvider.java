package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class UploadDataProvider implements Closeable {
    public abstract long getLength();

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer);

    public abstract void rewind(UploadDataSink uploadDataSink);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
