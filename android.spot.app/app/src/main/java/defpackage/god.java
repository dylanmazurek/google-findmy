package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class god extends cjj {
    public god() {
        super(3, 4);
    }

    @Override // defpackage.cjj
    public final void b(ddh ddhVar) {
        bzb.b(ddhVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `sync_version` INTEGER NOT NULL DEFAULT 0");
        bzb.b(ddhVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0");
        bzb.b(ddhVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0");
        bzb.b(ddhVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `first_registration_version` INTEGER NOT NULL DEFAULT 0");
    }
}
