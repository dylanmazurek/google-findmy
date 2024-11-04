package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crx extends cjj {
    public crx() {
        super(22, 23);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
