package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctj implements ctv {
    public final ConnectivityManager a;
    public final long b;

    public ctj(ConnectivityManager connectivityManager, long j) {
        this.a = connectivityManager;
        this.b = j;
    }

    @Override // defpackage.ctv
    public final mwv a(cpl cplVar) {
        cplVar.getClass();
        return new mwq(new zl(cplVar, this, (mmx) null, 2));
    }

    @Override // defpackage.ctv
    public final boolean b(cvu cvuVar) {
        if (cvuVar.j.a() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ctv
    public final boolean c(cvu cvuVar) {
        if (!b(cvuVar)) {
            return false;
        }
        throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    }
}
