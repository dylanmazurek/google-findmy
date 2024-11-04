package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class don implements diy {
    public static final diu a = new diu("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, diu.a);
    public static final diu b = new diu("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, diu.a);
    private final dlu c;

    @Deprecated
    public don() {
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // defpackage.dij
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, div divVar) {
        FileOutputStream fileOutputStream;
        boolean z = (Bitmap) ((dlf) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) divVar.b(b);
        if (compressFormat == null) {
            if (z.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        z.getWidth();
        z.getHeight();
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) divVar.b(a)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                dlu dluVar = this.c;
                if (dluVar != null) {
                    outputStream = new djc(fileOutputStream, dluVar);
                } else {
                    outputStream = fileOutputStream;
                }
                z.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                z = 1;
                outputStream.close();
            } catch (IOException unused2) {
                outputStream = fileOutputStream;
                z = 0;
                z = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
        return z;
    }

    @Override // defpackage.diy
    public final int b() {
        return 2;
    }

    public don(dlu dluVar) {
        this.c = dluVar;
    }
}
