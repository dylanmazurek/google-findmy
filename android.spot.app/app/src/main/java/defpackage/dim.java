package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dim implements diq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dim(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.diq
    public final ImageHeaderParser$ImageType a(dil dilVar) {
        if (this.b != 0) {
            try {
                return dilVar.a((InputStream) this.a);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return dilVar.b((ByteBuffer) this.a);
        } finally {
            dtd.b((ByteBuffer) this.a);
        }
    }
}
