package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsr extends dsv {
    public dsr(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.dsv
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ImageView) this.a).setImageBitmap((Bitmap) obj);
    }
}
