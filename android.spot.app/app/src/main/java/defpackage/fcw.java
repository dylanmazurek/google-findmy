package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcw extends fdd {
    final /* synthetic */ fcy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcw(fcy fcyVar, fcn fcnVar) {
        super(fcnVar);
        this.a = fcyVar;
    }

    @Override // defpackage.fdd
    public final void a() {
        fcy fcyVar = this.a;
        try {
            fct fctVar = fcyVar.b;
            fbm.b();
            fctVar.H();
            if (fctVar.d.c(86400000L)) {
                fctVar.d.b();
                fctVar.y("Deleting stale hits (if any)");
                SQLiteDatabase c = fctVar.c();
                fctVar.G();
                fctVar.z("Deleted stale hits, count", Integer.valueOf(c.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
            }
            fcyVar.L();
        } catch (SQLiteException e) {
            fcyVar.C("Failed to delete stale hits", e);
        }
        fdd fddVar = fcyVar.e;
        fcyVar.k();
        fddVar.d(86400000L);
    }
}
