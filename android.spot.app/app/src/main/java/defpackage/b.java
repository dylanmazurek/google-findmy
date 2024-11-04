package defpackage;

import android.media.Image;
import com.google.ar.core.ArImage;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class b extends Image.Plane {
    final /* synthetic */ ArImage a;
    private final long b;
    private final int c;

    public b() {
        throw null;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.a;
        return arImage.nativeGetBuffer(arImage.a.nativeWrapperHandle, this.b, this.c).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.a;
        int nativeGetPixelStride = arImage.nativeGetPixelStride(arImage.a.nativeWrapperHandle, this.b, this.c);
        if (nativeGetPixelStride != -1) {
            return nativeGetPixelStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.a;
        int nativeGetRowStride = arImage.nativeGetRowStride(arImage.a.nativeWrapperHandle, this.b, this.c);
        if (nativeGetRowStride != -1) {
            return nativeGetRowStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }

    public b(ArImage arImage, long j, int i) {
        this.a = arImage;
        this.b = j;
        this.c = i;
    }
}
