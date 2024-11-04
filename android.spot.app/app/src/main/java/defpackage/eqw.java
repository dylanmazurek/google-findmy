package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqw extends op {
    final /* synthetic */ eqx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqw(eqx eqxVar) {
        super(true);
        this.a = eqxVar;
    }

    @Override // defpackage.op
    public final void b() {
        eda edaVar = (eda) this.a.an.a().d();
        edaVar.getClass();
        if (eqx.p(edaVar.g)) {
            this.a.an.f();
        }
        h(false);
        this.a.F().onBackPressed();
    }
}
