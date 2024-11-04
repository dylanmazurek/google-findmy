package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.fdu;
import defpackage.gok;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AnalyticsService extends Service implements fdu {
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
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c();
        return null;
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
}
