package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dib implements dsw, dsm {
    public volatile dig a;
    public final List b;
    public final dgq c;
    private volatile dsi d;
    private volatile Object e;
    private final mwi f;

    public dib(mwi mwiVar, dgq dgqVar) {
        mwiVar.getClass();
        this.f = mwiVar;
        this.c = dgqVar;
        this.b = new ArrayList();
        if (dgqVar instanceof did) {
            this.a = ((did) dgqVar).a;
        } else if (dgqVar instanceof dia) {
            mpp.q(mwiVar, null, 0, new eax(this, (mmx) null, 1), 3);
        }
    }

    @Override // defpackage.dsm
    public final boolean a(dlb dlbVar) {
        Object obj = this.e;
        dsi dsiVar = this.d;
        if (obj != null && dsiVar != null && !dsiVar.l() && !dsiVar.n()) {
            this.f.j((Object) new dif(dih.d, obj));
            return false;
        }
        return false;
    }

    @Override // defpackage.dsm
    public final boolean b(Object obj) {
        return false;
    }

    @Override // defpackage.dsw
    public final dsi c() {
        return this.d;
    }

    @Override // defpackage.dsw
    public final void d(dsi dsiVar) {
        this.d = dsiVar;
    }

    @Override // defpackage.dsw
    public final void e(dso dsoVar) {
        dig digVar = this.a;
        if (digVar != null) {
            dsoVar.e(digVar.a, digVar.b);
            return;
        }
        synchronized (this) {
            dig digVar2 = this.a;
            if (digVar2 != null) {
                dsoVar.e(digVar2.a, digVar2.b);
            } else {
                this.b.add(dsoVar);
            }
        }
    }

    @Override // defpackage.dsw
    public final void f(dso dsoVar) {
        synchronized (this) {
            this.b.remove(dsoVar);
        }
    }

    @Override // defpackage.dsw
    public final void g(Object obj) {
        dih dihVar;
        this.e = obj;
        dsi dsiVar = this.d;
        if (dsiVar != null && dsiVar.l()) {
            dihVar = dih.c;
        } else {
            dihVar = dih.b;
        }
        this.f.j((Object) new dif(dihVar, obj));
    }

    @Override // defpackage.dsw
    public final void k() {
        this.e = null;
        this.f.j((Object) new die(dih.a));
    }

    @Override // defpackage.dsw
    public final void l() {
        this.f.j((Object) new die(dih.d));
    }

    @Override // defpackage.dsw
    public final void m() {
        this.e = null;
        this.f.j((Object) new die(dih.b));
    }

    @Override // defpackage.drk
    public final void h() {
    }

    @Override // defpackage.drk
    public final void i() {
    }

    @Override // defpackage.drk
    public final void j() {
    }
}
