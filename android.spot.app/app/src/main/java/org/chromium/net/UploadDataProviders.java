package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.moz;
import defpackage.nls;
import defpackage.nlt;
import defpackage.nlv;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new nlv(new nls(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new nlv(new nls(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new nlt(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return moz.aH(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return moz.aH(bArr, i, i2);
    }
}
