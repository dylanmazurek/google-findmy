package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cru extends cjj {
    public cru() {
        super(18, 19);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
