package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adf implements afq {
    private final mol a;
    private final msw b;
    private muf c;

    public adf(mnb mnbVar, mol molVar) {
        this.a = molVar;
        this.b = msz.m(mnbVar);
    }

    @Override // defpackage.afq
    public final void c() {
        muf mufVar = this.c;
        if (mufVar != null) {
            mufVar.s(mkm.aI("Old job was still running!", null));
        }
        this.c = mpp.q(this.b, null, 0, this.a, 3);
    }

    @Override // defpackage.afq
    public final void h() {
        muf mufVar = this.c;
        if (mufVar != null) {
            mufVar.s(new adh());
        }
        this.c = null;
    }

    @Override // defpackage.afq
    public final void i() {
        muf mufVar = this.c;
        if (mufVar != null) {
            mufVar.s(new adh());
        }
        this.c = null;
    }
}
