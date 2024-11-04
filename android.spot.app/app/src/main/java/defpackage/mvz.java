package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvz extends mrt implements mvy {
    public final mvy b;

    public mvz(mnb mnbVar, mvy mvyVar) {
        super(mnbVar, true);
        this.b = mvyVar;
    }

    @Override // defpackage.mwk
    public final mvq A() {
        return this.b.A();
    }

    @Override // defpackage.mun
    public final void H(Throwable th) {
        mvy mvyVar = this.b;
        CancellationException D = D(th, null);
        mvyVar.s(D);
        L(D);
    }

    @Override // defpackage.mwk
    public final Object d(mmx mmxVar) {
        throw null;
    }

    @Override // defpackage.mwk
    public final Object e(mmx mmxVar) {
        throw null;
    }

    @Override // defpackage.mwl
    public final Object h(Object obj, mmx mmxVar) {
        return this.b.h(obj, mmxVar);
    }

    @Override // defpackage.mwk
    public final Object i() {
        return this.b.i();
    }

    @Override // defpackage.mwl
    public final Object j(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.mwl
    public final void r(moh mohVar) {
        throw null;
    }

    @Override // defpackage.mun, defpackage.muf
    public final void s(CancellationException cancellationException) {
        if (dq()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new mug(c(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.mwl
    public final boolean u(Throwable th) {
        return this.b.u(th);
    }

    @Override // defpackage.mwl
    public final boolean x() {
        throw null;
    }
}
