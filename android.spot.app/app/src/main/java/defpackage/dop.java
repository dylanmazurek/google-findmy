package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dop implements diz {
    @Override // defpackage.diz
    public final dlf b(Context context, dlf dlfVar, int i, int i2) {
        if (dtq.l(i, i2)) {
            dln dlnVar = dgo.b(context).a;
            Bitmap bitmap = (Bitmap) dlfVar.c();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(dlnVar, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return dlfVar;
            }
            return dpr.g(c, dlnVar);
        }
        throw new IllegalArgumentException(a.aj(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    protected abstract Bitmap c(dln dlnVar, Bitmap bitmap, int i, int i2);
}
