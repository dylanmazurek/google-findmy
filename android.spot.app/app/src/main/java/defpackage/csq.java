package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csq {
    public static final /* synthetic */ int a = 0;

    static {
        cqc.a("Alarms");
    }

    public static void a(Context context, cvk cvkVar, int i) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent c = csr.c(context, cvkVar);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i, c, i2);
        if (service != null && alarmManager != null) {
            cqc.b();
            Objects.toString(cvkVar);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, cvk cvkVar, long j) {
        cvf y = workDatabase.y();
        cve b = cte.b(y, cvkVar);
        if (b != null) {
            a(context, cvkVar, b.c);
            c(context, cvkVar, b.c, j);
            return;
        }
        bet betVar = new bet(workDatabase, (byte[]) null);
        Object f = ((cih) betVar.a).f(new csf(betVar, 3));
        f.getClass();
        int intValue = ((Number) f).intValue();
        y.a(ctf.b(cvkVar, intValue));
        c(context, cvkVar, intValue, j);
    }

    private static void c(Context context, cvk cvkVar, int i, long j) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i3 = Build.VERSION.SDK_INT;
        Intent c = csr.c(context, cvkVar);
        if (i3 >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, c, i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
