package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gla {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final lqz c;
    private final HashMap d = new HashMap();

    public gla(Context context, lqz lqzVar) {
        this.b = context;
        this.c = lqzVar;
    }

    private final synchronized gky f(goa goaVar) {
        long j;
        Long valueOf;
        if (goaVar != null) {
            try {
                j = goaVar.a;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = -1;
        }
        HashMap hashMap = this.d;
        valueOf = Long.valueOf(j);
        if (!hashMap.containsKey(valueOf)) {
            this.d.put(valueOf, new gky(this.b, j));
        }
        return (gky) this.d.get(valueOf);
    }

    private final synchronized jiy g(goa goaVar, SQLiteDatabase sQLiteDatabase, hzp hzpVar) {
        jiy b;
        Cursor query = sQLiteDatabase.query("threads", null, hzpVar.a, hzpVar.a(), null, null, "last_notification_version DESC", null);
        try {
            jiu jiuVar = new jiu();
            while (query.moveToNext()) {
                try {
                    ggh c = ggk.c();
                    c.f(query.getString(glc.a(query, "thread_id")));
                    c.j(kzy.e(query.getInt(glc.a(query, "read_state"))));
                    c.h(a.w(query.getInt(glc.a(query, "count_behavior"))));
                    c.l(a.w(query.getInt(glc.a(query, "system_tray_behavior"))));
                    c.a = Long.valueOf(query.getLong(glc.a(query, "last_updated__version")));
                    c.b = Long.valueOf(query.getLong(glc.a(query, "last_notification_version")));
                    c.d = query.getString(glc.a(query, "payload_type"));
                    c.g(glc.f(query, lge.a, "notification_metadata"));
                    List f = glc.f(query, lfq.j, "actions");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        jer a2 = ggj.a((lfq) it.next());
                        if (a2.g()) {
                            arrayList.add(a2.c());
                        }
                    }
                    c.b(arrayList);
                    c.c = Long.valueOf(query.getLong(glc.a(query, "creation_id")));
                    c.c((lga) glc.e(query, lga.x, "rendered_message"));
                    c.e = (lia) glc.e(query, lia.b, "payload");
                    c.f = query.getString(glc.a(query, "update_thread_state_token"));
                    c.e(query.getString(glc.a(query, "group_id")));
                    c.g = Long.valueOf(query.getLong(glc.a(query, "expiration_timestamp")));
                    c.d(query.getLong(glc.a(query, "expiration_duration_from_display_ms")));
                    c.h = Long.valueOf(query.getLong(glc.a(query, "thread_stored_timestamp")));
                    c.k(a.w(query.getInt(glc.a(query, "storage_mode"))));
                    c.i(a.w(query.getInt(glc.a(query, "deletion_status"))));
                    jiuVar.d(c.a(), Long.valueOf(query.getLong(glc.a(query, "reference"))));
                } catch (glb unused) {
                    ghg a3 = ((ghf) this.c.a()).a(lcr.DATABASE_ERROR);
                    a3.e(goaVar);
                    a3.a();
                }
            }
            b = jiuVar.b();
            if (query != null) {
                query.close();
            }
        } finally {
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized void h(goa goaVar, hzp hzpVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(goaVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    jmx it = ((jis) list).iterator();
                    while (it.hasNext()) {
                        hzp hzpVar2 = (hzp) it.next();
                        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
                        kuvVar.y("UPDATE ");
                        kuvVar.y("threads");
                        kuvVar.y(" SET ");
                        kuvVar.y(hzpVar.a);
                        kuvVar.y(" WHERE ");
                        kuvVar.y(hzpVar2.a);
                        String str = kuvVar.x().a;
                        String[] a2 = hzpVar.a();
                        String[] a3 = hzpVar2.a();
                        int length = a2.length;
                        int length2 = a3.length;
                        Object[] objArr = (Object[]) Array.newInstance((Class<?>) String.class, length + length2);
                        System.arraycopy(a2, 0, objArr, 0, length);
                        System.arraycopy(a3, 0, objArr, length, length2);
                        writableDatabase.execSQL(str, objArr);
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeUpdate", 161, "ChimeThreadStorageHelper.java")).y("Error updating ChimeThread for account. Set: %s, Queries: %s", hzpVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized jis a(goa goaVar, List list) {
        jis g;
        jin jinVar = new jin();
        try {
            SQLiteDatabase writableDatabase = f(goaVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    jmx it = ((jis) list).iterator();
                    while (it.hasNext()) {
                        jinVar.j(g(goaVar, writableDatabase, (hzp) it.next()).keySet());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    g = jinVar.g();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeQuery", 102, "ChimeThreadStorageHelper.java")).u("Error getting ChimeThreads for account. Queries: %s", list);
            return jmi.a;
        }
        return g;
    }

    public final synchronized void b(goa goaVar, List list) {
        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
        kuvVar.y("reference");
        kuvVar.y(" = ");
        kuvVar.y("reference");
        kuvVar.z(" & ~?", 1L);
        h(goaVar, kuvVar.x(), list);
    }

    public final synchronized Pair c(goa goaVar, ggk ggkVar, boolean z) {
        boolean z2;
        gku gkuVar;
        Object obj;
        try {
            SQLiteDatabase writableDatabase = f(goaVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues(16);
                    contentValues.put("thread_id", ggkVar.a);
                    int i = ggkVar.p;
                    int i2 = i - 1;
                    if (i != 0) {
                        contentValues.put("read_state", Integer.valueOf(i2));
                        int i3 = ggkVar.r;
                        int i4 = i3 - 1;
                        if (i3 != 0) {
                            contentValues.put("count_behavior", Integer.valueOf(i4));
                            int i5 = ggkVar.s;
                            int i6 = i5 - 1;
                            if (i5 != 0) {
                                contentValues.put("system_tray_behavior", Integer.valueOf(i6));
                                contentValues.put("last_updated__version", ggkVar.b);
                                contentValues.put("last_notification_version", ggkVar.c);
                                contentValues.put("payload_type", ggkVar.g);
                                contentValues.put("update_thread_state_token", ggkVar.i);
                                contentValues.put("group_id", ggkVar.j);
                                contentValues.put("expiration_timestamp", ggkVar.k);
                                contentValues.put("expiration_duration_from_display_ms", Long.valueOf(ggkVar.l));
                                contentValues.put("thread_stored_timestamp", Long.valueOf(fma.i().toEpochMilli()));
                                contentValues.put("locally_removed", (Boolean) false);
                                int i7 = ggkVar.t;
                                int i8 = i7 - 1;
                                if (i7 != 0) {
                                    contentValues.put("storage_mode", Integer.valueOf(i8));
                                    contentValues.put("creation_id", ggkVar.f);
                                    contentValues.put("reference", (Long) 1L);
                                    int i9 = ggkVar.q;
                                    int i10 = i9 - 1;
                                    if (i9 != 0) {
                                        contentValues.put("deletion_status", Integer.valueOf(i10));
                                        lga lgaVar = ggkVar.d;
                                        if (lgaVar != null) {
                                            contentValues.put("rendered_message", lgaVar.g());
                                        }
                                        if (!ggkVar.e.isEmpty()) {
                                            ljh k = gxg.b.k();
                                            for (lge lgeVar : ggkVar.e) {
                                                ljh k2 = lia.b.k();
                                                lim e = lgeVar.e();
                                                if (!k2.b.y()) {
                                                    k2.t();
                                                }
                                                ((lia) k2.b).a = e;
                                                k.y((lia) k2.q());
                                            }
                                            contentValues.put("notification_metadata", ((gxg) k.q()).g());
                                        }
                                        if (!ggkVar.o.isEmpty()) {
                                            ljh k3 = gxg.b.k();
                                            for (ggj ggjVar : ggkVar.o) {
                                                ljh k4 = lia.b.k();
                                                lim e2 = ggjVar.b().e();
                                                if (!k4.b.y()) {
                                                    k4.t();
                                                }
                                                ((lia) k4.b).a = e2;
                                                k3.y((lia) k4.q());
                                            }
                                            contentValues.put("actions", ((gxg) k3.q()).g());
                                        }
                                        lia liaVar = ggkVar.h;
                                        if (liaVar != null) {
                                            contentValues.put("payload", liaVar.g());
                                        }
                                        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
                                        kuvVar.y("thread_id");
                                        kuvVar.z(" = ?", ggkVar.a);
                                        hzp x = kuvVar.x();
                                        jiy g = g(goaVar, writableDatabase, x);
                                        if (g.isEmpty()) {
                                            writableDatabase.insertWithOnConflict("threads", null, contentValues, 4);
                                            writableDatabase.setTransactionSuccessful();
                                            Pair pair = new Pair(gku.INSERTED, jdl.a);
                                            if (writableDatabase != null) {
                                                writableDatabase.close();
                                            }
                                            return pair;
                                        }
                                        ggk ggkVar2 = (ggk) g.keySet().d().get(0);
                                        long longValue = ggkVar2.b.longValue();
                                        long longValue2 = ggkVar.b.longValue();
                                        if (ggkVar2.b.equals(ggkVar.b) && !ggkVar2.equals(ggkVar)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (longValue >= longValue2 && (!z || !z2)) {
                                            Pair pair2 = new Pair(gku.REJECTED_SAME_VERSION, jdl.a);
                                            if (writableDatabase != null) {
                                                writableDatabase.close();
                                            }
                                            return pair2;
                                        }
                                        writableDatabase.update("threads", contentValues, x.a, x.a());
                                        writableDatabase.setTransactionSuccessful();
                                        if ((((Long) g.get(ggkVar2)).longValue() & 1) > 0) {
                                            gkuVar = gku.REPLACED;
                                        } else {
                                            gkuVar = gku.INSERTED;
                                        }
                                        if (gkuVar == gku.REPLACED) {
                                            obj = jer.i(ggkVar2);
                                        } else {
                                            obj = jdl.a;
                                        }
                                        Pair pair3 = new Pair(gkuVar, obj);
                                        if (writableDatabase != null) {
                                            writableDatabase.close();
                                        }
                                        return pair3;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                } finally {
                    writableDatabase.endTransaction();
                }
            } finally {
            }
        } catch (RuntimeException e3) {
            ((jol) ((jol) ((jol) a.f()).i(e3)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "insertOrReplaceThread", 239, "ChimeThreadStorageHelper.java")).u("Error inserting ChimeThread for account, %s", ggkVar);
            return new Pair(gku.REJECTED_DB_ERROR, jdl.a);
        }
    }

    public final synchronized void d(goa goaVar) {
        try {
            this.b.deleteDatabase(f(goaVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "deleteDatabase", (char) 249, "ChimeThreadStorageHelper.java")).r("Error deleting database for account");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(goa goaVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(goaVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    jmx it = ((jis) list).iterator();
                    while (it.hasNext()) {
                        hzp hzpVar = (hzp) it.next();
                        writableDatabase.delete("threads", hzpVar.a, hzpVar.a());
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeDelete", 181, "ChimeThreadStorageHelper.java")).u("Error deleting ChimeThreads for account. Queries: %s", list);
        }
    }
}
