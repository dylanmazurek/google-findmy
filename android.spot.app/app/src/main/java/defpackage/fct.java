package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fct extends fcl implements Closeable {
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final fdv d;
    public final fdv e;
    private final fcs f;

    public fct(fcn fcnVar) {
        super(fcnVar);
        G();
        this.d = new fdv();
        G();
        this.e = new fdv();
        d();
        this.f = new fcs(this, fcnVar.a);
    }

    final Map K(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = a.ao(str, "?");
            }
            return flx.a(new URI(str));
        } catch (URISyntaxException e) {
            v("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    public final void L() {
        H();
        c().beginTransaction();
    }

    public final void M(long j) {
        fbm.b();
        H();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        z("Deleting hit, id", valueOf);
        N(arrayList);
    }

    public final void N(List list) {
        fma.aR(list);
        fbm.b();
        H();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l != null && l.longValue() != 0) {
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(l);
                } else {
                    throw new SQLiteException("Invalid hit id");
                }
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase c = c();
                z("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = c.delete("hits2", sb2, null);
                if (delete != list.size()) {
                    super.E(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                v("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void O() {
        H();
        c().endTransaction();
    }

    public final void P() {
        H();
        c().setTransactionSuccessful();
    }

    public final boolean Q() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final long R(String str, String[] strArr) {
        long j;
        Cursor cursor = null;
        try {
            try {
                cursor = c().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                } else {
                    j = 0;
                }
                return j;
            } catch (SQLiteException e) {
                w("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final long b() {
        fbm.b();
        H();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = c().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                w("Database error", "SELECT COUNT(*) FROM hits2", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase c() {
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteException e) {
            C("Error opening database", e);
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f.close();
        } catch (SQLiteException e) {
            v("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            v("Error closing database", e2);
        }
    }

    public final String d() {
        k();
        k();
        return "google_analytics_v4.db";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:            if (r14.moveToFirst() != false) goto L10;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:            r7 = r14.getLong(0);        r4 = r14.getLong(1);        r1 = r14.getString(2);        r2 = r14.getString(3);        r9 = r14.getInt(4);        r3 = K(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:            if (android.text.TextUtils.isEmpty(r2) == false) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:            r0.add(new defpackage.fdj(r16, r3, r4, r6, r7, r9, null));     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:            if (r14.moveToNext() != false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:            if (r2.startsWith("http:") != false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:            r6 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:            if (r14 == null) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:            r14.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:            return r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(long r17) {
        /*
            r16 = this;
            r11 = r16
            java.lang.String r0 = "hit_id"
            r1 = 0
            r12 = 0
            r13 = 1
            int r3 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r3 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            defpackage.fma.aF(r1)
            defpackage.fbm.b()
            r16.H()
            android.database.sqlite.SQLiteDatabase r2 = r16.c()
            r1 = 0
            java.lang.String r3 = "hits2"
            java.lang.String r4 = "hit_time"
            java.lang.String r5 = "hit_string"
            java.lang.String r6 = "hit_url"
            java.lang.String r7 = "hit_app_id"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "%s ASC"
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            r6[r12] = r0     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            java.lang.String r9 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            java.lang.String r10 = java.lang.Long.toString(r17)     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteException -> L99
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            boolean r1 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r1 == 0) goto L8b
        L4c:
            long r7 = r14.getLong(r12)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            long r4 = r14.getLong(r13)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r2 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r3 = 4
            int r9 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            java.util.Map r3 = r11.K(r1)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r1 == 0) goto L6f
        L6d:
            r6 = 1
            goto L79
        L6f:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r1 != 0) goto L78
            goto L6d
        L78:
            r6 = 0
        L79:
            fdj r15 = new fdj     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r10 = 0
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0.add(r15)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r1 != 0) goto L4c
        L8b:
            if (r14 == 0) goto L90
            r14.close()
        L90:
            return r0
        L91:
            r0 = move-exception
            r1 = r14
            goto La0
        L94:
            r0 = move-exception
            r1 = r14
            goto L9a
        L97:
            r0 = move-exception
            goto La0
        L99:
            r0 = move-exception
        L9a:
            java.lang.String r2 = "Error loading hits from the database"
            r11.v(r2, r0)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        La0:
            if (r1 == 0) goto La5
            r1.close()
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fct.e(long):java.util.List");
    }

    @Override // defpackage.fcl
    protected final void a() {
    }
}
