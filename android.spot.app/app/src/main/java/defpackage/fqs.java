package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqs {
    public static final int a;

    static {
        int i;
        if (true != a.f()) {
            i = 0;
        } else {
            i = 33554432;
        }
        a = i;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
