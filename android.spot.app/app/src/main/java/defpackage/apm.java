package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apm extends aow implements bae, axw {
    public final moh a;
    public apm b;
    public apm c;
    private final Object d = apl.a;

    public apm(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.bae
    public final Object a() {
        return this.d;
    }

    public final void c(bet betVar) {
        fr.d(this, new zc(betVar, 4));
    }

    public final void d(bet betVar) {
        apm apmVar = this.b;
        if (apmVar != null) {
            apmVar.d(betVar);
        }
        this.b = null;
    }

    public final void e(bet betVar) {
        bae baeVar;
        apm apmVar;
        apm apmVar2 = this.b;
        apm apmVar3 = null;
        if (apmVar2 != null && fr.e(apmVar2, fr.f(betVar))) {
            apmVar = apmVar2;
        } else {
            if (!this.k.t) {
                baeVar = null;
            } else {
                mpn mpnVar = new mpn();
                qs.f(this, new ud(mpnVar, this, betVar, 7));
                baeVar = (bae) mpnVar.a;
            }
            apmVar = (apm) baeVar;
        }
        if (apmVar != null && apmVar2 == null) {
            apmVar.e(betVar);
        } else if (apmVar == null && apmVar2 != null) {
            apmVar2.d(betVar);
        } else if (!amr.i(apmVar, apmVar2)) {
            if (apmVar != null) {
                apmVar.e(betVar);
                apmVar3 = apmVar;
            }
            if (apmVar2 != null) {
                apmVar2.d(betVar);
            }
            apmVar = apmVar3;
        } else if (apmVar != null) {
            apmVar.e(betVar);
        }
        this.b = apmVar;
    }

    @Override // defpackage.aow
    public final void n() {
        this.c = null;
        this.b = null;
    }
}
