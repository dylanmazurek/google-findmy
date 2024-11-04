package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvu extends fvr {
    public final fjo a;

    public fvu(fjo fjoVar) {
        this.a = fjoVar;
    }

    @Override // defpackage.fvr
    public final void d(int i, Bundle bundle) {
        if (i != 0) {
            String u = fma.u();
            if (Log.isLoggable(u, 5)) {
                Log.w(u, "Non-success data changed callback received.");
                return;
            }
            return;
        }
        fjo fjoVar = this.a;
        bundle.getString("account");
        bundle.getString("pagegaiaid");
        bundle.getInt("scope");
        fjoVar.b(new fvt(0));
    }
}
