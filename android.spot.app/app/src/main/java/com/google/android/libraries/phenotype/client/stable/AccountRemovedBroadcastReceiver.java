package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.csf;
import defpackage.ejc;
import defpackage.hka;
import defpackage.hkn;
import defpackage.huw;
import defpackage.hvq;
import defpackage.hxg;
import defpackage.ivc;
import defpackage.jwb;
import defpackage.jwu;
import defpackage.jxv;
import defpackage.jys;
import defpackage.jyv;
import defpackage.jyz;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        String str;
        jyz jyzVar;
        jyz jyzVar2;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    str = extras.getString("authAccount");
                } else {
                    str = null;
                }
                if (str != null && (str.contains("../") || str.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.ag(str, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                hvq.e();
                hvq a = hvq.a(context);
                if (a == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                jyz[] jyzVarArr = new jyz[2];
                if (str != null) {
                    jyzVar = jwu.h(jys.q(hxg.b(a).b(new huw(str, 3), a.b())), new ejc(a, str, 20), a.b());
                } else {
                    jyzVar = jyv.a;
                }
                jyzVarArr[0] = jwb.g(jyzVar, IOException.class, new hkn(16), jxv.a);
                if (str != null) {
                    jyzVar2 = a.b().submit(new hka(context, str, 7));
                } else {
                    jyzVar2 = jyv.a;
                }
                jyzVarArr[1] = jyzVar2;
                ivc.R(jyzVarArr).a(new csf(goAsync, 14), jxv.a);
            }
        }
    }
}
