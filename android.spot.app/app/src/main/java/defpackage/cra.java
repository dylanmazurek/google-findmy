package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cra extends cjj {
    public static final cra c = new cra();

    private cra() {
        super(6, 7);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
