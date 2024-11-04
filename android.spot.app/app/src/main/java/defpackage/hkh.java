package defpackage;

import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkh implements hkc {
    private final /* synthetic */ int a;

    public hkh(int i) {
        this.a = i;
    }

    @Override // defpackage.hkc
    public final hkd a(Context context, hjt hjtVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        if (this.a != 0) {
            return new hkf(context, hjtVar, onAccountsUpdateListener);
        }
        return new hkg(context, hjtVar, onAccountsUpdateListener);
    }
}
