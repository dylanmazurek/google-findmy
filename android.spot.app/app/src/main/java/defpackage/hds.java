package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hds extends cii {
    final /* synthetic */ CardsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hds(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4, "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001");
        this.d = cardsDatabase_Impl;
    }

    @Override // defpackage.cii
    public final void c(ddh ddhVar) {
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bzb.b(ddhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    @Override // defpackage.cii
    public final void d(ddh ddhVar) {
        bzb.b(ddhVar, "DROP TABLE IF EXISTS `StorageCardDecorationState`");
        bzb.b(ddhVar, "DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
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
        HashMap hashMap = new HashMap(4);
        hashMap.put("accountIdentifier", new cjq("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap.put("storageState", new cjq("storageState", "TEXT", true, 0, null, 1));
        hashMap.put("lastDecorationConsumedTime", new cjq("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap.put("totalTimesConsumed", new cjq("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        cjt cjtVar = new cjt("StorageCardDecorationState", hashMap, new HashSet(0), new HashSet(0));
        cjt k = byk.k(ddhVar, "StorageCardDecorationState");
        if (!byl.r(cjtVar, k)) {
            return new lzl(false, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n" + byl.n(cjtVar) + "\n Found:\n" + byl.n(k));
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("accountIdentifier", new cjq("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap2.put("backupSyncState", new cjq("backupSyncState", "TEXT", true, 0, null, 1));
        hashMap2.put("lastDecorationConsumedTime", new cjq("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap2.put("totalTimesConsumed", new cjq("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        cjt cjtVar2 = new cjt("BackupSyncCardDecorationState", hashMap2, new HashSet(0), new HashSet(0));
        cjt k2 = byk.k(ddhVar, "BackupSyncCardDecorationState");
        if (!byl.r(cjtVar2, k2)) {
            return new lzl(false, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n" + byl.n(cjtVar2) + "\n Found:\n" + byl.n(k2));
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
