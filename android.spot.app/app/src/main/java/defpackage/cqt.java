package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqt extends cjj {
    public static final cqt c = new cqt();

    private cqt() {
        super(11, 12);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
