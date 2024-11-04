package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckk extends mpe implements mon {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckk(Object obj, int i) {
        super(4);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cki, java.lang.Object] */
    @Override // defpackage.mon
    public final /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.b != 0) {
            agt b = ((bkd) this.a).g.b((bip) obj, (biz) obj2);
            if (!(b instanceof bjl)) {
                bso bsoVar = new bso(b, ((bkd) this.a).f);
                ((bkd) this.a).f = bsoVar;
                Object obj5 = bsoVar.a;
                obj5.getClass();
                return (Typeface) obj5;
            }
            Object a = b.a();
            a.getClass();
            return (Typeface) a;
        }
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        sQLiteQuery.getClass();
        this.a.h(new ckr(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
