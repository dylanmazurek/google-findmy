package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import defpackage.ci;
import defpackage.fcn;
import defpackage.fdc;
import defpackage.fdn;
import defpackage.fdu;
import defpackage.gok;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements fdu {
    private gok a;

    private final gok c() {
        if (this.a == null) {
            this.a = new gok((Context) this, (byte[]) null);
        }
        return this.a;
    }

    @Override // defpackage.fdu
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.fdu
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().s();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().t();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        c().w(intent, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        gok c = c();
        fcn e = fcn.e((Context) c.b);
        fdn h = e.h();
        String string = jobParameters.getExtras().getString("action");
        fdc fdcVar = e.c;
        h.z("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            c.u(new ci(c, h, jobParameters, 11));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
