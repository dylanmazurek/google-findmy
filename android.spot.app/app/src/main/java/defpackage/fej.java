package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fej {
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final String b = "androidPackageName";
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final gok d = new gok("GoogleAuthUtil");

    public static TokenData a(final Context context, final Account account, final String str, Bundle bundle) {
        fma.aM("Calling this from your main thread can lead to deadlock");
        fma.aQ(str, "Scope cannot be empty or null.");
        o(account);
        f(context, 8400000);
        final Bundle bundle2 = new Bundle(bundle);
        n(context, bundle2);
        hwa.f(context);
        if (luj.c() && i(context)) {
            fes fesVar = new fes(context);
            fma.aQ(str, "Scope cannot be null!");
            fjy fjyVar = new fjy();
            fjyVar.b = new Feature[]{fec.c};
            fjyVar.a = new fuo(account, str, bundle2, 1);
            fjyVar.c = 1512;
            try {
                Bundle bundle3 = (Bundle) b(fesVar.h(fjyVar.a()), "token retrieval");
                l(bundle3);
                return k(context, bundle3);
            } catch (fhn e) {
                g(e, "token retrieval");
            }
        }
        return (TokenData) j(context, c, new fei() { // from class: fef
            @Override // defpackage.fei
            public final Object a(IBinder iBinder) {
                ezw ezwVar;
                String[] strArr = fej.a;
                if (iBinder == null) {
                    ezwVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    if (queryLocalInterface instanceof ezw) {
                        ezwVar = (ezw) queryLocalInterface;
                    } else {
                        ezwVar = new ezw(iBinder);
                    }
                }
                Bundle bundle4 = bundle2;
                String str2 = str;
                Account account2 = account;
                Parcel a2 = ezwVar.a();
                duh.c(a2, account2);
                a2.writeString(str2);
                duh.c(a2, bundle4);
                Parcel b2 = ezwVar.b(5, a2);
                Bundle bundle5 = (Bundle) duh.a(b2, Bundle.CREATOR);
                b2.recycle();
                if (bundle5 != null) {
                    return fej.k(context, bundle5);
                }
                throw new IOException("Service call returned null");
            }
        });
    }

    public static Object b(fxs fxsVar, String str) {
        try {
            return fma.p(fxsVar);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.q(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.q(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof fhn) {
                throw ((fhn) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.q(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static String c(Context context, String str) {
        fma.aQ(str, "accountName must be provided");
        fma.aM("Calling this from your main thread can lead to deadlock");
        f(context, 8400000);
        return d(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String d(Context context, Account account, String str, Bundle bundle) {
        o(account);
        return a(context, account, str, bundle).b;
    }

    public static void e(Context context, String str) {
        fma.aM("Calling this from your main thread can lead to deadlock");
        f(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        hwa.f(context);
        if (luj.c() && i(context)) {
            fes fesVar = new fes(context);
            ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.b = str;
            fjy fjyVar = new fjy();
            fjyVar.b = new Feature[]{fec.c};
            fjyVar.a = new fep(clearTokenRequest, 0);
            fjyVar.c = 1513;
            try {
                b(fesVar.h(fjyVar.a()), "clear token");
                return;
            } catch (fhn e) {
                g(e, "clear token");
            }
        }
        j(context, c, new feg(str, bundle));
    }

    public static void f(Context context, int i) {
        try {
            fhd.d(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new fed(e.getMessage(), e);
        } catch (fhb e2) {
            e = e2;
            throw new fed(e.getMessage(), e);
        } catch (fhc e3) {
            throw new fek(e3.getMessage(), new Intent(e3.a));
        }
    }

    public static void g(fhn fhnVar, String str) {
        d.q("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(fhnVar));
    }

    public static void h(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        feu a2 = feu.a(str2);
        gok gokVar = d;
        gokVar.q(String.format("[GoogleAuthUtil] error status:%s with method:%s", a2, str), new Object[0]);
        if (!feu.BAD_AUTHENTICATION.equals(a2) && !feu.CAPTCHA.equals(a2) && !feu.NEED_PERMISSION.equals(a2) && !feu.NEED_REMOTE_CONSENT.equals(a2) && !feu.NEEDS_BROWSER.equals(a2) && !feu.USER_CANCEL.equals(a2) && !feu.DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !feu.DM_INTERNAL_ERROR.equals(a2) && !feu.DM_SYNC_DISABLED.equals(a2) && !feu.DM_ADMIN_BLOCKED.equals(a2) && !feu.DM_ADMIN_PENDING_APPROVAL.equals(a2) && !feu.DM_STALE_SYNC_REQUIRED.equals(a2) && !feu.DM_DEACTIVATED.equals(a2) && !feu.DM_REQUIRED.equals(a2) && !feu.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !feu.DM_SCREENLOCK_REQUIRED.equals(a2)) {
            if (!feu.NETWORK_ERROR.equals(a2) && !feu.SERVICE_UNAVAILABLE.equals(a2) && !feu.INTNERNAL_ERROR.equals(a2) && !feu.AUTH_SECURITY_ERROR.equals(a2) && !feu.ACCOUNT_NOT_PRESENT.equals(a2)) {
                throw new fed(str2);
            }
            throw new IOException(str2);
        }
        hwa.f(context);
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(str2, intent, fel.AUTH_INSTANTIATION);
        }
        fgp fgpVar = fgp.a;
        int a3 = fhd.a(context);
        if (a3 >= 233800000 && pendingIntent == null) {
            gokVar.o(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(a3), str, 233800000), new Object[0]);
        }
        if (intent == null) {
            gokVar.o(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    public static boolean i(Context context) {
        if (fgp.a.g(context, 17895000) != 0) {
            return false;
        }
        ljv ljvVar = luj.a.a().a().a;
        String str = context.getApplicationInfo().packageName;
        Iterator it = ljvVar.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static Object j(Context context, ComponentName componentName, fei feiVar) {
        fgl fglVar = new fgl();
        fkw a2 = fkw.a(context);
        try {
            try {
                if (a2.b(new fkv(componentName), fglVar, "GoogleAuthUtil")) {
                    try {
                        fma.aM("BlockingServiceConnection.getService() called on main thread");
                        if (!fglVar.a) {
                            fglVar.a = true;
                            return feiVar.a((IBinder) fglVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException | TimeoutException e) {
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.c(componentName, fglVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static TokenData k(Context context, Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        h(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new fed("Invalid state. Shouldn't happen");
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        d.q("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    public static Account[] m(Context context) {
        fma.aP("com.google");
        try {
            int i = fgq.c;
            fhd.d(context, 8400000);
            if (Build.VERSION.SDK_INT >= 23) {
                fma.aR(context);
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (acquireContentProviderClient != null) {
                    try {
                        try {
                            Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                            if (call != null) {
                                Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                                if (parcelableArray != null) {
                                    Account[] accountArr = new Account[parcelableArray.length];
                                    for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                        accountArr[i2] = (Account) parcelableArray[i2];
                                    }
                                    return accountArr;
                                }
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            throw new RemoteException("Null result from AccountChimeraContentProvider");
                        } catch (RemoteException e) {
                            d.p("RemoteException when fetching accounts", e, new Object[0]);
                            throw e;
                        } catch (Exception e2) {
                            d.p("Exception when getting accounts", e2, new Object[0]);
                            throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                        }
                    } finally {
                        acquireContentProviderClient.release();
                    }
                }
                throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
            }
            return AccountManager.get(context).getAccountsByType("com.google");
        } catch (GooglePlayServicesIncorrectManifestValueException unused) {
            throw new fhb();
        }
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = a;
            for (int i = 0; i < 3; i++) {
                if (strArr[i].equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }
}
