package defpackage;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mey implements mdq {
    @Override // defpackage.mdq
    public final lyp a() {
        throw null;
    }

    protected abstract mdq b();

    @Override // defpackage.mdq
    public final void g(mfm mfmVar) {
        b().g(mfmVar);
    }

    @Override // defpackage.mdq
    public final void h(mca mcaVar) {
        b().h(mcaVar);
    }

    @Override // defpackage.mdq
    public final void i() {
        b().i();
    }

    @Override // defpackage.mdq
    public final void j(lzj lzjVar) {
        b().j(lzjVar);
    }

    @Override // defpackage.mdq
    public final void k(lzm lzmVar) {
        b().k(lzmVar);
    }

    @Override // defpackage.mdq
    public final void l(int i) {
        b().l(i);
    }

    @Override // defpackage.mdq
    public final void m(int i) {
        b().m(i);
    }

    @Override // defpackage.mdq
    public void n(mds mdsVar) {
        throw null;
    }

    @Override // defpackage.mju
    public final boolean o() {
        return b().o();
    }

    @Override // defpackage.mju
    public final void r() {
        b().r();
    }

    @Override // defpackage.mju
    public final void s() {
        b().s();
    }

    @Override // defpackage.mju
    public final void t(int i) {
        b().t(i);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", b());
        return q.toString();
    }

    @Override // defpackage.mju
    public final void u(lzb lzbVar) {
        b().u(lzbVar);
    }

    @Override // defpackage.mju
    public final void v(InputStream inputStream) {
        b().v(inputStream);
    }
}
