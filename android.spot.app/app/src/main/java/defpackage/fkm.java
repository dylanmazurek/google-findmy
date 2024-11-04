package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkm extends fkf {
    final /* synthetic */ fkn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkm(fkn fknVar, int i) {
        super(fknVar, i, null);
        this.g = fknVar;
    }

    @Override // defpackage.fkf
    protected final void a(ConnectionResult connectionResult) {
        this.g.f.a(connectionResult);
        System.currentTimeMillis();
    }

    @Override // defpackage.fkf
    protected final boolean c() {
        this.g.f.a(ConnectionResult.a);
        return true;
    }
}
