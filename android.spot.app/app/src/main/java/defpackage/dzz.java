package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzz extends ag implements lsc {
    private ContextWrapper a;
    private boolean b;
    private volatile lrr c;
    private final Object d = new Object();
    private boolean e = false;

    private final void a() {
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
        a();
        d();
    }

    @Override // defpackage.ag
    public final LayoutInflater cO(Bundle bundle) {
        LayoutInflater aA = aA();
        return aA.cloneInContext(new lrv(aA, this));
    }

    protected final void d() {
        if (!this.e) {
            this.e = true;
            ((dzl) this).a = (dzi) ((dwh) r()).e.a();
        }
    }

    @Override // defpackage.ag
    public final void f(Context context) {
        super.f(context);
        a();
        d();
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
        a();
        return this.a;
    }
}
