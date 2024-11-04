package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkz implements gkt {
    private static final joo b = joo.m("GnpSdk");
    public final ChimePerAccountRoomDatabase a;

    public gkz(ChimePerAccountRoomDatabase chimePerAccountRoomDatabase) {
        this.a = chimePerAccountRoomDatabase;
    }

    @Override // defpackage.gkt
    public final List a(String... strArr) {
        try {
            gle d = d();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM chime_thread_states WHERE thread_id IN (");
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                sb.append("?");
                if (i < length - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            return (List) bwr.c(((gli) d).a, true, false, new glg(sb.toString(), strArr, 0));
        } catch (SQLiteException e) {
            ((jol) ((jol) ((jol) b.g()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStateStorageImpl", "getThreadStatesById", 'D', "ChimeThreadStateStorageImpl.java")).r("Failed to get thread states by id");
            int i2 = jis.d;
            return jmi.a;
        }
    }

    @Override // defpackage.gkt
    public final void b(long j) {
        try {
            bwr.c(((gli) d()).a, false, true, new glh(fma.i().toEpochMilli() - j));
        } catch (SQLiteException e) {
            ((jol) ((jol) ((jol) b.g()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStateStorageImpl", "removeThreadStatesOlderThanDuration", 'N', "ChimeThreadStateStorageImpl.java")).r("Exception thrown on thread storage periodic cleanup.");
        }
    }

    @Override // defpackage.gkt
    public final void c(gks gksVar) {
        try {
        } catch (SQLiteException e) {
            ((jol) ((jol) ((jol) b.g()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStateStorageImpl", "insertThreadState", ':', "ChimeThreadStateStorageImpl.java")).r("Failed to insert thread state");
        }
    }

    public final gle d() {
        return this.a.w();
    }
}
