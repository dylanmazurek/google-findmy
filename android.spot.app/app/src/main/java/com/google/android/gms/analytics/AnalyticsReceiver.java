package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.fcn;
import defpackage.fdc;
import defpackage.fdn;
import defpackage.fds;
import defpackage.fxg;
import defpackage.gok;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private fds a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new fds();
        }
        fcn e = fcn.e(context);
        fdn h = e.h();
        if (intent == null) {
            h.B("AnalyticsReceiver called with null intent");
            return;
        }
        fdc fdcVar = e.c;
        String action = intent.getAction();
        h.z("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean v = gok.v(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (fds.a) {
                context.startService(intent2);
                if (!v) {
                    return;
                }
                try {
                    if (fds.b == null) {
                        fds.b = new fxg(context, "Analytics WakeLock");
                        fds.b.d(false);
                    }
                    fds.b.a(1000L);
                } catch (SecurityException unused) {
                    h.B("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }
}
