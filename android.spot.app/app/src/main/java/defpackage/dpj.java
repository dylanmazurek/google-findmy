package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpj implements dil {
    @Override // defpackage.dil
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.dil
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.dil
    public final int c(InputStream inputStream, dlu dluVar) {
        cdl cdlVar = new cdl(inputStream);
        cdj a = cdlVar.a("Orientation");
        int i = 1;
        if (a != null) {
            try {
                i = a.a(cdlVar.i);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.dil
    public final int d(ByteBuffer byteBuffer, dlu dluVar) {
        int i = dtd.a;
        return c(new dtc(byteBuffer), dluVar);
    }
}
