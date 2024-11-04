package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eip extends ecr implements lsc {
    private ContextWrapper am;
    private boolean an;
    private volatile lrr ao;
    private final Object ap = new Object();
    private boolean aq = false;

    private final void aJ() {
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
        aJ();
        aI();
    }

    protected final void aI() {
        if (!this.aq) {
            this.aq = true;
            ekh ekhVar = (ekh) this;
            dwh dwhVar = (dwh) r();
            ekhVar.aq = (evo) dwhVar.i.az.a();
            ekhVar.ar = dwhVar.a();
            ekhVar.as = (ele) dwhVar.i.m.a();
            ekhVar.ay = (dhx) dwhVar.i.k.a();
            ekhVar.ax = (elo) dwhVar.i.aE.a();
            ekhVar.au = (dyr) dwhVar.j.g.a();
            ekhVar.av = (exa) dwhVar.i.aB.a();
            ekhVar.aw = dwhVar.i.c();
            ekhVar.at = new ekr((bym) dwhVar.i.V.a(), (ewf) dwhVar.i.i.a(), (ejt) dwhVar.i.I.a(), dwhVar.i.b(), (ebf) dwhVar.j.c.a(), (dxf) dwhVar.i.w.a(), (ilv) dwhVar.i.n.a());
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
        aJ();
        aI();
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
        aJ();
        return this.am;
    }
}
