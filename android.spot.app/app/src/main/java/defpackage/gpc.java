package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpc implements gov {
    public static final joo a = joo.m("GnpSdk");
    public final gjg b;

    public gpc(gjg gjgVar) {
        this.b = gjgVar;
    }

    @Override // defpackage.gov
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.gov
    public final void b(Intent intent, gnd gndVar, long j) {
        gndVar.getClass();
        mpp.n(mnc.a, new eau(this, (mmx) null, 16));
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        return amr.i("android.intent.action.LOCALE_CHANGED", intent.getAction());
    }
}
