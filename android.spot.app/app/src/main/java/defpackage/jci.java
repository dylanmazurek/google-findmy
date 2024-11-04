package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jci extends ArCoreApk {
    public static final jci a = new jci();
    public Exception c;
    public Exception d;
    public ArCoreApk.Availability f;
    public boolean g;
    private boolean i;
    private boolean j;
    private int k;
    private long l;
    private jcs m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    public final Handler b = new Handler(Looper.getMainLooper());
    private final Messenger h = new Messenger(new jcf(this, Looper.getMainLooper()));
    boolean e = true;

    private static int g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0) {
                if (packageInfo.services != null) {
                    if (packageInfo.services.length != 0) {
                        return 0;
                    }
                }
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: NameNotFoundException -> 0x0086, all -> 0x00a8, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0086, blocks: (B:25:0x005a, B:27:0x0069, B:35:0x007a, B:36:0x0085), top: B:24:0x005a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void h(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.n     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> La8
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9f java.lang.Throwable -> La8
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9f java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.ar.core"
            boolean r2 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L97
            java.lang.String r2 = "com.google.ar.core"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La8
            r2.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = "required"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La8
            r5.o = r2     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.ar.core.min_apk_version"
            boolean r2 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L8f
            java.lang.String r2 = "com.google.ar.core.min_apk_version"
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> La8
            r5.p = r2     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.ar.core.load_32bit_so_from_split_module"
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> La8
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L57
            boolean r1 = defpackage.fr$$ExternalSyntheticApiModelOutline1.m119m()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L57
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> La8
            int r1 = r1.length     // Catch: java.lang.Throwable -> La8
            if (r1 <= 0) goto L57
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            r5.q = r1     // Catch: java.lang.Throwable -> La8
            android.content.pm.PackageInfo r6 = r0.getPackageInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            android.content.pm.ActivityInfo[] r6 = r6.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            java.lang.Class<com.google.ar.core.InstallActivity> r0 = com.google.ar.core.InstallActivity.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            int r1 = r6.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
        L67:
            if (r3 >= r1) goto L7a
            r4 = r6[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            java.lang.String r4 = r4.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            boolean r4 = r0.equals(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            if (r4 == 0) goto L77
            r5.n = r2     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return
        L77:
            int r3 = r3 + 1
            goto L67
        L7a:
            com.google.ar.core.exceptions.FatalException r6 = new com.google.ar.core.exceptions.FatalException     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            java.lang.String r1 = "Application manifest must contain activity "
            java.lang.String r0 = defpackage.a.ao(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            r6.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
            throw r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86 java.lang.Throwable -> La8
        L86:
            r6 = move-exception
            com.google.ar.core.exceptions.FatalException r0 = new com.google.ar.core.exceptions.FatalException     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "Could not load application package info"
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        L8f:
            com.google.ar.core.exceptions.FatalException r6 = new com.google.ar.core.exceptions.FatalException     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "Application manifest must contain meta-data com.google.ar.core.min_apk_version"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La8
            throw r6     // Catch: java.lang.Throwable -> La8
        L97:
            com.google.ar.core.exceptions.FatalException r6 = new com.google.ar.core.exceptions.FatalException     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "Application manifest must contain meta-data com.google.ar.core"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La8
            throw r6     // Catch: java.lang.Throwable -> La8
        L9f:
            r6 = move-exception
            com.google.ar.core.exceptions.FatalException r0 = new com.google.ar.core.exceptions.FatalException     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "Could not load application package metadata"
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        La8:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jci.h(android.content.Context):void");
    }

    private final boolean i(Context context) {
        h(context);
        return this.q;
    }

    private static final Bundle j() {
        ActivityOptions makeBasic;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (Build.VERSION.SDK_INT > 33) {
            makeBasic = ActivityOptions.makeBasic();
            pendingIntentBackgroundActivityStartMode = makeBasic.setPendingIntentBackgroundActivityStartMode(1);
            return pendingIntentBackgroundActivityStartMode.toBundle();
        }
        return null;
    }

    private static final boolean k(Context context) {
        ArCoreApk.Availability availability;
        Bundle bundle = new Bundle();
        bundle.putString("moduleName", "native_library_split");
        Bundle call = context.getContentResolver().call(iuu.i(), "splitCheckInstall", context.getPackageName(), bundle);
        if (call == null) {
            availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        } else if (call.getBoolean("splitCheckInstallResult")) {
            availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
        } else {
            availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
        }
        if (availability == ArCoreApk.Availability.SUPPORTED_INSTALLED) {
            return true;
        }
        return false;
    }

    private final void l(Context context, List list) {
        PendingIntent pendingIntent;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("moduleName", new ArrayList<>(list));
        bundle.putParcelable("splitInstallMessenger", this.h);
        bundle.putBoolean("splitInstallDisplayDialog", true);
        Bundle call = context.getContentResolver().call(iuu.i(), "splitInstall", context.getPackageName(), bundle);
        if (call == null) {
            pendingIntent = null;
        } else {
            pendingIntent = (PendingIntent) call.getParcelable("splitInstallIntent");
        }
        if (pendingIntent != null) {
            try {
                context.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0, j());
                ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
                return;
            } catch (IntentSender.SendIntentException | RuntimeException e) {
                Log.w("ARCore-ArCoreApk", "Download activity launch failed.", e);
                this.d = new RuntimeException("Download activity launch failed.");
                ArCoreApk.InstallStatus installStatus2 = ArCoreApk.InstallStatus.INSTALLED;
                return;
            }
        }
        ArCoreApk.InstallStatus installStatus3 = ArCoreApk.InstallStatus.INSTALLED;
    }

    private static final void m(Exception exc) {
        if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
            if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                if (exc instanceof RuntimeException) {
                    Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                    throw ((RuntimeException) exc);
                }
                throw new RuntimeException("Unexpected exception type", exc);
            }
            Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
            throw ((UnavailableUserDeclinedInstallationException) exc);
        }
        Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
        throw ((UnavailableDeviceNotCompatibleException) exc);
    }

    private static final ArCoreApk.InstallStatus n(Activity activity) {
        PendingIntent a2 = jdb.a(activity);
        if (a2 != null) {
            try {
                activity.startIntentSender(a2.getIntentSender(), null, 0, 0, 0, j());
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException e) {
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    public final synchronized jcs a(Context context) {
        if (this.m == null) {
            jcs jcsVar = new jcs(null);
            jcsVar.a(context.getApplicationContext());
            this.m = jcsVar;
        }
        return this.m;
    }

    public final void b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        ArCoreApk.Availability availability;
        if (!a.g()) {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
            return;
        }
        try {
            if (f(context)) {
                c();
                try {
                    if (jdb.a(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                if (availability == ArCoreApk.Availability.SUPPORTED_INSTALLED && i(context) && !k(context)) {
                    availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
                } else {
                    d();
                }
                iCheckAvailabilityCallback.onResult(availability);
                return;
            }
            if (g(context) != -1) {
                iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
            } else if (e(context)) {
                iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
            } else {
                a(context).b(context, iCheckAvailabilityCallback);
            }
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void c() {
        if (this.c == null) {
            this.k = 0;
        }
        this.i = false;
        jcs jcsVar = this.m;
        if (jcsVar != null) {
            jcsVar.f();
            this.m = null;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        synchronized (this) {
            ArCoreApk.Availability availability = this.f;
            if ((availability == null || availability.isUnknown()) && !this.g) {
                this.g = true;
                b(context, new jcg(this));
            }
            ArCoreApk.Availability availability2 = this.f;
            if (availability2 != null) {
                if (!availability2.isUnsupported()) {
                    this.f = null;
                }
                return availability2;
            }
            if (this.g) {
                return ArCoreApk.Availability.UNKNOWN_CHECKING;
            }
            Log.e("ARCore-ArCoreApk", "request not running but result is null?");
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer consumer) {
        b(context, new jch(this, consumer));
    }

    public final synchronized void d() {
        this.j = false;
    }

    public final boolean e(Context context) {
        h(context);
        return this.o;
    }

    final boolean f(Context context) {
        h(context);
        if (g(context) != 0 && g(context) < this.p) {
            return false;
        }
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.UserMessageType userMessageType;
        ArCoreApk.InstallBehavior installBehavior = e(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        if (e(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        boolean z2;
        if (a.g()) {
            if (f(activity)) {
                c();
                if (!i(activity) || k(activity)) {
                    d();
                    return n(activity);
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.i && !this.j) {
                Exception exc = this.c;
                if (exc == null) {
                    Exception exc2 = this.d;
                    if (exc2 != null) {
                        if (z) {
                            Log.w("ARCore-ArCoreApk", "Clearing previous module install failure: ", exc2);
                            this.d = null;
                        } else {
                            m(exc2);
                        }
                    }
                } else if (z) {
                    Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                    this.c = null;
                } else {
                    m(exc);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - this.l > 5000) {
                    this.k = 0;
                }
                int i = this.k + 1;
                this.k = i;
                this.l = uptimeMillis;
                if (i <= 2) {
                    if (z2) {
                        try {
                            activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                            this.i = true;
                        } catch (ActivityNotFoundException e) {
                            throw new FatalException("Failed to launch InstallActivity.", e);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("native_library_split");
                        l(activity, arrayList);
                        this.j = true;
                    }
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                }
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        }
        throw new UnavailableDeviceNotCompatibleException();
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailability(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        b(context, iCheckAvailabilityCallback);
    }
}
