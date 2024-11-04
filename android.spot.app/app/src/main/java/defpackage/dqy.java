package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqy implements dqz {
    private final dln a;
    private final dqz b;
    private final dqz c;

    public dqy(dln dlnVar, dqz dqzVar, dqz dqzVar2) {
        this.a = dlnVar;
        this.b = dqzVar;
        this.c = dqzVar2;
    }

    @Override // defpackage.dqz
    public final dlf a(dlf dlfVar, div divVar) {
        Drawable drawable = (Drawable) dlfVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(dpr.g(((BitmapDrawable) drawable).getBitmap(), this.a), divVar);
        }
        if (drawable instanceof dqo) {
            return this.c.a(dlfVar, divVar);
        }
        return null;
    }
}
