package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfw extends BroadcastReceiver {
    final /* synthetic */ jfe a;
    final /* synthetic */ Account b;

    public gfw(jfe jfeVar, Account account) {
        this.a = jfeVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gft, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Account[] v;
        ?? a = this.a.a();
        if (a != 0) {
            if (lwh.c(context)) {
                v = AccountManager.get(context).getAccounts();
            } else {
                v = bym.B(context).v();
            }
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra != -1 && intExtra < v.length && v[intExtra].equals(this.b)) {
                a.f();
            }
        }
    }
}
