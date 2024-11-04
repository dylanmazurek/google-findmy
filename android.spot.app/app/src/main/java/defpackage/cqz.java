package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqz extends cjj {
    public static final cqz c = new cqz();

    private cqz() {
        super(4, 5);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        ckdVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
