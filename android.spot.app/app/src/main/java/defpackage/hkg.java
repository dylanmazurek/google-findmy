package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkg implements hkd {
    private boolean a = false;
    private final OnAccountsUpdateListener b;
    private final AccountManager c;

    public hkg(Context context, hjt hjtVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (bqx.b(context, "android.permission.GET_ACCOUNTS") != 0) {
            iuu.q(iuu.m(new csf(hjtVar, 8), ((hju) hjtVar).c), new ems(4), jxv.a);
        }
    }

    @Override // defpackage.hkd
    public final void a() {
        synchronized (this) {
            if (!this.a) {
                this.c.addOnAccountsUpdatedListener(this.b, null, false, new String[]{"com.google"});
                this.a = true;
            }
        }
    }

    @Override // defpackage.hkd
    public final void b() {
        synchronized (this) {
            if (this.a) {
                try {
                    this.c.removeOnAccountsUpdatedListener(this.b);
                } catch (IllegalArgumentException e) {
                    Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                }
                this.a = false;
            }
        }
    }
}
