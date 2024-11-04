package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkx implements gkr {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final HashMap c = new HashMap();

    public gkx(Context context) {
        this.b = context;
    }

    private final synchronized gkw e(goa goaVar) {
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
        HashMap hashMap = this.c;
        valueOf = Long.valueOf(j);
        if (!hashMap.containsKey(valueOf)) {
            this.c.put(valueOf, new gkw(this.b, j));
        }
        return (gkw) this.c.get(valueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:10:0x0040, B:16:0x0070, B:25:0x0079, B:26:0x007c), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[Catch: all -> 0x007d, TRY_ENTER, TryCatch #4 {, blocks: (B:10:0x0040, B:16:0x0070, B:25:0x0079, B:26:0x007c), top: B:3:0x0002 }] */
    @Override // defpackage.gkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.gkq a(defpackage.goa r8, int r9, byte[] r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r2 = "job_type"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r2 = "payload"
            r1.put(r2, r10)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            gkw r8 = r7.e(r8)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r2 = "tasks"
            long r1 = r8.insert(r2, r0, r1)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L6e
            mep r4 = new mep     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            r4.<init>()     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            r4.b = r1     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            r4.c = r3     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            r4.i(r10)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            gkq r9 = r4.h()     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L75
            if (r8 == 0) goto L43
            r8.close()     // Catch: java.lang.Throwable -> L7d
        L43:
            monitor-exit(r7)
            return r9
        L45:
            r10 = move-exception
            goto L4d
        L47:
            r8 = move-exception
            r9 = r8
            goto L77
        L4a:
            r8 = move-exception
            r10 = r8
            r8 = r0
        L4d:
            joo r1 = defpackage.gkx.a     // Catch: java.lang.Throwable -> L75
            jnx r1 = r1.f()     // Catch: java.lang.Throwable -> L75
            jol r1 = (defpackage.jol) r1     // Catch: java.lang.Throwable -> L75
            jnx r10 = r1.i(r10)     // Catch: java.lang.Throwable -> L75
            jol r10 = (defpackage.jol) r10     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl"
            java.lang.String r2 = "insertTaskData"
            java.lang.String r3 = "ChimeTaskDataStorageImpl.java"
            r4 = 67
            jnx r10 = r10.j(r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L75
            jol r10 = (defpackage.jol) r10     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "Error inserting ChimeTaskData %d for account"
            r10.s(r1, r9)     // Catch: java.lang.Throwable -> L75
        L6e:
            if (r8 == 0) goto L73
            r8.close()     // Catch: java.lang.Throwable -> L7d
        L73:
            monitor-exit(r7)
            return r0
        L75:
            r9 = move-exception
            r0 = r8
        L77:
            if (r0 == 0) goto L7c
            r0.close()     // Catch: java.lang.Throwable -> L7d
        L7c:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkx.a(goa, int, byte[]):gkq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2 A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:13:0x00b2, B:15:0x00b7, B:28:0x00be, B:30:0x00c3, B:31:0x00c6), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:13:0x00b2, B:15:0x00b7, B:28:0x00be, B:30:0x00c3, B:31:0x00c6), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // defpackage.gkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List b(defpackage.goa r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            kuv r0 = new kuv     // Catch: java.lang.Throwable -> Lc7
            r1 = 0
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: java.lang.Throwable -> Lc7
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc7
            r3 = 0
            r2[r3] = r13     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r13 = "job_type=?"
            r0.z(r13, r2)     // Catch: java.lang.Throwable -> Lc7
            hzp r13 = r0.x()     // Catch: java.lang.Throwable -> Lc7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc7
            r0.<init>()     // Catch: java.lang.Throwable -> Lc7
            gkw r12 = r11.e(r12)     // Catch: java.lang.Throwable -> L7e java.lang.RuntimeException -> L82
            android.database.sqlite.SQLiteDatabase r12 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L7e java.lang.RuntimeException -> L82
            java.lang.String r3 = "tasks"
            java.lang.String r5 = r13.a     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.String[] r6 = r13.a()     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.String r9 = "_id ASC"
            r10 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r2 = r12
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
        L3a:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            if (r2 == 0) goto Lb0
            mep r2 = new mep     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.String r3 = "_id"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            r2.b = r3     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.String r3 = "job_type"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            r2.c = r3     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            java.lang.String r3 = "payload"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            byte[] r3 = r1.getBlob(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            r2.i(r3)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            gkq r2 = r2.h()     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            r0.add(r2)     // Catch: java.lang.Throwable -> L7a java.lang.RuntimeException -> L7c
            goto L3a
        L7a:
            r13 = move-exception
            goto Lbc
        L7c:
            r2 = move-exception
            goto L85
        L7e:
            r12 = move-exception
            r13 = r12
            r12 = r1
            goto Lbc
        L82:
            r12 = move-exception
            r2 = r12
            r12 = r1
        L85:
            joo r3 = defpackage.gkx.a     // Catch: java.lang.Throwable -> L7a
            jnx r3 = r3.f()     // Catch: java.lang.Throwable -> L7a
            jol r3 = (defpackage.jol) r3     // Catch: java.lang.Throwable -> L7a
            jnx r2 = r3.i(r2)     // Catch: java.lang.Throwable -> L7a
            jol r2 = (defpackage.jol) r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl"
            java.lang.String r4 = "executeQuery"
            java.lang.String r5 = "ChimeTaskDataStorageImpl.java"
            r6 = 126(0x7e, float:1.77E-43)
            jnx r2 = r2.j(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> L7a
            jol r2 = (defpackage.jol) r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Error getting ChimeTaskData for account. Query: %s %s"
            java.lang.String r4 = r13.a     // Catch: java.lang.Throwable -> L7a
            java.lang.String[] r13 = r13.a()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = java.util.Arrays.toString(r13)     // Catch: java.lang.Throwable -> L7a
            r2.y(r3, r4, r13)     // Catch: java.lang.Throwable -> L7a
        Lb0:
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.lang.Throwable -> Lc7
        Lb5:
            if (r12 == 0) goto Lba
            r12.close()     // Catch: java.lang.Throwable -> Lc7
        Lba:
            monitor-exit(r11)
            return r0
        Lbc:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.lang.Throwable -> Lc7
        Lc1:
            if (r12 == 0) goto Lc6
            r12.close()     // Catch: java.lang.Throwable -> Lc7
        Lc6:
            throw r13     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkx.b(goa, int):java.util.List");
    }

    @Override // defpackage.gkr
    public final void c(goa goaVar) {
        try {
            this.b.deleteDatabase(e(goaVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "deleteDatabase", 'e', "ChimeTaskDataStorageImpl.java")).r("Error deleting database for account");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gkr
    public final synchronized void d(goa goaVar, List list) {
        if (!list.isEmpty()) {
            String[] strArr = new String[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = Long.toString(((gkq) it.next()).a.longValue());
                i++;
            }
            SQLiteDatabase sQLiteDatabase = null;
            jis b = glc.b(null, "_id", strArr);
            try {
                try {
                    sQLiteDatabase = e(goaVar).getWritableDatabase();
                    sQLiteDatabase.beginTransaction();
                } catch (RuntimeException e) {
                    ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "executeDelete", (char) 156, "ChimeTaskDataStorageImpl.java")).r("Error deleting ChimeTaskData for account");
                }
                try {
                    jmx it2 = b.iterator();
                    while (it2.hasNext()) {
                        hzp hzpVar = (hzp) it2.next();
                        sQLiteDatabase.delete("tasks", hzpVar.a, hzpVar.a());
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } finally {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
    }
}
