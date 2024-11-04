package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gld extends cii {
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gld(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(1, "ea4ce6093b9d29b56181718d906e0024", "7b4a6a59292e18bdb45d33bd6152c7d2");
        this.d = chimePerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.cii
    public final void c(ddh ddhVar) {
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER, `deletion_status` INTEGER, `count_behavior` INTEGER, `system_tray_behavior` INTEGER, `modified_timestamp` INTEGER NOT NULL)");
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bzb.b(ddhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ea4ce6093b9d29b56181718d906e0024')");
    }

    @Override // defpackage.cii
    public final void d(ddh ddhVar) {
        bzb.b(ddhVar, "DROP TABLE IF EXISTS `chime_thread_states`");
    }

    @Override // defpackage.cii
    public final void e(ddh ddhVar) {
        this.d.v(ddhVar);
    }

    @Override // defpackage.cii
    public final void f(ddh ddhVar) {
        bwq.c(ddhVar);
    }

    @Override // defpackage.cii
    public final lzl g(ddh ddhVar) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("id", new cjq("id", "INTEGER", true, 1, null, 1));
        hashMap.put("thread_id", new cjq("thread_id", "TEXT", false, 0, null, 1));
        hashMap.put("last_updated_version", new cjq("last_updated_version", "INTEGER", true, 0, null, 1));
        hashMap.put("read_state", new cjq("read_state", "INTEGER", false, 0, null, 1));
        hashMap.put("deletion_status", new cjq("deletion_status", "INTEGER", false, 0, null, 1));
        hashMap.put("count_behavior", new cjq("count_behavior", "INTEGER", false, 0, null, 1));
        hashMap.put("system_tray_behavior", new cjq("system_tray_behavior", "INTEGER", false, 0, null, 1));
        hashMap.put("modified_timestamp", new cjq("modified_timestamp", "INTEGER", true, 0, null, 1));
        cjt cjtVar = new cjt("chime_thread_states", hashMap, new HashSet(0), new HashSet(0));
        cjt k = byk.k(ddhVar, "chime_thread_states");
        if (!byl.r(cjtVar, k)) {
            return new lzl(false, "chime_thread_states(com.google.android.libraries.notifications.internal.storage.ChimeThreadState).\n Expected:\n" + byl.n(cjtVar) + "\n Found:\n" + byl.n(k));
        }
        return new lzl(true, (String) null);
    }

    @Override // defpackage.cii
    public final void a() {
    }

    @Override // defpackage.cii
    public final void b() {
    }
}
