package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gky extends SQLiteOpenHelper {
    private static final joo a = joo.m("GnpSdk");

    public gky(Context context, long j) {
        super(context, j + "_threads.notifications.db", (SQLiteDatabase.CursorFactory) null, 22);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ((jol) a.k().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadSQLiteHelper", "onCreate", 110, "ChimeThreadSQLiteHelper.java")).u("Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4;
        Cursor cursor;
        int i5 = i;
        ((jol) a.k().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadSQLiteHelper", "onUpgrade", 118, "ChimeThreadSQLiteHelper.java")).z("Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i5 < 6) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0));");
            return;
        }
        if (i5 == 6) {
            glc.d(sQLiteDatabase, "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 > 7) {
                i5 = 7;
            } else {
                return;
            }
        }
        if (i5 == 7) {
            glc.d(sQLiteDatabase, "locally_removed", "INTEGER NOT NULL DEFAULT(0)");
            i5 = 8;
            if (i2 <= 8) {
                return;
            }
        }
        if (i5 < 12) {
            glc.d(sQLiteDatabase, "storage_mode", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 > 12) {
                i5 = 12;
            } else {
                return;
            }
        }
        if (i5 < 14) {
            glc.d(sQLiteDatabase, "payload_type", "TEXT");
            if (i2 > 14) {
                i5 = 14;
            } else {
                return;
            }
        }
        if (i5 == 14) {
            glc.d(sQLiteDatabase, "thread_stored_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 > 15) {
                i5 = 15;
            } else {
                return;
            }
        }
        if (i5 == 15) {
            glc.d(sQLiteDatabase, "creation_id", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 > 16) {
                i5 = 16;
            } else {
                return;
            }
        }
        if (i5 == 16) {
            glc.d(sQLiteDatabase, "actions", "BLOB");
            if (i2 > 17) {
                i5 = 17;
            } else {
                return;
            }
        }
        if (i5 == 17) {
            String[] strArr = {"_id", "thread_id", "read_state", "count_behavior", "system_tray_behavior", "last_updated__version", "last_notification_version", "creation_id", "notification_metadata", "actions", "rendered_message", "payload_type", "payload", "update_thread_state_token", "group_id", "expiration_timestamp", "thread_stored_timestamp", "locally_removed", "storage_mode"};
            int i6 = glc.a;
            try {
                i3 = 19;
                cursor = sQLiteDatabase.query("threads", null, "0", null, null, null, null);
                for (int i7 = 0; i7 < 19; i7++) {
                    try {
                        if (cursor.getColumnIndex(strArr[i7]) < 0) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
                            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0));");
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (i2 > 18) {
                    i5 = 18;
                } else {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } else {
            i3 = 19;
        }
        if (i5 == 18) {
            glc.d(sQLiteDatabase, "reference", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase.execSQL("UPDATE threads SET reference = 1");
            if (i2 > i3) {
                i4 = 19;
            } else {
                return;
            }
        } else {
            i4 = i5;
        }
        if (i4 == i3) {
            sQLiteDatabase.execSQL(String.format(Locale.US, "UPDATE %s SET %s = 0 WHERE %s != 0", "threads", "reference", "locally_removed"));
            if (i2 > 20) {
                i4 = 20;
            } else {
                return;
            }
        }
        if (i4 == 20) {
            glc.d(sQLiteDatabase, "deletion_status", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase.execSQL("UPDATE threads SET deletion_status = ?", new String[]{"1"});
            if (i2 <= 21) {
                return;
            }
        } else if (i4 != 21) {
            return;
        }
        glc.d(sQLiteDatabase, "expiration_duration_from_display_ms", "INTEGER NOT NULL DEFAULT(0)");
    }
}
