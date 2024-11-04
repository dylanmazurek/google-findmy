package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpt implements gov {
    public static final joo a = joo.m("GnpSdk");
    public final jer b;
    public final gjg c;

    public gpt(gjg gjgVar, jer jerVar) {
        this.c = gjgVar;
        this.b = jerVar;
    }

    @Override // defpackage.gov
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.gov
    public final void b(Intent intent, gnd gndVar, long j) {
        gndVar.getClass();
        mpp.n(mnc.a, new eau(this, (mmx) null, 17));
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        return amr.i("android.intent.action.BOOT_COMPLETED", intent.getAction());
    }
}
