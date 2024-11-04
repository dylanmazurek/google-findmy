package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzn {
    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static final ckl b(lrs lrsVar, SQLiteDatabase sQLiteDatabase) {
        lrsVar.getClass();
        Object obj = lrsVar.a;
        if (obj != null) {
            ckl cklVar = (ckl) obj;
            if (amr.i(cklVar.d, sQLiteDatabase)) {
                return cklVar;
            }
        }
        ckl cklVar2 = new ckl(sQLiteDatabase);
        lrsVar.a = cklVar2;
        return cklVar2;
    }
}
