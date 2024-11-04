package com.google.android.libraries.notifications.platform.executor.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.ci;
import defpackage.gqp;
import defpackage.jol;
import defpackage.joo;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GnpExecutorApiService extends Service {
    public static final joo a = joo.m("GnpSdk");
    public static final Queue b = new ArrayDeque();
    public int c;
    private ExecutorService d;

    public final void a() {
        if (b.isEmpty() && this.c == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            this.d = gqp.a(this).l();
        } catch (IllegalStateException e) {
            ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService", "onCreate", '9', "GnpExecutorApiService.java")).r("No Gnp component; GnpExecutorApiService will ignore tasks");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.d != null && intent != null && "ACTION_NEW_TASK".equals(intent.getAction())) {
            Queue queue = b;
            if (!queue.isEmpty()) {
                PowerManager powerManager = (PowerManager) getSystemService("power");
                this.c++;
                Runnable runnable = (Runnable) queue.remove();
                this.d.execute(new ci((Object) this, (Object) powerManager.newWakeLock(1, runnable.getClass().getSimpleName()), (Object) runnable, 15, (byte[]) null));
                return 2;
            }
            return 2;
        }
        a();
        return 2;
    }
}
