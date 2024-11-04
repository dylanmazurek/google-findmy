package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import defpackage.cqc;
import defpackage.csb;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = cqc.a("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cqc.b();
        Objects.toString(intent);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                csb f = csb.f(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (csb.a) {
                    BroadcastReceiver.PendingResult pendingResult = f.g;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    f.g = goAsync;
                    if (f.f) {
                        f.g.finish();
                        f.g = null;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                cqc.b();
                Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
