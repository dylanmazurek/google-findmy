package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfp extends mey {
    final /* synthetic */ mdq a;
    final /* synthetic */ mfq b;

    public mfp(mfq mfqVar, mdq mdqVar) {
        this.a = mdqVar;
        this.b = mfqVar;
    }

    @Override // defpackage.mey
    protected final mdq b() {
        return this.a;
    }

    @Override // defpackage.mey, defpackage.mdq
    public final void n(mds mdsVar) {
        this.b.a.b();
        this.a.n(new mfo(this, mdsVar));
    }
}
