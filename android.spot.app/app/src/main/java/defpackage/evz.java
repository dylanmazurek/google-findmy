package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evz implements evy {
    private Account b;
    private final Map a = new HashMap();
    private final dhx c = new dhx((short[]) null);

    @Override // defpackage.evy
    public final long a(Account account) {
        Long l = (Long) this.a.get(account);
        l.getClass();
        return l.longValue();
    }

    @Override // defpackage.evy
    public final Account b() {
        return this.b;
    }

    @Override // defpackage.evy
    public final jjr c() {
        return jjr.m(this.a.keySet());
    }

    @Override // defpackage.evy
    public final void d(ewk ewkVar) {
        this.c.h(ewkVar);
    }

    @Override // defpackage.evy
    public final void e() {
        this.a.clear();
    }

    @Override // defpackage.evy
    public final void f(Account account, long j) {
        this.a.put(account, Long.valueOf(j));
    }

    @Override // defpackage.evy
    public final void g(Account account) {
        this.a.remove(account);
    }

    @Override // defpackage.evy
    public final void h(ewk ewkVar) {
        this.c.j(ewkVar);
    }

    @Override // defpackage.evy
    public final void i(Bundle bundle) {
        this.b = (Account) bundle.getParcelable("account");
        Parcelable[] parcelableArray = bundle.getParcelableArray("auth_accounts");
        long[] longArray = bundle.getLongArray("auth_timestamps");
        if (parcelableArray != null && longArray != null) {
            int length = longArray.length;
            int length2 = parcelableArray.length;
            if (length2 == length) {
                for (int i = 0; i < length2; i++) {
                    this.a.put((Account) parcelableArray[i], Long.valueOf(longArray[i]));
                }
            }
        }
    }

    @Override // defpackage.evy
    public final void j(Bundle bundle) {
        bundle.putParcelable("account", this.b);
        if (!this.a.isEmpty()) {
            Set<Map.Entry> entrySet = this.a.entrySet();
            Account[] accountArr = new Account[entrySet.size()];
            long[] jArr = new long[entrySet.size()];
            int i = 0;
            for (Map.Entry entry : entrySet) {
                accountArr[i] = (Account) entry.getKey();
                jArr[i] = ((Long) entry.getValue()).longValue();
                i++;
            }
            bundle.putParcelableArray("auth_accounts", accountArr);
            bundle.putLongArray("auth_timestamps", jArr);
        }
    }

    @Override // defpackage.evy
    public final void k(Account account) {
        if (!amr.g(this.b, account)) {
            this.b = account;
            this.c.i();
        }
    }

    @Override // defpackage.evy
    public final boolean l(Account account) {
        return this.a.containsKey(account);
    }
}
