package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqa implements gpx {
    public static final joo a = joo.m("GnpSdk");
    private static final AtomicInteger e = new AtomicInteger();
    final Context b;
    final jzc c;
    final ScheduledExecutorService d;

    public gqa(Context context, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.b = context;
        this.c = ivc.y(executorService);
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.gpx
    public final jyz a(Callable callable) {
        return this.c.submit(callable);
    }

    @Override // defpackage.gpx
    public final void b(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // defpackage.gpx
    public final void c(BroadcastReceiver.PendingResult pendingResult, boolean z, final Runnable runnable, final gnd gndVar) {
        final int incrementAndGet = e.incrementAndGet();
        final gpw gpwVar = new gpw(pendingResult, z, incrementAndGet);
        if (!gndVar.e()) {
            new Handler(Looper.getMainLooper()).postDelayed(new gcb(gpwVar, 7), gndVar.a());
        }
        final PowerManager.WakeLock newWakeLock = ((PowerManager) this.b.getSystemService("power")).newWakeLock(1, "ChimeExecutorApi::".concat(String.valueOf(this.b.getPackageName())));
        try {
            this.c.execute(new Runnable() { // from class: gpy
                @Override // java.lang.Runnable
                public final void run() {
                    long a2;
                    joo jooVar = gqa.a;
                    int i = incrementAndGet;
                    PowerManager.WakeLock wakeLock = newWakeLock;
                    gnd gndVar2 = gndVar;
                    Runnable runnable2 = runnable;
                    gpw gpwVar2 = gpwVar;
                    try {
                        try {
                            ((jol) ((jol) gqa.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", 124, "GnpExecutorApiImpl.java")).s("Started Broadcast execution [%d].", i);
                            if (gndVar2.e()) {
                                a2 = 300000;
                            } else {
                                a2 = gndVar2.a();
                            }
                            wakeLock.acquire(a2);
                            runnable2.run();
                            try {
                                wakeLock.release();
                            } catch (RuntimeException e2) {
                                ((jol) ((jol) ((jol) gqa.a.g()).i(e2)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", (char) 134, "GnpExecutorApiImpl.java")).r("WakeLock releasing failed, probably due to timeout passing.");
                            }
                        } catch (SecurityException e3) {
                            ((jol) ((jol) ((jol) gqa.a.g()).i(e3)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", 128, "GnpExecutorApiImpl.java")).s("WakeLock acquiring failed for execution [%d].", i);
                            try {
                                wakeLock.release();
                            } catch (RuntimeException e4) {
                                ((jol) ((jol) ((jol) gqa.a.g()).i(e4)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", (char) 134, "GnpExecutorApiImpl.java")).r("WakeLock releasing failed, probably due to timeout passing.");
                            }
                        }
                        gpwVar2.a();
                        ((jol) ((jol) gqa.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", 139, "GnpExecutorApiImpl.java")).s("Finished Broadcast execution [%d].", i);
                    } catch (Throwable th) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException e5) {
                            ((jol) ((jol) ((jol) gqa.a.g()).i(e5)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", (char) 134, "GnpExecutorApiImpl.java")).r("WakeLock releasing failed, probably due to timeout passing.");
                        }
                        gpwVar2.a();
                        ((jol) ((jol) gqa.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "lambda$executeInBroadcast$0", 139, "GnpExecutorApiImpl.java")).s("Finished Broadcast execution [%d].", i);
                        throw th;
                    }
                }
            });
        } catch (RuntimeException e2) {
            ((jol) ((jol) ((jol) a.g()).i(e2)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", (char) 143, "GnpExecutorApiImpl.java")).r("Failed to execute in broadcast.");
        }
    }

    @Override // defpackage.gpx
    public final void d(Runnable runnable) {
        ijs.e(new gno(runnable, this.b, 2));
    }

    @Override // defpackage.gpx
    public final void e(Runnable runnable, gnd gndVar) {
        if (gndVar.e()) {
            b(runnable);
            return;
        }
        ivc.N(ivc.L(this.c.submit(runnable), gndVar.a(), TimeUnit.MILLISECONDS, this.d), new gpz(), this.c);
    }
}
