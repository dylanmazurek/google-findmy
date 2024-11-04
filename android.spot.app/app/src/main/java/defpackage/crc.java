package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crc extends cjj {
    public static final crc c = new crc();

    private crc() {
        super(8, 9);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
