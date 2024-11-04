package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksy implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private ksx e;
    private boolean f;

    public ksy(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new fmd("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((kuv) this.d.poll()).f();
        }
    }

    private final synchronized void c() {
        while (!this.d.isEmpty()) {
            ksx ksxVar = this.e;
            if (ksxVar != null && ksxVar.isBinderAlive()) {
                kuv kuvVar = (kuv) this.d.poll();
                ksx ksxVar2 = this.e;
                if (Binder.getCallingUid() == Process.myUid()) {
                    ((krz) ksxVar2.a.a).c((Intent) kuvVar.a).l(new pt(11), new fgb(kuvVar, 6));
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            } else {
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!flr.a().c(this.a, this.b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        b();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized fxs a(Intent intent) {
        kuv kuvVar;
        kuvVar = new kuv(intent);
        jxe jxeVar = new jxe(kuvVar, 11);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = this.c;
        kuvVar.e().l(scheduledExecutorService, new fgb(scheduledExecutorService.schedule(jxeVar, 20L, timeUnit), 7));
        this.d.add(kuvVar);
        c();
        return kuvVar.e();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (!(iBinder instanceof ksx)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        } else {
            this.e = (ksx) iBinder;
            c();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c();
    }
}
