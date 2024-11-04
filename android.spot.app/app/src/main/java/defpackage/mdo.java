package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdo implements mds {
    public mca a;
    final /* synthetic */ mdp b;
    public final mjo c;

    public mdo(mdp mdpVar, mjo mjoVar) {
        this.b = mdpVar;
        this.c = mjoVar;
    }

    @Override // defpackage.mds
    public final void a(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        int i = mkl.a;
        lzj b = this.b.b();
        if (mcaVar.l == mbx.CANCELLED && b != null) {
            if (!b.b) {
                if (b.a - System.nanoTime() <= 0) {
                    b.b = true;
                }
            }
            mcaVar = this.b.f.a();
            mbcVar = new mbc();
        }
        this.b.c.execute(new mdm(this, mcaVar, mbcVar));
    }

    public final void b(mca mcaVar) {
        this.a = mcaVar;
        this.b.h.h(mcaVar);
    }

    @Override // defpackage.mds
    public final void c(mbc mbcVar) {
        int i = mkl.a;
        this.b.c.execute(new mdk(this, mbcVar));
    }

    @Override // defpackage.mjv
    public final void d() {
        mbf mbfVar = mbf.UNARY;
        mbf mbfVar2 = this.b.b.a;
        if (mbfVar2 != mbfVar && mbfVar2 != mbf.SERVER_STREAMING) {
            int i = mkl.a;
            this.b.c.execute(new mdn(this));
        }
    }

    @Override // defpackage.mjv
    public final void e(lrs lrsVar) {
        int i = mkl.a;
        this.b.c.execute(new mdl(this, lrsVar));
    }
}
