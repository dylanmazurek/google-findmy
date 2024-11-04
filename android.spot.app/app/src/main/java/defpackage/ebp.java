package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class ebp extends v implements lsc {
    private ContextWrapper af;
    private boolean ag;
    private volatile lrr ah;
    private final Object ai = new Object();
    private boolean aj = false;

    private final void aG() {
        if (this.af == null) {
            this.af = new lrv(super.x(), this);
            this.ag = hzc.ag(super.x());
        }
    }

    @Override // defpackage.ag, defpackage.ces
    public final cgn P() {
        return iqg.G(this, super.P());
    }

    @Override // defpackage.ag
    public final void Z(Activity activity) {
        super.Z(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && lrr.a(contextWrapper) != activity) {
            z = false;
        }
        iqg.D(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aG();
        aF();
    }

    protected final void aF() {
        if (!this.aj) {
            this.aj = true;
            ((ebm) this).ah = (ehr) ((dwh) r()).j.e.a();
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final LayoutInflater cO(Bundle bundle) {
        LayoutInflater cO = super.cO(bundle);
        return cO.cloneInContext(new lrv(cO, this));
    }

    @Override // defpackage.v, defpackage.ag
    public final void f(Context context) {
        super.f(context);
        aG();
        aF();
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.ah == null) {
            synchronized (this.ai) {
                if (this.ah == null) {
                    this.ah = new lrr(this);
                }
            }
        }
        return this.ah.r();
    }

    @Override // defpackage.ag
    public final Context x() {
        if (super.x() == null && !this.ag) {
            return null;
        }
        aG();
        return this.af;
    }
}
