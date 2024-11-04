package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdk extends med {
    final /* synthetic */ mbc a;
    final /* synthetic */ mdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdk(mdo mdoVar, mbc mbcVar) {
        super(mdoVar.b.e);
        this.a = mbcVar;
        this.b = mdoVar;
    }

    @Override // defpackage.med
    public final void a() {
        int i = mkl.a;
        mdo mdoVar = this.b;
        if (mdoVar.a != null) {
            return;
        }
        try {
            mdoVar.c.S(this.a);
        } catch (Throwable th) {
            this.b.b(mca.c.c(th).d("Failed to read headers"));
        }
    }
}
