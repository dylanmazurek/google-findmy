package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpk extends dop {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.dop
    protected final Bitmap c(dln dlnVar, Bitmap bitmap, int i, int i2) {
        return dpx.c(dlnVar, bitmap, i, i2);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        return obj instanceof dpk;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return 1572326941;
    }
}
