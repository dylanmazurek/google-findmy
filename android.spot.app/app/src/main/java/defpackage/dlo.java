package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dlo implements dln {
    @Override // defpackage.dln
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.dln
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.dln
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.dln
    public final void c() {
    }

    @Override // defpackage.dln
    public final void e(int i) {
    }
}
