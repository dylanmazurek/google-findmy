package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdf extends fcl {
    public boolean a;
    public boolean b;
    public final AlarmManager d;
    private Integer e;

    /* JADX INFO: Access modifiers changed from: protected */
    public fdf(fcn fcnVar) {
        super(fcnVar);
        this.d = (AlarmManager) f().getSystemService("alarm");
    }

    @Override // defpackage.fcl
    protected final void a() {
        try {
            d();
            k();
            if (fdc.b() > 0) {
                Context f = f();
                ActivityInfo receiverInfo = f.getPackageManager().getReceiverInfo(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    y("Receiver registered for local dispatch.");
                    this.a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final int b() {
        if (this.e == null) {
            this.e = Integer.valueOf("analytics".concat(String.valueOf(f().getPackageName())).hashCode());
        }
        return this.e.intValue();
    }

    public final PendingIntent c() {
        Context f = f();
        return fqs.a(f, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsReceiver")), fqs.a);
    }

    public final void d() {
        this.b = false;
        try {
            this.d.cancel(c());
        } catch (NullPointerException unused) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) f().getSystemService("jobscheduler");
            int b = b();
            z("Cancelling job. JobID", Integer.valueOf(b));
            jobScheduler.cancel(b);
        }
    }
}
