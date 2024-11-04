package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iky implements ijv {
    public lyn[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [ikz, java.lang.Object] */
    @Override // defpackage.ijv
    public final /* bridge */ /* synthetic */ Object a(kqr kqrVar) {
        List c = kqrVar.c(kqrVar.e.d((Uri) kqrVar.c));
        lyn[] lynVarArr = this.a;
        if (lynVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                lynVarArr[i].m(c);
            }
        }
        return (OutputStream) c.get(0);
    }
}
