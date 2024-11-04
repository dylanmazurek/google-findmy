package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crb extends cjj {
    public static final crb c = new crb();

    private crb() {
        super(7, 8);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
