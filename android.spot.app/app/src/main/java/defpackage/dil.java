package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface dil {
    ImageHeaderParser$ImageType a(InputStream inputStream);

    ImageHeaderParser$ImageType b(ByteBuffer byteBuffer);

    int c(InputStream inputStream, dlu dluVar);

    int d(ByteBuffer byteBuffer, dlu dluVar);
}
