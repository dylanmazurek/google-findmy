package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdm extends med {
    final /* synthetic */ mca a;
    final /* synthetic */ mbc b;
    final /* synthetic */ mdo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdm(mdo mdoVar, mca mcaVar, mbc mbcVar) {
        super(mdoVar.b.e);
        this.a = mcaVar;
        this.b = mbcVar;
        this.c = mdoVar;
    }

    @Override // defpackage.med
    public final void a() {
        int i = mkl.a;
        this.c.b.f.b();
        mca mcaVar = this.a;
        mbc mbcVar = this.b;
        mca mcaVar2 = this.c.a;
        if (mcaVar2 != null) {
            mbcVar = new mbc();
            mcaVar = mcaVar2;
        }
        try {
            this.c.c.a(mcaVar, mbcVar);
        } finally {
            this.c.b.d.a(mcaVar.f());
        }
    }
}
