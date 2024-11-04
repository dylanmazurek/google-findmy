package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncc implements msd, mvj {
    public final mse a;
    final /* synthetic */ ncd b;

    public ncc(ncd ncdVar, mse mseVar) {
        this.b = ncdVar;
        this.a = mseVar;
    }

    @Override // defpackage.mvj
    public final void D(nai naiVar, int i) {
        this.a.D(naiVar, i);
    }

    @Override // defpackage.msd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.msd
    public final void d(moh mohVar) {
        throw null;
    }

    @Override // defpackage.msd
    public final /* bridge */ /* synthetic */ void e(Object obj, moh mohVar) {
        boolean z = msy.a;
        this.b.a.c(null);
        this.a.e(obj, new naq(this.b, 3));
    }

    @Override // defpackage.msd
    public final /* bridge */ /* synthetic */ void f(mst mstVar, Object obj) {
        throw null;
    }

    @Override // defpackage.msd
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.msd
    public final /* synthetic */ Object h(Object obj, moh mohVar) {
        boolean z = msy.a;
        naq naqVar = new naq(this.b, 4);
        nbj F = this.a.F((mlh) obj, naqVar);
        if (F != null) {
            this.b.a.c(null);
        }
        return F;
    }

    @Override // defpackage.msd
    public final void i(Throwable th) {
        throw null;
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.a.b;
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        this.a.p(obj);
    }
}
