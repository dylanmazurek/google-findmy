package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfq extends mfa {
    public final mdg a;
    private final meb b;

    public mfq(meb mebVar, mdg mdgVar) {
        this.b = mebVar;
        this.a = mdgVar;
    }

    @Override // defpackage.mfa, defpackage.mdt
    public final mdq a(mbg mbgVar, mbc mbcVar, lys lysVar, lyy[] lyyVarArr) {
        return new mfp(this, this.b.a(mbgVar, mbcVar, lysVar, lyyVarArr));
    }

    @Override // defpackage.mfa
    protected final meb d() {
        return this.b;
    }
}
