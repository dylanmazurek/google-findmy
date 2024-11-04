package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.gqp;
import defpackage.gqq;
import defpackage.jol;
import defpackage.joo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScheduledTaskService extends JobService {
    private static final joo a = joo.m("GnpSdk");

    private final gqq a() {
        try {
            return gqp.a(getApplicationContext());
        } catch (RuntimeException e) {
            ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskService", "getGnpComponent", '1', "ScheduledTaskService.java")).r("Failed to get GnpComponent for ScheduledTaskService");
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        gqq a2 = a();
        if (a2 == null) {
            return false;
        }
        a2.g().a(getApplicationContext());
        a2.n();
        return a2.d().a(jobParameters, this);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        gqq a2 = a();
        if (a2 == null) {
            return false;
        }
        a2.d().b();
        return true;
    }
}
