package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfr implements cfa {
    final /* synthetic */ cev a;
    final /* synthetic */ mpn b;
    final /* synthetic */ msw c;
    final /* synthetic */ cev d;
    final /* synthetic */ msd e;
    final /* synthetic */ mol f;
    final /* synthetic */ ncd g;

    public cfr(cev cevVar, mpn mpnVar, msw mswVar, cev cevVar2, msd msdVar, ncd ncdVar, mol molVar) {
        this.a = cevVar;
        this.b = mpnVar;
        this.c = mswVar;
        this.d = cevVar2;
        this.e = msdVar;
        this.g = ncdVar;
        this.f = molVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == this.a) {
            this.b.a = mpp.q(this.c, null, 0, new cfq(this.g, this.f, null), 3);
            return;
        }
        if (cevVar == this.d) {
            muf mufVar = (muf) this.b.a;
            if (mufVar != null) {
                mufVar.s(null);
            }
            this.b.a = null;
        }
        if (cevVar == cev.ON_DESTROY) {
            this.e.p(mlh.a);
        }
    }
}
