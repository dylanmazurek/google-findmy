package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doo implements dix {
    private final dln a = new dlo();

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        return c(he$$ExternalSyntheticApiModelOutline0.m123m(obj), i, i2, divVar);
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ boolean b(Object obj, div divVar) {
        he$$ExternalSyntheticApiModelOutline0.m123m(obj);
        return true;
    }

    public final dlf c(ImageDecoder.Source source, int i, int i2, div divVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new doi(i, i2, divVar));
        return new dpr(decodeBitmap, this.a, 1);
    }
}
