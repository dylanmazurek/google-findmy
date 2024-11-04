package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cko extends SQLiteOpenHelper {
    private final Context a;
    private final cke b;
    private final boolean c;
    private boolean d;
    private final ckt e;
    private boolean f;
    private final lrs g;

    public cko(Context context, String str, final lrs lrsVar, cke ckeVar, boolean z) {
        super(context, str, null, ckeVar.b, new DatabaseErrorHandler() { // from class: ckm
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                ckl b = bzn.b(lrs.this, sQLiteDatabase);
                Log.e("SupportSQLite", a.af(b, "Corruption reported by sqlite on database: ", ".path"));
                if (!b.j()) {
                    String c = b.c();
                    if (c != null) {
                        cke.f(c);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = b.d.getAttachedDbs();
                    } catch (Throwable th) {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                cke.f((String) obj);
                            }
                        } else {
                            String c2 = b.c();
                            if (c2 != null) {
                                cke.f(c2);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    b.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object obj2 = ((Pair) it2.next()).second;
                        obj2.getClass();
                        cke.f((String) obj2);
                    }
                    return;
                }
                String c3 = b.c();
                if (c3 != null) {
                    cke.f(c3);
                }
            }
        });
        this.a = context;
        this.g = lrsVar;
        this.b = ckeVar;
        this.c = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this.e = new ckt(str, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final ckl a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return bzn.b(this.g, sQLiteDatabase);
    }

    public final ckd b() {
        boolean z;
        SQLiteDatabase c;
        ckd a;
        File parentFile;
        try {
            ckt cktVar = this.e;
            if (!this.f && getDatabaseName() != null) {
                z = true;
            } else {
                z = false;
            }
            cktVar.a(z);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z2 = this.f;
            if (databaseName != null && !z2 && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                c = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    c = c();
                } catch (Throwable th) {
                    if (th instanceof ckn) {
                        ckn cknVar = th;
                        Throwable th2 = cknVar.a;
                        int i = cknVar.b;
                        int i2 = i - 1;
                        if (i != 0) {
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (!(th2 instanceof SQLiteException)) {
                                                throw th2;
                                            }
                                        } else {
                                            throw th2;
                                        }
                                    } else {
                                        throw th2;
                                    }
                                } else {
                                    throw th2;
                                }
                            } else {
                                throw th2;
                            }
                        } else {
                            throw null;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.c) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        c = c();
                    } catch (ckn e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                a = b();
            } else {
                a = a(c);
            }
            return a;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            ckt cktVar = this.e;
            Map map = ckt.a;
            boolean z = cktVar.b;
            cktVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            cke ckeVar = this.b;
            a(sQLiteDatabase);
            ckeVar.e();
        } catch (Throwable th) {
            throw new ckn(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.b.a(a(sQLiteDatabase));
        } catch (Throwable th) {
            throw new ckn(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ckn(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d) {
            try {
                this.b.c(a(sQLiteDatabase));
            } catch (Throwable th) {
                throw new ckn(5, th);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.d(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ckn(3, th);
        }
    }
}
