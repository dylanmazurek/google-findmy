package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckl implements ckd {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final mkt b = mkm.a(3, bcf.o);
    public static final mkt c = mkm.a(3, bcf.n);

    public ckl(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.ckd
    public final Cursor a(cki ckiVar) {
        final ckk ckkVar = new ckk(ckiVar, 0);
        Cursor rawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ckj
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, android.database.Cursor] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = ckl.a;
                return mon.this.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ckiVar.b(), e, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.ckd
    public final Cursor b(String str) {
        return a(new ckc(str));
    }

    @Override // defpackage.ckd
    public final String c() {
        return this.d.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.ckd
    public final void d() {
        this.d.beginTransaction();
    }

    @Override // defpackage.ckd
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.ckd
    public final void f() {
        this.d.endTransaction();
    }

    @Override // defpackage.ckd
    public final void g(String str) {
        this.d.execSQL(str);
    }

    @Override // defpackage.ckd
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.ckd
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override // defpackage.ckd
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override // defpackage.ckd
    public final cks k(String str) {
        SQLiteStatement compileStatement = this.d.compileStatement(str);
        compileStatement.getClass();
        return new cks(compileStatement);
    }

    @Override // defpackage.ckd
    public final void l(Object[] objArr) {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
