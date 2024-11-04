package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfo extends mez {
    final /* synthetic */ mds a;
    final /* synthetic */ mfp b;

    public mfo(mfp mfpVar, mds mdsVar) {
        this.a = mdsVar;
        this.b = mfpVar;
    }

    @Override // defpackage.mez, defpackage.mds
    public final void a(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        this.b.b.a.a(mcaVar.f());
        this.a.a(mcaVar, mdrVar, mbcVar);
    }

    @Override // defpackage.mez
    protected final mds b() {
        return this.a;
    }
}
