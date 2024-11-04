package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crw extends cjj {
    public crw() {
        super(20, 21);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
