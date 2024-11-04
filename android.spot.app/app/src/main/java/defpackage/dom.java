package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dom implements diy {
    private final dln a;
    private final diy b;

    public dom(dln dlnVar, diy diyVar) {
        this.a = dlnVar;
        this.b = diyVar;
    }

    @Override // defpackage.dij
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, div divVar) {
        return this.b.a(new dpr(((BitmapDrawable) ((dlf) obj).c()).getBitmap(), this.a, 1), file, divVar);
    }

    @Override // defpackage.diy
    public final int b() {
        return 2;
    }
}
