package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpi implements diz {
    private final diz b;
    private final boolean c;

    public dpi(diz dizVar, boolean z) {
        this.b = dizVar;
        this.c = z;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.diz
    public final dlf b(Context context, dlf dlfVar, int i, int i2) {
        dln dlnVar = dgo.b(context).a;
        Drawable drawable = (Drawable) dlfVar.c();
        dlf a = dph.a(dlnVar, drawable, i, i2);
        if (a == null) {
            if (!this.c) {
                return dlfVar;
            }
            throw new IllegalArgumentException(der.b(drawable, "Unable to convert ", " to a Bitmap"));
        }
        dlf b = this.b.b(context, a, i, i2);
        if (b.equals(a)) {
            b.e();
            return dlfVar;
        }
        return dpr.f(context.getResources(), b);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dpi) {
            return this.b.equals(((dpi) obj).b);
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return this.b.hashCode();
    }
}
