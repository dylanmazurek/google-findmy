package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuv {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            cqc.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e);
        }
    }

    public static final cvk b(cvu cvuVar) {
        cvuVar.getClass();
        return new cvk(cvuVar.b, cvuVar.r);
    }
}
