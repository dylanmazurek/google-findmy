package defpackage;

import android.app.Notification;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqn {
    public static void a(Service service, int i, Notification notification, int i2) {
        if (i2 == 0 || i2 == -1) {
            service.startForeground(i, notification, i2);
        } else {
            service.startForeground(i, notification, i2 & 255);
        }
    }
}
