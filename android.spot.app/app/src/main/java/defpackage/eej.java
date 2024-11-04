package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eej extends ecr implements lsc {
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
        aL();
    }

    protected final void aL() {
        if (!this.aq) {
            this.aq = true;
            edl edlVar = (edl) this;
            dwh dwhVar = (dwh) r();
            edlVar.av = (dyr) dwhVar.j.g.a();
            edlVar.aB = (fma) dwhVar.i.j.a();
            edlVar.an = (evo) dwhVar.i.az.a();
            edlVar.aA = (dhx) dwhVar.i.k.a();
            edlVar.ao = (evy) dwhVar.i.g.a();
            edlVar.aw = (dxf) dwhVar.i.w.a();
            edlVar.ax = (ebf) dwhVar.j.c.a();
            edlVar.az = (elo) dwhVar.i.aE.a();
            edlVar.ap = dwhVar.a();
            edlVar.ay = (exa) dwhVar.i.aB.a();
            dwj dwjVar = dwhVar.i;
            iam.c((ktn) dwjVar.u.a(), (iaq) dwjVar.p.a());
            edlVar.aq = (eei) dwhVar.i.aF.a();
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
        aL();
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
