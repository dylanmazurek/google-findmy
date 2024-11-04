package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bym {
    public final Object a;

    public bym(Object obj) {
        this.a = obj;
    }

    public static bym A() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return new bym(defaultAdapter);
    }

    public static bym B(Context context) {
        return new bym(AccountManager.get(context));
    }

    private static String C(String str) {
        return "never_ask_password_again_".concat(String.valueOf(str));
    }

    public static bym a(int i, int i2, int i3, int i4, boolean z) {
        return new bym(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static final /* synthetic */ void e(bio bioVar) {
        String str;
        if (!(bioVar instanceof bid)) {
            if (bioVar instanceof bjh) {
                bioVar.b();
                if (!a.m(2, 0)) {
                    if (!a.m(2, 1)) {
                        if (!a.m(2, 2)) {
                            bioVar.b();
                            if (!a.m(2, 0)) {
                                if (!a.m(2, 1)) {
                                    if (a.m(2, 2)) {
                                        str = "Async";
                                    } else {
                                        str = "Invalid(value=2)";
                                    }
                                } else {
                                    str = "Optional";
                                }
                            } else {
                                str = "Blocking";
                            }
                            str.toString();
                            throw new IllegalArgumentException("Unknown loading type ".concat(str));
                        }
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    try {
                        throw null;
                    } catch (Throwable th) {
                        mjo.n(th);
                        throw null;
                    }
                }
                throw null;
            }
            return;
        }
        bid bidVar = (bid) bioVar;
        bjp bjpVar = bidVar.a;
        Objects.toString(bidVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(bidVar)));
    }

    public static void g(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public final int b() {
        return ((AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void c() {
        for (int O = mkm.O(this.a); O >= 0; O--) {
            ((bah) ((njz) ((ArrayList) this.a).get(O)).a).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.bio r14, defpackage.mmx r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bym.d(bio, mmx):java.lang.Object");
    }

    public final void f() {
        synchronized (this) {
            ((se) this.a).c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void h(String str) {
        g(this.a.edit().putString("key_current_account", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void i(String str, boolean z) {
        g(this.a.edit().putBoolean(C(str), z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean j(String str) {
        return this.a.getBoolean(C(str), false);
    }

    public final void k(dxp dxpVar) {
        ((fbr) this.a).c("&cd", dxpVar.l);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fma.bp("&t", "screenview", hashMap);
        ((fbr) this.a).b(fma.bo(hashMap, hashMap2, arrayList, arrayList2));
    }

    public final void l(dxq dxqVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fma.bp("&t", "event", hashMap);
        fma.br("UI action", hashMap);
        fma.bq(dxqVar.S, hashMap);
        fma.bs(dxqVar.T, hashMap);
        ((fbr) this.a).b(fma.bo(hashMap, hashMap2, arrayList, arrayList2));
    }

    public final void m(Runnable runnable, long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "timeout needs to be greater than 0");
        ((Handler) this.a).postDelayed(runnable, j);
    }

    public final void n(Runnable runnable) {
        ((Handler) this.a).removeCallbacks(runnable);
    }

    public final void o(gbp gbpVar) {
        hwx.U(!((ljj) this.a).ao(gbpVar.b));
        Object obj = this.a;
        int f = gbpVar.b.f();
        ljh ljhVar = (ljh) obj;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        gbr gbrVar = (gbr) ((ljj) obj).b;
        gbr gbrVar2 = gbr.d;
        ljr ljrVar = gbrVar.c;
        if (!ljrVar.c()) {
            gbrVar.c = ljn.n(ljrVar);
        }
        gbrVar.c.g(f);
        ((ljj) this.a).ap(gbpVar.b, gbpVar.a);
    }

    public final fyy p(String str) {
        return new fyy(((BluetoothAdapter) this.a).getRemoteDevice(str));
    }

    public final boolean q() {
        return ((BluetoothAdapter) this.a).isEnabled();
    }

    public final void r(Exception exc) {
        ((fxv) this.a).r(exc);
    }

    public final void s(Object obj) {
        ((fxv) this.a).s(obj);
    }

    public final boolean t(Exception exc) {
        fma.aS(exc, "Exception must not be null");
        Object obj = this.a;
        fxv fxvVar = (fxv) obj;
        synchronized (fxvVar.a) {
            if (((fxv) obj).b) {
                return false;
            }
            ((fxv) obj).b = true;
            ((fxv) obj).d = exc;
            fxvVar.e.d((fxs) obj);
            return true;
        }
    }

    public final boolean u(Object obj) {
        return ((fxv) this.a).t(obj);
    }

    public final Account[] v() {
        jax c = jbu.c("AccountManager.getAccounts");
        try {
            Account[] accounts = ((AccountManager) this.a).getAccounts();
            c.close();
            return accounts;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int w(String str) {
        return ((Context) this.a).checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo x(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo y(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final boolean z(lqc lqcVar) {
        if (eyf.r(lqcVar, ((elo) this.a).h())) {
            return true;
        }
        return false;
    }

    public bym(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public bym(char[] cArr) {
        this.a = Build.VERSION.SDK_INT >= 28 ? new bjg(1) : new bjg(0);
    }

    public bym(int[] iArr) {
        this.a = new fxv();
    }

    public bym(bym bymVar) {
        this.a = new fxv();
        njz njzVar = new njz(this, null);
        ((fxv) bymVar.a).n(new fxh(njzVar));
    }

    public bym(fmn fmnVar) {
        fma.aR(fmnVar);
        this.a = fmnVar;
    }

    public /* synthetic */ bym(String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

    public bym(byte[] bArr, byte[] bArr2) {
        this.a = new se((byte[]) null);
    }

    public bym(Context context) {
        this.a = context.getApplicationContext();
    }

    public bym(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new bzg(uri, clipDescription, uri2) : new bzh(uri, clipDescription, uri2);
    }

    public bym(jer jerVar) {
        this.a = (fzi) jerVar.f();
    }

    public bym(ljh ljhVar) {
        hwx.K(((juv) ljhVar.b).c != 0, "VeIdentifier must be non-zero");
        this.a = ljhVar;
    }

    public bym(byte[] bArr) {
        this.a = new ArrayList();
    }

    public bym() {
        this.a = new AtomicInteger(0);
    }

    public bym(int i) {
        ljj ljjVar = (ljj) gbr.d.k();
        this.a = ljjVar;
        ljj ljjVar2 = ljjVar;
        if (!ljjVar2.b.y()) {
            ljjVar2.t();
        }
        gbr gbrVar = (gbr) ljjVar.b;
        gbrVar.b = i - 1;
        gbrVar.a |= 1;
    }

    public bym(short[] sArr) {
        this.a = new Handler();
    }

    public bym(fbr fbrVar) {
        fbrVar.getClass();
        this.a = fbrVar;
    }

    public bym(pk pkVar, Activity activity) {
        this.a = activity;
        pkVar.b("local_setup", (cs) activity, new pq(), new dyd(this, 1));
    }

    public bym(Context context, byte[] bArr) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.getClass();
        this.a = defaultSharedPreferences;
    }

    public bym(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        fex fexVar = new fex(context, "FCM_CLIENT_EVENT_LOGGING");
        fexVar.b(ffm.b);
        ffq ffqVar = new ffq(fexVar.a, fexVar.b, fexVar.e, fexVar.d, fexVar.c, fexVar.f);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", "FCM_CLIENT_EVENT_LOGGING", Integer.valueOf(Integer.parseInt("FCM_CLIENT_EVENT_LOGGING"))));
        } catch (NumberFormatException unused) {
            this.a = ffqVar;
        }
    }
}
