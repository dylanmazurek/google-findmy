package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gob extends cjj {
    public gob() {
        super(1, 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ckd] */
    @Override // defpackage.cjj
    public final void b(ddh ddhVar) {
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS `_new_gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT)");
        bzb.b(ddhVar, "INSERT INTO `_new_gnp_accounts` (`id`,`account_specific_id`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources`) SELECT `id`,`account_name`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources` FROM `gnp_accounts`");
        bzb.b(ddhVar, "DROP TABLE `gnp_accounts`");
        bzb.b(ddhVar, "ALTER TABLE `_new_gnp_accounts` RENAME TO `gnp_accounts`");
        ddhVar.a.g("UPDATE gnp_accounts SET account_type = 1");
    }
}
