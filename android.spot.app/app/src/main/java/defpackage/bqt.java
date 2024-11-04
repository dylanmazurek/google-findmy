package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt {
    public static ComponentName a(Context context, Intent intent) {
        ComponentName startForegroundService;
        startForegroundService = context.startForegroundService(intent);
        return startForegroundService;
    }

    public static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Intent registerReceiver;
        if ((i & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, bqx.g(context), handler);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        return registerReceiver;
    }

    public static final void c(boolean z, bqs bqsVar) {
        bqsVar.d(z);
    }

    public static final void d(boolean z, bqs bqsVar) {
        bqsVar.e(z);
    }
}
