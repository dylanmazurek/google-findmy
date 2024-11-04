package defpackage;

import com.google.android.libraries.notifications.platform.data.impl.GnpRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goh extends cii {
    final /* synthetic */ GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goh(GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(7, "48cf00a0325d969bc7db54862da7882f", "002596e059cf0812de189d848545c6ca");
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.cii
    public final void c(ddh ddhVar) {
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT)");
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bzb.b(ddhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '48cf00a0325d969bc7db54862da7882f')");
    }

    @Override // defpackage.cii
    public final void d(ddh ddhVar) {
        bzb.b(ddhVar, "DROP TABLE IF EXISTS `gnp_accounts`");
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
        HashMap hashMap = new HashMap(15);
        hashMap.put("id", new cjq("id", "INTEGER", true, 1, null, 1));
        hashMap.put("account_specific_id", new cjq("account_specific_id", "TEXT", false, 0, null, 1));
        hashMap.put("account_type", new cjq("account_type", "INTEGER", false, 0, null, 1));
        hashMap.put("obfuscated_gaia_id", new cjq("obfuscated_gaia_id", "TEXT", false, 0, null, 1));
        hashMap.put("actual_account_name", new cjq("actual_account_name", "TEXT", false, 0, null, 1));
        hashMap.put("actual_account_oid", new cjq("actual_account_oid", "TEXT", false, 0, null, 1));
        hashMap.put("registration_status", new cjq("registration_status", "INTEGER", true, 0, null, 1));
        hashMap.put("registration_id", new cjq("registration_id", "TEXT", false, 0, null, 1));
        hashMap.put("sync_sources", new cjq("sync_sources", "TEXT", false, 0, null, 1));
        hashMap.put("representative_target_id", new cjq("representative_target_id", "TEXT", false, 0, null, 1));
        hashMap.put("sync_version", new cjq("sync_version", "INTEGER", true, 0, "0", 1));
        hashMap.put("last_registration_time_ms", new cjq("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        hashMap.put("last_registration_request_hash", new cjq("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        hashMap.put("first_registration_version", new cjq("first_registration_version", "INTEGER", true, 0, "0", 1));
        hashMap.put("internal_target_id", new cjq("internal_target_id", "TEXT", false, 0, null, 1));
        cjt cjtVar = new cjt("gnp_accounts", hashMap, new HashSet(0), new HashSet(0));
        cjt k = byk.k(ddhVar, "gnp_accounts");
        if (!byl.r(cjtVar, k)) {
            return new lzl(false, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n" + byl.n(cjtVar) + "\n Found:\n" + byl.n(k));
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
