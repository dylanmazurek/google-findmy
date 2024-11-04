package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkf implements hkd {
    private final Context a;
    private final BroadcastReceiver b;
    private final OnAccountsUpdateListener c;

    public hkf(Context context, hjt hjtVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.a = context.getApplicationContext();
        this.c = onAccountsUpdateListener;
        this.b = new hke(this, hjtVar);
    }

    @Override // defpackage.hkd
    public final void a() {
        this.a.registerReceiver(this.b, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
    }

    @Override // defpackage.hkd
    public final void b() {
        this.a.unregisterReceiver(this.b);
    }

    public final void c(Account[] accountArr) {
        this.c.onAccountsUpdated(accountArr);
    }
}
