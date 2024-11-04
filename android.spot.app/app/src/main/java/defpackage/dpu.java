package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpu implements dpe {
    private final dpt a;
    private final dtg b;

    public dpu(dpt dptVar, dtg dtgVar) {
        this.a = dptVar;
        this.b = dtgVar;
    }

    @Override // defpackage.dpe
    public final void a(dln dlnVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                dlnVar.d(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // defpackage.dpe
    public final void b() {
        this.a.a();
    }
}
