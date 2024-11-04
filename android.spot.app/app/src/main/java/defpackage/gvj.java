package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvj implements gvi {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;

    public gvj(Context context) {
        this.b = context;
    }

    @Override // defpackage.gvi
    public final Set a() {
        int i = 0;
        if (frx.aF(this.b, "android.permission.GET_ACCOUNTS") && !frx.aG()) {
            HashSet hashSet = new HashSet();
            Account[] accountsByType = AccountManager.get(this.b).getAccountsByType("com.google");
            int length = accountsByType.length;
            while (i < length) {
                hashSet.add(accountsByType[i].name);
                i++;
            }
            return hashSet;
        }
        ((jol) a.k().j("com/google/android/libraries/notifications/platform/internal/util/deviceaccounts/impl/DeviceAccountsUtilImpl", "getAccountsViaGmsCore", 72, "DeviceAccountsUtilImpl.java")).r("Try to retrieve accounts list from Accounts ContentProvider.");
        ContentProviderClient acquireContentProviderClient = this.b.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient != null) {
            try {
                try {
                    Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", null).getParcelableArray("accounts");
                    HashSet hashSet2 = new HashSet();
                    int length2 = parcelableArray.length;
                    while (i < length2) {
                        hashSet2.add(((Account) parcelableArray[i]).name);
                        i++;
                    }
                    return hashSet2;
                } catch (Exception e) {
                    throw new gvh(e);
                }
            } finally {
                acquireContentProviderClient.release();
            }
        }
        throw new gvh();
    }

    @Override // defpackage.gvi
    public final boolean b(String str) {
        try {
            return a().contains(str);
        } catch (gvh e) {
            ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/platform/internal/util/deviceaccounts/impl/DeviceAccountsUtilImpl", "hasCorrespondingAccountOnDevice", '9', "DeviceAccountsUtilImpl.java")).r("HasCorrespondingAccountOnDevice fell back to true");
            return true;
        }
    }
}
