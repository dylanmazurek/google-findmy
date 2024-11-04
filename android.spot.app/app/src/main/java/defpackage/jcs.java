package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcs {
    public BroadcastReceiver a;
    public Context b;
    public PackageInstaller c;
    public PackageInstaller.SessionCallback d;
    public iyr e;
    private final Queue f;
    private Context g;
    private final ServiceConnection h;
    private volatile int i;

    public jcs() {
        throw null;
    }

    public static void g(Activity activity, jcq jcqVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            jci jciVar = jci.a;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (next.activityInfo != null && next.activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            jciVar.e = !z;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            jcqVar.b(new FatalException("Failed to launch installer.", e));
        }
    }

    public static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    public static void i(Activity activity, Bundle bundle, jcq jcqVar) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                jcqVar.b(new FatalException("Installation Intent failed", e));
                return;
            }
        }
        Log.e("ARCore-InstallService", "Did not get pending intent.");
        jcqVar.b(new FatalException("Installation intent failed to unparcel."));
    }

    public final synchronized void a(Context context) {
        this.g = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.h, 1)) {
            this.i = 2;
            return;
        }
        this.i = 1;
        this.g = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.h);
    }

    public final synchronized void b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        try {
            e(new hlt(this, context, (Object) iCheckAvailabilityCallback, 7));
        } catch (jcy unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void c(IBinder iBinder) {
        iyr iyrVar;
        if (iBinder == null) {
            iyrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof iyr) {
                iyrVar = (iyr) queryLocalInterface;
            } else {
                iyrVar = new iyr(iBinder);
            }
        }
        this.e = iyrVar;
        this.i = 3;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final synchronized void d() {
        this.i = 1;
        this.e = null;
    }

    public final synchronized void e(Runnable runnable) {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                this.f.offer(runnable);
                return;
            }
            throw new jcy();
        }
        throw null;
    }

    public final synchronized void f() {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                this.g.unbindService(this.h);
                this.g = null;
                this.i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                this.b.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.d;
            if (sessionCallback != null) {
                this.c.unregisterSessionCallback(sessionCallback);
                this.d = null;
                return;
            }
            return;
        }
        throw null;
    }

    public jcs(byte[] bArr) {
        this.f = new ArrayDeque();
        this.i = 1;
        this.h = new jct(this, 0);
    }
}
