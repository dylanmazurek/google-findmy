package defpackage;

import android.app.Notification;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuu {
    public static void a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
