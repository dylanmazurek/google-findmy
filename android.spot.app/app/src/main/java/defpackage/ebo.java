package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class ebo extends ag implements lsc {
    private ContextWrapper a;
    private boolean b;
    private volatile lrr c;
    private final Object d = new Object();
    private boolean e = false;

    private final void d() {
        if (this.a == null) {
            this.a = new lrv(super.x(), this);
            this.b = hzc.ag(super.x());
        }
    }

    @Override // defpackage.ag, defpackage.ces
    public final cgn P() {
        return iqg.G(this, super.P());
    }

    @Override // defpackage.ag
    public final void Z(Activity activity) {
        super.Z(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && lrr.a(contextWrapper) != activity) {
            z = false;
        }
        iqg.D(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d();
        a();
    }

    protected final void a() {
        if (!this.e) {
            this.e = true;
            ebl eblVar = (ebl) this;
            dwh dwhVar = (dwh) r();
            eblVar.a = (dyh) dwhVar.j.d.a();
            eblVar.b = (evy) dwhVar.i.g.a();
            eblVar.c = lsg.b(dwhVar.i.V);
            eblVar.d = (hid) dwhVar.i.aC.a();
            eblVar.e = (hba) dwhVar.i.aD.a();
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
        d();
        a();
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new lrr(this);
                }
            }
        }
        return this.c.r();
    }

    @Override // defpackage.ag
    public final Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        d();
        return this.a;
    }
}
