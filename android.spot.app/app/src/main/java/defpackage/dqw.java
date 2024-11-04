package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqw implements dix {
    private final List a;
    private final dix b;
    private final dlu c;

    public dqw(List list, dix dixVar, dlu dluVar) {
        this.a = list;
        this.b = dixVar;
        this.c = dluVar;
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, divVar);
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ boolean b(Object obj, div divVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) divVar.b(dqv.b)).booleanValue() && bpx.m(this.a, inputStream, this.c) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
