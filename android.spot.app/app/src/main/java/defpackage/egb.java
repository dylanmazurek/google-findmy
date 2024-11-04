package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class egb extends ecr implements lsc {
    private ContextWrapper am;
    private boolean an;
    private volatile lrr ao;
    private final Object ap = new Object();
    private boolean aq = false;

    private final void aI() {
        if (this.am == null) {
            this.am = new lrv(super.x(), this);
            this.an = hzc.ag(super.x());
        }
    }

    @Override // defpackage.ag, defpackage.ces
    public final cgn P() {
        return iqg.G(this, super.P());
    }

    @Override // defpackage.ag
    public final void Z(Activity activity) {
        super.Z(activity);
        ContextWrapper contextWrapper = this.am;
        boolean z = true;
        if (contextWrapper != null && lrr.a(contextWrapper) != activity) {
            z = false;
        }
        iqg.D(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aI();
        aJ();
    }

    protected final void aJ() {
        if (!this.aq) {
            this.aq = true;
            efh efhVar = (efh) this;
            dwh dwhVar = (dwh) r();
            dwj dwjVar = dwhVar.i;
            Object obj = dwjVar.aS.b;
            efhVar.au = (efy) dwjVar.B.a();
            efhVar.av = (egh) dwhVar.i.E.a();
            efhVar.aw = (evo) dwhVar.i.az.a();
            efhVar.ax = dwhVar.a();
            efhVar.aF = (dhx) dwhVar.i.k.a();
            efhVar.aA = (ehr) dwhVar.j.e.a();
            efhVar.aE = (apc) dwhVar.i.z.a();
            efhVar.aB = (dyr) dwhVar.j.g.a();
            efhVar.ay = (ejo) dwhVar.i.D.a();
            efhVar.aC = (exa) dwhVar.i.aB.a();
            efhVar.aD = dwhVar.i.c();
            efhVar.az = new eev((ebf) dwhVar.j.c.a(), (ees) dwhVar.i.H.a(), dwhVar.i.a(), dwhVar.i.b(), (ewg) dwhVar.i.h.a(), (dxf) dwhVar.i.w.a(), (efy) dwhVar.i.B.a(), (bym) dwhVar.i.V.a(), (dhx) dwhVar.i.k.a());
        }
    }

    @Override // defpackage.ag
    public final LayoutInflater cO(Bundle bundle) {
        LayoutInflater aA = aA();
        return aA.cloneInContext(new lrv(aA, this));
    }

    @Override // defpackage.ag
    public final void f(Context context) {
        super.f(context);
        aI();
        aJ();
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.ao == null) {
            synchronized (this.ap) {
                if (this.ao == null) {
                    this.ao = new lrr(this);
                }
            }
        }
        return this.ao.r();
    }

    @Override // defpackage.ag
    public final Context x() {
        if (super.x() == null && !this.an) {
            return null;
        }
        aI();
        return this.am;
    }
}
