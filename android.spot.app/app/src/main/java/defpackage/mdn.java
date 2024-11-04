package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdn extends med {
    final /* synthetic */ mdo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdn(mdo mdoVar) {
        super(mdoVar.b.e);
        this.a = mdoVar;
    }

    @Override // defpackage.med
    public final void a() {
        int i = mkl.a;
        mdo mdoVar = this.a;
        if (mdoVar.a != null) {
            return;
        }
        try {
            mdoVar.c.g();
        } catch (Throwable th) {
            this.a.b(mca.c.c(th).d("Failed to call onReady."));
        }
    }
}
