package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqx implements dqz {
    private final /* synthetic */ int a;
    private final Object b;

    public dqx(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.dqz
    public final dlf a(dlf dlfVar, div divVar) {
        if (this.a != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((Bitmap) dlfVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
            dlfVar.e();
            return new dqg(byteArrayOutputStream.toByteArray(), 0);
        }
        return dpr.f((Resources) this.b, dlfVar);
    }

    public dqx(Resources resources, int i) {
        this.a = i;
        bsc.q(resources);
        this.b = resources;
    }
}
