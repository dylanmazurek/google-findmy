package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@mkp
/* loaded from: classes.dex */
public final class cim extends cke {
    private chj a;
    private final List c;
    private final cik d;
    private final String e;
    private final String f;

    public cim(chj chjVar, cik cikVar) {
        super(23);
        this.c = chjVar.d;
        this.a = chjVar;
        this.d = cikVar;
        this.e = "86254750241babac4b8d52996a675549";
        this.f = "1cbd3130fa23b59692c061c594c16cc0";
    }

    private final void g(ckd ckdVar) {
        ckdVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ckdVar.g(bwg.k(this.e));
    }

    @Override // defpackage.cke
    public final void a(ckd ckdVar) {
        Cursor b = ckdVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = true;
                }
            }
            mjo.r(b, null);
            this.d.b(ckdVar);
            if (!z) {
                cil a = this.d.a(ckdVar);
                if (!a.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(a.b)));
                }
            }
            g(ckdVar);
            for (bwe bweVar : this.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.cke
    public final void b(ckd ckdVar, int i, int i2) {
        d(ckdVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[LOOP:0: B:23:0x0096->B:25:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    @Override // defpackage.cke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ckd r5) {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.b(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lbb
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r3 = 0
            defpackage.mjo.r(r0, r3)
            if (r1 == 0) goto L6c
            ckc r0 = new ckc
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.a(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L32
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L65
            goto L33
        L32:
            r1 = r3
        L33:
            defpackage.mjo.r(r0, r3)
            java.lang.String r0 = r4.e
            boolean r0 = defpackage.amr.i(r0, r1)
            if (r0 != 0) goto L79
            java.lang.String r0 = r4.f
            boolean r0 = defpackage.amr.i(r0, r1)
            if (r0 == 0) goto L47
            goto L79
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r2)
            java.lang.String r2 = r4.e
            r0.append(r2)
            java.lang.String r2 = ", found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L65:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            defpackage.mjo.r(r0, r5)
            throw r1
        L6c:
            cik r0 = r4.d
            cil r0 = r0.a(r5)
            boolean r1 = r0.a
            if (r1 == 0) goto La9
            r4.g(r5)
        L79:
            cik r0 = r4.d
            cry r0 = (defpackage.cry) r0
            androidx.work.impl.WorkDatabase_Impl r1 = r0.a
            r1.a = r5
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r5.g(r1)
            ddh r1 = new ddh
            r1.<init>(r5, r3)
            androidx.work.impl.WorkDatabase_Impl r0 = r0.a
            r0.v(r1)
            java.util.List r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L96:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            bwe r1 = (defpackage.bwe) r1
            r1.q(r5)
            goto L96
        La6:
            r4.a = r3
            return
        La9:
            java.lang.String r5 = r0.b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        Lbb:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r1 = move-exception
            defpackage.mjo.r(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cim.c(ckd):void");
    }

    @Override // defpackage.cke
    public final void d(ckd ckdVar, int i, int i2) {
        List c;
        chj chjVar = this.a;
        if (chjVar != null && (c = bxc.c(chjVar.n, i, i2)) != null) {
            bwq.c(new ddh(ckdVar, (byte[]) null));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((cjj) it.next()).b(new ddh(ckdVar, (byte[]) null));
            }
            cil a = this.d.a(ckdVar);
            if (a.a) {
                g(ckdVar);
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(a.b)));
        }
        chj chjVar2 = this.a;
        if (chjVar2 != null && !bxc.b(chjVar2, i, i2)) {
            ckdVar.g("DROP TABLE IF EXISTS `Dependency`");
            ckdVar.g("DROP TABLE IF EXISTS `WorkSpec`");
            ckdVar.g("DROP TABLE IF EXISTS `WorkTag`");
            ckdVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
            ckdVar.g("DROP TABLE IF EXISTS `WorkName`");
            ckdVar.g("DROP TABLE IF EXISTS `WorkProgress`");
            ckdVar.g("DROP TABLE IF EXISTS `Preference`");
            for (bwe bweVar : this.c) {
            }
            this.d.b(ckdVar);
            return;
        }
        throw new IllegalStateException(a.aj(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    @Override // defpackage.cke
    public final void e() {
    }
}
