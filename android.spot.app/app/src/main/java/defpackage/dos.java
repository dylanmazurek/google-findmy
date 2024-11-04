package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dos extends dop {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.dop
    protected final Bitmap c(dln dlnVar, Bitmap bitmap, int i, int i2) {
        Paint paint = dpx.a;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            return bitmap;
        }
        return dpx.c(dlnVar, bitmap, i, i2);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        return obj instanceof dos;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return -670243078;
    }
}
