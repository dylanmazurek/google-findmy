package defpackage;

import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gow implements gov {
    private static final joo b = joo.m("GnpSdk");
    public final apc a;
    private final goj c;
    private final gvi d;
    private final gqz e;
    private final ktn f;

    public gow(goj gojVar, apc apcVar, gvi gviVar, gqz gqzVar, ktn ktnVar) {
        gviVar.getClass();
        gqzVar.getClass();
        ktnVar.getClass();
        this.c = gojVar;
        this.a = apcVar;
        this.d = gviVar;
        this.e = gqzVar;
        this.f = ktnVar;
    }

    @Override // defpackage.gov
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [gur, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, gvl] */
    @Override // defpackage.gov
    public final void b(Intent intent, gnd gndVar, long j) {
        gndVar.getClass();
        b.k().r("Account changed event received.");
        ktn ktnVar = this.f;
        this.e.a(new grb(null, null, 2, (gnv) ktnVar.d, (gri) ktnVar.a, ktnVar.b, ktnVar.c));
        try {
            Set a = this.d.a();
            for (goa goaVar : this.c.b()) {
                if (!a.contains(goaVar.b)) {
                    mpp.n(mnc.a, new dzk(this, goaVar, (mmx) null, 14));
                }
            }
        } catch (gvh e) {
            this.e.a(this.f.j(lcr.FAILED_ACCOUNT_DATA_CLEANUP));
            ((jol) ((jol) b.g()).i(e)).r("Account cleanup skipped due to error getting device accounts");
        }
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        return amr.i("android.accounts.LOGIN_ACCOUNTS_CHANGED", intent.getAction());
    }
}
