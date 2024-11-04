package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.gfl;
import defpackage.hlt;
import defpackage.huw;
import defpackage.hvq;
import defpackage.hwx;
import defpackage.hxe;
import defpackage.hxg;
import defpackage.jwu;
import defpackage.jys;
import defpackage.knd;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        hxe hxeVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (!stringExtra.contains("../") && !stringExtra.contains("/..")) {
                hvq a = hvq.a(context);
                if (a == null) {
                    hvq.e();
                    hwx.U(false);
                    return;
                }
                Map a2 = hxe.a(context);
                if (!a2.isEmpty() && (hxeVar = (hxe) a2.get(stringExtra)) != null && hxeVar.b.equals(knd.PROCESS_STABLE)) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    jys r = ((jys) jwu.h(jys.q(jwu.g(jys.q(hxg.b(a).a()), new huw(stringExtra, 4), a.b())), new gfl(hxeVar, stringExtra, a, 2), a.b())).r(25L, TimeUnit.SECONDS, a.b());
                    r.c(new hlt(r, stringExtra, goAsync, 3), a.b());
                    return;
                }
                return;
            }
            Log.w("PhenotypeBackgroundRecv", a.ag(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
        }
    }
}
