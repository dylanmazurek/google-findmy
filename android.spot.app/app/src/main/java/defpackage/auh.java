package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auh extends aow implements bae, azz, axv {
    public final String a = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    public auj b;
    public boolean c;

    public auh(auj aujVar) {
        this.b = aujVar;
    }

    private final void u() {
        auj aujVar;
        mpn mpnVar = new mpn();
        qs.e(this, new wo(20));
        auh auhVar = (auh) mpnVar.a;
        if (auhVar == null || (aujVar = auhVar.b) == null) {
            aujVar = this.b;
        }
        bau w = w();
        if (w != null) {
            w.a(aujVar);
        }
    }

    private final void v() {
        mlh mlhVar;
        bau w;
        if (this.c) {
            this.c = false;
            if (this.t) {
                mpn mpnVar = new mpn();
                qs.e(this, new zc(mpnVar, 7));
                auh auhVar = (auh) mpnVar.a;
                if (auhVar != null) {
                    auhVar.u();
                    mlhVar = mlh.a;
                } else {
                    mlhVar = null;
                }
                if (mlhVar == null && (w = w()) != null) {
                    w.a(null);
                }
            }
        }
    }

    private final bau w() {
        aep aepVar = bcg.e;
        if (!this.k.t) {
            ll.g("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (bau) qg.f(this).l.a(aepVar);
    }

    @Override // defpackage.bae
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.azz
    public final void bR() {
        v();
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bS() {
        qo.c(this);
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bT() {
        qo.d(this);
    }

    @Override // defpackage.azz
    public final void bU(auf aufVar, int i, long j) {
        if (i == 2) {
            int i2 = aufVar.c;
            if (!a.m(i2, 4)) {
                if (a.m(i2, 5)) {
                    v();
                }
            } else {
                this.c = true;
                c();
            }
        }
    }

    public final void c() {
        mpk mpkVar = new mpk();
        mpkVar.a = true;
        qs.f(this, new zc(mpkVar, 8));
        if (mpkVar.a) {
            u();
        }
    }

    @Override // defpackage.aow
    public final void n() {
        v();
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bV() {
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bW() {
    }
}
