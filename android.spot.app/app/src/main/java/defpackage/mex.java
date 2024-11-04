package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mex implements mdt {
    final mca a;
    private final mdr b;

    public mex(mca mcaVar, mdr mdrVar) {
        hwx.K(!mcaVar.f(), "error must not be OK");
        this.a = mcaVar;
        this.b = mdrVar;
    }

    @Override // defpackage.mdt
    public final mdq a(mbg mbgVar, mbc mbcVar, lys lysVar, lyy[] lyyVarArr) {
        return new mew(this.a, this.b, lyyVarArr);
    }

    @Override // defpackage.mad
    public final lzz c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
