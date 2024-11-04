package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqr implements diz {
    private final diz b;

    public dqr(diz dizVar) {
        bsc.q(dizVar);
        this.b = dizVar;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.diz
    public final dlf b(Context context, dlf dlfVar, int i, int i2) {
        dqo dqoVar = (dqo) dlfVar.c();
        dlf dprVar = new dpr(dqoVar.a(), dgo.b(context).a, 1);
        dlf b = this.b.b(context, dprVar, i, i2);
        if (!dprVar.equals(b)) {
            dprVar.e();
        }
        Bitmap bitmap = (Bitmap) b.c();
        dqoVar.a.a.e(this.b, bitmap);
        return dlfVar;
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dqr) {
            return this.b.equals(((dqr) obj).b);
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return this.b.hashCode();
    }
}
