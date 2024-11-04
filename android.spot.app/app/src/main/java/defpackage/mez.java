package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class mez implements mds {
    @Override // defpackage.mds
    public void a(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        throw null;
    }

    protected abstract mds b();

    @Override // defpackage.mds
    public final void c(mbc mbcVar) {
        b().c(mbcVar);
    }

    @Override // defpackage.mjv
    public final void d() {
        b().d();
    }

    @Override // defpackage.mjv
    public final void e(lrs lrsVar) {
        b().e(lrsVar);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", b());
        return q.toString();
    }
}
