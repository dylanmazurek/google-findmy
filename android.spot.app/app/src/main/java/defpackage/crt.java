package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crt extends cjj {
    public crt() {
        super(17, 18);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        ckdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
